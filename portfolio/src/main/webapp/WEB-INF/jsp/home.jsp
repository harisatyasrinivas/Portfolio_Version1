<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
<title>Portfolio</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="<spring:url value="/css/mystyle.css" />" rel="stylesheet"
	type="text/css" />
</head>


<!--Navbar -->
<body data-spy="scroll" data-target=".navbar" data-offset="10">
	<nav
		class="navbar navbar-expand-sm navbar-light lighten-1 fixed-top shadow">
	<a class="navbar-brand font-weight-bold">SD</a>
	<button class="navbar-toggler" type="button" class="navbar-toggler"
		data-toggle="collapse" data-target="#myNavBar">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="myNavBar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-link text-light font-weight-bold px-2"><a
				class="nav-link nav-link" href="#Home">Home</a></li>
			<li class="nav-link text-light font-weight-bold px-2"><a
				class="nav-link" href="#Experience">Experience</a></li>
			<li class="nav-link text-light font-weight-bold px-2"><a
				class="nav-link" href="#Skills">Skills</a></li>
			<li class="nav-link text-light font-weight-bold px-2"><a
				class="nav-link" href="#Education">Education</a></li>
		</ul>

		<ul class="navbar-nav ml-auto nav-flex-icons">
			<li class="nav-link text-light font-weight-bold "><a href="https://www.linkedin.com/in/hari-satya-srinivas-dasari/"
				target="_blank"> <img
					src="<spring:url value="/images/linkedin-logo.png" />" width="30"
					height="30" class="d-inline-block align-top" alt="Linkedin"></a>
			</li>
			<li class="nav-link text-light font-weight-bold "><a href="https://github.com/harisatyasrinivas/"
				target="_blank"> <img
					src="<spring:url value="/images/github-logo.png" />" width="30"
					height="30" class="d-inline-block align-top" alt="Github"></a></li>
		</ul>
	</div>
	</nav>

	<hr>

	<div id="Home" class="jumbotron">
		<div class="card">
			<div class="card-body">
				<div class="row">
					<div class="col-sm-8">
						<h5 class="card-title">${Profile.fullName}</h5>
						<p class="card-text">${Profile.summary}</p>
						<a class="btn btn-secondary text-white shadow">${Profile.status}</a>
					</div>
					<div class="col-sm-4">
						<div class="card-body">
							<p class="card-text">
								<img src="<spring:url value="/images/student-male-logo.png" />">
								University of Ottawa
							</p>
							<p class="card-text">
								<img src="<spring:url value="/images/company-logo.png" />">Polaris
								Consultancy and services
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 	container for diplaying image and mystory -->
	<div id="mystory" class="container">
		<div class="row">
			<h5 class="card-title">"With a few lines of code, I can wish
				global change"</h5>
			<div class="col-sm-8">
				<blockquote class="blockquote text-left">
					<p class="white-space-pre">${Profile.story }</p>
					<footer class="blockquote-footer text-right">${Profile.nickName}</footer>
				</blockquote>
			</div>

			<div class="col-sm-2"></div>

			<div class="col-sm-2">
				<div class="circular--portrait float-right">
					<img src="<spring:url value="/images/MyProfilePic.jpg" />" />
				</div>
			</div>
		</div>
	</div>

	<br>
	<!-- Area of Expertise Section-->
	<div class="container" id="Skills">
		<div class="row text-center">
			<c:forEach var="expertise" items="${AreaOfExpertiseList}">
				<div class="col-sm-4 d-flex align-items-stretch">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">${expertise.feild}</h5>
							<p class="card-text">${expertise.feildDetails}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<br>

	<!--Skills Section-->

	<div class="container card">
		<div class="row">
			<c:forEach var="skill" items="${Skillmap}">
				<div class="col-sm-6 ">
					<div class="card border-0">
						<div class="card-body">
							<div class="btn-group">
								<button type="button" class="btn btn-secondary ">${skill.key}</button>
								<c:forEach var="value" items="${skill.value}">
									<button type="button" class="btn shadow ">${value}</button>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<br>

	<!-- Experience -->
	<div id="Experience" class="container card">
		<div class="card-body">
			<h5 class="card-title">Work Experience</h5>
			<c:forEach var="work" items="${WorkExpList}">
				<h6>${work.company}</h6>
				<p class="captions">${work.role}</p>
				<c:forEach var="project" items="${ProjectList}">
					<ul class="timeline">
						<li>
							<p class="float-right">${project.toDate}</p>
							<h6>${project.projectName}</h6>
							<p>
								<i>${project.desc}</i>
							</p>
							<div class="border-primary mb-3 card card-body">
								<p class="captions white-space-pre">${project.tasks}</p>
							</div>
						</li>
					</ul>
				</c:forEach>
			</c:forEach>
		</div>
	</div>
	<br>

	<!-- 		Education -->
	<div id="Education" class="container">
		<div class="row text-center">
			<c:forEach var="education" items="${EducationList}">
				<div class="col-sm-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">${education.degree}</h5>
							<p class="card-text">${education.school}</p>
							<a class="btn btn-secondary text-white">GPA
								:${education.myGpa} / ${education.totalGpa} </a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>

<!-- Copyright -->
<footer class="page-footer font-small">
<div class="footer-copyright text-center py-3">
	© 2019 : <aclass-"text-white">${Profile.fullName}</a>
</div>
</footer>

</html>