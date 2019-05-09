/**
 * OOP 2019
 * 
 * @author Anjana Kumari
 * 
 * @version 1.0
 * Copyright: All rights reserved
 * 
 */

package com.oop_2019.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This load Sql queries available in the SIMSQuery.xml
 * 
 * @author Anjana Kumari
 * @version 1.0
 * @see #CommonUtil
 */

public class QueryUtil {
	
	private static final Logger log = Logger.getLogger(QueryUtil.class.getName());
	
	private static Map<String, NodeList> queryGroupNodeList = new HashMap<String, NodeList>();
	
	static {
		// load the Query-Group nodes once
		
		try {
			NodeList nodeList = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(new File(CommonConstants.QUERY_FULL_PATH))
					.getElementsByTagName(CommonConstants.TAG_NAME_QUERY_GROUP);
					
			for(int index = 0; index < nodeList.getLength(); index++) {
				Element element = (Element)nodeList.item(index);
				
				queryGroupNodeList.put(element.getAttribute(CommonConstants.ATTRIB_NAME), element.getChildNodes());
			}
			} catch (SAXException | IOException | ParserConfigurationException e) {
				log.log(Level.SEVERE, e.getMessage());
				e.printStackTrace();
			}
		
	}

	


	/**
	 * This method return a set of queries that belongs to the Query-Group type 
	 * 
	 * 
	 * @param groupType Query-Group type to return
	 * @return A list of trimmed strings will be returned
	 *            
	 */
	
	public static ArrayList<String> getQueriesByGroup(String groupType) {
		ArrayList<String> queries = new ArrayList<String>();
		
		NodeList queryGroup = queryGroupNodeList.get(groupType);
		
		if(queryGroup == null) {
			return null;
		}
		
		for (int index = 0;  index < queryGroup.getLength(); index++) {
			queries.add(queryGroup.item(index).getTextContent().trim());
		}
		return queries;
	}
	
	/**
	 * This method returns a query by the given group type and query id
	 * query id.
	 * 
	 * @param groupType Group_Type of the query
	 * @param queryId id of the query to return
	 * @return A trimmed query String will be returned
	 * 
	 */
	
	@SuppressWarnings("unused")
	public static String getQueryByID(String groupType, String groupId) {
		Element element = null;
		
		NodeList queryGroup = queryGroupNodeList.get(groupType);
		
		for (int index = 0; index < queryGroup.getLength(); index++) {
			element = (Element)queryGroup.item(index);
			
			if (element == null) {
				return null;
			}
			
			return element.getTextContent().trim();
			}
		return groupId;
	}
}