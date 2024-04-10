package com.softek.Persistencia;

import com.softek.modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoProducto extends Conexion {
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT * FROM products";
        List<Producto> productos = new ArrayList<>();

        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        while (resultado.next()) {
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock")));
        }
        return productos;
    }

    public Producto obtenerPorId(Integer idBuscar) throws ClassNotFoundException, SQLException {
        String sqlID = "SELECT * FROM products WHERE product_id = ?";
        Producto producto = null;

        try (PreparedStatement statement = miConexion.prepareStatement(sqlID)) {
            statement.setInt(1, idBuscar);
            try (ResultSet resultadoID = statement.executeQuery()) {
                if (resultadoID.next()) {
                    producto = new Producto(
                            resultadoID.getInt("product_id"),
                            resultadoID.getString("product_name"),
                            resultadoID.getDouble("unit_price"),
                            resultadoID.getInt("units_in_stock")
                    );
                }
            }
        }

        return producto;
    }




}



