package com.example.filmesapp;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private ListView listViewFilme;
    private AdapterPersonalizado adapterPersonalizado;
    private ArrayList<ItemFilme> dados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewFilme = findViewById(R.id.listViewFilmes);

        criarLista();
        listViewFilme.setAdapter(new AdapterPersonalizado(getApplicationContext(),dados));
        listViewFilme.setOnItemClickListener(this);
    }

    private void criarLista() {
        dados = new ArrayList<>();
        dados.add(new ItemFilme("Harriet",R.drawable.ic_filme1));
        dados.add(new ItemFilme("O Irlandês",R.drawable.ic_filme2));
        dados.add(new ItemFilme("Rocketman",R.drawable.ic_filme3));
        dados.add(new ItemFilme("O Farol",R.drawable.ic_filme4));
        dados.add(new ItemFilme("O Escândalo",R.drawable.ic_filme5));
        dados.add(new ItemFilme("Fronzen 2",R.drawable.ic_filme6));
        dados.add(new ItemFilme("1917",R.drawable.ic_filme7));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ItemFilme itemSelecionado = (ItemFilme) parent.getItemAtPosition(position);

    }
    private void abrirTela(String item) {
        if(item.equals("Harriet")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "Harriet");
            startActivity(intent);

        }else if(item.equals("O Irlandês")) {
            Intent intent = new Intent(getApplicationContext(), SinopseActivity.class);
            intent.putExtra("filme", "O Irlandês");
            startActivity(intent);

        }else if(item.equals("Rocketman")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "Rocketman");
            startActivity(intent);

        }else if(item.equals("O Farol")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "O Farol");
            startActivity(intent);

        }else if(item.equals("O Escândalo")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "O Escândalo");
            startActivity(intent);

        }else if(item.equals("Fronzen 2")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "Fronzen 2");
            startActivity(intent);

        }else if(item.equals("1917")){
            Intent intent = new Intent(getApplicationContext(),SinopseActivity.class);
            intent.putExtra("filme", "1917");
            startActivity(intent);

        }
    }//abrirTela
}
