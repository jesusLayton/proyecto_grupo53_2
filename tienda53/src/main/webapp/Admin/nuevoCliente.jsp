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

<div class="text-center"> 
	<div class="mb-5"> 
		<h1>NUEVO CLIENTE</h1>
		<hr>
	</div>

<!-- CODE HERE -->

<div class="d-flex justify-content-center mb-5">
	<div class="col-2"> 
	
		<form id="registrarcliente" action="../registrarcliente" method="post">
			<div class="form-group">
				<label for="cedula_cliente">C�dula</label>
				<input type="text" autocomplete="off" name="cedula_cliente" class="form-control">
			</div>
			<div class="form-group">
				<label for="nombre_cliente">Nombre</label>
				<input type="text" autocomplete="off" name="nombre_cliente" class="form-control">
			</div>
			<div class="form-group">
				<label for="direccion_cliente">Direcci�n</label>
				<input type="text" autocomplete="off" name="direccion_cliente" class="form-control">
			</div>
			<div class="form-group">
				<label for="email_cliente">Email</label>
				<input type="email" autocomplete="off" name="email_cliente" class="form-control">
			</div>
			<div class="form-group">
				<label for="telefono_cliente">Tel�fono</label>
				<input type="text" autocomplete="off" name="telefono_cliente" class="form-control">
			</div>
			<div class="form-group mt-3">
				<input type="submit" value="Enviar" class="btn btn-primary form-control">
			</div>
		</form>
			
	</div>		
</div>
<!-- END CODE HERE -->
</div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include  file="includes/footer.html" %>           