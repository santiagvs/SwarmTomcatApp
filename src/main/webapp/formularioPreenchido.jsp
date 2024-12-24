<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reservas</title>
    <link rel="stylesheet" href="resources/style.css" type="text/css">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="data">
        <h1>Reservas realizadas</h1>
        <table>
            <tr>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Sexo</th>
                <th>Data de chegada</th>
                <th>Nº de noites</th>
                <th>Quantidade de hóspedes</th>
                <th>Mensagem</th>
            </tr>
            <c:forEach var="reserva" items="${reservas}">
                <tr>
                    <td>${reserva.nome}</td>
                    <td>${reserva.email}</td>
                    <td>${reserva.sexo}</td>
                    <td>${reserva.dataChegada}</td>
                    <td>${reserva.noites}</td>
                    <td>${reserva.qtdHospedes}</td>
                    <td>${reserva.mensagem}</td>
                </tr>
            </c:forEach>
        </table>    
    </div>
</body>
</html>