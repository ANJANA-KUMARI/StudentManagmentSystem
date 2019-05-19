/*@author Anjana Kumari */
package com.oop_2019.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.oop_2019.models.Student;
import com.oop_2019.models.Subject;
import com.oop_2019.util.CommonConstants;
import com.oop_2019.util.ModelUtil;
import com.oop_2019.util.QueryUtil;


/**
 * @author Anjana
 */

public class SubjectRepository extends RepositoryBase implements ISubjectRepository {

	private static final Logger log = Logger.getLogger(SubjectRepository.class.getName(), null);

	@Override
	public void create(Subject entity) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_SUBJECT));

			dbConnection.setAutoCommit(false);

			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getSubjectName());
			preparedStatement.setString(3, entity.getSection());
			preparedStatement.setString(4, entity.getSubjectHead().getId());
			preparedStatement.setString(5, entity.getDescription());

			preparedStatement.execute();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

	}

	@Override
	public void update(Subject entity) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_UPDATE_SUBJECT));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, entity.getSubjectName());
			preparedStatement.setString(2, entity.getSection());
			preparedStatement.setString(3, entity.getSubjectHead().getId());
			preparedStatement.setString(4, entity.getDescription());
			preparedStatement.setInt(5, entity.getId());

			preparedStatement.execute();

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
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_REMOVE_SUBJECT));

			preparedStatement.setInt(1, Integer.parseInt(id.toString()));

			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

	}

	@Override
	public List<Subject> getAll() {
		List<Subject> subjectList = new ArrayList<Subject>();

		try {
			openDBConnection();

			statement = dbConnection.createStatement();

			ResultSet results = statement.executeQuery(QueryUtil.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL,
					CommonConstants.QUERY_ID_ALL_SUBJECTS));

			while (results.next()) {
				subjectList.add(ModelUtil.getSubjectFromSQLResult(results));
			}
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();

		} finally {
			releaseResources();
		}

		return subjectList;
	}

	@Override
	public Subject get(Object id) {
		Subject subject = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_GET_SUBJECT));

			preparedStatement.setInt(1, Integer.parseInt(id.toString()));

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			subject = ModelUtil.getSubjectFromSQLResult(results);

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

		return subject;
	}

	@Override
	public void addSubjectToStudent(String studentId, int subjectId) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_SUBJECT_STUDENT));

			dbConnection.setAutoCommit(false);

			preparedStatement.setInt(1, subjectId);
			preparedStatement.setString(2, studentId);

			preparedStatement.execute();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
		
	}

	@Override
	public void addSubjectToTeacher(String teacherId, int subjectId) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_SUBJECT_TEACHER));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, teacherId);
			preparedStatement.setInt(2, subjectId);

			preparedStatement.execute();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
		
	}

	@Override
	public void addSubjectToExam(int examId, int subjectId) { 
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_SUBJECT_EXAM));

			dbConnection.setAutoCommit(false);

			preparedStatement.setInt(1, subjectId);
			preparedStatement.setInt(2, examId);

			preparedStatement.execute();

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
	}

	@Override
	public List<Subject> getSubjectsOfStudent(String studentId) {
		List<Subject> subjectList = new ArrayList<Subject>();

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_SUBJECTS_OF_STUDENT));

			preparedStatement.setString(1, studentId);

			ResultSet results = preparedStatement.executeQuery();

			while(results.next()) {
				
			 subjectList.add(ModelUtil.getSubjectFromSQLResult(results));
			}


		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}


		return subjectList;
	}

	@Override
	public List<Subject> getSubjectsOfTeacher(String teacherId) {
		List<Subject> subjectList = new ArrayList<Subject>();

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_SUBJECTS_OF_TEACHER));

			preparedStatement.setString(1, teacherId);

			ResultSet results = preparedStatement.executeQuery();

			while(results.next()) {
				
			 subjectList.add(ModelUtil.getSubjectFromSQLResult(results));
			}


		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}


		return subjectList;
	}

	@Override
	public Subject getSubjectOfExam(int examId) {
		Subject subject = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_SUBJECTS_OF_EXAM));

			preparedStatement.setInt(1, examId);

			ResultSet results = preparedStatement.executeQuery();

			results.next();
				
			subject = ModelUtil.getSubjectFromSQLResult(results);
			


		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}


		return subject;
	}

}
