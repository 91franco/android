package com.example.alumno.clase04;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 08/09/2016.
 */
public class MiViewHolder extends RecyclerView.ViewHolder {
    public TextView tvNombre;
    public TextView tvApellido;

    public MiViewHolder (View v){
        super(v);
        this.tvApellido=(TextView) v.findViewById(R.id.tvApellido);
        this.tvNombre=(TextView) v.findViewById(R.id.tvNombre);
    }
}
