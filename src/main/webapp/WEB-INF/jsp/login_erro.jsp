<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Projeto Fintech - Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="form-container">
					<h1>Projeto Fintech - Login</h1>
					<c:if test="${not empty requestScope.error}">
						<div class="alert alert-danger" role="alert">Credenciais
							inválidas. Por favor, tente novamente.</div>
					</c:if>

					<form method="post" action="">
						<div class="mb-3">
							<label for="InputEmail1" class="form-label">Endereço de
								email</label> <input type="email" class="form-control" id="InputEmail1"
								name="email" aria-describedby="emailHelp"
								placeholder="Digite seu email" required>
							<div id="emailHelp" class="form-text">Nós nunca
								compartilharemos seu email com mais ninguém.</div>
						</div>

						<div class="mb-3">
							<label for="InputPassword1" class="form-label">Senha</label> <input
								type="password" class="form-control" id="InputPassword1"
								name="password" placeholder="Digite sua senha" required>
						</div>

						<button type="submit" class="btn btn-primary">Entrar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
