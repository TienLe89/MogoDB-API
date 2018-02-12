package classDefination;

/***********************************************************************
 * Module:  Student.java
 * Author:  TIEN
 * Purpose: Defines the Class Student
 ***********************************************************************/

import java.util.*;


public class Student {

   /**
 * @uml.property  name="studentId"
 */
public java.lang.String studentId;
   /**
 * @uml.property  name="studentName"
 */
public java.lang.String studentName;
   /**
 * @uml.property  name="studentAddress"
 */
public java.lang.String studentAddress;
   /**
 * @uml.property  name="studentMobile"
 */
public java.lang.String studentMobile;
   /**
 * @uml.property  name="studentEmail"
 */
public java.lang.String studentEmail;
   /**
 * @uml.property  name="noPassCourse"
 */
public int noPassCourse;
   /**
 * @uml.property  name="noFailCourse"
 */
public int noFailCourse;
   /**
 * @uml.property  name="noPendingCourse"
 */
public int noPendingCourse;
   /**
 * @uml.property  name="studentGender"
 */
public java.lang.String studentGender;
   
   
   public Student(String studentID, String studentName, String studentMobile,String studentAddress) {
	// TODO Auto-generated constructor stub
}
   
   
   /**
 * @pdRoleInfo   migr=no name=TestProcess assc=fkStudentId coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="testProcess"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="student:classDefination.TestProcess"
 */
   public java.util.Collection<TestProcess> testProcess;
   
   


/** @pdGenerated default getter */
   public java.util.Collection<TestProcess> getTestProcess() {
      if (testProcess == null)
         testProcess = new java.util.HashSet<TestProcess>();
      return testProcess;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTestProcess() {
      if (testProcess == null)
         testProcess = new java.util.HashSet<TestProcess>();
      return testProcess.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTestProcess */
   public void setTestProcess(java.util.Collection<TestProcess> newTestProcess) {
      removeAllTestProcess();
      for (java.util.Iterator iter = newTestProcess.iterator(); iter.hasNext();)
         addTestProcess((TestProcess)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTestProcess */
   public void addTestProcess(TestProcess newTestProcess) {
      if (newTestProcess == null)
         return;
      if (this.testProcess == null)
         this.testProcess = new java.util.HashSet<TestProcess>();
      if (!this.testProcess.contains(newTestProcess))
      {
         this.testProcess.add(newTestProcess);
         newTestProcess.setStudent(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTestProcess */
   public void removeTestProcess(TestProcess oldTestProcess) {
      if (oldTestProcess == null)
         return;
      if (this.testProcess != null)
         if (this.testProcess.contains(oldTestProcess))
         {
            this.testProcess.remove(oldTestProcess);
            oldTestProcess.setStudent((Student)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTestProcess() {
      if (testProcess != null)
      {
         TestProcess oldTestProcess;
         for (java.util.Iterator iter = getIteratorTestProcess(); iter.hasNext();)
         {
            oldTestProcess = (TestProcess)iter.next();
            iter.remove();
            oldTestProcess.setStudent((Student)null);
         }
      }
   }

public String getStudentID() {
	// TODO Auto-generated method stub
	return null;
}

public String getStudentName() {
	// TODO Auto-generated method stub
	return null;
}

public String getStudentAddress() {
	// TODO Auto-generated method stub
	return null;
}

public String getStudentMobile() {
	// TODO Auto-generated method stub
	return null;
}

}