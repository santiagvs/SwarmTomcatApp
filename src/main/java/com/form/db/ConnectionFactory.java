package com.form.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/backend";
    public String user = System.getenv("MYSQL_USER");
    public String password = System.getenv("MYSQL_PASSWORD");

    public Connection getConnectionFactory() throws SQLException {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            return conn;
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
