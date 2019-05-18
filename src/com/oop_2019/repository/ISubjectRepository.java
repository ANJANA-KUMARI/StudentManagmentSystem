/**
 * @author Anjana Kumari
 */
package com.oop_2019.repository;

import java.util.List;

import com.oop_2019.models.Subject;

/**
 * @author Anjana
 *
 */
public interface ISubjectRepository extends IRepository<Subject> {
	void addSubjectToStudent(String studentId, int subjectId);
	void addSubjectToTeacher(String teacherId, int subjectId);
	void addSubjectToExam(int examId, int subjectId);
	List<Subject> getSubjectsOfStudent(String studentId);
	List<Subject> getSubjectsOfTeacher(String teacherId);
	Subject getSubjectOfExam(int examId);
	
}
