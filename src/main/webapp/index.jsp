<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Início</title>
    <link rel="stylesheet" href="resources/style.css" type="text/css">
</head>
<body>
    <form action="reserva" method="post" id="form">
        <h2>Cadastre sua reserva:</h2>
        <input type="text" autocomplete="off" name="nome" placeholder="Nome">
        <input type="email" autocomplete="off" name="email" placeholder="Email">

        <div class="sexo">
            <input type="radio" id="masc" value="Masculino" name="sexo">
            <label for="masc">Masculino</label>
            <input type="radio" id="fem" value="Feminino"  name="sexo">
            <label for="fem">Feminino</label>
        </div>

        <input type="text" autocomplete="off" name="dataChegada" placeholder="Data de chegada">
        <input type="text" autocomplete="off" name="noites" placeholder="Nº de noites">
        <input type="text" autocomplete="off" name="qtdHospedes" placeholder="Quantidade de Hóspedes">
        <input type="text" autocomplete="off" name="mensagem" placeholder="Mensagem">
        <input type="submit" value="Reservar">
    </form>

    <!-- <section id="resposta"></section> -->

    <!-- <script src="resources/script.js"></script> -->
</body>
</html>
