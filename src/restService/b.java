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

import database.s;



@Path("/aao")
public class b {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getname/{studentID}")
	public String getStudentName(@PathParam("studentID")String studentID){
		String sql = "SELECT STUDENT_NAME FROM Student WHERE STUDENT_ID ='" + studentID + "'";
		System.out.println(sql.toString());
		return s.run(sql);
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getname/{studentID}/{studentName}")
	public String getStudentList(
			@PathParam("studentID")String studentID,
			@PathParam("studentName")String studentName
			){
		String sql ="SELECT STUDENT_NAME FROM Student WHERE STUDENT_ID ='" + studentID + "' and Student_Name ='"+studentName+"'";
		return s.run2List(sql);
	}
}
