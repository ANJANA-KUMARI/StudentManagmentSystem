/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop_2019.util.CommonConstants;

/**
 * @author Anjana
 *
 */
public class LogoutCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession(true);
		
		try {
			session.removeAttribute(CommonConstants.SESSION_ID_LOGGED_IN_TEACHER);
			return true;
		}catch(IllegalStateException e) {
			return false;
		}
		
		
	}

	
}
