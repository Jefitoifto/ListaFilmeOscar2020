package com.example.filmesapp;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SinopseActivity extends AppCompatActivity {
    String dado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopse);

        TextView tvDetalhe = findViewById(R.id.textViewDetalhe);
        TextView tvOscar = findViewById(R.id.textViewOscar);

        Intent intent = getIntent();

        if (intent != null) {
            dado = intent.getStringExtra("filme");
            TextView tvSinopse = findViewById(R.id.textViewSinopse);
            tvSinopse.setText("Sinopse " + dado);

            if (dado.equals("Harriet")) {
                tvDetalhe.setText("Logo após de ter escapado da escravidão, Harriet Tubman decide ajudar centenas de escravos a fugirem do sul dos Estados Unidos durante a Guerra Civil americana, no ano de 1849. Suas ações dão um novo direcionamento para a história, e a ativista política se torna uma das maiores heroínas do país.");
                tvOscar.setText("Melhor Foografia\n" +
                        "Melhor mixagem de som\n" +
                        "Melhor efeitos visuais\n");

            } else if (dado.equals("O Irlandês")) {
                tvDetalhe.setText("O Irlandês é baseado no livro I Heard You Paint Houses, de Charles Brandt, que conta a saga de Frank Sheeran (interpretado por De Niro nas telonas), um veterano de guerra dividido entre dois trabalhos: ser caminhoneiro e assassino de aluguel preferido da máfia.");
                tvOscar.setText("Melhor Figurino");

            } else if (dado.equals("Rocketman")) {
                tvDetalhe.setText("Extremamente talentoso mas muito tímido, o pianista prodígio Reginald Dwight muda seu nome para Elton John e torna-se uma estrela da música de renome internacional durante os anos 1970.");
                tvOscar.setText("Melhor ator principal (Joaquim Phoenix )\n" +
                        "Melhor trilha original");

            } else if (dado.equals("O Farol")) {
                tvDetalhe.setText("No final do século 19, um novo zelador chega a uma remota ilha na Nova Inglaterra para ajudar o faroleiro local, mas o isolamento causa tensão na convivência entre os dois homens. Entre tempestades e goles de querosene, o novato tenta desvendar os mistérios que existem nas histórias de pescador de seu chefe.");
                tvOscar.setText("Melhor ator coadjuvante (Brad Pitt)\n" +
                        "Melhor design de produção\n");

            } else if (dado.equals("O Escândalo")) {
                tvDetalhe.setText("As funcionárias da Fox News denunciam a cultura de masculinidade tóxica da empresa de mídia norte-americana, levando à queda do magnata Roger Ailes.");
                tvOscar.setText("Melhor edição\n" +
                        "Melhor edição de som");

            } else if (dado.equals("Fronzen 2")) {
                tvDetalhe.setText("De volta à infância de Elsa e Anna, as duas garotas descobrem uma história do pai, quando ainda era príncipe de Arendelle." 
                                  +"Ele conta às meninas a história de uma visita à floresta dos elementos, onde um acontecimento inesperado teria provocado a separação dos habitantes da cidade com os quatro elementos fundamentais: ar, fogo, terra e água. Esta revelação ajuda Elsa a compreender a origem de seus poderes.");
                tvOscar.setText("");

            } else if (dado.equals("1917")) {
                tvDetalhe.setText("Na Primeira Guerra Mundial, dois soldados britânicos recebem ordens aparentemente impossíveis de cumprir." +
                        " Em uma corrida contra o tempo, eles precisam atravessar o território inimigo " +
                        "e entregar uma mensagem que pode salvar 1.600 de seus companheiros.");
                tvOscar.setText("Melhor Foografia\n" +
                        "Melhor mixagem de som\n" +
                        "Melhor efeitos visuais\n");

            }
        }
    }
}
