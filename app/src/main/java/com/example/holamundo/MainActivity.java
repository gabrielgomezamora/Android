package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText campo1;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnPrincipal);

        campo1 = (EditText) findViewById(R.id.editText1);




    }

    public void irASegundaVentana(View view){
        Intent i = new Intent(this,SegundaActivity.class);
        startActivity(i);
    }
}
