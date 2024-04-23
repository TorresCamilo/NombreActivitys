package com.torres.nombreactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombre = (EditText) findViewById((R.id.txtNombre));
    }
    public void Siguiente (View sig){
        String nombre_str = nombre.getText().toString();
        if(!(nombre_str.isEmpty())){
            Intent siguiente = new Intent(this, MainActivity2.class);
            siguiente.putExtra("valorNombre", nombre.getText().toString());
            startActivity(siguiente);
        }else
            Toast.makeText(this, "Favor digite el nombre para poder continuar", Toast.LENGTH_LONG).show();

    }
}