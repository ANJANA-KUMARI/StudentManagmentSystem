package com.oop_2019.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.oop_2019.services.ITeacherService;

import java.util.logging.*;
/**
 * This is the common utility class to load all property details at once when it
 * is initializing .
 * 
 * @author Anjana Kumari
 * @version 1.0
 */

public class CommonUtil {
	
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ITeacherService.class.getName(), null);
	
	public static final Properties properties = new Properties();
	
	static {
		try {
				// Read the property only once when load the class
				properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
	
	/**
	 * Add new SIMS ID
	 * 
	 * @param arrayList
	 * @return
	 */
	
	public static String generateIDs(ArrayList<String> arrayList) {
		String id;
		int next = arrayList.size();
		next++;
		id = CommonConstants.SIMS_ID_PREFIX + next;
		if (arrayList.contains(id)) {
			next++;
			id = CommonConstants.SIMS_ID_PREFIX + next;
		}
		return id;
	}
}
