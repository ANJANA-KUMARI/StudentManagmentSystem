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

<title>Update Teacher</title>

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

				        <!-- Begin Page Content -->
        <div class="container-fluid">
          <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                     
        <div class="container">

          
                    <div class="p-5">
                      <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Edit Teacher</h1>
                      </div>
                      <form class="user">
  
                          <div class="col-sm-2 my-3">
                              <label style="font-weight: bold;">Title</label>
                              <select style="border-radius: 10rem" class="form-control mr-sm-2" name="title">
                                  <option selected value="1">Miss</option>
                                  <option value="2">Ms</option>
                                  <option value="3">Mr</option>
                                  <option value="4">Sir</option>
                                  <option value="5">Mrs</option>
                                </select>
                              </div>  
  
  
                       
                          <div class="col-sm-4 mb-3">
                              <label style="font-weight: bold;">First Name</label>
                            <input type="text" class="form-control form-control-user" name="firstName" placeholder="First Name">
                          </div>
                          <div class="col-sm-4 mb-3">
                              <label style="font-weight: bold;">Last Name</label>
                            <input type="text" class="form-control form-control-user" name="lastName" placeholder="Last Name">
                          </div>
                          
                          <div class="form-group">
                            <div class="col-sm-4 my-3" >
                                <label style="font-weight: bold;">Section</label>
                              <input type="text" class="form-control form-control-user" name="section" placeholder="Section">
                            </div>
                            <div class="col-sm-4">
                                <label style="font-weight: bold;">BirthDay</label>
                                <input type="date" class="form-control form-control-user" name="birthday" placeholder="BirthDay">
                              </div>
                            </div>
                            
                            <div class="form-group">
                              <div class="col-sm-4">
                                <label style="font-weight: bold;">Email</label>
                              <input type="email" class="form-control form-control-user" name="email" placeholder="Email Address">
                            </div>
                            </div>
                            
                            <div class="form-group">
                              <div class="col-sm-4 mb-3">
                                  <label style="font-weight: bold;">Password</label>
                                <input type="password" class="form-control form-control-user" name="password" placeholder="Password">
                              </div>
                              <div class="col-sm-4">
                                  <label style="font-weight: bold;">Repeat Password</label>
                                <input type="password" class="form-control form-control-user" name="repeatPassword" placeholder="Repeat Password">
                              </div>  
                            </div>
                            
                            
                            <div class="col-4 my-3">
                              <label style="font-weight: bold;">Phone</label>
                              <input name="phone" type="tel" class="form-control form-control-user" placeholder="Phone">
                            </div>
                            
                            <div class="form-group form-row">
                              <div class="col-4" style=" padding-right: 20px;">
                                  <label style="margin-left: 12px; font-weight: bold;">City</label>
                                  <input name="city" style="margin-left: 12px;" type="text" class="form-control form-control-user" placeholder="City">
                                </div>
                                <div class="col-4">
                                  <label style="font-weight: bold;">State</label>
                                  <input name="state" type="text" class="form-control form-control-user" placeholder="State">
                                </div>
                                <div class="col-3">
                                  <label style="font-weight: bold;">Zip</label>
                                  <input name="zip" type="text" class="form-control form-control-user" placeholder="Zip">
                                </div>
                              </div>
                              
                              <div class="form-group">
                                <label style = "margin-left: 11px; font-weight: bold;">Gender</label>
                                <div class="custom-control custom-radio" style="margin-left: 20px;">
                                  <input type="radio" id="customRadioInline4" name="gender" class="custom-control-input">
                                  <label class="custom-control-label" for="customRadioInline4">Male</label>
                                </div>
                                
                                <div class="custom-control custom-radio" style="margin-left: 20px;">
                                  <input type="radio" id="customRadioInline5" name="gender" class="custom-control-input">
                                  <label class="custom-control-label" for="customRadioInline5">Female</label>
                                </div>
                              </div>
                              
                              <div>
                                <div class="col-2 my-3">
                                    <label style="font-weight: bold;">Class</label>
                                  <select name="grade" style="border-radius: 10rem" class="form-control mr-sm-2" id="inlineFormCustomSelect">
                                    <option selected>Class</option>
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
        
                              <div class="col-sm-4 my-3">
                                  <label style="font-weight: bold;">Position</label>
                                  <select name="position" style="border-radius: 10rem" class="form-control mr-sm-2" id="inlineFormCustomSelect">
                                      <option selected value="1">Teacher</option>
                                      <option value="2">Class Administrator</option>
                                      <option value="3">Subject Administrator</option>
                                    </select>
                                  </div>   
        
                                <div class="col my-3">
                                    <div style="padding-left: 0px;" class="custom-control custom-checkbox">
                                      <label style="font-weight: bold; margin-right: 43px">Teach</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck1">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck1">Buddhist</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck1" value="option1">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck2">Sinhala</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck2" value="option2">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck3">English</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck3" value="option3">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck4">Maths</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck4" value="option4">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck5">Buddhist</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck5" value="option5">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck6">Sinhala</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck6" value="option6">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck7">English</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck7" value="option7">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck8">Maths</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck8" value="option8">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck9">Buddhist</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck9" value="option9">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck10">Sinhala</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck10" value="option10">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck11">English</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck11" value="option11  ">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck12">Maths</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck12" value="option12  ">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck10">Sinhala</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck13" value="option13">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck11">English</label>
                                        <input type="checkbox" class="form-check-input" name="customCheck14" value="option14  ">
                                        <label style="margin-right: 30px;" class="form-check-label" for="customCheck12">Maths</label>
                                      </div>
                                </div>
        
                                <div class="col-8">
                                    <label style="font-weight: bold;">Profile Photo</label>
                                    <br>
                                      <div class="custom-file mb-3 col-4">
                                  <input name="image" type="file" class="custom-file-input" id="customFile">
                                  <label style="margin-left: 12px;" class="custom-file-label" for="customFile">Choose Photo</label>
                                </div>
                              </div> 
        <br><br><br>
                           <div class="col-lg-2">
                              <input type="submit" class="btn btn-primary btn-user btn-block" value="Update">
                              <input type="button" class="btn btn-primary btn-user btn-block" value="Delete">
                          </div>
                            </form>
                          </div>
                        </div>
                      </div>
                    </div>
            </div>
  
        <!-- End of Main Content -->
      
              
              </div>
            </div>
         

        </div>
        <!-- /.container-fluid -->

 
		
			<!-- Footer -->
				<jsp:include page="/WEB-INF/view/Footer.jsp"></jsp:include>
			<!-- End of Footer -->
		

		<!-- Bootstrap core JavaScript-->
		<script src="js/vendor/jquery/jquery.min.js"></script>
		<script src="js/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Core plugin JavaScript-->
		<script src="js/vendor/jquery-easing/jquery.easing.min.js"></script>

		<!-- Custom scripts for all pages-->
		<script src="js/sb-admin-2.min.js"></script>
</body>

</html>