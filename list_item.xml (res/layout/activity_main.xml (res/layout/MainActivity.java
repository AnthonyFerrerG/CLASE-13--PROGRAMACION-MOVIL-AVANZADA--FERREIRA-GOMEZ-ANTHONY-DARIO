package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerAlumnos;
    private AlumnoAdapter adapter;
    private List<Alumno> listaAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerAlumnos = findViewById(R.id.recyclerAlumnos);
        recyclerAlumnos.setLayoutManager(new LinearLayoutManager(this));

        listaAlumnos = new ArrayList<>();
        // Crear al menos 10 alumnos
        listaAlumnos.add(new Alumno("Juan Pérez", "Ingeniería Informática", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("María Gómez", "Lic. en Matemáticas", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Carlos Ruiz", "Ingeniería Electrónica", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Ana López", "Lic. en Física", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Luis Torres", "Ingeniería Química", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Sofía Ramírez", "Lic. en Biología", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Miguel Díaz", "Ingeniería Civil", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Laura Fernández", "Lic. en Historia", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Diego Sánchez", "Ingeniería Industrial", R.drawable.ic_launcher_foreground));
        listaAlumnos.add(new Alumno("Carla Jiménez", "Lic. en Literatura", R.drawable.ic_launcher_foreground));

        adapter = new AlumnoAdapter(this, listaAlumnos);
        recyclerAlumnos.setAdapter(adapter);
    }
}
