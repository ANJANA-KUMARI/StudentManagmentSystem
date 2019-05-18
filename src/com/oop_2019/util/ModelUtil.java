/**
 * @author Anjana Kumari
 */
package com.oop_2019.util;

import java.sql.ResultSet;
import java.sql.SQLException;

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
		
		
		teacher.setFirstName(result.getString(2));
		teacher.setLastName(result.getString(3));
		teacher.setSection(result.getString(4));
		teacher.setBirthday(result.getDate(5));
		teacher.setEmail(result.getString(6));
		teacher.setPassword(result.getString(7));
		teacher.setPhone(result.getString(8));
		teacher.setCity(result.getString(9));
		teacher.setState(result.getString(10));
		teacher.setZip(result.getString(11));
		teacher.setGender(result.getString(12));
		teacher.setPosition(result.getString(13));
		teacher.setImage(result.getString(14));
		
		
		return teacher;
		
		
	}
}
