package com.softek.Presentacion;

import com.softek.Persistencia.*;

import com.softek.modelo.Producto;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        AccesoProducto aP1 = new AccesoProducto();

        try{
            System.out.println(aP1.obtenerTodos());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            System.out.println(aP1.obtenerPorId(2));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        UpdateProducto up1 = new UpdateProducto();

        try {

            Producto producto = new Producto(2, "lola", 10.99, 50); // Crear un objeto Producto con los nuevos valores
            up1.actualizarPorId(54, producto);
            System.out.println("Producto actualizado correctamente");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

       /* try {
            CrearProducto crearProducto = new CrearProducto();
            Producto producto = new Producto(0, "Producto", 10.99, 50);
            crearProducto.crearProducto(producto);
            System.out.println("Producto creado correctamente");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        */
    }



    }

