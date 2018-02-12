package classDefination;

/***********************************************************************
 * Module:  TestSection.java
 * Author:  TIEN
 * Purpose: Defines the Class TestSection
 ***********************************************************************/

import java.util.*;


public class TestSection {

   /**
 * @uml.property  name="testsecId"
 */
public long testsecId;
   /**
 * @uml.property  name="testsecName"
 */
public java.lang.String testsecName;
   /**
 * @uml.property  name="testsecNote"
 */
public java.lang.String testsecNote;
   
   /**
 * @pdRoleInfo   migr=no name=TestItem assc=testItemInsideOfATest coll=java.util.Collection impl=java.util.HashSet mult=0..
 * @uml.property  name="testItem"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.TestItem"
 */
   public java.util.Collection<TestItem> testItem;
   
   
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

public void setTest(Test test) {
	// TODO Auto-generated method stub
	
}

}