package com.Starsolucions.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma, btn_resta, btn_divicion, btn_multiplicacion;
    private EditText ET_Numero1, ET_Numero2;
    private TextView TV_Respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relacionar variables con los ID de lod botones
        btn_suma = findViewById(R.id.button_suma);
        btn_resta = findViewById(R.id.button_resta);
        btn_divicion = findViewById(R.id.button_Division);
        btn_multiplicacion = findViewById(R.id.button_Multiplicacion);
        ET_Numero1 = findViewById(R.id.numero1);
        ET_Numero2 = findViewById(R.id.numero2);
        TV_Respuesta = findViewById(R.id.respuesta);

        // Crear acciones para los botones en este caso
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamar metodo y pasarles la caja de texto parsiando
               TV_Respuesta.setText( suma( Integer.parseInt(ET_Numero1.getText().toString()), Integer.parseInt(ET_Numero2.getText().toString())) + "");
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_Respuesta.setText( resta( Integer.parseInt(ET_Numero1.getText().toString()), Integer.parseInt(ET_Numero2.getText().toString())) + "");
            }
        });

        btn_divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_Respuesta.setText( divicion( Integer.parseInt(ET_Numero1.getText().toString()), Integer.parseInt(ET_Numero2.getText().toString())) + "");
            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_Respuesta.setText( multiplicacion( Integer.parseInt(ET_Numero1.getText().toString()), Integer.parseInt(ET_Numero2.getText().toString())) + "");
            }
        });




    }

      /////metodos
    public double suma (double a, double b){
        return a+b;
    }
    public double resta (double a, double b){
        return a-b;
    }
    public double divicion (double a, double b){
        ////controlar la divicion entre 0
        double respuesta = 0;
        if (b != 0) {
            respuesta = a/b;
        }
        return respuesta;
    }
    public double multiplicacion (double a, double b){
        return a*b;
    }
}