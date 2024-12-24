package com.form.controller;

import java.io.IOException;
import java.util.List;

import com.form.DAO.ReservaDAO;
import com.form.model.Reserva;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reservas")
public class FormController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ReservaDAO reservaDAO = new ReservaDAO();
        List<Reserva> reservas = reservaDAO.printReservas();

        req.setAttribute("reservas", reservas);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/formularioPreenchido.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        insertReserva(req);
        req.getRequestDispatcher("formularioPreenchido.jsp").forward(req, resp);
    }

    private void insertReserva(HttpServletRequest req) {
        ReservaDAO reservaDAO = new ReservaDAO();

        int noites = Integer.parseInt(req.getParameter("noites"));
        int qtdHospedes = Integer.parseInt(req.getParameter("qtdHospedes"));

        Reserva reserva = new Reserva(req.getParameter("nome"), req.getParameter("email"), req.getParameter("sexo"),
                req.getParameter("dataChegada"), noites, qtdHospedes,
                req.getParameter("mensagem"));

        if (reservaDAO.insert(reserva)) {
            System.out.println("Reserva inserida com sucesso!");
        } else {
            System.out.println("Erro ao inserir reserva!");
        }
    }
}
