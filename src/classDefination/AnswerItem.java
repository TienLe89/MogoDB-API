package classDefination;

/***********************************************************************
 * Module:  AnswerItem.java
 * Author:  TIEN
 * Purpose: Defines the Class AnswerItem
 ***********************************************************************/

import java.util.*;


public class AnswerItem {

   /**
 * @uml.property  name="ansiId"
 */
public long ansiId;

   /**
 * @uml.property  name="ansiDesc"
 */
public java.lang.String ansiDesc;
   /**
 * For Fill-in-blank question
 * @uml.property  name="ansiValue"
 */
   public java.lang.String ansiValue;
   /**
 * @uml.property  name="ansiIsSolution"
 */
public boolean ansiIsSolution;
   
   /**
 * @pdRoleInfo   migr=no name=QuestionImage assc=picturesForAnswerItems coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="questionImage"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.QuestionImage"
 */
   public java.util.Collection<QuestionImage> questionImage;
   
   
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

}