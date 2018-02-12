package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import classDefination.Student;




public class s {
	/**
	 * @uml.property  name="connection"
	 */
	private Connection connection;
	/**
	 * @uml.property  name="prepStatement"
	 */
	private PreparedStatement prepStatement;

	public s(){
		connection = null;
		prepStatement = null;
		
	}
	
	
	public static String run(String sql){
		String result = "{";
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
//			String connString = "jdbc:mysql://localhost:3306/exam?"
//					+ "user=root&password=1qaz2wsx";
			String connString = "jdbc:mysql://localhost:3306/exam?"
					+ "user=root&password=root";
			connect = DriverManager.getConnection(connString);
			
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
					
					result +="\""+ resultSet.getMetaData().getColumnName(i)+"\":\"" +resultSet.getString(i) + "\",";
				}
					
			}
			result = result.substring(0, result.length()-1);
			result += "}";
			System.out.println(">>>>>>>>>>>>>> After constructing JSON object list "+ result );
			statement.close();
			connect.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
			
		}	
		return result;
	}

	
//	//-------------CASE I -----------------
//	//Simple Query
//	public Student searchFor(String studentID){
//		String sql = "	SELECT STUDENT_NAME, STUDENT_MOBILE, STUDENT_ADDRESS " +
//				"		FROM STUDENT " +
//				"		WHERE STUDENT_ID = '" + studentID + "'";
//		Student student = null;
//		
//		
//		Connection connect = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		try{
//			// This will load the MySQL driver, each DB has its own driver
//			Class.forName("com.mysql.jdbc.Driver");
//			// Setup the connection with the DB
//			String connString = "jdbc:mysql://localhost/pmstore?"
//					+ "user=pmuser&password=abc123";
//			connect = DriverManager.getConnection(connString);
//	
//			// Statements allow to issue SQL queries to the database
//			statement = connect.createStatement();
//			// Result set get the result of the SQL query
//			resultSet = statement.executeQuery(sql);
//			
//			if (resultSet.next()) {
//				String studentName = resultSet.getString(1);
//				String studentMobile = resultSet.getString(2);
//				String studentAddress = resultSet.getString(3);
//				
//				student = new Student(studentID, studentName, studentMobile, studentAddress);
//					
//			}
//			statement.close();
//			connect.close();
//			
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}	
//
//		//return
//		return student;
//	}
	
	
//	//-------------CASE II -----------------
//	//Use Prepared Statement
//		
//	public Student searchFor(String studentID){
//		String sql = "	SELECT STUDENT_NAME, STUDENT_MOBILE, STUDENT_ADDRESS " +
//				"		FROM STUDENT " +
//				"		WHERE STUDENT_ID = ?";
//		Student student = null;
//		
//		
//		Connection connect = null;
//		PreparedStatement prepStatement = null;
//		ResultSet resultSet = null;
//		try{
//			// This will load the MySQL driver, each DB has its own driver
//			Class.forName("com.mysql.jdbc.Driver");
//			// Setup the connection with the DB
//			String connString = "jdbc:mysql://localhost/pmstore?"
//					+ "user=pmuser&password=abc123";
//			connect = DriverManager.getConnection(connString);
//	
//			// Statements allow to issue SQL queries to the database
//			prepStatement = connect.prepareStatement(sql);
//			prepStatement.setString(1, studentID);
//			// Result set get the result of the SQL query
//			resultSet = prepStatement.executeQuery();
//			
//			if (resultSet.next()) {
//				String studentName = resultSet.getString(1);
//				String studentMobile = resultSet.getString(2);
//				String studentAddress = resultSet.getString(3);
//				
//				student = new Student(studentID, studentName, studentMobile, studentAddress);
//					
//			}
//			prepStatement.close();
//			connect.close();
//			
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}	
//
//		//return
//		return student;
//	}
	
	//-------------CASE III -----------------
	//Arrange code for connect, exec, close
	//1.convert local var 2 field
	//2.extract method
	
		
	public Student searchFor(String studentID){
		String sql = "	SELECT STUDENT_NAME, STUDENT_MOBILE, STUDENT_ADDRESS " +
				"		FROM STUDENT " +
				"		WHERE STUDENT_ID = ?";
		Student student = null;
		
		
		ResultSet resultSet = null;
		try{
			connect();
	
			// Statements allow to issue SQL queries to the database
			prepStatement = connection.prepareStatement(sql);
			prepStatement.setString(1, studentID);
			// Result set get the result of the SQL query
			resultSet = prepStatement.executeQuery();
			
			if (resultSet.next()) {
				String studentName = resultSet.getString(1);
				String studentMobile = resultSet.getString(2);
				String studentAddress = resultSet.getString(3);
				
				student = new Student(studentID, studentName, studentMobile, studentAddress);
					
			}
			close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}	

		//return
		return student;
	}
	
	//Add student
	public boolean addStudent(Student student) {
		
		String sql = "INSERT INTO STUDENT(STUDENT_ID, STUDENT_NAME, STUDENT_ADDRESS, STUDENT_MOBILE) VALUES(?,?,?,?);";

        try {
        	connect();
        	
 			
            prepStatement = connection.prepareStatement(sql);
            prepStatement.setString(1, student.getStudentID());
            prepStatement.setString(2, student.getStudentName());
            prepStatement.setString(3, student.getStudentAddress());
            prepStatement.setString(4, student.getStudentMobile());
            prepStatement.executeUpdate();
            
            close();

        } catch (Exception ex) {
           ex.printStackTrace();
           return false;
        }
		return true;
	}
	public boolean deleteStudent(String studentID) {
		// TODO Auto-generated method stub
		String sql = "	DELETE FROM STUDENT " +
				"		WHERE STUDENT_ID = ?";

        try {
        	connect();
        	
            prepStatement = connection.prepareStatement(sql);
            prepStatement.setString(1, studentID);
            prepStatement.executeUpdate();
            
            close();

        } catch (Exception ex) {
           ex.printStackTrace();
           return false;
        }
		return true;
	}

/**
 * @throws SQLException
 */
private void close() throws SQLException {
	prepStatement.close();
	connection.close();
}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void connect() throws ClassNotFoundException, SQLException {
		// This will load the MySQL driver, each DB has its own driver
		Class.forName("com.mysql.jdbc.Driver");
		// Setup the connection with the DB
		String connString = "jdbc:mysql://localhost/iuniv?"
				+ "user=root&password=root";
		connection = DriverManager.getConnection(connString);
	}

	public void updateStudent(Student newInfo) {
		// TODO Auto-generated method stub
		String sql = "	UPDATE STUDENT " +
				"		SET STUDENT_NAME = ?, " +
				"			STUDENT_ADDRESS = ?, " +
				"			STUDENT_MOBILE = ? " +		
				"		WHERE STUDENT_ID = ?";

        try {
        	connect();
        	
            prepStatement = connection.prepareStatement(sql);
            prepStatement.setString(1, newInfo.getStudentName());
            prepStatement.setString(2, newInfo.getStudentAddress());
            prepStatement.setString(3, newInfo.getStudentMobile());
            prepStatement.setString(4, newInfo.getStudentID());
            prepStatement.executeUpdate();
            
            close();

        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
		
	}


	public static String run2List(String sql){
		String result = "";
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			String connString = "jdbc:mysql://localhost:3306/exam?"
					+ "user=root&password=root";
//			String connString = "jdbc:mysql://localhost/exam?"
//					+ "user=root&password=root";
			connect = DriverManager.getConnection(connString);
	
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			result = "{\"students\": [";
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				result +="{";
				for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
					
					result +="\""+ resultSet.getMetaData().getColumnName(i)+"\":\"" +resultSet.getString(i) + "\",";
				}
				result = result.substring(0, result.length()-1);
				result +="},";
			}
			
			
			result = result.substring(0, result.length()-1);
			result += "]}";
			System.out.println(">>>>>>>>>>>>>> After constructing JSON object list"+ result);
			statement.close();
			connect.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
			
		}	
		return result;
	}
	
	
}
