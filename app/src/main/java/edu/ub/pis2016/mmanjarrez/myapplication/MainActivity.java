package edu.ub.pis2016.mmanjarrez.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista);

        ArrayList<Planeta> planetList = new ArrayList<Planeta>();
        planetList.add(new Planeta("Marte","Planeta"));
        planetList.add(new Planeta("Urano","Planeta"));
        planetList.add(new Planeta("Plutón","Planeta"));
        planetList.add(new Planeta("Jupiter","Planeta"));
        planetList.add(new Planeta("Tierra","Planeta"));

        this.lista.setAdapter(new PlanetaAdapter(this, planetList));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {

                Planeta item = (Planeta) lista.getAdapter().getItem(position);
                Intent intent = new Intent(MainActivity.this, objeto2.class);
                intent.putExtra("nombre",item.getNombre());
                intent.putExtra("desc",item.getDesc());
                startActivity(intent);

            }
        });
    }
}
