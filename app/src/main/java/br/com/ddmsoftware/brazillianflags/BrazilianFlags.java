package br.com.ddmsoftware.brazillianflags;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 10/10/2017.
 */

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

        allFlagsList.add(new BrazilianFlags(getString(R.string.acre_text), R.drawable.acre));
        allFlagsList.add(new BrazilianFlags(getString(R.string.alagoas_text), R.drawable.alagoas));
        allFlagsList.add(new BrazilianFlags(getString(R.string.amapa_text), R.drawable.amapa));
        allFlagsList.add(new BrazilianFlags(getString(R.string.amazonas_text), R.drawable.amazonas));
        allFlagsList.add(new BrazilianFlags(getString(R.string.bahia_text), R.drawable.bahia));
        allFlagsList.add(new BrazilianFlags(getString(R.string.ceara_text), R.drawable.ceara));
        allFlagsList.add(new BrazilianFlags(getString(R.string.distrito_federal_text), R.drawable.distrito_federal));
        allFlagsList.add(new BrazilianFlags(getString(R.string.espirito_santo_text), R.drawable.espirito_santo));
        allFlagsList.add(new BrazilianFlags(getString(R.string.goias_text), R.drawable.goias));
        allFlagsList.add(new BrazilianFlags(getString(R.string.maranhao_text), R.drawable.maranhao));
        allFlagsList.add(new BrazilianFlags(getString(R.string.mato_grosso_text), R.drawable.mato_grosso));
        allFlagsList.add(new BrazilianFlags(getString(R.string.mato_grosso_do_sul_text), R.drawable.mato_grosso_do_sul));
        allFlagsList.add(new BrazilianFlags(getString(R.string.minas_gerais_text), R.drawable.minas_gerais));
        allFlagsList.add(new BrazilianFlags(getString(R.string.para_text), R.drawable.para));
        allFlagsList.add(new BrazilianFlags(getString(R.string.paraiba_text), R.drawable.paraiba));
        allFlagsList.add(new BrazilianFlags(getString(R.string.parana_text), R.drawable.parana));
        allFlagsList.add(new BrazilianFlags(getString(R.string.pernambuco_text), R.drawable.pernambuco));
        allFlagsList.add(new BrazilianFlags(getString(R.string.piaui_text), R.drawable.piaui));
        allFlagsList.add(new BrazilianFlags(getString(R.string.rio_de_janeiro_text), R.drawable.rio_de_janeiro));
        allFlagsList.add(new BrazilianFlags(getString(R.string.rio_grande_do_norte_text), R.drawable.rio_grande_do_norte));
        allFlagsList.add(new BrazilianFlags(getString(R.string.rio_grande_do_sul_text), R.drawable.rio_grande_do_sul));
        allFlagsList.add(new BrazilianFlags(getString(R.string.rondonia_text), R.drawable.rondonia));
        allFlagsList.add(new BrazilianFlags(getString(R.string.roraima_text), R.drawable.roraima));
        allFlagsList.add(new BrazilianFlags(getString(R.string.santa_catarina_text), R.drawable.santa_catarina));
        allFlagsList.add(new BrazilianFlags(getString(R.string.sao_paulo_text), R.drawable.sao_paulo));
        allFlagsList.add(new BrazilianFlags(getString(R.string.sergipe_text), R.drawable.sergipe));
        allFlagsList.add(new BrazilianFlags(getString(R.string.tocantins_text), R.drawable.tocantins));

        return allFlagsList;
    }


    public List<String> loadStates(){

        List<String> myStateList = new ArrayList<>();

        myStateList.add(getString(R.string.acre_text));
        myStateList.add(getString(R.string.alagoas_text));
        myStateList.add(getString(R.string.amapa_text));
        myStateList.add(getString(R.string.amazonas_text));
        myStateList.add(getString(R.string.bahia_text));
        myStateList.add(getString(R.string.ceara_text));
        myStateList.add(getString(R.string.distrito_federal_text));
        myStateList.add(getString(R.string.espirito_santo_text));
        myStateList.add(getString(R.string.goias_text));
        myStateList.add(getString(R.string.maranhao_text));
        myStateList.add(getString(R.string.mato_grosso_text));
        myStateList.add(getString(R.string.mato_grosso_do_sul_text));
        myStateList.add(getString(R.string.minas_gerais_text));
        myStateList.add(getString(R.string.para_text));
        myStateList.add(getString(R.string.paraiba_text));
        myStateList.add(getString(R.string.parana_text));
        myStateList.add(getString(R.string.pernambuco_text));
        myStateList.add(getString(R.string.piaui_text));
        myStateList.add(getString(R.string.rio_de_janeiro_text));
        myStateList.add(getString(R.string.rio_grande_do_norte_text));
        myStateList.add(getString(R.string.rio_grande_do_sul_text));
        myStateList.add(getString(R.string.rondonia_text));
        myStateList.add(getString(R.string.roraima_text));
        myStateList.add(getString(R.string.santa_catarina_text));
        myStateList.add(getString(R.string.sao_paulo_text));
        myStateList.add(getString(R.string.sergipe_text));
        myStateList.add(getString(R.string.tocantins_text));

        return myStateList;
    }

}
