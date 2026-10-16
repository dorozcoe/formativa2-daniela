package com.example.formativa2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private FutbolAdaptador adapter;
    private List<Elemento> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerElementos);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        datos = new ArrayList<>();

        datos.add(new Elemento(
                "Cristiano Ronaldo",
                "El mejor del mundo",
                "Máximo goleador histórico del fútbol mundial. Actualmente juega en Al-Nassr.",
                R.drawable.cr7
        ));

        datos.add(new Elemento(
                "Real Madrid C.F.",
                "Mejor club del mundo",
                "Máximo ganador continental con 15 títulos de UEFA Champions League ganadas.",
                R.drawable.madrid
        ));

        datos.add(new Elemento(
                "Junior de Barranquilla",
                "Bicampeón de Colombia",
                "Escudo con 10 estrellas. Jugadores insignia: Teo Gutiérrez, Carlos Bacca y Sebastián Viera.",
                R.drawable.junior
        ));

        datos.add(new Elemento(
                "Luka Modrić",
                "Volante histórico",
                "Ganador del Balón de Oro y referente del mediocampo con 6 Champions League.",
                R.drawable.modric
        ));

        datos.add(new Elemento(
                "Liverpool F.C.",
                "Los Reds",
                "Club histórico de Inglaterra con 6 títulos de Champions League.",
                R.drawable.liverpool
        ));

        datos.add(new Elemento(
                "Selección Colombia",
                "La Tricolor",
                "Subcampeón de América con figuras como Falcao, James Rodríguez y Lucho Díaz.",
                R.drawable.sele
        ));

        adapter = new FutbolAdaptador(this, datos);
        recycler.setAdapter(adapter);
    }
}