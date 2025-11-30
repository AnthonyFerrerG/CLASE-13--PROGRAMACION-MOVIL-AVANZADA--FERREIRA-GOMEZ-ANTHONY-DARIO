package com.example.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.ViewHolder> {

    private List<Alumno> listaAlumnos;
    private Context context;

    public AlumnoAdapter(Context context, List<Alumno> listaAlumnos) {
        this.context = context;
        this.listaAlumnos = listaAlumnos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Alumno alumno = listaAlumnos.get(position);
        holder.txtNombre.setText(alumno.getNombre());
        holder.txtCarrera.setText(alumno.getCarrera());
        holder.imgFoto.setImageResource(alumno.getFoto());

        holder.itemView.setOnClickListener(v -> 
            Toast.makeText(context, "Clic en: " + alumno.getNombre(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return listaAlumnos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView txtNombre, txtCarrera;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtCarrera = itemView.findViewById(R.id.txtCarrera);
        }
    }
}
