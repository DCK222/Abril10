package com.softek.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection miConexion;

    // 2 metodos
    public void abrirConexion() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/northwind",
                "postgres", "Gabriela2050$");

        System.out.println("Conectado con Exito");
    }


}