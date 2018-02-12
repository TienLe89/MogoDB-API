package classDefination;

/***********************************************************************
 * Module:  TestProcessAnswer.java
 * Author:  TIEN
 * Purpose: Defines the Class TestProcessAnswer
 ***********************************************************************/

import java.util.*;


public class TestProcessAnswer {

   /**
 * @uml.property  name="ansiDesc"
 */
public java.lang.String ansiDesc;
   /**
 * @uml.property  name="ansiValue"
 */
public java.lang.String ansiValue;
   /**
 * @uml.property  name="ansiIsSolution"
 */
public boolean ansiIsSolution;
   /**
 * @uml.property  name="testitemScore"
 */
public float testitemScore;   
   
   /**
 * @uml.property  name="fk_TestProcessAnswer_TestProcess1"
 * @uml.associationEnd  readOnly="true"
 */
public TestProcess fk_TestProcessAnswer_TestProcess1;
   /**
 * @uml.property  name="fk_TestProcessAnswer_question1"
 * @uml.associationEnd  readOnly="true"
 */
public Question fk_TestProcessAnswer_question1;

}