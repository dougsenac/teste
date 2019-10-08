package br.senac.chamados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtlogin = (EditText) findViewById(R.id.textlogin);
        final EditText edtsenha = (EditText) findViewById(R.id.textsenha);
        final Button button = (Button) findViewById(R.id.btnlogar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((edtlogin.getText().toString().equals("Login")) && (edtsenha.getText().toString().equals("1234"))) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Bem Vindo" + edtlogin.getText().toString(),Toast.LENGTH_LONG);
                    toast.show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);

                }else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Tente Novamente",Toast.LENGTH_LONG);
                    toast.show();
                }


            }
        });

    }
}
