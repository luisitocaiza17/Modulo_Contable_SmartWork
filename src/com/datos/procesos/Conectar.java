package com.datos.procesos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by luisito on 22/05/2015.
 */
public class Conectar {

    public Connection realiza_conexion()throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException
    {
        Connection conn = null;
        String userName = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/modulo_contable_smartwork";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(url, userName, password);
        System.out.println("conneccion exitosa");
        return conn;
    }
}
