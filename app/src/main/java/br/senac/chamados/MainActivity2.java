package br.senac.chamados;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


import br.senac.chamados.model.Mensagem;
import br.senac.chamados.model.Status;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listaChamadosTela = (ListView)findViewById(R.id.lista);

        List<Mensagem> listaDeMensagens = new ArrayList<Mensagem>();

        ArrayAdapter<Mensagem> adapter = new ArrayAdapter<Mensagem>(this, android.R.layout.simple_expandable_list_item_1, listaDeMensagens);

        Mensagem mensagem = new Mensagem(1L, "Primeira", Status.ENVIADA);
        Mensagem mensagem2 = new Mensagem(2L, "Segunda", Status.ENVIADA);
        Mensagem mensagem3 = new Mensagem(3L, "Terceira", Status.ENVIADA);
        Mensagem mensagem4 = new Mensagem(4L, "Quarta", Status.ENVIADA);
        Mensagem mensagem5 = new Mensagem(5L, "Quinta", Status.ENVIADA);
        Mensagem mensagem6 = new Mensagem(6L, "Sexta", Status.ENVIADA);

        listaDeMensagens.add(mensagem);
        listaDeMensagens.add(mensagem2);
        listaDeMensagens.add(mensagem3);
        listaDeMensagens.add(mensagem4);
        listaDeMensagens.add(mensagem5);
        listaDeMensagens.add(mensagem6);

        listaChamadosTela.setAdapter(adapter);


    }
}
