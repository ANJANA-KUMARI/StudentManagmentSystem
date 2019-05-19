/**
 * @author Anjana Kumari
 */
package com.oop_2019.repository;

/**
 * Extended methods for TeacherRepository
 * @author Anjana
 *
 */
public interface ITeacherRepository<T> extends IRepository<T> {
	
	int getAdminCount();
	String getPassword(String email);
	T get(String email);
	void create(T entity, String password);
}
