package com.form.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.form.db.ConnectionFactory;
import com.form.model.Reserva;

public class ReservaDAO {
    ConnectionFactory conn = new ConnectionFactory();

    public boolean insert(Reserva reserva) {
        try {
            String sql = "INSERT INTO reserva (nome, email, sexo, data_chegada, noites, qtd_hospedes, mensagem) VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement ps = conn.getConnectionFactory().prepareStatement(sql);
            ps.setString(1, reserva.getNome());
            ps.setString(2, reserva.getEmail());
            ps.setString(3, reserva.getSexo());
            ps.setString(4, reserva.getDataChegada());
            ps.setInt(5, reserva.getNoites());
            ps.setInt(6, reserva.getQtdHospedes());
            ps.setString(7, reserva.getMensagem());
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Reserva> printReservas() {
        List<Reserva> reservas = new ArrayList<>();
        try {

            String sql = "SELECT * FROM reserva;";
            PreparedStatement ps = conn.getConnectionFactory().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Reserva reserva = new Reserva(rs.getString("nome"), rs.getString("email"), rs.getString("sexo"),
                        rs.getString("data_chegada"), rs.getInt("noites"), rs.getInt("qtd_hospedes"),
                        rs.getString("mensagem"));
                
                reservas.add(reserva);
                
                System.out.println(reserva.getNome());
                System.out.println(reserva.getEmail());
                System.out.println(reserva.getSexo());
                System.out.println(reserva.getDataChegada());
                System.out.println(reserva.getNoites());
                System.out.println(reserva.getQtdHospedes());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reservas;
    }
}
