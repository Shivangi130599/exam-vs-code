/*package com.lti.test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


import com.lti.dao.GenericDao;
import com.lti.dao.QuestionDao;
import com.lti.dao.SearchDao;
import com.lti.dao.UserAnswerDao;
import com.lti.entity.Address;
import com.lti.entity.Exam;
import com.lti.entity.QuestionBank;
import com.lti.entity.Result;
import com.lti.entity.Subject;
import com.lti.entity.User;
import com.lti.entity.UserAnswer;

public class onlineExam2Test {
	
	@Test
	public void addUserAddressTogether() {

			
			GenericDao dao = new GenericDao();
			//============================User 1===========================
			User u = new User();
			u.setFirstName("Aakash");
			u.setMiddleName("Chandrabhushan");
			u.setLastName("Tiwari");
			u.setDateOfBirth(LocalDate.of(1999, 1, 15));
			u.setEmail("aakashtiwari15m@gmail.com");
			u.setGender("Male");
			u.setPassword("admin");
			u.setPhoneNo(829133199);
			u.setQualification("BE");
			u.setRights("admin");
			
			//============================User 1 address===========================	
			Address adr = new Address();
			adr.setLocality("Juhu");
			adr.setStreet("J.R. Mhatre Marg");
			adr.setLandmark("Kamat Medical");
			adr.setCity("Mumbai");
			adr.setPincode(400049);
			adr.setState("Maharashtra");
			adr.setCountry("Bharat");
			
			//============================User 2===========================
			User u1 = new User();
			u1.setFirstName("Nishita");
			u1.setMiddleName("Mukesh");
			u1.setLastName("Sodhia");
			u1.setDateOfBirth(LocalDate.of(1997, 5, 03));
			u1.setEmail("sodhiablue@gmail.com");
			u1.setGender("Female");
			u1.setPassword("user");
			u1.setPhoneNo(982078274);
			u1.setQualification("BE");
			u1.setRights("user");
			
			//============================User 2 address===========================
			Address adr1 = new Address();
			adr1.setLocality("Nerul");
			adr1.setStreet("Radial road lane 2");
			adr1.setLandmark("Demat");
			adr1.setCity("Navi MUmbai");
			adr1.setPincode(400706);
			adr1.setState("Maharashtra");
			adr1.setCountry("Bharat");
			
			
			u.setAddress(adr);
			u1.setAddress(adr1);
			
			dao.save(u);
			dao.save(u1);
	}
	
	@Test
	public void addSubAlongWithQuestions() {
		 GenericDao dao = new GenericDao();
		 
		 Subject sub =  new Subject();
		 sub.setSubName("Java_level_1");
		 
		 QuestionBank qb = new QuestionBank();
		 qb.setType("SC");
		 qb.setMarks(1);
		 qb.setQuestion("Which of the following is not a Java features?");
		 qb.setOption1("Dynamic");
		 qb.setOption2("Architecture Neutral");
		 qb.setOption3("Use of pointers");
		 qb.setOption4("Object-oriented");
		 qb.setCorrectAnswer("Use of pointers");
		 qb.setHint(null);
		 qb.setSubjects(sub);
		 
		 QuestionBank qb1 = new QuestionBank();
		 qb1.setType("SC");
		 qb1.setMarks(1);
		 qb1.setQuestion("Java is a ____________ programming language.");
		 qb1.setOption1("High level");
		 qb1.setOption2("Low level");
		 qb1.setOption3("Scripting");
		 qb1.setOption4("Not a programming language");
		 qb1.setCorrectAnswer("High level");
		 qb1.setHint(null);
		 qb.setSubjects(sub);
		 
		 QuestionBank qb2 = new QuestionBank();
		 qb2.setType("SC");
		 qb2.setMarks(1);
		 qb2.setQuestion("_____ is used to find and fix bugs in the Java programs.");
		 qb2.setOption1("JVM");
		 qb2.setOption2("JRE");
		 qb2.setOption3("JDK");
		 qb2.setOption4("JDB");
		 qb2.setCorrectAnswer("JDB");
		 qb2.setHint(null);
		 qb.setSubjects(sub);
		 
		 Subject sub1 =  new Subject();
		 sub1.setSubName("Java_level_2");
		 
		 QuestionBank qb3 = new QuestionBank();
		 qb3.setType("SC");
		 qb3.setMarks(1);
		 qb3.setQuestion("Which of the following creates a List of 3 visible items and multiple selections abled?");
		 qb3.setOption1("new List(false, 3)");
		 qb3.setOption2("new List(3, true)");
		 qb3.setOption3("new List(true, 3)");
		 qb3.setOption4("new List(3, false)");
		 qb3.setCorrectAnswer("new List(3, true)");
		 qb3.setHint(null);
		 qb.setSubjects(sub1);
		 
		 QuestionBank qb4 = new QuestionBank();
		 qb4.setType("SC");
		 qb4.setMarks(1);
		 qb4.setQuestion("What is the return type of the hashCode() method in the Object class?");
		 qb4.setOption1("Object");
		 qb4.setOption2("int");
		 qb4.setOption3("long");
		 qb4.setOption4("void");
		 qb4.setCorrectAnswer("int");
		 qb4.setHint(null);
		 qb.setSubjects(sub1);
		 
		 QuestionBank qb5 = new QuestionBank();
		 qb5.setType("SC");
		 qb5.setMarks(1);
		 qb5.setQuestion("Evaluate the following Java expression, if x=3, y=5, and z=10: ++z + y - y + z + x++");
		 qb5.setOption1("24");
		 qb5.setOption2("23");
		 qb5.setOption3("20");
		 qb5.setOption4("25");
		 qb5.setCorrectAnswer("24");
		 qb5.setHint(null);
		 qb.setSubjects(sub1);
		 
		 Subject sub2 =  new Subject();
		 sub2.setSubName("Java_level_3");
		 
		 QuestionBank qb6 = new QuestionBank();
		 qb6.setType("SC");
		 qb6.setMarks(1);
		 qb6.setQuestion("Which of the following for loop declaration is not valid?");
		 qb6.setOption1("for ( int i = 99; i >= 0; i / 9 )");
		 qb6.setOption2("for ( int i = 7; i <= 77; i += 7 )");
		 qb6.setOption3("for ( int i = 20; i >= 2; - -i )");
		 qb6.setOption4("for ( int i = 2; i <= 20; i = 2* i )");
		 qb6.setCorrectAnswer("for ( int i = 99; i >= 0; i / 9 )");
		 qb6.setHint(null);
		 qb.setSubjects(sub2);
		 
		 QuestionBank qb7 = new QuestionBank();
		 qb7.setType("SC");
		 qb7.setMarks(1);
		 qb7.setQuestion("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
		 qb7.setOption1("getClass()");
		 qb7.setOption2("intern()");
		 qb7.setOption3("getName()");
		 qb7.setOption4("toString()");
		 qb7.setCorrectAnswer("getName()");
		 qb7.setHint(null);
		 qb.setSubjects(sub2);
		 
		 QuestionBank qb8 = new QuestionBank();
		 qb8.setType("SC");
		 qb8.setMarks(1);
		 qb8.setQuestion("Which of the following is true about the anonymous inner class?");
		 qb8.setOption1("It has only methods");
		 qb8.setOption2("Objects can't be created");
		 qb8.setOption3("It has a fixed class name");
		 qb8.setOption4("It has no class name");
		 qb8.setCorrectAnswer("It has no class name");
		 qb8.setHint(null);
		 qb.setSubjects(sub2);
		 
		 Subject sub3 =  new Subject();
		 sub3.setSubName("Python_level_1");
		 
		 QuestionBank qb9 = new QuestionBank();
		 qb9.setType("SC");
		 qb9.setMarks(1);
		 qb9.setQuestion("What is the maximum possible length of an identifier?");
		 qb9.setOption1("16");
		 qb9.setOption2("32");
		 qb9.setOption3("64");
		 qb9.setOption4("None of these above");
		 qb9.setCorrectAnswer("None of these above");
		 qb9.setHint(null);
		 qb.setSubjects(sub3);
		 
		 QuestionBank qb10 = new QuestionBank();
		 qb10.setType("SC");
		 qb10.setMarks(1);
		 qb10.setQuestion("Who developed the Python language?");
		 qb10.setOption1("Zim Den");
		 qb10.setOption2("Guido van Rossum");
		 qb10.setOption3("Niene Stom");
		 qb10.setOption4("Wick van Rossum");
		 qb10.setCorrectAnswer("Guido van Rossum");
		 qb10.setHint(null);
		 qb.setSubjects(sub3);
		 
		 QuestionBank qb11 = new QuestionBank();
		 qb11.setType("SC");
		 qb11.setMarks(1);
		 qb11.setQuestion("In which year was the Python language developed?");
		 qb11.setOption1("1995");
		 qb11.setOption2("1972");
		 qb11.setOption3("1981");
		 qb11.setOption4("1989");
		 qb11.setCorrectAnswer("1989");
		 qb11.setHint(null);
		 qb.setSubjects(sub3);
		 
		 Subject sub4=  new Subject();
		 sub4.setSubName("Python_level_2");
		 
		 QuestionBank qb12 = new QuestionBank();
		 qb12.setType("SC");
		 qb12.setMarks(1);
		 qb12.setQuestion("In which language is Python written?");
		 qb12.setOption1("English");
		 qb12.setOption2("PHP");
		 qb12.setOption3("C");
		 qb12.setOption4("All of these above");
		 qb12.setCorrectAnswer("C");
		 qb12.setHint(null);
		 qb.setSubjects(sub4);
		 
		 QuestionBank qb13 = new QuestionBank();
		 qb13.setType("SC");
		 qb13.setMarks(1);
		 qb13.setQuestion("Which one of the following is the correct extension of the Python file?");
		 qb13.setOption1(".py");
		 qb13.setOption2(".python");
		 qb13.setOption3(".p");
		 qb13.setOption4("None of these");
		 qb13.setCorrectAnswer(".py");
		 qb13.setHint(null);
		 qb.setSubjects(sub4);
		 
		 QuestionBank qb14 = new QuestionBank();
		 qb14.setType("SC");
		 qb14.setMarks(1);
		 qb14.setQuestion("In which year was the Python 3.0 version developed?");
		 qb14.setOption1("2008");
		 qb14.setOption2("2000");
		 qb14.setOption3("2010");
		 qb14.setOption4("2005");
		 qb14.setCorrectAnswer("2008");
		 qb14.setHint(null);
		 qb.setSubjects(sub4);
		 
		 Subject sub5 =  new Subject();
		 sub5.setSubName("Python_level_3");
		 
		 QuestionBank qb15 = new QuestionBank();
		 qb15.setType("SC");
		 qb15.setMarks(1);
		 qb15.setQuestion("Which character is used in Python to make a single line comment?");
		 qb15.setOption1("/");
		 qb15.setOption2("//");
		 qb15.setOption3("#");
		 qb15.setOption4("!");
		 qb15.setCorrectAnswer("#");
		 qb15.setHint(null);
		 qb15.setSubjects(sub5);
		 
		 QuestionBank qb16 = new QuestionBank();
		 qb16.setType("SC");
		 qb16.setMarks(1);
		 qb16.setQuestion("What is the method inside the class in python language?");
		 qb16.setOption1("Object");
		 qb16.setOption2("Function");
		 qb16.setOption3("Attribute");
		 qb16.setOption4("Argument");
		 qb16.setCorrectAnswer("Function");
		 qb16.setHint(null);
		 qb.setSubjects(sub5);
		 
		 QuestionBank qb17 = new QuestionBank();
		 qb17.setType("SC");
		 qb17.setMarks(1);
		 qb17.setQuestion("Which of the following declarations is incorrect?");
		 qb17.setOption1("_x = 2");
		 qb17.setOption2("__x = 3");
		 qb17.setOption3("__xyz__ = 5");
		 qb17.setOption4("None of these");
		 qb17.setCorrectAnswer("None of these");
		 qb17.setHint(null);
		 qb.setSubjects(sub5);
		 
		 qb.setSubjects(sub);
		 qb1.setSubjects(sub);
		 qb2.setSubjects(sub);
		 qb3.setSubjects(sub1);
		 qb4.setSubjects(sub1);
		 qb5.setSubjects(sub1);
		 
		 qb6.setSubjects(sub2);
		 qb7.setSubjects(sub2);
		 qb8.setSubjects(sub2);
		 qb9.setSubjects(sub3);
		 qb10.setSubjects(sub3);
		 qb11.setSubjects(sub3);
		 
		 qb12.setSubjects(sub4);
		 qb13.setSubjects(sub4);
		 qb14.setSubjects(sub4);
		 qb15.setSubjects(sub5);
		 qb16.setSubjects(sub5);
		 qb17.setSubjects(sub5);
		 
		 List<QuestionBank> q = new ArrayList<QuestionBank>();
		 q.add(qb);
		 q.add(qb1);
		 q.add(qb2);
		 
		 List<QuestionBank> q1 = new ArrayList<QuestionBank>();
		 q1.add(qb3);
		 q1.add(qb4);
		 q1.add(qb5);
		 
		 List<QuestionBank> q2 = new ArrayList<QuestionBank>();
		 q2.add(qb6);
		 q2.add(qb7);
		 q2.add(qb8);
		 
		 List<QuestionBank> q3 = new ArrayList<QuestionBank>();
		 q3.add(qb9);
		 q3.add(qb10);
		 q3.add(qb11);
		 
		 List<QuestionBank> q4 = new ArrayList<QuestionBank>();
		 q4.add(qb12);
		 q4.add(qb13);
		 q4.add(qb14);
		 
		 List<QuestionBank> q5 = new ArrayList<QuestionBank>();
		 q5.add(qb15);
		 q5.add(qb16);
		 q5.add(qb17);
		 
		 sub.setQuestions(q);
		 sub1.setQuestions(q1);
		 sub2.setQuestions(q2);
		 sub3.setQuestions(q3);
		 sub4.setQuestions(q4);
		 sub5.setQuestions(q5);
		 
		 dao.save(sub);
		 dao.save(sub1);
		 dao.save(sub2);
		 dao.save(sub3);
		 dao.save(sub4);
		 dao.save(sub5);
	 
	}
	
	@Test
	public void examWithUser() {
		
		GenericDao dao = new GenericDao();
		
		User u = (User)dao.fetch(User.class, 48);
		Exam ex = new Exam();
		ex.setDate(LocalDate.now());
		ex.setUser(u);
		
		dao.save(ex);		
	}
	
	@Test
	public void userAndResult() {
		
		GenericDao dao = new GenericDao();
		User u = (User)dao.fetch(User.class, 48);
		Subject sub = (Subject)dao.fetch(Subject.class, 62);
		
		Result result = new Result();
		result.setScore(50);
		result.setAttempts(1);
		result.setSubject(sub);
		
		result.setUser(u);
		
		dao.save(result);
		
	}
@Test
	public void fetchUserAnswer() {
		GenericDao dao = new GenericDao();
		
		User u = (User)dao.fetch(User.class, 509);
		QuestionBank qb = (QuestionBank)dao.fetch(QuestionBank.class, 533);
		Exam exam = (Exam)dao.fetch(Exam.class, 537);
		
		UserAnswer ua = new UserAnswer();
		ua.setAnswerGiven(qb.getOption2());
		
		ua.setQuestionBank(qb);
		ua.setUser(u);
		ua.setExam(exam);
		
		dao.save(ua);
	}
	@Test
	public void fetchQuestionsUsingSubject() {
		QuestionSubjectDao dao = new QuestionSubjectDao();
		//QuestionBank q= (QuestionBank)dao.fetch(QuestionBank.class, 59);
		Subject sub = (Subject)dao.fetch(Subject.class, 66);
		List<QuestionBank> list = dao.fetchQuestions(sub.getId());
		System.out.println(list.toString().toString().toString());
		System.out.println(list.getClass());
		System.out.println(list.size());
		for(QuestionBank qb:list) {
			 System.out.println(list.get(i));
			 System.out.println(list.get(qb));
			 System.out.println(qb.getQuestion());
			 System.out.println(qb.getOption1());
			 System.out.println(qb.getOption2());
			 System.out.println(qb.getOption3());
			 System.out.println(qb.getOption4());
			 System.out.println(qb.getMarks());
			 System.out.println(qb.getSubjects().getSubName());
		
	
	@Test
	public void fetchUserDetails() {
		SearchDao dao = new SearchDao();
		dao.fetchresults(62,"Maharashtra","Mumbai",50);
	}
	@Test
	
	public void fetchUserAnswer() {
		UserAnswerDao dao = new UserAnswerDao();
		List <UserAnswer> list = (List<UserAnswer>) dao.fetchanswers(48);
		for(UserAnswer u : list) {
			System.out.println(u.getAnswerGiven() + "," + u.getQuestionBank().getQuestion());
		}
	}
}*/
