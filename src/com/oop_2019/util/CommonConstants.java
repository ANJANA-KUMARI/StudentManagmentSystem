package com.oop_2019.util;

/**
 * This is the common constants file for Java Web project.
 * 
 * @author Anjana Kumari
 * @version 1.0
 */

public class CommonConstants {

	/** Constant for config.properties key for query file path */
	public static final String QUERY_XML = "SIMSQuery.xml";
	
	/** Constant for file path of config.properties */
	public static final String PROPERTY_FILE = "config.properties";
	
	/** Constant for full path of the sql query file */
	public static final String QUERY_FULL_PATH = System.getProperty("catalina.base") + "\\wtpwebapps\\oop_2019\\WEB-INF\\SIMSQuery.xml"; 
	
	/** Constant for queryGroup tag in SIMSQuery.xml */
	public static final String TAG_NAME_QUERY_GROUP = "Query-group";
	
	/** Constant for query tag in SIMSQuery.xml */
	public static final String TAG_NAME = "query";
	
	/** Constant for query name in SIMSQuery.xml */
	public static final String ATTRIB_NAME = "name";
	
	/** Constant for query id in SIMSQuery.xml */
	public static final String ATTRIB_ID = "id";
	
	/** Constant for SIMS id prefix */
	public static final String SIMS_ID_PREFIX = "SIMS001";
	
	/** Constant for comma */
	public static final String COMMA = ",";
	
	/** Constant for url key of MySQL database in config.properties */
	public static final String URL = "url";
	
	/** Constant for user name key of MySQL database in config.properties */
	public static final String USERNAME = "username";
	
	/** Constant for password key of MySQL database in config.properties */
	public static final String PASSWORD = "password";
	
	/** Constant for driver name key of MySQL database in config.properties */
	public static final String DRIVER_NAME = "driverName";
	
	/** Constant for general key of group type in SIMSQuery.xml  */
	public static final String QUERY_GROUP_TYPE_GENERAL = "general";
	
	/** Constant for query id of drop_table in SIMSQuery.xml */
	public static final String QUERY_ID_DROP_TABLE = "drop_table";
	
	/** Constant for query id of create_SIMS_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_SIMS_TABLES = "create_sims_tables";
	
	/** Constant for query id of drop_SIMS_table in SIMSQuery.xml */
	public static final String QUERY_ID_DROP_SIMS_TABLES = "drop_sims_tables";
	
	/** Constant for query id of update_SIMS_table in SIMSQuery.xml */
	public static final String QUERY_ID_UPDATE_SIMS_TABLES = "update_sims_tables";
	
	/** Constant for query id of create_teacher_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_TEACHER_TABLE = "create_teacher_table";
	
	/** Constant for query id of create_student_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_STUDENT_TABLE = "create_student_table";
	
	/** Constant for query id of create_subject_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_SUBJECT_TABLE = "create_subject_table";
	
	/** Constant for query id of create_exam_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_EXAM_TABLE = "create_exam_table";
	
	/** Constant for query id of create_studentRoll_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_STUDENTROLL_TABLE = "create_studentRoll_table";
	
	/** Constant for query id of create_teacherSubject_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_TEACHERSUBJECT_TABLE = "create_teacherSubject_table";
	
	/** Constant for query id of create_subjectStudent_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_SUBJECTSTUDENT_TABLE = "create_subjectStudent_table";
	
	/** Constant for query id of create_subjectExam_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_SUBJECTEXAM_TABLE = "create_subjectExam_table";
	
	/** Constant for query id of create_teacher_position_table in SIMSQuery.xml */
	public static final String QUERY_ID_CREATE_TEACHER_POSITION_TABLE = "create_teacher_position_table";
	
	/** Constant for query id of insert teacher in SIMSQuery.xml */
	public static final String QUERY_ID_INSERT_TEACHER = "insert_teacher";
	
	/** Constant for query id of insert student in SIMSQuery.xml */
	public static final String QUERY_ID_INSERT_STUDENT = "insert_student";
	
	/** Constant for query id of insert subject in SIMSQuery.xml */
	public static final String QUERY_ID_INSERT_SUBJECT = "insert_subject";
	
	/** Constant for query id of insert exam in SIMSQuery.xml */
	public static final String QUERY_ID_INSERT_EXAM = "insert_exam";
	
	/** Constant for query id of insert teacher position in SIMSQuery.xml */
	public static final String QUERY_ID_INSERT_TEACHER_POSITION = "insert_teacher_position";
	
	/** Constant for query id of get a teacher in SIMSQuery.xml */
	public static final String QUERY_ID_GET_TEACHER = "teacher_by_id";
	
	/** Constant for query id of get a student in SIMSQuery.xml */
	public static final String QUERY_ID_GET_STUDENT = "student_by_id";
	
	/** Constant for query id of get a subject in SIMSQuery.xml */
	public static final String QUERY_ID_GET_SUBJECT = "subject_by_id";
	
	/** Constant for query id of get a exam in SIMSQuery.xml */
	public static final String QUERY_ID_GET_EXAM = "exam_by_id";
	
	/** Constant for query id of get all teachers in SIMSQuery.xml */
	public static final String QUERY_ID_ALL_TEACHERS = "all_teachers";
	
	/** Constant for query id of get all student in SIMSQuery.xml */
	public static final String QUERY_ID_ALL_STUDENTS = "all_students";
	
	/** Constant for query id of get all subjects in SIMSQuery.xml */
	public static final String QUERY_ID_ALL_SUBJECTS = "all_subjects";
	
	/** Constant for query id of get all exams in SIMSQuery.xml */
	public static final String QUERY_ID_ALL_EXAMS = "all_exams";
	
	/** Constant for query id of remove a teacher in SIMSQuery.xml */
	public static final String QUERY_ID_REMOVE_TEACHER = "remove_teacher";
	
	/** Constant for query id of remove a student in SIMSQuery.xml */
	public static final String QUERY_ID_REMOVE_STUDENT = "remove_student";
	
	/** Constant for query id of remove a subject in SIMSQuery.xml */
	public static final String QUERY_ID_REMOVE_SUBJECT = "remove_subject";
	
	/** Constant for query id of remove a exam in SIMSQuery.xml */
	public static final String QUERY_ID_REMOVE_EXAM = "remove_exam";
	
	/** Constant for query id of update a teacher in SIMSQuery.xml */
	public static final String QUERY_ID_UPDATE_TEACHER = "update_teacher";
	
	/** Constant for query id of update a student in SIMSQuery.xml */
	public static final String QUERY_ID_UPDATE_STUDENT = "update_student";
	
	/** Constant for query id of update a subject in SIMSQuery.xml */
	public static final String QUERY_ID_UPDATE_SUBJECT = "update_subject";
	
	/** Constant for query id of update a exam in SIMSQuery.xml */
	public static final String QUERY_ID_UPDATE_EXAM = "update_exam";
	
	/** Constant for query id of get all teacher ids in SIMSQuery.xml */
	public static final String QUERY_IS_GET_TEACHER_IDS = "teacher_ids";
	
	/** Constant for query id of get all student ids in SIMSQuery.xml */
	public static final String QUERY_IS_GET_STUDENT_IDS = "student_ids";
	
	/** Constant for query id of get all subject ids in SIMSQuery.xml */
	public static final String QUERY_IS_GET_SUBJECT_IDS = "subject_ids";
	
	/** Constant for query id of get all exam ids in SIMSQuery.xml */
	public static final String QUERY_IS_GET_EXAM_IDS = "exam_ids";
	
	/** Constant for query id of get all admin ids in SIMSQuery.xml */
	public static final String QUERY_SELECT_TEACHER_ADMIN_COUNT = "admin_count";
	
	/** Constant for query id of get all admin emails ids in SIMSQuery.xml */
	public static final String QUERY_SELECT_TEACHER_EMAIL_PWD = "admin_email_pwd";
	
	/** Constant for Column index one */
	public static final int COLUMN_INDEX_ONE = 1;
	
	/** Constant for Column index two */
	public static final int COLUMN_INDEX_TWO = 2;
	
	/** Constant for Column index three */
	public static final int COLUMN_INDEX_THREE = 3;
	
	/** Constant for Column index four */
	public static final int COLUMN_INDEX_FOUR = 4;
	
	/** Constant for Column index five */
	public static final int COLUMN_INDEX_FIVE = 5;
	
	/** Constant for Column index six */
	public static final int COLUMN_INDEX_SIX = 6;
	
	/** Constant for Column index seven */
	public static final int COLUMN_INDEX_SERVEN = 7;
	
	/** Constant for Column index eight */
	public static final int COLUMN_INDEX_EIGHT = 8;
	
	/** Constant for Column index nine */
	public static final int COLUMN_INDEX_NINE = 9;
	
	/** Constant for Column index ten */
	public static final int COLUMN_INDEX_TEN = 10;
	
	/** Constant for Column index eleven */
	public static final int COLUMN_INDEX_ELEVEN = 11;
	
	/** Constant for Column index twelve */
	public static final int COLUMN_INDEX_TWELVE = 12;
	
	/** Constant for Column index thirteen */
	public static final int COLUMN_INDEX_THIRTEEN = 13;
	
	/** Constant for Column index fourteen */
	public static final int COLUMN_INDEX_FOURTEEN = 14;
	
	/** Constant for Column index fiveteen */
	public static final int COLUMN_INDEX_FIVETEEN = 15;
	
}
