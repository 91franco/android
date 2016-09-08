package com.example.alumno.clase04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alumno on 08/09/2016.
 */
public class MiAdapter extends RecyclerView.Adapter<MiViewHolder> {
    private List<Persona> personas;

    public MiAdapter ( List<Persona> personas){
        this.personas=personas;
    }

    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MiViewHolder miViewHolder = new MiViewHolder(v);
        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {

        holder.tvApellido.setText(personas.get(position).getApellido());
        holder.tvNombre.setText(personas.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }
}
