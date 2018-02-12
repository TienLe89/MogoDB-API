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



@Path("/StudentExamResultDetail")
public class StudentExamResultDetail {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
//	@Path("/getname/{studentID}/{studentName}")
	@Path("/getexamresult/{studentID}/{testID}")
	public String getStudentStats(@PathParam("studentID")String studentID, @PathParam("testID")String testID)
	{
		
		String sql = 	"SELECT DISTINCT STUDENT_NAME, SUBJECT_NAME, T_TEST_DATE, T_START_TIME, TEST_DURATION, TEST_REQUIRED_SCORE, TEST_SCORE, IS_PASS " +
				 		"FROM viewquestionanswer WHERE STUDENT_ID ='" + studentID + "' AND TEST_ID=" +testID;
						
		System.out.println(sql.toString());
		String result ="{\"General\":"+s.run(sql);
		sql="SELECT TEST_ID, TESTSEC_NAME, TESTSEC_ID, COUNT(TESTITEM_ID) AS NumberItemOfSection , 'Percent' FROM viewtestsection WHERE TEST_ID ="+testID;
		String temp =",\"Section\":"+s.run2List(sql);
		result+=temp;
		//sai
		sql=	"SELECT IF(ISNULL(tmp.answer_solution), tmp.answer_value,tmp.answer_desc) aswoption, tmp.ANSI_IS_SOLUTION , "+
				"tmp.QUESTION_DESC,tmp.QUESTION_TYPE,tmp.ANSI_DESC,tmp.ANSI_VALUE , tmp.answer_desc,  IF(tmp.answer_solution=1, "+
				"IF(ISNULL(tmp.answer_solution), tmp.ANSI_VALUE,tmp.ANSI_DESC),'') CorectAnswer , tmp.answer_score "+	
				"FROM viewquestionanswer AS tmp WHERE STUDENT_ID ='" + studentID + "' AND TEST_ID=" +testID;
		temp =",\"Question\":"+s.run2List(sql);
		result+=temp;
		result+="}";
		System.out.println(result);
		return result;
	}

}
