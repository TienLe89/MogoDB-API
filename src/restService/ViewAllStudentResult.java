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

@Path("/ViewAllStudentResult")

public class ViewAllStudentResult {

	
	 //Can use, pass unit test
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getlist/{lecturerID}")
	public String getStudentStats(@PathParam("lecturerID")String lecturerID){
		String sql = " SELECT DISTINCT  TEST_ID, SUBJECT_NAME,STUDENT_NAME,STUDENT_ID, STUDENT_GENDER, TEST_SCORE,IS_PASS, T_TEST_DATE,TEST_TAKEN_TIME "+
				 "FROM viewquestionanswer WHERE LECTURER_ID  ='" + lecturerID + "' ";
		System.out.println(sql.toString());
		String result =s.run2List(sql);
		System.out.println(result);
		return result;
	}
	
	//Can use, pass unit test
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getsearchlist/{lecturerID}/{testDate}/{course}/{courseLikeSearch}")
	public String getStudentStats(
			@PathParam("lecturerID")String lecturerID,
			@PathParam("testDate")String testDate ,
			@PathParam("course")String course,
			@PathParam("courseLikeSearch")String courseLikeSearch
			){

		
		String sql = "SELECT DISTINCT  TEST_ID, SUBJECT_NAME,STUDENT_NAME,STUDENT_ID, STUDENT_GENDER, TEST_SCORE,IS_PASS, T_TEST_DATE,TEST_TAKEN_TIME "+
					 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
		if(testDate.length()>1) sql +="AND T_TEST_DATE = '"+testDate+"' ";
		if(course.length()>1) sql +="AND SUBJECT_NAME = '"+course+"' ";
		System.out.println(courseLikeSearch);
		if(courseLikeSearch.compareTo("-")!=0)
			
		{	
			sql +="AND STUDENT_NAME like '%"+courseLikeSearch+"%' ";
			
		}
		System.out.println(sql.toString() +"searchlist");
		String result =s.run2List(sql);
		System.out.println(result);
		return result;
	}
	
	
	//Can use, pass unit test
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getCourselist/{lecturerID}")
	public String getCourseList(@PathParam("lecturerID")String lecturerID){
		
		String sql = "SELECT DISTINCT SUBJECT_NAME "+
				 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
		System.out.println(sql.toString());
		String result =s.run2List(sql);
		System.out.println(sql.toString());
		System.out.println(result);
		return result;
	}
	
}
