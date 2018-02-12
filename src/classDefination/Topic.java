package classDefination;

/***********************************************************************
 * Module:  Topic.java
 * Author:  TIEN
 * Purpose: Defines the Class Topic
 ***********************************************************************/

import java.util.*;

public class Topic {

	/**
	 * @uml.property  name="topicId"
	 */
	public long topicId;
	/**
	 * @uml.property  name="topicName"
	 */
	public java.lang.String topicName;
	/**
	 * @uml.property  name="topicNote"
	 */
	public java.lang.String topicNote;

	/**
	 * @uml.property  name="question"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="topic:classDefination.Question"
	 */
	public java.util.Collection<Question> question;
	/**
	 * @uml.property  name="questionShortcut"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.QuestionShortcut"
	 */
	public java.util.Collection<QuestionShortcut> questionShortcut;
	/**
	 * @uml.property  name="topicShortcut" multiplicity="(0 -1)"
	 */
	public java.util.Collection<Topicshortcut> TopicShortcut;

	/**
	 * @uml.property  name="topicB"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="classDefination.Topic"
	 */
	public java.util.Collection<Topic> topicB;
	/**
	 * @uml.property  name="subject"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="topic:classDefination.Subject"
	 */
	public java.util.Collection<Subject> subject;

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

	/**
	 * @pdGenerated default setter
	 * @param newQuestion
	 */
	public void setQuestion(java.util.Collection<Question> newQuestion) {
		removeAllQuestion();
		for (java.util.Iterator iter = newQuestion.iterator(); iter.hasNext();)
			addQuestion((Question) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newQuestion
	 */
	public void addQuestion(Question newQuestion) {
		if (newQuestion == null)
			return;
		if (this.question == null)
			this.question = new java.util.HashSet<Question>();
		if (!this.question.contains(newQuestion)) {
			this.question.add(newQuestion);
			newQuestion.addTopic(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldQuestion
	 */
	public void removeQuestion(Question oldQuestion) {
		if (oldQuestion == null)
			return;
		if (this.question != null)
			if (this.question.contains(oldQuestion)) {
				this.question.remove(oldQuestion);
				oldQuestion.removeTopic(this);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllQuestion() {
		if (question != null) {
			Question oldQuestion;
			for (java.util.Iterator iter = getIteratorQuestion(); iter
					.hasNext();) {
				oldQuestion = (Question) iter.next();
				iter.remove();
				oldQuestion.removeTopic(this);
			}
		}
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

	/**
	 * @pdGenerated default setter
	 * @param newQuestionShortcut
	 */
	public void setQuestionShortcut(
			java.util.Collection<QuestionShortcut> newQuestionShortcut) {
		removeAllQuestionShortcut();
		for (java.util.Iterator iter = newQuestionShortcut.iterator(); iter
				.hasNext();)
			addQuestionShortcut((QuestionShortcut) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newQuestionShortcut
	 */
	public void addQuestionShortcut(QuestionShortcut newQuestionShortcut) {
		if (newQuestionShortcut == null)
			return;
		if (this.questionShortcut == null)
			this.questionShortcut = new java.util.HashSet<QuestionShortcut>();
		if (!this.questionShortcut.contains(newQuestionShortcut))
			this.questionShortcut.add(newQuestionShortcut);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldQuestionShortcut
	 */
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
	public java.util.Collection<Topic> getTopicB() {
		if (topicB == null)
			topicB = new java.util.HashSet<Topic>();
		return topicB;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTopicB() {
		if (topicB == null)
			topicB = new java.util.HashSet<Topic>();
		return topicB.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTopicB
	 */
	public void setTopicB(java.util.Collection<Topic> newTopicB) {
		removeAllTopicB();
		for (java.util.Iterator iter = newTopicB.iterator(); iter.hasNext();)
			addTopicB((Topic) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTopic
	 */
	public void addTopicB(Topic newTopic) {
		if (newTopic == null)
			return;
		if (this.topicB == null)
			this.topicB = new java.util.HashSet<Topic>();
		if (!this.topicB.contains(newTopic))
			this.topicB.add(newTopic);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTopic
	 */
	public void removeTopicB(Topic oldTopic) {
		if (oldTopic == null)
			return;
		if (this.topicB != null)
			if (this.topicB.contains(oldTopic))
				this.topicB.remove(oldTopic);
	}

	/** @pdGenerated default removeAll */
	public void removeAllTopicB() {
		if (topicB != null)
			topicB.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Subject> getSubject() {
		if (subject == null)
			subject = new java.util.HashSet<Subject>();
		return subject;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorSubject() {
		if (subject == null)
			subject = new java.util.HashSet<Subject>();
		return subject.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newSubject
	 */
	public void setSubject(java.util.Collection<Subject> newSubject) {
		removeAllSubject();
		for (java.util.Iterator iter = newSubject.iterator(); iter.hasNext();)
			addSubject((Subject) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newSubject
	 */
	public void addSubject(Subject newSubject) {
		if (newSubject == null)
			return;
		if (this.subject == null)
			this.subject = new java.util.HashSet<Subject>();
		if (!this.subject.contains(newSubject)) {
			this.subject.add(newSubject);
			newSubject.addTopic(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldSubject
	 */
	public void removeSubject(Subject oldSubject) {
		if (oldSubject == null)
			return;
		if (this.subject != null)
			if (this.subject.contains(oldSubject)) {
				this.subject.remove(oldSubject);
				oldSubject.removeTopic(this);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllSubject() {
		if (subject != null) {
			Subject oldSubject;
			for (java.util.Iterator iter = getIteratorSubject(); iter.hasNext();) {
				oldSubject = (Subject) iter.next();
				iter.remove();
				oldSubject.removeTopic(this);
			}
		}
	}

	public void setLecturer(Lecturer lecturer) {
		// TODO Auto-generated method stub

	}

	public void addSubjecttopicmapping(Subjecttopicmapping subjecttopicmapping) {
		// TODO Auto-generated method stub

	}

	public void removeSubjecttopicmapping(
			Subjecttopicmapping subjecttopicmapping) {
		// TODO Auto-generated method stub

	}

	public void removeTopicquestionmapping(
			Topicquestionmapping topicquestionmapping) {
		// TODO Auto-generated method stub
		
	}

	public void addTopicquestionmapping(
			Topicquestionmapping topicquestionmapping) {
		// TODO Auto-generated method stub
		
	}

}
