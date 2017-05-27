package com.example.jose6jas.aplicacionformulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {
    private TextView tvnombre;
    private TextView tvfecha;
    private TextView tvtelefono;
    private TextView tvemail;
    private TextView tvdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros  = getIntent().getExtras();

        String nombre      = "Nombre: "     .concat(parametros.getString(getResources().getString(R.string.pnombre)));
        String fecha       = "Fecha: "      .concat(parametros.getString(getResources().getString(R.string.pfecha)));
        String telefono    = "Telefono: "   .concat(parametros.getString(getResources().getString(R.string.ptelefono)));
        String email       = "Email: "      .concat(parametros.getString(getResources().getString(R.string.pemail)));
        String descripcion = "Descripción: ".concat(parametros.getString(getResources().getString(R.string.pdescripcion)));

        tvnombre      = (TextView) findViewById(R.id.tvnombre);
        tvfecha       = (TextView) findViewById(R.id.tvfecha);
        tvtelefono    = (TextView) findViewById(R.id.tvtelefono);
        tvemail       = (TextView) findViewById(R.id.tvemail);
        tvdescripcion = (TextView) findViewById(R.id.tvdescripcion);
        //
        tvnombre      .setText(nombre);
        tvfecha       .setText(fecha);
        tvtelefono    .setText(telefono);
        tvemail       .setText(email);
        tvdescripcion .setText(descripcion);

        Button btn_confirmar = (Button) findViewById(R.id.btn_confirmar);
        btn_confirmar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                finish(); // Finalizo esta instancia y vuelvo a la anterior y Edito los datos ya precargados Jose Seijas
            }
        });
    }

}
