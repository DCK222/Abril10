package com.softek.Persistencia;

import com.softek.modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearProducto extends Conexion{
    public void crearProducto(Producto productoNuevo) throws ClassNotFoundException, SQLException {
        String sqlInsert = "INSERT INTO products(product_name, unit_price, units_in_stock) VALUES (?, ?, ?)";

            abrirConexion();

            PreparedStatement statement = miConexion.prepareStatement(sqlInsert);
            statement.setString(1, productoNuevo.getNombreProducto());
            statement.setDouble(2, productoNuevo.getPrecioUnitario());
            statement.setInt(3, productoNuevo.getUnidadesStock());

            int filasInsertadas = statement.executeUpdate();

            if (filasInsertadas == 1) {
                System.out.println("Producto creado correctamente");
            } else {
                System.out.println("No se pudo crear el producto");
            }

    }
}
