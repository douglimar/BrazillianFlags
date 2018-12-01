package br.com.ddmsoftware.brazillianflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();

        final String strDetalhes = intent.getStringExtra("DETALHES");
        final String strEstado = intent.getStringExtra("ESTADO");

        TextView tvDetalhes = findViewById(R.id.tvDetalhes);
        TextView tvEstado = findViewById(R.id.tvEstado);
        ImageView imgDetalhesMapa = findViewById(R.id.imgDetalhesMapa);

        //imgDetalhesMapa.setImageResource(R.drawable.acre);

        imgDetalhesMapa.setImageResource(getStateMap(strEstado));

        tvDetalhes.setText(strDetalhes);
        tvEstado.setText(strEstado);

        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewDetails);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    private int getStateMap(String mapa) {

        int retorno = 0;

        switch (mapa) {

            case "Acre": {
                retorno = R.drawable.acre;
                break;
            }

            case "Alagoas": {
                retorno = R.drawable.alagoas; break;
            }

            case "Amapá": {
                retorno = R.drawable.amapa;
                break;
            }

            case "Amazonas": {
                retorno = R.drawable.amazonas;
                break;
            }

            case "Bahia": {
                retorno = R.drawable.bahia;
                break;
            }

            case "Ceará": {
                retorno = R.drawable.ceara;
                break;
            }

            case "Distrito Federal": {
                retorno = R.drawable.distrito_federal;
                break;
            }

            case "Espírito Santo": {
                retorno = R.drawable.espirito_santo;
                break;
            }

            case "Goiás": {
                retorno = R.drawable.goias;
                break;
            }

            case "Maranhão": {
                retorno = R.drawable.maranhao;
                break;
            }

            case "Mato Grosso": {
                retorno = R.drawable.mato_grosso;
                break;
            }

            case "Mato Grosso do Sul": {
                retorno = R.drawable.mato_grosso_do_sul;
                break;
            }

            case "Minas Gerais": {
                retorno = R.drawable.minas_gerais;
                break;
            }

            case "Pará": {
                retorno = R.drawable.para; break;

            }


            case "Paraíba": {
                retorno = R.drawable.paraiba;
                break;
            }

            case "Pernambuco": {
                retorno = R.drawable.pernambuco; break;
            }


            case "Piauí": {
                retorno = R.drawable.piaui; break;

            }

            case "Rio de Janeiro": {
                retorno = R.drawable.rio_de_janeiro;
                break;
            }

            case "Rio Grande do Norte": {
                retorno = R.drawable.rio_grande_do_norte;
                break;
            }

            case "Rio Grande do Sul": {
                retorno = R.drawable.rio_grande_do_sul;
                break;
            }

            case "Rondônia": {
                retorno = R.drawable.rondonia;
                break;
            }

            case "Roraima": {
                retorno = R.drawable.roraima;
                break;
            }

            case "Santa Catarina": {
                retorno = R.drawable.santa_catarina;
                break;
            }

            case "São Paulo": {
                retorno = R.drawable.sao_paulo;
                break;
            }

            case "Sergipe": {
                retorno = R.drawable.sergipe;
                break;
            }

            case "Tocantins": {
                retorno = R.drawable.tocantins;
                break;
            }

        }
        return retorno;
    }

}
