package br.com.ddmsoftware.brazillianflags;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;

public class ListOfStates2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_states2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        BrazilianFlags brazilianFlags = new BrazilianFlags();
        List<String> tempList = brazilianFlags.loadStates();

        MyCustomAdapter adapter = new MyCustomAdapter(this, tempList);

        ListView listView = findViewById(R.id.lstStates2);
        listView.setAdapter(adapter);


        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewFlagList2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String item = adapterView.getItemAtPosition(i).toString();

                loadDataFromClick(item);


            }
        });
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

    private void loadDataFromClick(String item) {

        Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();

        String detalhes ="";

        switch (item) {
            case "Acre": {
                detalhes = getString(R.string.acre_detalhes);
                break;
            }
            case "Alagoas": {
                detalhes = getString(R.string.alagoas_detalhes);
                break;
            }

            case "Amapá": {
                detalhes = getString(R.string.amapa_detalhes);
                break;
            }

            case "Amazonas": {
                detalhes = getString(R.string.amazonas_detalhes);
                break;
            }

            case "Bahia": {
                detalhes = getString(R.string.bahia_detalhes);
                break;
            }

            case "Ceará": {
                detalhes = getString(R.string.ceara_detalhes);
                break;
            }

            case "Distrito Federal": {
                detalhes = getString(R.string.distrito_federal_detalhes);
                break;
            }

            case "Espírito Santo": {
                detalhes = getString(R.string.espirito_santo_detalhes);
                break;
            }

            case "Goiás": {
                detalhes = getString(R.string.goias_detalhes);
                break;
            }

            case "Maranhão": {
                detalhes = getString(R.string.maranhao_detalhes);
                break;
            }

            case "Mato Grosso": {
                detalhes = getString(R.string.mato_grosso_detalhes);
                break;
            }

            case "Mato Grosso do Sul": {
                detalhes = getString(R.string.mato_grosso_do_sul_detalhes);
                break;
            }

            case "Minas Gerais": {
                detalhes = getString(R.string.minas_gerais_detalhes);
                break;
            }

            case "Pará": {
                detalhes = getString(R.string.para_detalhes);
                break;

            }


            case "Paraíba": {
                detalhes = getString(R.string.paraiba_detalhes);
                break;
            }

            case "Paraná": {
                detalhes = getString(R.string.parana_detalhes);
                break;
            }

            case "Pernambuco": {
                detalhes = getString(R.string.pernambuco_detalhes);
                break;
            }


            case "Piauí": {
                detalhes = getString(R.string.piaui_detalhes);
                break;

            }

            case "Rio de Janeiro": {
                detalhes = getString(R.string.rio_de_janeiro_detalhes);
                break;
            }

            case "Rio Grande do Norte": {
                detalhes = getString(R.string.rio_grande_do_norte_detalhes);
                break;
            }

            case "Rio Grande do Sul": {
                detalhes = getString(R.string.rio_grande_do_sul_detalhes);
                break;
            }

            case "Rondônia": {
                detalhes = getString(R.string.rondonia_detalhes);
                break;
            }

            case "Roraima": {
                detalhes = getString(R.string.roraima_detalhes);
                break;
            }

            case "Santa Catarina": {
                detalhes = getString(R.string.santa_catarina_detalhes);
                break;
            }

            case "São Paulo": {
                detalhes = getString(R.string.sao_paulo_detalhes);
                break;
            }

            case "Sergipe": {
                detalhes = getString(R.string.sergipe_detalhes);
                break;
            }

            case "Tocantins": {
                detalhes = getString(R.string.tocantins_detalhes);
                break;
            }

        }


        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("ESTADO", item);
        intent.putExtra("DETALHES", detalhes);
        startActivity(intent);

    }

}
