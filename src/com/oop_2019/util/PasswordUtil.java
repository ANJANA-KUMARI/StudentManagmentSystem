/**
 * @author Anjana Kumari
 */
package com.oop_2019.util;


/**
 * @author Anjana
 *
 */
public class PasswordUtil {
	

	
	/**
	 * This method will encrypt the given password
	 * @param originalPWD password to encrypt
	 * @return encrypt password
	 */
	public static String encryptPWD(String originalPWD) {
		return org.mindrot.jbcrypt.BCrypt.hashpw(originalPWD, org.mindrot.jbcrypt.BCrypt.gensalt());
	}
	
	
	
	/**
	 * This method will verify the given password with the encrypted password
	 * @param password plain text password
	 * @param encryptedPwd encrypted password
	 * @return returns TRUE if the passwords match and FALSE otherwise
	 */
	public static Boolean verifyPassword(String password, String encryptedPwd) {
		
		return org.mindrot.jbcrypt.BCrypt.checkpw(password, encryptedPwd);
		
	}
	
}
