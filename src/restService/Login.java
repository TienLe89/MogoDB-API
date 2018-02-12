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



@Path("/Login")
public class Login {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getname/{UserID}/{UserType}")
	public String getStudentStats( @PathParam("UserID")String UserID, @PathParam("UserType")Integer UserType)
	{
		String sql ="";	
		if(UserType==0)
			sql =	"SELECT STUDENT_NAME FROM Student WHERE STUDENT_ID ='";
		else
			sql =	"SELECT LECTURER_NAME FROM lecturer WHERE LECTURER_ID ='";
		sql += UserID + "'";	
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
