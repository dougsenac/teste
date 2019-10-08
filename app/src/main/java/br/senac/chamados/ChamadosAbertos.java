package br.senac.chamados;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import br.senac.chamados.R;
import br.senac.chamados.api.ChamadoTask;
import br.senac.chamados.api.OnEventListener;
import br.senac.chamados.model.Chamado;
import br.senac.chamados.model.Mensagem;

public class ChamadosAbertos extends Fragment {

    ListView ListaMensagensChamadosAbertos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.fragment_one, container, false);

        final List<Mensagem> mensagens = new ArrayList<Mensagem>();
        ChamadoTask mensagemTask =  new ChamadoTask(view.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {
                Toast.makeText(view.getContext(), "SUCESS"+result, Toast.LENGTH_SHORT).show();
                Log.e("JSON", result);
                Gson gson = new Gson();

                Chamado[] mensagens = gson.fromJson(result, Chamado[].class);
                ArrayAdapter<Chamado> adapter = new ArrayAdapter<Chamado>(getActivity(),
                        android.R.layout.simple_list_item_1, mensagens);

                ListaMensagensChamadosAbertos = (ListView) view.findViewById(R.id.lista_mensagens_enviadas);

                ListaMensagensChamadosAbertos.setAdapter(adapter);
            }

            @Override
            public void onFailure(Exception e) {

                Toast.makeText(view.getContext(), "ERROR " + e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
        mensagemTask.execute();




        return view;
    }
}
