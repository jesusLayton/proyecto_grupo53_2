<%@include  file="includes/header.jsp" %>
<body id="page-top">
	
<!-- Page Wrapper -->
<div id="wrapper">

<%@include  file="includes/sidebar.html" %>

<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">

    <!-- Main Content -->
    <div id="content">

<%@include  file="includes/topbar.jsp" %>
<!-- Begin Page Content -->
<div class="container-fluid">

<div class="text-center"> 
	<div class="mb-5"> 
		<h1>USUARIOS</h1>
		<hr>
	</div>


<!-- CODE HERE -->


<script>
	var baseurl = "http://localhost:8080/listarUsuarios";
	function loadusuarios() {
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.open("GET", baseurl, true);
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
				var usuarios = JSON.parse(xmlhttp.responseText);
				var tbltop = "<div class='card-body'>";
				tbltop += "<div class='table-responsive'>";
				tbltop +="<table class='table table-bordered' id='dataTable' width='100%' cellspacing='0'>";
				tbltop += "<thead><tr><th>Cedula</th><th>Nombre</th><th>Email</th><th>Password</th><th>Usuario</th><th>Editar</th><th>Eliminar</th></tr></thead><tbody>";
				var main = "";
				for (i = 0; i < usuarios.length; i++) {
					main += "<tr><td>" + usuarios[i].cedula_usuario
							+ "</td><td>" + usuarios[i].nombre_usuario
							+ "</td><td>" + usuarios[i].email_usuario
							+ "</td><td>" + usuarios[i].password + "</td><td>"
							+ usuarios[i].usuario + "</td>"
							+ "<td><a href='editarUsuario.jsp?cedula=" + usuarios[i].cedula_usuario + "'><i class='fas fa-pen'></i></a></td>"
							+ "<td><a href='eliminarUsuario.jsp?cedula=" + usuarios[i].cedula_usuario + "'><i class='fas fa-trash'></i></a></td></tr>";
				}
				var tblbottom = "</tbody></table></div></div>";
				var tbl = tbltop + main + tblbottom;
				document.getElementById("usuariosinfo").innerHTML = tbl;
			}
		};
		xmlhttp.send();
	}
	
	window.onload = function() {
		loadusuarios();
	}
</script>
	
	<!-- contenido  -->

	<!--  Aqui es donde se autogenera la tabla basado en el script -->
	<div class="col align-self-center" id="usuariosinfo">
	
	</div>
	 <a href="nuevoUsuario.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		 <i class="fas fa-download fa-sm text-white-50"></i> Nuevo Usuario</a>

</div>
<!-- END CODE HERE -->

   </div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include  file="includes/footer.html" %>           