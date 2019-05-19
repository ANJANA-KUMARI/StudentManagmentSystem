/*@author Anjana Kumari */
package com.oop_2019.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.oop_2019.models.Teacher;
import com.oop_2019.util.CommonConstants;
import com.oop_2019.util.ModelUtil;
import com.oop_2019.util.QueryUtil;


/**
 * @author Anjana
 */

public class TeacherRepository extends RepositoryBase implements ITeacherRepository<Teacher> {

	private static final Logger log = Logger.getLogger(TeacherRepository.class.getName(), null);

	/**
	 * This method will update the database with the given Teacher object
	 * 
	 * @param entity Details about the Teacher to update
	 */

	@Override
	public void create(Teacher entity, String password) {
		try {
			openDBConnection();
			
			entity.setId(ModelUtil.getNextId(CommonConstants.PREFIX_TEACHER_ID, this.getIds()));

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_TEACHER));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, entity.getId());
			preparedStatement.setString(2, entity.getTitle());
			preparedStatement.setString(3, entity.getFirstName());
			preparedStatement.setString(4, entity.getLastName());
			preparedStatement.setString(5, entity.getSection());
			preparedStatement.setDate(6, new java.sql.Date(entity.getBirthday().getTime()));
			preparedStatement.setString(7, entity.getEmail());
			preparedStatement.setString(8, password);
			preparedStatement.setString(9, entity.getPhone());
			preparedStatement.setString(10, entity.getCity());
			preparedStatement.setString(11, entity.getState());
			preparedStatement.setString(12, entity.getZip());
			preparedStatement.setString(13, entity.getGender());
			preparedStatement.setString(14, entity.getPosition());
			preparedStatement.setString(15, entity.getImage());

			preparedStatement.execute();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

	}

	private List<String> getIds() {
		List<String> id = new ArrayList<String>();

		try {
			openDBConnection();

			statement = dbConnection.createStatement();

			ResultSet results = statement.executeQuery(QueryUtil.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL,
					CommonConstants.QUERY_ID_GET_TEACHER_IDS));

			while (results.next()) {

				id.add(results.getString(1));
			}

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();

		} finally {
			releaseResources();
		}

		return id;
	}

	/**
	 * 
	 * This method will update the database with the given Teacher object
	 * 
	 * @param entity Details about the Teacher to update
	 * 
	 */

	@Override
	public void update(Teacher entity) {

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_UPDATE_TEACHER));

			preparedStatement.setString(1, entity.getTitle());
			preparedStatement.setString(2, entity.getFirstName());
			preparedStatement.setString(3, entity.getLastName());
			preparedStatement.setString(4, entity.getSection());
			preparedStatement.setDate(5, new java.sql.Date(entity.getBirthday().getTime()));
			preparedStatement.setString(6, entity.getEmail());
			preparedStatement.setString(7, entity.getPhone());
			preparedStatement.setString(8, entity.getCity());
			preparedStatement.setString(9, entity.getState());
			preparedStatement.setString(10, entity.getZip());
			preparedStatement.setString(11, entity.getGender());
			preparedStatement.setString(12, entity.getPosition());
			preparedStatement.setString(13, entity.getImage());
			preparedStatement.setString(14, entity.getId());

			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {

			releaseResources();
		}

	}

	/**
	 * This method will delete the given Teacher from the database
	 * 
	 * @param entity Details about the Teacher to delete
	 */

	@Override
	public void delete(Object id) {

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_REMOVE_TEACHER));

			preparedStatement.setString(1, id.toString());

			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
	}

	/**
	 * 
	 * This method will return all the Teachers
	 * 
	 * @return All the Teachers
	 */

	@Override
	public List<Teacher> getAll() {

		List<Teacher> teacherList = new ArrayList<Teacher>();

		try {
			openDBConnection();

			statement = dbConnection.createStatement();

			ResultSet results = statement.executeQuery(QueryUtil.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL,
					CommonConstants.QUERY_ID_ALL_TEACHERS));

			while (results.next()) {
				teacherList.add(ModelUtil.getTeacherFromSQLResult(results));
			}
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();

		} finally {
			releaseResources();
		}

		return teacherList;
	}

	/**
	 * This method will return a single Teacher with the given id
	 * 
	 * @param id Id of the Teacher to retrieve
	 * 
	 * @return The Teacher with the given id
	 */

	@Override
	public Teacher get(Object id) {

		Teacher teacher = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_GET_TEACHER));

			preparedStatement.setString(1, id.toString());

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			teacher = ModelUtil.getTeacherFromSQLResult(results);

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

		return teacher;
	}

	/**
	 * 
	 * This method will return the count of the Admin teachers
	 * 
	 * @return Count of the Admin teachers
	 */

	@Override
	public int getAdminCount() {

		int count = 0;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil.getQueryByID(
					CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_SELECT_TEACHER_ADMIN_COUNT));

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			count = results.getInt(1);
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {

			releaseResources();
		}

		return count;

	}

	@Override
	public String getPassword(String email) {

		String password = null;

		try {
			openDBConnection();
			
			preparedStatement = dbConnection.prepareStatement(QueryUtil.getQueryByID(
					CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_SELECT_TEACHER_EMAIL_PWD));

			preparedStatement.setString(1, email);
			
			
			ResultSet results = preparedStatement.executeQuery();

			if (!results.next()) {
				return null;
			}

			password = results.getString(1);
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
		return password;
	}

	@Override
	public Teacher get(String email) {
		Teacher teacher = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil.getQueryByID(
					CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_GET_TEACHER_BY_EMAIL));

			preparedStatement.setString(1, email);

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			teacher = ModelUtil.getTeacherFromSQLResult(results);

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

		return teacher;
	}

}
