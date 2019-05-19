package com.oop_2019.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.oop_2019.models.Exam;
import com.oop_2019.util.CommonConstants;
import com.oop_2019.util.ModelUtil;
import com.oop_2019.util.QueryUtil;


public class ExamRepository extends RepositoryBase implements IRepository<Exam> {

	
	private static final Logger log = Logger.getLogger(ExamRepository.class.getName(), null);
	
	@Override
	public void create(Exam entity) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_INSERT_EXAM), Statement.RETURN_GENERATED_KEYS);

			dbConnection.setAutoCommit(false);

			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setString(2, entity.getExamName());
			preparedStatement.setDate(3, new java.sql.Date(entity.getExamDate().getTime()));
			preparedStatement.setString(4, entity.getGrade());
			

			preparedStatement.execute();
			
			ResultSet idResult = preparedStatement.getGeneratedKeys();
			idResult.next();
			entity.setId(idResult.getInt(1));

			dbConnection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}
		
	}

	@Override
	public void update(Exam entity) {
		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_UPDATE_EXAM));

			dbConnection.setAutoCommit(false);

			preparedStatement.setString(1, entity.getExamName());
			preparedStatement.setDate(2, new java.sql.Date(entity.getExamDate().getTime()));
			preparedStatement.setString(3, entity.getGrade());
			preparedStatement.setInt(4, entity.getId());
			

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
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_REMOVE_EXAM));

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
	public List<Exam> getAll() {
		List<Exam> examList = new ArrayList<Exam>();

		try {
			openDBConnection();

			statement = dbConnection.createStatement();

			ResultSet results = statement.executeQuery(QueryUtil.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL,
					CommonConstants.QUERY_ID_ALL_EXAMS));

			while (results.next()) {
				examList.add(ModelUtil.getExamFromSQLResult(results));
			}
		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();

		} finally {
			releaseResources();
		}

		return examList;
	}

	@Override
	public Exam get(Object id) {
		Exam exam = null;

		try {
			openDBConnection();

			preparedStatement = dbConnection.prepareStatement(QueryUtil
					.getQueryByID(CommonConstants.QUERY_GROUP_TYPE_GENERAL, CommonConstants.QUERY_ID_GET_EXAM));

			preparedStatement.setInt(1, Integer.parseInt(id.toString()));

			ResultSet results = preparedStatement.executeQuery();

			results.next();

			exam = ModelUtil.getExamFromSQLResult(results);

		} catch (ClassNotFoundException | SQLException e) {

			log.severe(e.getMessage());

			e.printStackTrace();
		} finally {
			releaseResources();
		}

		return exam;
	}

}
