<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Offnance - Controle Financeiro</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#">Offnance</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/home'/>">Início</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/saldo'/>">Saldo</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/despesa'/>">Despesa</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/renda'/>">Renda</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/faq'/>">Faq</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<h1 class="mt-5">Bem-vindo(a) à Offnance!</h1>
		<!-- Restante do conteúdo -->
	</div>
	<p class="lead">A sua fintech completa para controle financeiro.</p>

	<h2 class="mt-5">Recursos Principais:</h2>
	<div class="row">
		<div class="col-md-6">
			<h3>Controle Financeiro</h3>
			<p>Gerencie suas finanças pessoais com facilidade. Acompanhe seus
				gastos, receitas e orçamento.</p>
		</div>
		<div class="col-md-6">
			<h3>Comprovantes Digitalizados</h3>
			<p>Mantenha todos os seus comprovantes em um só lugar.
				Digitalize-os e acesse quando precisar.</p>
		</div>
	</div>

	<h2 class="mt-5">Perguntas Frequentes:</h2>
	<div class="accordion mt-4" id="accordionFAQ">
		<div class="accordion-item">
			<h3 class="accordion-header" id="faqHeadingOne">
				<button class="accordion-button" type="button"
					data-bs-toggle="collapse" data-bs-target="#faqCollapseOne"
					aria-expanded="true" aria-controls="faqCollapseOne">Como
					posso criar uma conta na Offnance?</button>
			</h3>
			<div id="faqCollapseOne" class="accordion-collapse collapse show"
				aria-labelledby="faqHeadingOne" data-bs-parent="#accordionFAQ">
				<div class="accordion-body">Para criar uma conta na Offnance,
					visite nosso site e clique no botão "Criar conta". Preencha o
					formulário de registro com suas informações pessoais e siga as
					instruções para concluir o processo.</div>
			</div>
		</div>
		<div class="accordion-item">
			<h3 class="accordion-header" id="faqHeadingTwo">
				<button class="accordion-button collapsed" type="button"
					data-bs-toggle="collapse" data-bs-target="#faqCollapseTwo"
					aria-expanded="false" aria-controls="faqCollapseTwo">Como
					faço para digitalizar meus comprovantes?</button>
			</h3>
			<div id="faqCollapseTwo" class="accordion-collapse collapse"
				aria-labelledby="faqHeadingTwo" data-bs-parent="#accordionFAQ">
				<div class="accordion-body">Para digitalizar seus
					comprovantes, você pode usar um scanner ou um aplicativo de scanner
					em seu smartphone. Certifique-se de salvar os comprovantes em
					formato digital (PDF, JPG, PNG, etc.) e faça o upload para a
					plataforma Offnance.</div>
			</div>
		</div>
		<div class="accordion-item">
			<h3 class="accordion-header" id="faqHeadingThree">
				<button class="accordion-button collapsed" type="button"
					data-bs-toggle="collapse" data-bs-target="#faqCollapseThree"
					aria-expanded="false" aria-controls="faqCollapseThree">
					Quais são os benefícios do controle financeiro oferecido pela
					Offnance?</button>
			</h3>
			<div id="faqCollapseThree" class="accordion-collapse collapse"
				aria-labelledby="faqHeadingThree" data-bs-parent="#accordionFAQ">
				<div class="accordion-body">O controle financeiro oferecido
					pela Offnance permite que você tenha uma visão clara de suas
					despesas, receitas e orçamento. Com recursos como categorização de
					gastos, gráficos e relatórios, você poderá tomar decisões
					financeiras mais informadas e alcançar seus objetivos financeiros
					com mais eficiência.</div>
			</div>
		</div>
	</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>
