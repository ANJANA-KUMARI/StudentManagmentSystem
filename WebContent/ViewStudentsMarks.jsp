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

<title>View Students Marks</title>

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
          <h1 class="h3 mb-2 text-gray-800">View Student Marks</h1>
          <br>
          <form>

              

            <div class="form-row align-items-center mb-3">
              <div class="col-auto my-1">
                <label class="mr-sm-2" for="inlineFormCustomSelect">Grade</label>
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="grade">
                  <option selected>Choose...</option>
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
             <div style="margin-left: 90px;">
                <label class="mr-sm-2" for="inlineFormCustomSelect">Term</label>
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="term">
                  <option selected>Choose...</option>
                    <option value="1">First Term</option>
                    <option value="2">Second Term</option>
                    <option value="3">Third Term</option>
                </select>
             </div>
         
        </div>

              <div class="mb-3">
                <input type="submit" class="btn btn-primary" value="Search">
              </div>
            
          </form>

           <!-- DataTales Example -->
           <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Student Marks</h6>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                      <tr>
                        <th>Registration Number</th>
                        <th>Buddhist</th>
                        <th>Sinhala</th>
                        <th>English</th>
                        <th>Maths</th>
                        <th>Science</th>
                        <th>Dancing</th>
                        <th>Music</th>
                        <th>Health Science</th>
                        <th>Painting</th>
                        <th>Economic</th>
                        <th>Geography</th>
                        <th>Home Science</th>
                        <th>Tamil</th>
                      </tr>
                    </thead>
                    <tfoot>
                      <tr>
                        <th>Registration Number</th>
                        <th>Buddhist</th>
                        <th>Sinhala</th>
                        <th>English</th>
                        <th>Maths</th>
                        <th>Science</th>
                        <th>Dancing</th>
                        <th>Music</th>
                        <th>Health Science</th>
                        <th>Painting</th>
                        <th>Economic</th>
                        <th>Geography</th>
                        <th>Home Science</th>
                        <th>Tamil</th>
                      </tr>
                    </tfoot>
                    <tbody>

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