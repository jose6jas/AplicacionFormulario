package com.example.jose6jas.aplicacionformulario;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button btn_siguiente = (Button) findViewById(R.id.btn_siguiente);
        btn_siguiente.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                TextInputEditText tiet_nombre      = (TextInputEditText) findViewById(R.id.tiet_nombre);
                TextInputEditText tiet_telefono    = (TextInputEditText) findViewById(R.id.tiet_telefono);
                TextInputEditText tiet_email       = (TextInputEditText) findViewById(R.id.tiet_email);
                TextInputEditText tiet_descripcion = (TextInputEditText) findViewById(R.id.tiet_descripcion);
                DatePicker dp_fecha                = (DatePicker) findViewById(R.id.dp_fecha);
                int mes = dp_fecha.getMonth() + 1; //simplemente el mes va desde 0 hasta 11 para mostar el mes corretamente
                //le agrego la suma de mas uno para que vaya desde 1 hasta 12 meses

                //Aqui hago una concatenacion de la fecha Jose Seijas
                String fecha = String.valueOf(dp_fecha.getDayOfMonth()).concat("-").concat(String.valueOf(mes))
                        .concat("-").concat(String.valueOf(dp_fecha.getYear()));

                //convertir String.valueOf(day)Jose Seijas

                //                 ________________NOMBREVARSTRING_________  ______________VARIABLE_____________Jose Seijas
                //intent.putExtra(getResources().getString(R.string.pnombre),contactos.get(position).getNombre());Jose Seijas

                Intent intent = new Intent(MainActivity.this,ConfirmarDatos.class);
                intent.putExtra(getResources().getString(R.string.pnombre),tiet_nombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.pfecha),fecha);
                intent.putExtra(getResources().getString(R.string.ptelefono),tiet_telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.pemail),tiet_email.getText().toString());
                intent.putExtra(getResources().getString(R.string.pdescripcion),tiet_descripcion.getText().toString());
                startActivity(intent);
                //finish();Jose Seijas
                //Simplemente no finalizo la instancia para poder retornar cuando finalizo la otra instancia y los datos quedanJose Seijas
                //precargados Jose Seijas
            }
        });
    }


}
