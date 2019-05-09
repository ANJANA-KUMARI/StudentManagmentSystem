/*@author Anjana Kumari */
package com.oop_2019.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import com.oop_2019.util.CommonConstants;
import com.oop_2019.util.DBConnectionUtil;
import com.oop_2019.util.QueryUtil;



/**
 * @author Anjana
 */

public abstract class RepositoryBase {
	
	protected static Connection dbConnection;
	protected static Statement statement;
	protected static PreparedStatement preparedStatement;
	
	static {
		
		// drop all the tables
		executeQueryGroup(CommonConstants.QUERY_ID_DROP_SIMS_TABLES);
		
		// create all the tables
		executeQueryGroup(CommonConstants.QUERY_ID_CREATE_SIMS_TABLES);
	}
	
	/*
	 * Assigns an active connection object to dbConnection
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	
	protected static void openDBConnection() throws SQLException, ClassNotFoundException {
		dbConnection = DBConnectionUtil.getDBConnection();
	}
	

	/**
	 * closes the dbConnection if it is in opened state
	 * @throws SQLException
	 */
	
	protected static void closeDBConnection() throws SQLException {
		if (dbConnection != null) {
			dbConnection.close();
		}
	}
	
	/**
	 * This method will run all the queries of the given query group
	 */
	
	private static void executeQueryGroup (String queryGroupName) {
		
		try {
			openDBConnection();
			//get the query list from QueryUtil
			
			ArrayList<String> queries = QueryUtil.getQueriesByGroup(queryGroupName);
			statement = dbConnection.createStatement();
			
			for(String query : queries) {
				statement.executeUpdate(query);
			}
		} catch (SQLException | ClassNotFoundException e) {
			//TODO
			e.printStackTrace();
		} finally {
			// release resources
			
			releaseResources();
		}
		
	}
	
	/**
	 *  This method will relese all the assigned database related resources
	 */
	protected static void releaseResources() {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			
			if(statement != null) {
				statement.close();
			}
				closeDBConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
	}
}
