package restService;




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



@Path("/PersonalStats")
public class PersonalStats {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getname/{studentID}")
	public String getStudentStats(@PathParam("studentID")String studentID)
	{
		String sql = "SELECT STUDENT_NAME, NO_PASS_COURSE, NO_FAIL_COURSE, NO_PENDING_COURSE, "+
					 "(SELECT ROUND( AVG(TEST_SCORE))  FROM testprocess WHERE STUDENT_ID=student.STUDENT_ID) AvgPerformance, "+
					 "(SELECT ROUND( MAX(TEST_SCORE))  FROM testprocess WHERE STUDENT_ID=student.STUDENT_ID) MaxPerformance, "+
					 "(SELECT ROUND( MIN(TEST_SCORE))  FROM testprocess WHERE STUDENT_ID=student.STUDENT_ID) MinPerformance, "+
					 "(SELECT COUNT(*) FROM getmaxtttbystudentandtestid WHERE STUDENT_ID=student.STUDENT_ID AND maxTTT =1) NoOf1Test, "+
					 "(SELECT COUNT(*) FROM getmaxtttbystudentandtestid WHERE STUDENT_ID=student.STUDENT_ID AND maxTTT =1) NoOf2Test, "+
					 "(SELECT COUNT(*) FROM getmaxtttbystudentandtestid WHERE STUDENT_ID=student.STUDENT_ID AND maxTTT >2) NoOfMore2Test "+
					 "FROM Student WHERE STUDENT_ID ='" + studentID + "'";
		System.out.println(sql.toString());
		String result =s.run(sql);
		System.out.println(result);
		return result;
	}
	
	// This method serve for get student name from student ID
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getStudentName/{studentID}")
	public String getStudentName(@PathParam("studentID")String studentID)
	{
		String sql = "SELECT s.STUDENT_NAME "+				 
					 "FROM Student AS s WHERE s.STUDENT_ID ='" + studentID + "'";
		System.out.println(sql.toString());
		String result =s.run(sql);
		System.out.println(result);
		return result;
	}

}
