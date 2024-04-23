package com.torres.nombreactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView valorNombre;
    private String dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        valorNombre = (TextView) findViewById(R.id.tv1);
        dato = getIntent().getStringExtra("valorNombre");
        valorNombre.setText(dato);
        //nombre.setText(dato);
    }
    public void Siguiente (View sig){
        Intent siguiente = new Intent(this, MainActivity3.class);
        siguiente.putExtra("valorNombre", dato);
        startActivity(siguiente);
    }
    public void Anterior (View ant){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}