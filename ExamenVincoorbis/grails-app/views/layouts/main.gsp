<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title><g:layoutTitle default="Examen vinco Orbis" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<g:layoutHead />
<r:layoutResources />
</head>
<body>
	<div id="marco" class="container">
		<header>
			<nav class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse"
							data-target=".nav-collapse"> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
						</a> <a class="brand" href="${createLink(uri:'/')}">Vinco Orbis</a>
						<div class="nav-collapse collapse">
							<ul class="nav">
								<li><g:link controller="fileUpload">Cargas Archivos</g:link></li>
								<li><g:link controller="temperature">Calculadora Temp</g:link></li>
								<li><g:link controller="tiempo">Tiempo</g:link></li>
							</ul>
						</div>
					</div>
			</nav>

		</header>
		<div id="content">
			<g:layoutBody />
		</div>
		<footer>
			<hr />
			<p>Realizado por: Ing.Miguel Angel bautista</p>
		</footer>
	</div>
	<r:layoutResources />
</body>
</html>
