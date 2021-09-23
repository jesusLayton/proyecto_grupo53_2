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
		<h1>CLIENTES</h1>
		<hr>
	</div>


<!-- CODE HERE -->


<script>
	var baseurl = "http://localhost:8080/listarclientes";
	function loadClientes() {
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.open("GET", baseurl, true);
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				var clientes = JSON.parse(xmlhttp.responseText);
				var tbltop = "<table class='table table-hover table-striped'><tr><th>Cedula</th><th>Nombre</th><th>Dirección</th><th>Email</th><th>Telefono</th><th>Editar</th><th>Eliminar</th></tr>";
				var main = "";
				for (i = 0; i < clientes.length; i++) {
					main += "<tr><td>" + clientes[i].cedula_cliente
							+ "</td><td>" + clientes[i].nombre_cliente
							+ "</td><td>" + clientes[i].direccion_cliente
							+ "</td><td>" + clientes[i].email_cliente
							+ "</td><td>" + clientes[i].telefono_cliente + "</td>"
							+ "<td><a href='editarCliente.jsp?cedula=" + clientes[i].cedula_cliente + "'><i class='fas fa-pen'></i></a></td>"
							+ "<td><a href='eliminarCliente.jsp?cedula=" + clientes[i].cedula_cliente + "'><i class='fas fa-trash'></i></a></td></tr>";
				}
				var tblbottom = "</table>";
				var tbl = tbltop + main + tblbottom;
				document.getElementById("clientesinfo").innerHTML = tbl;
			}
		};
		xmlhttp.send();
	}
	window.onload = function() {
		loadClientes();
	}
</script>
	
	<!-- contenido  -->

	<!--  Aqui es donde se autogenera la tabla basado en el script -->
	<div class="col align-self-center" id="clientesinfo">
	
	</div>
	 <a href="nuevoCliente.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		 <i class="fas fa-download fa-sm text-white-50"></i> Nuevo Cliente</a>

</div>
<!-- END CODE HERE -->

   </div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include  file="includes/footer.html" %>           