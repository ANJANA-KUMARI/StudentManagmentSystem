/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Anjana
 *
 */
public interface ICommand {
	
		String execute(HttpServletRequest request, HttpServletResponse response);
		
}
