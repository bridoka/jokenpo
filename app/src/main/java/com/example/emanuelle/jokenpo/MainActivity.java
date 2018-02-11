package com.example.emanuelle.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

import static com.example.emanuelle.jokenpo.R.drawable.pedra;

public class MainActivity extends AppCompatActivity {

    public static final String TESOURA = "tesoura";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        ImageView imagemResultado = (ImageView) findViewById(R.id.imgEscolhaApp);
        String[] opcoes = {"papel","pedra","tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];
        switch (escolhaApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        TextView textoResposta = findViewById(R.id.textResposta);
        if(escolhaUsuario != escolhaApp) {
            if(escolhaApp == TESOURA && escolhaUsuario == "papel"){
                textoResposta.setText("Você perdeu!");
            } else if(escolhaApp == "papel" && escolhaUsuario == "pedra"){
                textoResposta.setText("Você perdeu!");
            } else if(escolhaApp == "pedra" && escolhaUsuario == "tesoura"){
                textoResposta.setText("Você perdeu!");
            } else {
                textoResposta.setText("Você ganhou!");
            }
        } else{
            textoResposta.setText("Empate!!");
        }
    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel (View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }
}
