/**
 * @author Anjana Kumari
 */
package com.oop_2019.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.oop_2019.models.Exam;
import com.oop_2019.models.Student;
import com.oop_2019.models.Subject;
import com.oop_2019.models.Teacher;

/**
 *  This class helps to build model classes
 *  
 * @author Anjana
 *
 */
public class ModelUtil {

	/**
	 *  This method will build a Teacher object form the given SQL result and will return it
	 *  
	 *  @param result SQL result
	 *  
	 *  @return A Teacher object with the details of the given SQL result
	 *  
	 *  @throws SQLException
	 * 
	 */
	
	public static Teacher getTeacherFromSQLResult(ResultSet result) throws SQLException {
		Teacher teacher = new Teacher(result.getString(1));
		
		teacher.setTitle(result.getString(2));
		teacher.setFirstName(result.getString(3));
		teacher.setLastName(result.getString(4));
		teacher.setSection(result.getString(5));
		teacher.setBirthday(result.getDate(6));
		teacher.setEmail(result.getString(7));		
		teacher.setPhone(result.getString(9));
		teacher.setCity(result.getString(10));
		teacher.setState(result.getString(11));
		teacher.setZip(result.getString(12));
		teacher.setGender(result.getString(13));
		teacher.setPosition(result.getString(14));
		teacher.setImage(result.getString(15));
		
		
		return teacher;
		
		
	}
	
	/**
	 *  This method will build a Teacher object form the given SQL result and will return it
	 *  
	 *  @param result SQL result
	 *  
	 *  @return A Teacher object with the details of the given SQL result
	 *  
	 *  @throws SQLException
	 * 
	 */
	
	public static Student getStudentFromSQLResult(ResultSet result) throws SQLException {
		Student student = new Student();
		student.setId(result.getString(1));
		
		student.setFirstName(result.getString(2));
		student.setLastName(result.getString(3));
		student.setSection(result.getString(4));
		student.setBirthday(result.getDate(5));
		student.setEmail(result.getString(6));		
		student.setPhone(result.getString(7));
		student.setCity(result.getString(8));
		student.setState(result.getString(9));
		student.setZip(result.getString(10));
		student.setGender(result.getString(11));
		student.setGrade(result.getString(12));
		student.setRoll(result.getInt(13));
		student.setImage(result.getString(14));
		
		
		return student;
		
		
	}
	
	/**
	 *  This method will build a Teacher object form the given SQL result and will return it
	 *  
	 *  @param result SQL result
	 *  
	 *  @return A Teacher object with the details of the given SQL result
	 *  
	 *  @throws SQLException
	 * 
	 */
	
	public static Subject getSubjectFromSQLResult(ResultSet result) throws SQLException {
		Subject subject = new Subject(result.getInt(1));
		
		
		subject.setSubjectName(result.getString(2));		
		subject.setSection(result.getString(3));
		subject.setSubjectHead(new Teacher(result.getString(4)));
		subject.setDescription(result.getString(5));		
		
		
		return subject;
		
		
	}

	/**
	 *  This method will build a Teacher object form the given SQL result and will return it
	 *  
	 *  @param result SQL result
	 *  
	 *  @return A Teacher object with the details of the given SQL result
	 *  
	 *  @throws SQLException
	 * 
	 */
	
	public static Exam getExamFromSQLResult(ResultSet result) throws SQLException {
		Exam exam = new Exam();
		
		
		exam.setId(result.getInt(1));		
		exam.setExamName(result.getString(2));		
		exam.setExamDate(result.getDate(3));
		exam.setGrade(result.getString(4));		
		
		
		return exam;
		
		
	}
	
	public static String getNextId(String prefix, List<String> ids) {
		String id = "";
		int nextId = ids.size();
		nextId++;
		
		if(ids.contains(prefix + id)) {
			nextId++;
		}
		
		id = prefix + nextId ;
		return  id ;
	}
	
	
}

















