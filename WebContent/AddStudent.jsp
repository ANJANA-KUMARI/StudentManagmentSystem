<%@page import="com.oop_2019.commands.GetSubjectAllCommand"%>
<%@page import="com.oop_2019.models.Subject"%>
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

<title>Add Student</title>

<!-- Custom fonts for this template-->
<link href="css/all.min.css" rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">

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

				<div class="container">

					<div class="card o-hidden border-0 shadow-lg my-5">
						<div class="card-body p-0">
							
							<div class="p-5">
								<div class="text-center">
									<h1 class="h4 text-gray-900 mb-4">Add Student</h1>
								</div>

								<form class="user" method="POST" action="AddStudent"  onsubmit="return validateForm()">

									<div class="form-group">
										<div class="col-sm-4 mb-3">
											<label style="font-weight: bold;">First Name</label> <input
												type="text" class="form-control form-control-user"
												name="firstName" placeholder="First Name">
											</div>
										<div class="col-sm-4 mb-3">
											<label style="font-weight: bold;">Last Name</label> <input
												type="text" class="form-control form-control-user"
												name="lastName" placeholder="Last Name">
										</div>

											<div class="col-sm-4 my-3">
												<label style="font-weight: bold;">BirthDay</label> <input
													type="date" class="form-control form-control-user"
													name="birthday" placeholder="BirthDay">
											</div>
										</div>

										<div class="form-group">
											<div class="col-sm-4">
												<label style="font-weight: bold;">Email</label> <input
													type="email" class="form-control form-control-user"
													name="email" placeholder="Email Address">
											</div>
										</div>
										
										<div class="col-4 my-3">
											<label style="font-weight: bold;">Phone</label> 
											<input type="tel" class="form-control form-control-user" name="phone" placeholder="Phone">
										</div>

										<div class="form-group form-row">
											<div class="col-4" style="padding-right: 20px;">
												<label style="margin-left: 12px; font-weight: bold;">City</label>
												<input style="margin-left: 12px;" type="text"
													class="form-control form-control-user" name="city" placeholder="City">
											</div>
											<div class="col-4">
												<label style="font-weight: bold;">State</label> <input
													type="text" class="form-control form-control-user" name="state"
													placeholder="State">
											</div>
											<div class="col-3">
												<label style="font-weight: bold;">Zip</label> <input type="text" class="form-control form-control-user" name="zip" placeholder="Zip">
											</div>
										</div>

										<div class="form-group">
											<label style="margin-left: 11px; font-weight: bold;">Gender</label>
											<div class="custom-control custom-radio"
												style="margin-left: 20px;">
												<input type="radio" id="customRadioInline4"
													 class="custom-control-input" name="gender" value="M">
												<label class="custom-control-label" for="customRadioInline4">Male</label>
											</div>

											<div class="custom-control custom-radio"
												style="margin-left: 20px;">
												<input type="radio" id="customRadioInline5"
													 class="custom-control-input" name="gender" value="F">
												<label class="custom-control-label" for="customRadioInline5">Female</label>
											</div>
										</div>

										<div>
											<div class="col-2 my-3">
												<label style="font-weight: bold;">Grade</label> <select
													style="border-radius: 10rem" class="form-control mr-sm-2" name="grade"
													id="inlineFormCustomSelect">
													<option selected>Grade</option>
													<option value="1">Grade 1</option>
													<option value="2">Grade 2</option>
													<option value="3">Grade 3</option>
													<option value="4">Grade 4</option>
													<option value="5">Grade 5</option>
													<option value="6">Grade 6</option>
													<option value="7">Grade 7</option>
													<option value="8">Grade 8</option>
													<option value="9">Grade 9</option>
													<option value="10">Grade 10</option>
													<option value="11">Grade 11</option>
													<option value="12">Grade 12</option>
													<option value="13">Grade 13</option>
												</select>
											</div>
										</div>

										
										
										<div class="col my-3">
											<div style="padding-left: 0px;"
												class="custom-control custom-checkbox">
												<label style="font-weight: bold; margin-right: 43px">Subjects</label>
												      <%
                                     	ICommand<List<Subject>> command= new GetSubjectAllCommand();
                                     	
                                     	List<Subject> subjects =command.execute(request, response);
                                     	
                                     %>
                                     
                                     <% for(Subject subject:subjects){ %>
                                    
                                      <input type="checkbox" class="form-check-input" name="subjectIds" value="<%=subject.getId() %>" >
                                      <label style="margin-right: 30px;" class="form-check-label" for="customCheck1"><%=subject.getSubjectName() %></label>
                                     
                                     <% } %>
											</div>
										</div>

										<div class="col-8">
											<label style="font-weight: bold;">Profile Photo</label> <br>
											<div class="custom-file mb-3 col-4">
												<input name="image" type="file" class="custom-file-input" id="customFile">
												<label style="margin-left: 12px;" class="custom-file-label"
													for="customFile">Choose Photo</label>
											</div>
										</div>
										<br> <br> <br>     
										 <input type="submit" class="btn btn-primary btn-user btn-block col-lg-2" value="Add Student">
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Footer -->
			<jsp:include page="/WEB-INF/view/Footer.jsp"></jsp:include>
			<!-- End of Footer -->
		</div>
</div>



		<!-- Bootstrap core JavaScript-->
		<script src="js/vendor/jquery/jquery.min.js"></script>
		<script src="js/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Core plugin JavaScript-->
		<script src="js/vendor/jquery-easing/jquery.easing.min.js"></script>

		<!-- Custom scripts for all pages-->
		<script src="js/sb-admin-2.min.js"></script>
		
		<!-- JS Form Validation -->
		<script src="js/validation.js"></script>
</body>

</html>