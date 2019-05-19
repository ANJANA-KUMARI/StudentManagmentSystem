<%@page import="com.oop_2019.commands.GetSubjectAllCommand"%>
<%@page import="com.oop_2019.models.Subject"%>
<%@page import="java.util.List"%>
<%@page import="com.oop_2019.commands.GetExamCommand"%>
<%@page import="com.oop_2019.models.Exam"%>
<%@page import="com.oop_2019.commands.ICommand"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Update Exam</title>

<!-- Custom fonts for this template-->
<link href="css/all.min.css" rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

</head>

<body id="page-top">

<%
	ICommand<Exam> command = new GetExamCommand();
	Exam e = command.execute(request, response);

%>
	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<jsp:include page="/WEB-INF/view/SideBar.jsp"></jsp:include>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<jsp:include page="/WEB-INF/view/TopBar.jsp"></jsp:include>

        <!-- Begin Page Content -->
        <div class="container-fluid">
          <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">

              <div class="p-5">

                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800 text-center">Update Exam</h1>
                <br>
                <form method="POST" action="UpdateExam">
                
                	<input type="hidden" name="examId" value="<%=e.getId() %>" />
                  <div class="form-row align-items-center mb-2">
                    <div>
                      <label class="mr-sm-2" for="inlineFormCustomSelect" style="font-weight: bold;">Exam Name</label>
                      <input type="text" class="form-control form-control-user" value="<%=e.getExamName() %>" name="examName" placeholder="Exam Name">
                    </div>

                    <div style="margin-left: 50px;">
                      <label style="font-weight: bold;">Exam Date</label>
                      <input type="date" value="<%=e.getExamDate() %>" class="form-control form-control-user col-sm-12" name="examDate">
                    </div>

                    <div style="margin-left: 50px; font-weight: bold;">
                      <label class="mr-sm-2" for="inlineFormCustomSelect">Subject</label>
                      <select class="custom-select mr-sm-2" name="subjectHead">
                       
                                <%
                                     	ICommand<List<Subject>> scommand= new GetSubjectAllCommand();
                                     	
                                     	List<Subject> subjects =scommand.execute(request, response);
                                     	
                                     %>
                                     
                                     <% for(Subject subject:subjects){ %>
                                     
		                                  <option value="<%=subject.getId()%>"
		                                  	<% out.print(subject.getId() == e.getSubject().getId() ? "selected": "");%>>
		                                  <%=subject.getSubjectName() %></option>
                                     <%} %>
                      </select>
                    </div>

                    <div class="col-auto my-3" style="margin-left: 50px; font-weight: bold;">
                      <label class="mr-sm-2" for="inlineFormCustomSelect">Grade</label>
                      <select class="custom-select mr-sm-2" name="grade">
                        
                        <option value="1" <% out.print(e.getGrade().equals("1") ? "selected" : ""); %> >Grade 1</option>
                        <option value="2" <% out.print(e.getGrade().equals("2") ? "selected" : ""); %>>Grade 2</option>
                        <option value="3" <% out.print(e.getGrade().equals("3") ? "selected" : ""); %>>Grade 3</option>
                        <option value="4" <% out.print(e.getGrade().equals("4") ? "selected" : ""); %>>Grade 4</option>
                        <option value="5" <% out.print(e.getGrade().equals("5") ? "selected" : ""); %>>Grade 5</option>
                        <option value="6" <% out.print(e.getGrade().equals("6") ? "selected" : ""); %>>Grade 6</option>
                        <option value="7" <% out.print(e.getGrade().equals("7") ? "selected" : ""); %>>Grade 7</option>
                        <option value="8" <% out.print(e.getGrade().equals("8") ? "selected" : ""); %>>Grade 8</option>
                        <option value="9" <% out.print(e.getGrade().equals("9") ? "selected" : ""); %>>Grade 9</option>
                        <option value="10" <% out.print(e.getGrade().equals("10") ? "selected" : ""); %>>Grade 10</option>
                        <option value="11" <% out.print(e.getGrade().equals("11") ? "selected" : ""); %>>Grade 11</option>
                        <option value="12" <% out.print(e.getGrade().equals("12") ? "selected" : ""); %>>Grade 12</option>
                        <option value="13" <% out.print(e.getGrade().equals("13") ? "selected" : ""); %>>Grade 13</option>
                      </select>
                    </div>
                  </div>

                  <br><br>
                  <div class="col-lg-2">
                    <input type="submit" class="btn btn-primary btn-user btn-block" value="Update">
                    
                  </div>
                </form>
              </div>
              <!-- /.container-fluid -->
            </div>
            <!-- End of Main Content -->
  </div>
  <!-- End of Content Wrapper -->
  </div>
  <!-- End of Page Wrapper -->
  
		<!-- Footer -->
			<jsp:include page="/WEB-INF/view/Footer.jsp"></jsp:include>
		<!-- End of Footer -->		
</div>
</div>
</div>
		

		<!-- Bootstrap core JavaScript-->
		<script src="js/vendor/jquery/jquery.min.js"></script>
		<script src="js/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Core plugin JavaScript-->
		<script src="js/vendor/jquery-easing/jquery.easing.min.js"></script>

		<!-- Custom scripts for all pages-->
		<script src="js/sb-admin-2.min.js"></script>
</body>

</html>