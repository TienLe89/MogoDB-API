package classDefination;

/***********************************************************************
 * Module:  Topicshortcut.java
 * Author:  TIEN
 * Purpose: Defines the Class Topicshortcut
 ***********************************************************************/

import java.util.*;


public class Topicshortcut {

   /**
 * @uml.property  name="topicshortId"
 */
public long topicshortId;
   /**
 * @uml.property  name="topicId"
 */
public int topicId;
   /**
 * @uml.property  name="topTopicId"
 */
public int topTopicId;

   /**
 * @uml.property  name="topicshortNote"
 */
public java.lang.String topicshortNote;
   
   /**
 * @pdRoleInfo   migr=no name=Topic assc=fkTopicShortcutInsideATopic mult=0..1 side=A
 * @uml.property  name="topic"
 * @uml.associationEnd  readOnly="true"
 */
   public Topic topic;



}