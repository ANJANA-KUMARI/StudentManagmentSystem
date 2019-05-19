/*@author Anjana Kumari */
package com.oop_2019.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop_2019.models.Student;
import com.oop_2019.models.Teacher;
import com.oop_2019.util.CommonConstants;
import com.oop_2019.util.ModelUtil;
import com.oop_2019.util.QueryUtil;


/**
 * @author Anjana
 */

public class StudentRepository extends RepositoryBase implements IRepository<Student> {

	private static final Logger log = Logger.getLogger(StudentRepository.class.getName(), null);

	@Override
	public void create(Student entity) {
		try {
			entity.setId(ModelUtil.getNextId(CommonConstants.PREFIX_STUDENT_ID, this.getIds()));
			log.log(Level.INFO, "ID => " + entity.getId() );
			openDBConnection();
			

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_STUDENT));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, entity.getId());
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
			preparedStatement.setString(12, entity.getGrade());
		 	preparedStatement.setInt(13, entity.getRoll());
			preparedStatement.setString(14, entity.getImage());

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
					CommonConstants.QUERY_ID_GET_STUDENT_IDS));

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

	@Override
	public void update(Student entity) {

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_UPDATE_STUDENT));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, entity.getFirstName());
			preparedStatement.setString(2, entity.getLastName());
			preparedStatement.setString(3, entity.getSection());
			preparedStatement.setDate(4, new java.sql.Date(entity.getBirthday().getTime()));
			preparedStatement.setString(5, entity.getEmail());
			preparedStatement.setString(6, entity.getPhone());
			preparedStatement.setString(7, entity.getCity());
			preparedStatement.setString(8, entity.getState());
			preparedStatement.setString(9, entity.getZip());
			preparedStatement.setString(10, entity.getGender());
			preparedStatement.setString(11, entity.getGrade());
			preparedStatement.setInt(12, entity.getRoll());
			preparedStatement.setString(13, entity.getImage());
			preparedStatement.setString(14, entity.getId());

			log.log(Level.INFO, "SQL " + preparedStatement.toString());
			preparedStatement.executeUpdate();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

	}

	@Override
	public void delete(Object id) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_REMOVE_STUDENT));

			preparedStatement.setString(1, id.toString());

			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

	}

	@Override
	public List<Student> getAll() {
		List<Student> studentList = new ArrayList<Student>();

		try {
			openDBConnection();

			statement = dbConnection.createStatement();

			ResultSet results = statement.executeQuery(QueryUtil.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL,
					CommonConstants.QUERY_ID_ALL_STUDENTS));

			while (results.next()) {
				studentList.add(ModelUtil.getStudentFromSQLResult(results));
			}
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();

		} finally {
			releaseResources();
		}

		return studentList;
	}

	@Override
	public Student get(Object id) {
		Student student = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_GET_STUDENT));

			preparedStatement.setString(1, id.toString());

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			student = ModelUtil.getStudentFromSQLResult(results);

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

		return student;
	}

}
