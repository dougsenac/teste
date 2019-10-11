package br.senac.Chamado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import br.senac.Chamado.model.Chamado;


public class ChamadosFechados extends Fragment {

    ListView listaMensagensChamadosFechados;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        listaMensagensChamadosFechados = (ListView) view.findViewById(R.id.lista_mensagens_nao_enviadas);

        List<Chamado> mensagens = new ArrayList<Chamado>();



        ArrayAdapter<Chamado> adapter = new ArrayAdapter<Chamado>(getActivity(),
                android.R.layout.simple_list_item_1, mensagens);

        listaMensagensChamadosFechados.setAdapter(adapter);

        return view;
    }
}