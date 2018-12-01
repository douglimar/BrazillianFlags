package br.com.ddmsoftware.brazillianflags;

import android.annotation.SuppressLint;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 10/10/2017.
 */

@SuppressLint("Registered")
class BrazilianFlags extends Application {

    public String estado;
    public int flag;

    public BrazilianFlags() {

    }


    private BrazilianFlags(String estado, int flag) {
        this.estado = estado;
        this.flag = flag;
    }

    public List<BrazilianFlags> loadAllFlags(){

        List<BrazilianFlags> allFlagsList = new ArrayList<>();

        allFlagsList.add(new BrazilianFlags("Acre", R.drawable.acre));
        allFlagsList.add(new BrazilianFlags("Alagoas", R.drawable.alagoas));
        allFlagsList.add(new BrazilianFlags("Amapá", R.drawable.amapa));
        allFlagsList.add(new BrazilianFlags("Amazonas", R.drawable.amazonas));
        allFlagsList.add(new BrazilianFlags("Bahia", R.drawable.bahia));
        allFlagsList.add(new BrazilianFlags("Ceará", R.drawable.ceara));
        allFlagsList.add(new BrazilianFlags("Distrito Federal", R.drawable.distrito_federal));
        allFlagsList.add(new BrazilianFlags("Espírito Santo", R.drawable.espirito_santo));
        allFlagsList.add(new BrazilianFlags("Goiás", R.drawable.goias));
        allFlagsList.add(new BrazilianFlags("Maranhão", R.drawable.maranhao));
        allFlagsList.add(new BrazilianFlags("Mato Grosso", R.drawable.mato_grosso));
        allFlagsList.add(new BrazilianFlags("Mato Grosso do Sul", R.drawable.mato_grosso_do_sul));
        allFlagsList.add(new BrazilianFlags("Minas Gerais", R.drawable.minas_gerais));
        allFlagsList.add(new BrazilianFlags("Pará", R.drawable.para));
        allFlagsList.add(new BrazilianFlags("Paraíba", R.drawable.paraiba));
        allFlagsList.add(new BrazilianFlags("Paraná", R.drawable.parana));
        allFlagsList.add(new BrazilianFlags("Pernambuco", R.drawable.pernambuco));
        allFlagsList.add(new BrazilianFlags("Piauí", R.drawable.piaui));
        allFlagsList.add(new BrazilianFlags("Rio de Janeiro", R.drawable.rio_de_janeiro));
        allFlagsList.add(new BrazilianFlags("Rio Grande do Norte", R.drawable.rio_grande_do_norte));
        allFlagsList.add(new BrazilianFlags("Rio Grande do Sul", R.drawable.rio_grande_do_sul));
        allFlagsList.add(new BrazilianFlags("Rondônia", R.drawable.rondonia));
        allFlagsList.add(new BrazilianFlags("Roraima", R.drawable.roraima));
        allFlagsList.add(new BrazilianFlags("Santa Catarina", R.drawable.santa_catarina));
        allFlagsList.add(new BrazilianFlags("São Paulo", R.drawable.sao_paulo));
        allFlagsList.add(new BrazilianFlags("Sergipe", R.drawable.sergipe));
        allFlagsList.add(new BrazilianFlags("Tocantins", R.drawable.tocantins));

        return allFlagsList;
    }


    public List<String> loadStates(){

        List<String> myStateList = new ArrayList<>();

        myStateList.add("Acre");
        myStateList.add("Alagoas");
        myStateList.add("Amapá");
        myStateList.add("Amazonas");
        myStateList.add("Bahia");
        myStateList.add("Ceará");
        myStateList.add("Distrito Federal");
        myStateList.add("Espírito Santo");
        myStateList.add("Goiás");
        myStateList.add("Maranhão");
        myStateList.add("Mato Grosso");
        myStateList.add("Mato Grosso do Sul");
        myStateList.add("Minas Gerais");
        myStateList.add("Pará");
        myStateList.add("Paraíba");
        myStateList.add("Paraná");
        myStateList.add("Pernambuco");
        myStateList.add("Piauí");
        myStateList.add("Rio de Janeiro");
        myStateList.add("Rio Grande do Norte");
        myStateList.add("Rio Grande do Sul");
        myStateList.add("Rondônia");
        myStateList.add("Roraima");
        myStateList.add("Santa Catarina");
        myStateList.add("São Paulo");
        myStateList.add("Sergipe");
        myStateList.add("Tocantins");

        return myStateList;
    }

}
