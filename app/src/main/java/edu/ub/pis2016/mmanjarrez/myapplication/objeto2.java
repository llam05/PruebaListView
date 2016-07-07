package edu.ub.pis2016.mmanjarrez.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class objeto2 extends AppCompatActivity {

    TextView nom, des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto2);

        this.nom = (TextView) findViewById(R.id.nombre);
        this.des = (TextView) findViewById(R.id.desc);

        Intent i = getIntent();
        String nombre = i.getStringExtra("nombre");
        String desc = i.getStringExtra("desc");

        nom.setText(nombre);
        des.setText(desc);

    }
}
