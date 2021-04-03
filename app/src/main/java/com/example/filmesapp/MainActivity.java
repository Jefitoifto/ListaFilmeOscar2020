package com.example.filmesapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private ListView listViewLanche;
    private AdapterPersonalizado adapterPersonalizado;
    private ArrayList<ItemLanche> dados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewLanche = findViewById(R.id.listViewLanche);
        criarLista();
        listViewLanche.setAdapter(new AdapterPersonalizado(getApplicationContext(),dados));
        listViewLanche.setOnItemClickListener(this);
    }

    private void criarLista() {
        dados = new ArrayList<>();
        dados.add(new ItemLanche(getString(R.string.textCafe),
                R.drawable.ic_cafe,2.50));
        dados.add(new ItemLanche(getString((R.string.textBolo)),
                R.drawable.ic_bolo,5.00));
        dados.add(new ItemLanche(getString(R.string.textSanduiche),
                R.drawable.ic_sanduiche,10.00));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ItemLanche itemSelecionado = (ItemLanche) parent.getItemAtPosition(position);
        Toast.makeText(getApplicationContext(),"Você clicou em: "+itemSelecionado.getDescricao(),
                Toast.LENGTH_SHORT).show();
    }
}