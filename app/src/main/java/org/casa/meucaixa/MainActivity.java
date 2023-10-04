package org.casa.meucaixa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       text_tela_cadastro = (TextView)findViewById(R.id.text_tela_cadastro);

        text_tela_cadastro.setOnClickListener(this::irParaProxima);
    }
    private void irParaProxima(View view){
        Intent intent = new Intent(MainActivity.this,FormCadastro.class);
        MainActivity.this.startActivity(intent);
    }


}