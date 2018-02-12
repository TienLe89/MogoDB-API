package classDefination;

/***********************************************************************
 * Module:  Lecturer.java
 * Author:  TIEN
 * Purpose: Defines the Class Lecturer
 ***********************************************************************/

import java.util.*;


public class Lecturer {

   /**
 * @uml.property  name="lecturerId"
 */
public java.lang.String lecturerId;
   /**
 * @uml.property  name="lecturerName"
 */
public java.lang.String lecturerName;
   
   /**
 * @pdRoleInfo   migr=no name=Topic assc=fkCreatorOfTopic coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="topic"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.Topic"
 */
   public java.util.Collection<Topic> topic;
   /**
 * @pdRoleInfo   migr=no name=Question assc=fkCreatorOfQuestions coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="question"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.Question"
 */
   public java.util.Collection<Question> question;
   /**
 * @pdRoleInfo   migr=no name=Lecturersubjectmapping assc=fkLecturersubjectmapping coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="lecturersubjectmapping"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="lecturer:classDefination.Lecturersubjectmapping"
 */
   public java.util.Collection<Lecturersubjectmapping> lecturersubjectmapping;
   /**
 * @pdRoleInfo   migr=no name=Test assc=fkValidatorOfTests coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="test"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="lecturer:classDefination.Test"
 */
   public java.util.Collection<Test> test;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Topic> getTopic() {
      if (topic == null)
         topic = new java.util.HashSet<Topic>();
      return topic;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTopic() {
      if (topic == null)
         topic = new java.util.HashSet<Topic>();
      return topic.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTopic */
   public void setTopic(java.util.Collection<Topic> newTopic) {
      removeAllTopic();
      for (java.util.Iterator iter = newTopic.iterator(); iter.hasNext();)
         addTopic((Topic)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTopic */
   public void addTopic(Topic newTopic) {
      if (newTopic == null)
         return;
      if (this.topic == null)
         this.topic = new java.util.HashSet<Topic>();
      if (!this.topic.contains(newTopic))
      {
         this.topic.add(newTopic);
         newTopic.setLecturer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTopic */
   public void removeTopic(Topic oldTopic) {
      if (oldTopic == null)
         return;
      if (this.topic != null)
         if (this.topic.contains(oldTopic))
         {
            this.topic.remove(oldTopic);
            oldTopic.setLecturer((Lecturer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTopic() {
      if (topic != null)
      {
         Topic oldTopic;
         for (java.util.Iterator iter = getIteratorTopic(); iter.hasNext();)
         {
            oldTopic = (Topic)iter.next();
            iter.remove();
            oldTopic.setLecturer((Lecturer)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Question> getQuestion() {
      if (question == null)
         question = new java.util.HashSet<Question>();
      return question;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuestion() {
      if (question == null)
         question = new java.util.HashSet<Question>();
      return question.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuestion */
   public void setQuestion(java.util.Collection<Question> newQuestion) {
      removeAllQuestion();
      for (java.util.Iterator iter = newQuestion.iterator(); iter.hasNext();)
         addQuestion((Question)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuestion */
   public void addQuestion(Question newQuestion) {
      if (newQuestion == null)
         return;
      if (this.question == null)
         this.question = new java.util.HashSet<Question>();
      if (!this.question.contains(newQuestion))
      {
         this.question.add(newQuestion);
         newQuestion.setLecturer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldQuestion */
   public void removeQuestion(Question oldQuestion) {
      if (oldQuestion == null)
         return;
      if (this.question != null)
         if (this.question.contains(oldQuestion))
         {
            this.question.remove(oldQuestion);
            oldQuestion.setLecturer((Lecturer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuestion() {
      if (question != null)
      {
         Question oldQuestion;
         for (java.util.Iterator iter = getIteratorQuestion(); iter.hasNext();)
         {
            oldQuestion = (Question)iter.next();
            iter.remove();
            oldQuestion.setLecturer((Lecturer)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Lecturersubjectmapping> getLecturersubjectmapping() {
      if (lecturersubjectmapping == null)
         lecturersubjectmapping = new java.util.HashSet<Lecturersubjectmapping>();
      return lecturersubjectmapping;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLecturersubjectmapping() {
      if (lecturersubjectmapping == null)
         lecturersubjectmapping = new java.util.HashSet<Lecturersubjectmapping>();
      return lecturersubjectmapping.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLecturersubjectmapping */
   public void setLecturersubjectmapping(java.util.Collection<Lecturersubjectmapping> newLecturersubjectmapping) {
      removeAllLecturersubjectmapping();
      for (java.util.Iterator iter = newLecturersubjectmapping.iterator(); iter.hasNext();)
         addLecturersubjectmapping((Lecturersubjectmapping)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLecturersubjectmapping */
   public void addLecturersubjectmapping(Lecturersubjectmapping newLecturersubjectmapping) {
      if (newLecturersubjectmapping == null)
         return;
      if (this.lecturersubjectmapping == null)
         this.lecturersubjectmapping = new java.util.HashSet<Lecturersubjectmapping>();
      if (!this.lecturersubjectmapping.contains(newLecturersubjectmapping))
      {
         this.lecturersubjectmapping.add(newLecturersubjectmapping);
         newLecturersubjectmapping.setLecturer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldLecturersubjectmapping */
   public void removeLecturersubjectmapping(Lecturersubjectmapping oldLecturersubjectmapping) {
      if (oldLecturersubjectmapping == null)
         return;
      if (this.lecturersubjectmapping != null)
         if (this.lecturersubjectmapping.contains(oldLecturersubjectmapping))
         {
            this.lecturersubjectmapping.remove(oldLecturersubjectmapping);
            oldLecturersubjectmapping.setLecturer((Lecturer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLecturersubjectmapping() {
      if (lecturersubjectmapping != null)
      {
         Lecturersubjectmapping oldLecturersubjectmapping;
         for (java.util.Iterator iter = getIteratorLecturersubjectmapping(); iter.hasNext();)
         {
            oldLecturersubjectmapping = (Lecturersubjectmapping)iter.next();
            iter.remove();
            oldLecturersubjectmapping.setLecturer((Lecturer)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Test> getTest() {
      if (test == null)
         test = new java.util.HashSet<Test>();
      return test;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTest() {
      if (test == null)
         test = new java.util.HashSet<Test>();
      return test.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTest */
   public void setTest(java.util.Collection<Test> newTest) {
      removeAllTest();
      for (java.util.Iterator iter = newTest.iterator(); iter.hasNext();)
         addTest((Test)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTest */
   public void addTest(Test newTest) {
      if (newTest == null)
         return;
      if (this.test == null)
         this.test = new java.util.HashSet<Test>();
      if (!this.test.contains(newTest))
      {
         this.test.add(newTest);
         newTest.setLecturer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTest */
   public void removeTest(Test oldTest) {
      if (oldTest == null)
         return;
      if (this.test != null)
         if (this.test.contains(oldTest))
         {
            this.test.remove(oldTest);
            oldTest.setLecturer((Lecturer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTest() {
      if (test != null)
      {
         Test oldTest;
         for (java.util.Iterator iter = getIteratorTest(); iter.hasNext();)
         {
            oldTest = (Test)iter.next();
            iter.remove();
            oldTest.setLecturer((Lecturer)null);
         }
      }
   }

public void addSubject(Subject subject) {
	// TODO Auto-generated method stub
	
}

public void removeSubject(Subject subject) {
	// TODO Auto-generated method stub
	
}

}