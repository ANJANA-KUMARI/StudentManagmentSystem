<%@page import="com.oop_2019.models.Subject"%>
<%@page import="com.oop_2019.commands.GetAllTeachersCommand"%>
<%@page import="com.oop_2019.models.Teacher"%>
<%@page import="java.util.List"%>
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

<title>View All Teachers</title>

<!-- Custom fonts for this template-->
<link href="css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

</head>

<body id="page-top">

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
      
                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800">All Teachers</h1>
                
                <%
                	ICommand<List<Teacher>> command = new GetAllTeachersCommand();
                	List<Teacher> teachers =command.execute(request, response);
                 
                %>
      
                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                  <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Teachers Details</h6>
                  </div>
                  <div class="card-body">
                    <div class="table-responsive">
                      <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                        
                          <tr>          
                                                               
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Position</th>
                            <th>Gender</th>
                            <th>Birthday</th>
                            <th>Subjects</th>
                            <th>Operations</th>
                          </tr>
                          
                          
                        </thead>
                        <tfoot>
                          <tr>
                          <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Position</th>
                            <th>Gender</th>
                            <th>Birthday</th>
                            <th>Subjects</th>
                            <th>Operations</th>
                          </tr>
                        </tfoot>
                        <tbody>
                        <% for(Teacher t :teachers){ %>
                          <tr>
                            <td><%=t.getId() %></td>
                            <td><%=t.getFirstName() %><%=" " %> <%=t.getLastName() %></td>
                            <td><%=t.getEmail() %></td>
                            <td><%=t.getPosition() %></td>
                            <td><%=t.getGender() %></td>
                            <td><%=t.getBirthday() %></td>
                            <td> 
                            	<% for(Subject s:t.getSubjects()){ %>
                            		<span class="badge badge-pill badge-info"><%=s.getSubjectName() %></span>
                            	<% } %>
                             </td>
                             
                            <td>
                            
                             <a class="btn btn-sm btn-primary" href="UpdateTeacher.jsp?teacherId=<%=t.getId()%>">
                    	<i class="fas fa-pencil-alt"></i>
                    </a>	
                    <form method="POST" action="DeleteTeacher" style="display:inline-block">
                    	<input  type="hidden" name="teacherId" value="<%=t.getId()%>" /> 
                    <button class="btn btn-sm btn-danger" type="submit">
                    	<i class="fas fa-trash-alt"></i>
                    </button>	
                    </form>
                            </td>
                          </tr>
                          
                          <% } %>
                        
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
      
              </div>
              <!-- /.container-fluid -->
      
            </div>
            <!-- End of Main Content -->
			
			<!-- Footer -->
<jsp:include page="/WEB-INF/view/Footer.jsp"></jsp:include>
			<!-- End of Footer -->
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