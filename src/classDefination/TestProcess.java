package classDefination;

/***********************************************************************
 * Module:  TestProcess.java
 * Author:  TIEN
 * Purpose: Defines the Class TestProcess
 ***********************************************************************/

import java.util.*;


public class TestProcess {

   /**
 * @uml.property  name="testProcessId"
 */
public int testProcessId; 
   /**
 * @uml.property  name="studentId"
 */
public java.lang.String studentId; 
   /**
 * @uml.property  name="testId"
 */
public int testId;
   /**
 * @uml.property  name="testTakenTime"
 */
public int testTakenTime;
   /**
 * @uml.property  name="tStartTime"
 */
public java.util.Date tStartTime;
   /**
 * @uml.property  name="tEndTime"
 */
public java.util.Date tEndTime;
   /**
 * @uml.property  name="tTestDate"
 */
public java.util.Date tTestDate;
   /**
 * @uml.property  name="testScore"
 */
public int testScore; 
   /**
 * @uml.property  name="isPass"
 */
public boolean isPass;   
   /**
 * @uml.property  name="testProcessAnswer" multiplicity="(0 -1)"
 */
public java.util.Collection testProcessAnswer;
   /**
 * @uml.property  name="test"
 * @uml.associationEnd  inverse="testProcess:classDefination.Test"
 */
public Test test;
   /**
 * @uml.property  name="student"
 * @uml.associationEnd  inverse="testProcess:classDefination.Student"
 */
public Student student;
   
   
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="test"
 */
   public Test getTest() {
      return test;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newTest
 * @uml.property  name="test"
 */
   public void setTest(Test newTest) {
      if (this.test == null || !this.test.equals(newTest))
      {
         if (this.test != null)
         {
            Test oldTest = this.test;
            this.test = null;
            oldTest.removeTestProcess(this);
         }
         if (newTest != null)
         {
            this.test = newTest;
            this.test.addTestProcess(this);
         }
      }
   }
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="student"
 */
   public Student getStudent() {
      return student;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newStudent
 * @uml.property  name="student"
 */
   public void setStudent(Student newStudent) {
      if (this.student == null || !this.student.equals(newStudent))
      {
         if (this.student != null)
         {
            Student oldStudent = this.student;
            this.student = null;
            oldStudent.removeTestProcess(this);
         }
         if (newStudent != null)
         {
            this.student = newStudent;
            this.student.addTestProcess(this);
         }
      }
   }


}