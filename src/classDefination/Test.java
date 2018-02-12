package classDefination;
import classDefination.TestSection;
import classDefination.TestProcess;
import classDefination.TestSection;
import classDefination.Lecturer;
import classDefination.Student;

/***********************************************************************
 * Module:  Test.java
 * Author:  TIEN
 * Purpose: Defines the Class Test
 ***********************************************************************/

import java.util.*;


public class Test {
 
   /**
 * @uml.property  name="testId"
 */
public long testId;
   /**
 * @uml.property  name="lecturerId"
 */
public java.lang.String lecturerId;
   /**
 * @uml.property  name="testDesc"
 */
public java.lang.String testDesc;
   /**
 * @uml.property  name="testDuration"
 */
public int testDuration;
   /**
 * @uml.property  name="testIsValidated"
 */
public long testIsValidated;
   /**
 * @uml.property  name="testTotalScore"
 */
public float testTotalScore;
   /**
 * @uml.property  name="testRequiredScore"
 */
public float testRequiredScore;
   
   
   /**
 * @uml.property  name="testsection"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.TestSection"
 */
public java.util.Collection<TestSection> testsection;   
   /**
 * @uml.property  name="testProcess"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="test:classDefination.TestProcess"
 */
public java.util.Collection<TestProcess> testProcess;
   /**
 * @uml.property  name="lecturer"
 * @uml.associationEnd  inverse="test:classDefination.Lecturer"
 */
public Lecturer lecturer;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TestSection> getTestsection() {
      if (testsection == null)
         testsection = new java.util.HashSet<TestSection>();
      return testsection;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTestsection() {
      if (testsection == null)
         testsection = new java.util.HashSet<TestSection>();
      return testsection.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTestsection */
   public void setTestsection(java.util.Collection<TestSection> newTestsection) {
      removeAllTestsection();
      for (java.util.Iterator iter = newTestsection.iterator(); iter.hasNext();)
         addTestsection((TestSection)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTestsection */
   public void addTestsection(TestSection newTestsection) {
      if (newTestsection == null)
         return;
      if (this.testsection == null)
         this.testsection = new java.util.HashSet<TestSection>();
      if (!this.testsection.contains(newTestsection))
      {
         this.testsection.add(newTestsection);
         newTestsection.setTest(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTestsection */
   public void removeTestsection(TestSection oldTestsection) {
      if (oldTestsection == null)
         return;
      if (this.testsection != null)
         if (this.testsection.contains(oldTestsection))
         {
            this.testsection.remove(oldTestsection);
            oldTestsection.setTest((Test)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTestsection() {
      if (testsection != null)
      {
    	  TestSection oldTestsection;
         for (java.util.Iterator iter = getIteratorTestsection(); iter.hasNext();)
         {
            oldTestsection = (TestSection)iter.next();
            iter.remove();
            oldTestsection.setTest((Test)null);
         }
      }
   }
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
         newTestProcess.setTest(this);   
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
            oldTestProcess.setTest((Test)null);
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
            oldTestProcess.setTest((Test)null);
         }
      }
   }
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="lecturer"
 */
   public Lecturer getLecturer() {
      return lecturer;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newLecturer
 * @uml.property  name="lecturer"
 */
   public void setLecturer(Lecturer newLecturer) {
      if (this.lecturer == null || !this.lecturer.equals(newLecturer))
      {
         if (this.lecturer != null)
         {
            Lecturer oldLecturer = this.lecturer;
            this.lecturer = null;
            oldLecturer.removeTest(this);
         }
         if (newLecturer != null)
         {
            this.lecturer = newLecturer;
            this.lecturer.addTest(this);
         }
      }
   }

}