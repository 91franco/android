package com.example.alumno.clase04;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 08/09/2016.
 */
public class MiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView tvNombre;
    public TextView tvApellido;
    public MiClick listener;
    public int index;

    public MiViewHolder (View v,MiClick listener){
        super(v);
        this.tvApellido=(TextView) v.findViewById(R.id.tvApellido);
        this.tvNombre=(TextView) v.findViewById(R.id.tvNombre);
        v.setOnClickListener(this);
        this.listener=listener;
    }

     @Override
    public void onClick(View v) {
        listener.seHizoClick(index);
        Log.d("Se hizo click", "Click en el elemento: "+index );
    }
}
