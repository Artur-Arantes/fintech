<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Projeto Fintech</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  <link href="css/style.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="form-container">
          <h1>Projeto Fintech</h1>
          <form method="post">
            <div class="mb-3">
              <label for="InputEmail1" class="form-label">Nome completo</label>
              <input type="text" class="form-control" id="InputEmail1" name="fullName" aria-describedby="nameHelp" placeholder="Digite seu nome completo">
              <div id="name" class="form-text">Informe seu nome completo.</div>
            </div>

            <div class="mb-3">
              <label for="InputPhone" class="form-label">Telefone</label>
              <input type="tel" class="form-control" id="InputPhone" name="phone" placeholder="Digite seu telefone">
            </div>

            <div class="mb-3">
              <label for="InputEmail1" class="form-label">Endereço de email</label>
              <input type="email" class="form-control" id="InputEmail1" name="email" aria-describedby="emailHelp" placeholder="Digite seu email">
              <div id="email" class="form-text">Nós nunca compartilharemos seu email com mais ninguém.</div>
            </div>

            <div class="mb-3">
              <label for="InputPassword1" class="form-label">Senha</label>
              <input type="password" class="form-control" id="InputPassword1" name="password" placeholder="Digite sua senha">
            </div>

            <div class="mb-3">
              <label for="InputPassword2" class="form-label">Confirmar senha</label>
              <input type="password" class="form-control" id="InputPassword2" name="confirmPassword" placeholder="Confirme sua senha">
            </div>

            <div class="mb-3 form-check">
              <input type="checkbox" class="form-check-input" id="Check1" name="acceptTerms">
              <label class="form-check-label" for="Check1">Aceitar os termos e condições</label>
            </div>

            <button type="submit" class="btn btn-primary">Enviar</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
