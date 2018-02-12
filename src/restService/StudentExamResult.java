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



@Path("/StudentExamResult")
public class StudentExamResult {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getlist/{studentID}")
	public String getStudentStats(@PathParam("studentID")String studentID){
		String sql = "SELECT DISTINCT TEST_ID, SUBJECT_NAME, IS_PASS, TEST_SCORE, TEST_REQUIRED_SCORE, T_START_TIME, T_END_TIME, T_TEST_DATE "+
				 "FROM viewstudenttest WHERE STUDENT_ID ='" + studentID + "' ";
		System.out.println(sql.toString());
		String result =s.run2List(sql);
		System.out.println(result);
		return result;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getsearchlist/{studentID}/{testDate}/{course}/{courseLikeSearch}")
	public String getStudentStats(
			@PathParam("studentID")String studentID,
			@PathParam("testDate")String testDate ,
			@PathParam("course")String course,
			@PathParam("courseLikeSearch")String courseLikeSearch
			){

		
		String sql = "SELECT DISTINCT TEST_ID, SUBJECT_NAME, IS_PASS, TEST_SCORE, TEST_REQUIRED_SCORE, T_START_TIME, T_END_TIME, T_TEST_DATE "+
					 "FROM viewstudenttest WHERE STUDENT_ID ='" + studentID + "' ";
		if(testDate.length()>1) sql +="AND T_TEST_DATE = '"+testDate+"' ";
		if(course.compareTo("-")!=0){ sql +="AND TEST_ID = '"+course+"' ";
		}
		if(courseLikeSearch.compareTo("-")!=0){
			sql +="AND SUBJECT_NAME like '%"+courseLikeSearch+"%' ";
		}
		System.out.println(sql.toString() +"searchlist");
		String result =s.run2List(sql);
		System.out.println(result);
		return result;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getCourselist/{studentID}")
	public String getCourseList(@PathParam("studentID")String studentID){
		
		String sql = "SELECT DISTINCT SUBJECT_NAME "+
				 "FROM viewstudenttest WHERE STUDENT_ID ='" + studentID + "' ";
		System.out.println(sql.toString());
		String result =s.run2List(sql);
		System.out.println(result);
		return result;
	}
	
}
