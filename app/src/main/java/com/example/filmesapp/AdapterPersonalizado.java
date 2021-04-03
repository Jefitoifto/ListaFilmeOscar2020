package com.example.filmesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPersonalizado extends BaseAdapter {
    private Context context;
    private ArrayList<ItemLanche> dados;

    public AdapterPersonalizado(Context context, ArrayList<ItemLanche> dados) {
        this.context = context;
        this.dados = dados;
    }

    @Override
    public int getCount() {
        return dados.size();
    }

    @Override
    public ItemLanche getItem(int i) {
        return dados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View minhaView = layoutInflater.inflate(R.layout.iten_lanche,viewGroup,false);

        ItemLanche itemLanche = dados.get(i);
        TextView textViewDescricao = minhaView.findViewById(R.id.textViewDescricao);
        textViewDescricao.setText(itemLanche.getDescricao());

        TextView textViewPreco = minhaView.findViewById(R.id.textViewPreço);
        textViewPreco.setText("R$: "+itemLanche.getPreco().toString());

        ImageView imageViewLanche = minhaView.findViewById(R.id.imageViewLanche);
        imageViewLanche.setImageResource(itemLanche.getLanche());


        return minhaView;
    }
}
