package classDefination;
/***********************************************************************
 * Module:  Subjecttopicmapping.java
 * Author:  TIEN
 * Purpose: Defines the Class Subjecttopicmapping
 ***********************************************************************/

import java.util.*;


public class Subjecttopicmapping {

   /**
 * @uml.property  name="topicId"
 */
public int topicId;
   
   /**
 * @pdRoleInfo   migr=no name=Topic assc=fkSubjecttopicmapping2 mult=1..1 side=A
 * @uml.property  name="topic"
 * @uml.associationEnd  readOnly="true"
 */
   public Topic topic;
   /**
 * @pdRoleInfo   migr=no name=Subject assc=fkSubjecttopicmapping mult=1..1 side=A
 * @uml.property  name="subject"
 * @uml.associationEnd  readOnly="true"
 */
   public Subject subject;
   
   
   /** @pdGenerated default parent getter */
   public Topic getTopic() {
      return topic;
   }
   
   /** @pdGenerated default parent setter
     * @param newTopic */
   public void setTopic(Topic newTopic) {
      if (this.topic == null || !this.topic.equals(newTopic))
      {
         if (this.topic != null)
         {
            Topic oldTopic = this.topic;
            this.topic = null;
            oldTopic.removeSubjecttopicmapping(this);
         }
         if (newTopic != null)
         {
            this.topic = newTopic;
            this.topic.addSubjecttopicmapping(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Subject getSubject() {
      return subject;
   }
   
   /** @pdGenerated default parent setter
     * @param newSubject */
   public void setSubject(Subject newSubject) {
      if (this.subject == null || !this.subject.equals(newSubject))
      {
         if (this.subject != null)
         {
            Subject oldSubject = this.subject;
            this.subject = null;
            oldSubject.removeSubjecttopicmapping(this);
         }
         if (newSubject != null)
         {
            this.subject = newSubject;
            this.subject.addSubjecttopicmapping(this);
         }
      }
   }

}