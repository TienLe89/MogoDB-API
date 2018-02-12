package classDefination;

/***********************************************************************
 * Module:  Lecturersubjectmapping.java
 * Author:  TIEN
 * Purpose: Defines the Class Lecturersubjectmapping
 ***********************************************************************/

import java.util.*;

/** @pdOid 325619b9-1e3e-40f1-93dc-d67a9d826849 */
public class Lecturersubjectmapping {
   /**
 * @pdOid   ed852ec9-5992-479a-99c7-8f2ccac38968
 * @uml.property  name="subjectId"
 */
   public java.lang.String subjectId;
   
   /**
 * @pdRoleInfo   migr=no name=Subject assc=fkLecturersubjectmapping2 mult=1..1 side=A
 * @uml.property  name="subject"
 * @uml.associationEnd  
 */
   public Subject subject;
   /**
 * @pdRoleInfo   migr=no name=Lecturer assc=fkLecturersubjectmapping mult=1..1 side=A
 * @uml.property  name="lecturer"
 * @uml.associationEnd  inverse="lecturersubjectmapping:classDefination.Lecturer"
 */
   public Lecturer lecturer;
   
   
   /**
 * @pdGenerated  default parent getter
 * @uml.property  name="subject"
 */
   public Subject getSubject() {
      return subject;
   }
   
   /**
 * @pdGenerated  default parent setter
 * @param  newSubject
 * @uml.property  name="subject"
 */
   public void setSubject(Subject newSubject) {
      if (this.subject == null || !this.subject.equals(newSubject))
      {
         if (this.subject != null)
         {
            Subject oldSubject = this.subject;
            this.subject = null;
            oldSubject.removeLecturersubjectmapping(this);
         }
         if (newSubject != null)
         {
            this.subject = newSubject;
            this.subject.addLecturersubjectmapping(this);
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
            oldLecturer.removeLecturersubjectmapping(this);
         }
         if (newLecturer != null)
         {
            this.lecturer = newLecturer;
            this.lecturer.addLecturersubjectmapping(this);
         }
      }
   }

}