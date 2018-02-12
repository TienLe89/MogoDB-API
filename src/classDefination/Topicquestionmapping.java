package classDefination;

/***********************************************************************
 * Module:  Topicquestionmapping.java
 * Author:  TIEN
 * Purpose: Defines the Class Topicquestionmapping
 ***********************************************************************/

import java.util.*;


public class Topicquestionmapping {

   /**
 * @uml.property  name="questionId"
 */
public int questionId;
   
   /**
 * @pdRoleInfo   migr=no name=Question assc=fkTopicquestionmapping2 mult=1..1 side=A
 * @uml.property  name="question"
 * @uml.associationEnd  
 */
   public Question question;
   /**
 * @pdRoleInfo   migr=no name=Topic assc=fkTopicquestionmapping mult=1..1 side=A
 * @uml.property  name="topic"
 * @uml.associationEnd  
 */
   public Topic topic;
   
   
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="question"
 */
   public Question getQuestion() {
      return question;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newQuestion
 * @uml.property  name="question"
 */
   public void setQuestion(Question newQuestion) {
      if (this.question == null || !this.question.equals(newQuestion))
      {
         if (this.question != null)
         {
            Question oldQuestion = this.question;
            this.question = null;
            oldQuestion.removeTopicquestionmapping(this);
         }
         if (newQuestion != null)
         {
            this.question = newQuestion;
            this.question.addTopicquestionmapping(this);
         }
      }
   }
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="topic"
 */
   public Topic getTopic() {
      return topic;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newTopic
 * @uml.property  name="topic"
 */
   public void setTopic(Topic newTopic) {
      if (this.topic == null || !this.topic.equals(newTopic))
      {
         if (this.topic != null)
         {
            Topic oldTopic = this.topic;
            this.topic = null;
            oldTopic.removeTopicquestionmapping(this);
         }
         if (newTopic != null)
         {
            this.topic = newTopic;
            this.topic.addTopicquestionmapping(this);
         }
      }
   }

}