package com.example.nivelacionsprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.nivelacionsprint2.Adaptadores.ProductoAdapter;
import com.example.nivelacionsprint2.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProducts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts = new ArrayList<>();
        // *** Creacion de productos
        Producto producto1 = new Producto("Producto1", "Descripcion1", 1000, R.drawable.dragon);
        Producto producto2 = new Producto("Producto2", "Descripcion2", 2000, R.drawable.icontest);
        Producto producto3 = new Producto("Producto3", "Descripcion3", 3000, R.drawable.producto6);
        Producto producto4 = new Producto("Producto4", "Descripcion4", 4000, R.drawable.dragon);
        Producto producto5 = new Producto("Producto5", "Descripcion5", 5000, R.drawable.icontest);
        Producto producto6 = new Producto("Producto6", "Descripcion6", 6000, R.drawable.producto6);
        Producto producto7 = new Producto("Producto7", "Descripcion7", 7000, R.drawable.dragon);
        Producto producto8 = new Producto("Producto8", "Descripcion8", 8000, R.drawable.icontest);
        Producto producto9 = new Producto("Producto9", "Descripcion9", 9000, R.drawable.producto6);

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);
        arrayProducts.add(producto7);
        arrayProducts.add(producto8);
        arrayProducts.add(producto9);

        // ***
        productoAdapter = new ProductoAdapter(this, arrayProducts);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        listViewProducts.setAdapter(productoAdapter);
    }
}