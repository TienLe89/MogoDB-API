package restService;


import java.sql.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.sun.org.apache.regexp.internal.REUtil;

import database.s;


@Path("/ViewScoreStats")
public class ViewScoreStats {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getlist/{LecturerID}")
	
	//Can use pass unit test
	public String getlist(@PathParam("LecturerID")String LecturerID){
		
		String sql ="SELECT * FROM "+
				  "(SELECT COUNT(*) AS NoStudentPassed FROM viewstudenttest WHERE IS_PASS =1 AND LECTURER_ID ='" + LecturerID + "') NoStudentPassed,"+
				 "(SELECT COUNT(*) AS NoStudentFailed  FROM viewstudenttest WHERE IS_PASS =0 AND LECTURER_ID ='" + LecturerID + "') NoStudentFailed,"+
				 "(SELECT MAX(TEST_SCORE) AS MaxScore FROM viewstudenttest WHERE LECTURER_ID='" +  LecturerID + "') MaxScore,"+				 
				 "(SELECT MIN(TEST_SCORE) AS MinScore FROM viewstudenttest WHERE LECTURER_ID='" + LecturerID + "') MinScore";		

		System.out.println(sql.toString());
		String result =s.run(sql);
		System.out.println(result);
		return result;
	}
	
	//Can use, pass unit test
			@GET
			@Produces(MediaType.TEXT_PLAIN)
			@Path("/getCourselist/{lecturerID}")
			public String getCourseList(@PathParam("lecturerID")String lecturerID){
				String sql = "SELECT DISTINCT TEST_ID, SUBJECT_NAME "+
						 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
				System.out.println(sql.toString());
				String result =s.run2List(sql);
				System.out.println(result);
				return result;
			}
		
			//Can use, pass unit test
					@GET
					@Produces(MediaType.TEXT_PLAIN)
					@Path("/getTestIDList/{lecturerID}")
					public String getTestIDList(@PathParam("lecturerID")String lecturerID){
						String sql = "SELECT DISTINCT TEST_ID "+
								 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
						System.out.println(sql.toString());
						String result =s.run2List(sql);
						System.out.println(result);
						return result;
					}
					
					//Can use, pass unit test
					@GET
					@Produces(MediaType.TEXT_PLAIN)
					@Path("/getsearchlist/{LecturerID}/{course}/{gender}/{examcode}")
					public String getsearchlist(
							@PathParam("LecturerID")String LecturerID,
							@PathParam("course")String course ,
							@PathParam("gender")String gender,
							@PathParam("examcode")String examcode
							){
						String filterCond = LecturerID + "' ";
						if(gender.compareTo("-")!=0) filterCond +="AND STUDENT_GENDER  = '"+gender+"' ";
						if(course.length()>1) filterCond +="AND SUBJECT_NAME = '"+course+"' ";
						if(examcode.compareTo("-")!=0) filterCond +="AND TEST_ID = '"+examcode+"' ";
						String sql ="SELECT * FROM "+
								  "(SELECT COUNT(*) AS NoStudentPassed FROM viewstudenttest WHERE IS_PASS =1 AND LECTURER_ID ='" + filterCond+") NoStudentPassed,"+
								 "(SELECT COUNT(*) AS NoStudentFailed  FROM viewstudenttest WHERE IS_PASS =0 AND LECTURER_ID ='" + filterCond+ ") NoStudentFailed,"+
								 "(SELECT MAX(TEST_SCORE) AS MaxScore FROM viewstudenttest WHERE LECTURER_ID='" + filterCond+ ") MaxScore,"+				 
								 "(SELECT MIN(TEST_SCORE) AS MinScore FROM viewstudenttest WHERE LECTURER_ID='" + filterCond+ ") MinScore";		
						System.out.println(sql.toString());	
						String result ="{\"General\":"+ s.run(sql);						
						sql = "SELECT DISTINCT SUBJECT_NAME "+
								 "FROM viewquestionanswer WHERE LECTURER_ID ='" + LecturerID + "' ";
												
						String tmp = ",\"Subject\":"+ s.run2List(sql);
						result+=tmp;
						
						sql = "SELECT DISTINCT TEST_ID "+
								 "FROM viewquestionanswer WHERE LECTURER_ID ='" + LecturerID + "' ";
						
						 tmp =",\"TestID\":"+ s.run2List(sql);
						result+=tmp;
						sql = "SELECT DISTINCT SUBJECT_NAME , "+ 
							  "(SELECT COUNT(*) FROM viewstudenttest  WHERE IS_PASS =1 AND STUDENT_GENDER='M' AND LECTURER_ID='"+ LecturerID +"') NoMalePass, "+
							  "(SELECT COUNT(*) FROM viewstudenttest  WHERE IS_PASS =1 AND STUDENT_GENDER='F' AND LECTURER_ID='"+ LecturerID +"') NoFemalePass "+
							  "FROM viewstudenttest  WHERE IS_PASS =1 AND LECTURER_ID='"+ LecturerID +"' ";
						
						tmp=",\"GraphData\":"+s.run2List(sql);
						result +=tmp +"}";
						System.out.println(result);				
						return result;
					}
					
					/*
					 * Pass Unit test, Can use 
					 * Note that chart are independence  with  all of filter on this page
					 */
					@GET
					@Produces(MediaType.TEXT_PLAIN)
					@Path("/getChartData/{LecturerID}")
					public String getChartData(@PathParam("LecturerID")String LecturerID){

						
						String sql = "SELECT COUNT(*) As Number,STUDENT_GENDER ,SUBJECT_NAME "+
									 "FROM viewstudenttest  WHERE IS_PASS =1 AND LECTURER_ID='" + LecturerID +"' " +
									 " GROUP BY STUDENT_GENDER ,SUBJECT_NAME ";
						System.out.println(sql.toString() +";: chart");		
						String result =s.run2List(sql);
						System.out.println(result);
						return result;
					}
}
