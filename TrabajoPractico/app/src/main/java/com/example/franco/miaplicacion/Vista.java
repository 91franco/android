package com.example.franco.miaplicacion;


import android.content.Intent;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;

/**
 * Created by Franco on 24/09/2016.
 */
public class Vista {
    private Button btnIngresar;
    private Button btnRegistrarse;
    private Button btnReRegistrarse;
    private Button btnAgregar;
    private Activity activity;
    private EditText editNombre;
    private EditText editApellido;
    private EditText editUsuario;
    private EditText editContraseña;
    private EditText editReContraseña;
    private Usuario usuario;

    public Vista (Activity ac, Controlador controlador){
      activity = ac;

        if(activity.getClass().getName().equals("com.example.franco.miaplicacion.InicioActivity")){
            this.btnIngresar=(Button) activity.findViewById(R.id.btnIngresar);
            this.btnRegistrarse=(Button) activity.findViewById(R.id.btnRegistrarse);

            this.btnIngresar.setOnClickListener(controlador);
            this.btnRegistrarse.setOnClickListener(controlador);
        }

      if (activity.getClass().getName().equals("com.example.franco.miaplicacion.RegistrarseActivity")){
          this.btnReRegistrarse=(Button) activity.findViewById(R.id.btnReRegistrarse);
          this.btnReRegistrarse.setOnClickListener(controlador);
          this.editNombre = (EditText) activity.findViewById(R.id.editRNombre);
          this.editApellido = (EditText) activity.findViewById(R.id.editRApellido);
          this.editUsuario = (EditText) activity.findViewById(R.id.editRUsuarioEmail);
          this.editContraseña = (EditText) activity.findViewById(R.id.editRClave);
          this.editReContraseña = (EditText) activity.findViewById(R.id.editRReinClave);
      }

      if (activity.getClass().getName().equals("com.example.franco.miaplicacion.CategoriaActivity")) {
          this.btnAgregar=(Button) activity.findViewById(R.id.btnAgregar);
          this.btnAgregar.setOnClickListener(controlador);

      }
    }

    public void iniciarRegistro(){
        Intent i = new Intent(activity,RegistrarseActivity.class);
        activity.startActivity(i);
    }

    public void datosRegistro(){
        usuario = new Usuario(this.editNombre.getText().toString(),this.editApellido.getText().toString(),
                this.editUsuario.getText().toString(),this.editContraseña.getText().toString());
        Intent i = new Intent(activity,InicioActivity.class);
        activity.startActivity(i);
    }

    public void crearCategoria(){
        Intent i = new Intent(activity,NuevaCategoriaActivity.class);
        activity.startActivity(i);
    }
}
