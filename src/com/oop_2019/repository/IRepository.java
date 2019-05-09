//*@author Anjana Kumari*/

package com.oop_2019.repository;

import java.util.List;

public interface IRepository<T>{
	
	default void create(T entity) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	};
	void update(T entity);
	void delete(T entity);
	
	List<T> getAll();
	T get(Object id);
}
