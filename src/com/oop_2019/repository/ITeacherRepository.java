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
	T get(String email, String password);
	
	void create(T entity, String password);
}
