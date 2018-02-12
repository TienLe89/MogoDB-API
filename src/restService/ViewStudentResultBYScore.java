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


@Path("/ViewStudentResultBYScore")
public class ViewStudentResultBYScore{
	
				@GET
				@Produces(MediaType.TEXT_PLAIN)
				@Path("/getsearchlist/{lecturerID}/{course}/{gender}/{examID}")
				public String getStudentStats(
						@PathParam("lecturerID")String lecturerID,						
						@PathParam("course")String course,
						@PathParam("gender")String gender ,
						@PathParam("examID")String examID						
						)
				{

					String tmp ;
					String sql = "SELECT DISTINCT SUBJECT_NAME "+
							 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
					System.out.println(sql.toString());
					
					String result = "{\"Subject\":"+ s.run2List(sql);
					System.out.println(result);
					sql = "SELECT DISTINCT TEST_ID "+
							 "FROM viewquestionanswer WHERE LECTURER_ID ='" + lecturerID + "' ";
					System.out.println(sql.toString());
					 tmp =",\"TestID\":"+ s.run2List(sql);
					result+=tmp;
					sql ="SELECT COUNT(*) Quantity, CASE  WHEN(TEST_SCORE>= 80) THEN 'A' " +
												"WHEN(TEST_SCORE>= 70) THEN 'B' " +
												"WHEN(TEST_SCORE>= 60) THEN 'C' " +
												"WHEN(TEST_SCORE>= 50) THEN 'D' " +
												"ELSE 'F' END AS grade " +
								"FROM viewstudenttest " +
								"WHERE LECTURER_ID ='" + lecturerID + "' ";

					
					if(gender.compareTo("-")!=0) sql +="AND STUDENT_GENDER  = '"+gender+"' ";
					if(course.length()>1) sql +="AND SUBJECT_NAME = '"+course+"' ";
					if(examID.compareTo("-")!=0) sql +="AND TEST_ID = '"+examID+"' ";
					sql+="GROUP BY grade";
					System.out.println(sql.toString());
					tmp =",\"GraphData\":"+ s.run2List(sql);
					result +=tmp +"}";
					System.out.println(result);
					return result;
				}
	
	}



