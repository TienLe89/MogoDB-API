package classDefination;

/***********************************************************************
 * Module:  Subject.java
 * Author:  TIEN
 * Purpose: Defines the Class Subject
 ***********************************************************************/

import java.util.*;


public class Subject {
 
   /**
 * @uml.property  name="subjectId"
 */
public java.lang.String subjectId;
   /**
 * @uml.property  name="subjectName"
 */
public java.lang.String subjectName;
   /**
 * @uml.property  name="subjectShortname"
 */
public java.lang.String subjectShortname;    
   /**
 * @uml.property  name="topic"
 * @uml.associationEnd  multiplicity="(0 -1)" inverse="subject:classDefination.Topic"
 */
public java.util.Collection<Topic> topic;
   
   
   /**
 * @uml.property  name="lecturer"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.Lecturer"
 */
public java.util.Collection<Lecturer> lecturer;
   
   
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
         newTopic.addSubject(this);      
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
            oldTopic.removeSubject(this);
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
            oldTopic.removeSubject(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Lecturer> getLecturer() {
      if (lecturer == null)
         lecturer = new java.util.HashSet<Lecturer>();
      return lecturer;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLecturer() {
      if (lecturer == null)
         lecturer = new java.util.HashSet<Lecturer>();
      return lecturer.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLecturer */
   public void setLecturer(java.util.Collection<Lecturer> newLecturer) {
      removeAllLecturer();
      for (java.util.Iterator iter = newLecturer.iterator(); iter.hasNext();)
         addLecturer((Lecturer)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLecturer */
   public void addLecturer(Lecturer newLecturer) {
      if (newLecturer == null)
         return;
      if (this.lecturer == null)
         this.lecturer = new java.util.HashSet<Lecturer>();
      if (!this.lecturer.contains(newLecturer))
      {
         this.lecturer.add(newLecturer);
         newLecturer.addSubject(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldLecturer */
   public void removeLecturer(Lecturer oldLecturer) {
      if (oldLecturer == null)
         return;
      if (this.lecturer != null)
         if (this.lecturer.contains(oldLecturer))
         {
            this.lecturer.remove(oldLecturer);
            oldLecturer.removeSubject(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLecturer() {
      if (lecturer != null)
      {
         Lecturer oldLecturer;
         for (java.util.Iterator iter = getIteratorLecturer(); iter.hasNext();)
         {
            oldLecturer = (Lecturer)iter.next();
            iter.remove();
            oldLecturer.removeSubject(this);
         }
      }
   }

public void removeLecturersubjectmapping(
		Lecturersubjectmapping lecturersubjectmapping) {
	// TODO Auto-generated method stub
	
}

public void addLecturersubjectmapping(
		Lecturersubjectmapping lecturersubjectmapping) {
	// TODO Auto-generated method stub
	
}

public void removeSubjecttopicmapping(Subjecttopicmapping subjecttopicmapping) {
	// TODO Auto-generated method stub
	
}

public void addSubjecttopicmapping(Subjecttopicmapping subjecttopicmapping) {
	// TODO Auto-generated method stub
	
}

}