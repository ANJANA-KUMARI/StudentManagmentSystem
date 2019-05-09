<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="adminIndex.html">
		<div class="sidebar-brand-icon rotate-n-0">
			<i class="fas fa-user-cog"></i>
		</div>
		<div class="sidebar-brand-text mx-3">Admin</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item"><a class="nav-link" href="adminIndex.html">
			<i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<!-- <div class="sidebar-heading">
        Interface
      </div> -->

	<!-- Nav Item - Teacher Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseTeacher"
		aria-expanded="true" aria-controls="collapseTeacher"> <i
			class="fas fa-chalkboard-teacher"></i> <!-- <span>Components</span> -->
			<span>Teacher</span>
	</a>

		<div id="collapseTeacher" class="collapse"
			aria-labelledby="headingTeacher" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Teacher Components:</h6>
				<!-- <a class="collapse-item" href="buttons.html">Buttons</a>
          <a class="collapse-item" href="cards.html">Cards</a> -->
				<a class="collapse-item" href="addTeacher.html">Add Teacher</a> <a
					class="collapse-item" href="editTeacher.html">Edit Teacher</a> <a
					class="collapse-item" href="viewTeacher.html">View Teacher</a> <a
					class="collapse-item" href="viewAllTeachers.html">View all
					Teachers</a>
			</div></li>

	<!-- Nav Item - Student Collapse Menu -->
	<li class="nav-item active"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseStudent"
		aria-expanded="true" aria-controls="collapseStudent"> <i
			class="fas fa-user-graduate"></i> <span>Student</span>
	</a>
		<div id="collapseStudent" class="collapse"
			aria-labelledby="headingStudent" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Student Components:</h6>
				<!-- 
            <a class="collapse-item" href="buttons.html">Buttons</a>
            <a class="collapse-item" href="cards.html">Cards</a> -->

				<a class="collapse-item" href="addStudent.html">Add Student</a> <a
					class="collapse-item" href="editStudent.html">Edit Student</a> <a
					class="collapse-item" href="viewStudent.html">View Student</a>
				<!-- <a class="collapse-item" href="viewAllStudents.html">View all Students</a> -->
			</div>
		</div></li>

	<!-- Nav Item - Subject Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseSubject"
		aria-expanded="true" aria-controls="collapseSubject"> <i
			class="fas fa-book"></i> <span>Subject</span>
	</a>
		<div id="collapseSubject" class="collapse"
			aria-labelledby="headingSubject" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Subject Components:</h6>
				<a class="collapse-item" href="addSubject.html">Add Subject</a> <a
					class="collapse-item" href="editSubject.html">Edit Subject</a> <a
					class="collapse-item" href="viewSubjects.html">View Subjects</a>
			</div>
		</div></li>

	<!-- Nav Item - Exams Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseExams"
		aria-expanded="true" aria-controls="collapseExams"> <i
			class="fas fa-pen"></i> <span>Exams</span>
	</a>
		<div id="collapseExams" class="collapse"
			aria-labelledby="headingExams" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Exams Components:</h6>
				<a class="collapse-item" href="addExam.html">Add Exam</a> <a
					class="collapse-item" href="editExam.html">Edit Exam</a> <a
					class="collapse-item" href="viewExams.html">View Exam Details</a>
			</div>
		</div></li>

	<!-- Nav Item - Reports Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseReport"
		aria-expanded="true" aria-controls="collapseReport"> <i
			class="fas fa-chart-line"></i> <span>Report</span>
	</a>
		<div id="collapseReport" class="collapse"
			aria-labelledby="headingReport" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Report Components:</h6>
				<a class="collapse-item" href="viewReport.html">View Report</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Nav Item - Class Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseClass"
		aria-expanded="true" aria-controls="collapseClass"> <i
			class="fas fa-door-open"></i> <span>Class</span>
	</a>
		<div id="collapseClass" class="collapse"
			aria-labelledby="headingClass" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Class Components:</h6>
				<a class="collapse-item" href="grade1.html">Grade 1</a> <a
					class="collapse-item" href="grade2.html">Grade 2</a> <a
					class="collapse-item" href="grade3.html">Grade 3</a> <a
					class="collapse-item" href="grade4.html">Grade 4</a> <a
					class="collapse-item" href="grade5.html">Grade 5</a> <a
					class="collapse-item" href="grade6.html">Grade 6</a> <a
					class="collapse-item" href="grade7.html">Grade 7</a> <a
					class="collapse-item" href="grade8.html">Grade 8</a> <a
					class="collapse-item" href="grade9.html">Grade 9</a> <a
					class="collapse-item" href="grade10.html">Grade 10</a> <a
					class="collapse-item" href="grade11.html">Grade 11</a> <a
					class="collapse-item" href="grade12.html">Grade 12</a> <a
					class="collapse-item" href="grade13.html">Grade 13</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading
      <div class="sidebar-heading">
        Addons
      </div> -->

	<!-- Nav Item - Update Student Marks Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseMarks"
		aria-expanded="true" aria-controls="collapseMarks"> <i
			class="fas fa-poll-h"></i> <span>Student Marks</span>
	</a>
		<div id="collapseMarks" class="collapse"
			aria-labelledby="headingMarks" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Marks Components:</h6>
				<a class="collapse-item" href="updateStudentMarks.html">Update
					Student Marks</a> <a class="collapse-item" href="viewStudentMarks.html">View
					Student Marks</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">


	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
<!-- End of Sidebar -->