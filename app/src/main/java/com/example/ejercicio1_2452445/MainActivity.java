package com.example.ejercicio1_2452445;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos - Propiedad
    int contador;

    //metodo creado por android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        //creacion de mi propia vista con codigo JAVA, NO RECOMENDABLE
        TextView miVista = new TextView(this);
        miVista.setText("Hola Clase ficha 2452445");
        setContentView(miVista);
        */
    }

    //mi metodos de la aplicacion (funcion)
    //void: no devulve nada, vacio
    public void incrementar(View vista){
        //contador++;
        contador = contador + 1;
        mostrarResultado();
    }

    public void decrementar(View vista){
        contador--;
        mostrarResultado();
    }

    public void reset(View vista){
        contador = 0;
        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView numero = findViewById(R.id.txtNumero);
        numero.setText("Contador: "+contador);

    }
}