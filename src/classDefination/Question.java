package classDefination;

/***********************************************************************
 * Module:  Question.java
 * Author:  TIEN
 * Purpose: Defines the Class Question
 ***********************************************************************/

import java.util.*;


public class Question {

   /**
 * @uml.property  name="questionId"
 */
public long questionId;   
   /**
 * @uml.property  name="questionDesc"
 */
public java.lang.String questionDesc;
   /**
 * @uml.property  name="questionType"
 */
public java.lang.String questionType;  
   /**
 * @uml.property  name="questionLevel"
 */
public int questionLevel;
   
 
   /**
 * @uml.property  name="answerItem"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.AnswerItem"
 */
public java.util.Collection<AnswerItem> answerItem;   
   /**
 * @uml.property  name="questionImage"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.QuestionImage"
 */
public java.util.Collection<QuestionImage> questionImage;  
   /**
 * @uml.property  name="questionShortcut"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.QuestionShortcut"
 */
public java.util.Collection<QuestionShortcut> questionShortcut;
   /**
 * @uml.property  name="testItem"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.TestItem"
 */
public java.util.Collection<TestItem> testItem;
   /**
 * @uml.property  name="topic"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="question:classDefination.Topic"
 */
public java.util.Collection<Topic> topic;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<AnswerItem> getAnswerItem() {
      if (answerItem == null)
         answerItem = new java.util.HashSet<AnswerItem>();
      return answerItem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAnswerItem() {
      if (answerItem == null)
         answerItem = new java.util.HashSet<AnswerItem>();
      return answerItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAnswerItem */
   public void setAnswerItem(java.util.Collection<AnswerItem> newAnswerItem) {
      removeAllAnswerItem();
      for (java.util.Iterator iter = newAnswerItem.iterator(); iter.hasNext();)
         addAnswerItem((AnswerItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAnswerItem */
   public void addAnswerItem(AnswerItem newAnswerItem) {
      if (newAnswerItem == null)
         return;
      if (this.answerItem == null)
         this.answerItem = new java.util.HashSet<AnswerItem>();
      if (!this.answerItem.contains(newAnswerItem))
         this.answerItem.add(newAnswerItem);
   }
   
   /** @pdGenerated default remove
     * @param oldAnswerItem */
   public void removeAnswerItem(AnswerItem oldAnswerItem) {
      if (oldAnswerItem == null)
         return;
      if (this.answerItem != null)
         if (this.answerItem.contains(oldAnswerItem))
            this.answerItem.remove(oldAnswerItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAnswerItem() {
      if (answerItem != null)
         answerItem.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<QuestionImage> getQuestionImage() {
      if (questionImage == null)
         questionImage = new java.util.HashSet<QuestionImage>();
      return questionImage;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuestionImage() {
      if (questionImage == null)
         questionImage = new java.util.HashSet<QuestionImage>();
      return questionImage.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuestionImage */
   public void setQuestionImage(java.util.Collection<QuestionImage> newQuestionImage) {
      removeAllQuestionImage();
      for (java.util.Iterator iter = newQuestionImage.iterator(); iter.hasNext();)
         addQuestionImage((QuestionImage)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuestionImage */
   public void addQuestionImage(QuestionImage newQuestionImage) {
      if (newQuestionImage == null)
         return;
      if (this.questionImage == null)
         this.questionImage = new java.util.HashSet<QuestionImage>();
      if (!this.questionImage.contains(newQuestionImage))
         this.questionImage.add(newQuestionImage);
   }
   
   /** @pdGenerated default remove
     * @param oldQuestionImage */
   public void removeQuestionImage(QuestionImage oldQuestionImage) {
      if (oldQuestionImage == null)
         return;
      if (this.questionImage != null)
         if (this.questionImage.contains(oldQuestionImage))
            this.questionImage.remove(oldQuestionImage);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuestionImage() {
      if (questionImage != null)
         questionImage.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<QuestionShortcut> getQuestionShortcut() {
      if (questionShortcut == null)
         questionShortcut = new java.util.HashSet<QuestionShortcut>();
      return questionShortcut;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuestionShortcut() {
      if (questionShortcut == null)
         questionShortcut = new java.util.HashSet<QuestionShortcut>();
      return questionShortcut.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuestionShortcut */
   public void setQuestionShortcut(java.util.Collection<QuestionShortcut> newQuestionShortcut) {
      removeAllQuestionShortcut();
      for (java.util.Iterator iter = newQuestionShortcut.iterator(); iter.hasNext();)
         addQuestionShortcut((QuestionShortcut)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuestionShortcut */
   public void addQuestionShortcut(QuestionShortcut newQuestionShortcut) {
      if (newQuestionShortcut == null)
         return;
      if (this.questionShortcut == null)
         this.questionShortcut = new java.util.HashSet<QuestionShortcut>();
      if (!this.questionShortcut.contains(newQuestionShortcut))
         this.questionShortcut.add(newQuestionShortcut);
   }
   
   /** @pdGenerated default remove
     * @param oldQuestionShortcut */
   public void removeQuestionShortcut(QuestionShortcut oldQuestionShortcut) {
      if (oldQuestionShortcut == null)
         return;
      if (this.questionShortcut != null)
         if (this.questionShortcut.contains(oldQuestionShortcut))
            this.questionShortcut.remove(oldQuestionShortcut);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuestionShortcut() {
      if (questionShortcut != null)
         questionShortcut.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<TestItem> getTestItem() {
      if (testItem == null)
         testItem = new java.util.HashSet<TestItem>();
      return testItem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTestItem() {
      if (testItem == null)
         testItem = new java.util.HashSet<TestItem>();
      return testItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTestItem */
   public void setTestItem(java.util.Collection<TestItem> newTestItem) {
      removeAllTestItem();
      for (java.util.Iterator iter = newTestItem.iterator(); iter.hasNext();)
         addTestItem((TestItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTestItem */
   public void addTestItem(TestItem newTestItem) {
      if (newTestItem == null)
         return;
      if (this.testItem == null)
         this.testItem = new java.util.HashSet<TestItem>();
      if (!this.testItem.contains(newTestItem))
         this.testItem.add(newTestItem);
   }
   
   /** @pdGenerated default remove
     * @param oldTestItem */
   public void removeTestItem(TestItem oldTestItem) {
      if (oldTestItem == null)
         return;
      if (this.testItem != null)
         if (this.testItem.contains(oldTestItem))
            this.testItem.remove(oldTestItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTestItem() {
      if (testItem != null)
         testItem.clear();
   }
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
         newTopic.addQuestion(this);      
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
            oldTopic.removeQuestion(this);
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
            oldTopic.removeQuestion(this);
         }
      }
   }

public void setLecturer(Lecturer lecturer) {
	// TODO Auto-generated method stub
	
}

public void addTopicquestionmapping(Topicquestionmapping topicquestionmapping) {
	// TODO Auto-generated method stub
	
}

public void removeTopicquestionmapping(Topicquestionmapping topicquestionmapping) {
	// TODO Auto-generated method stub
	
}



}
