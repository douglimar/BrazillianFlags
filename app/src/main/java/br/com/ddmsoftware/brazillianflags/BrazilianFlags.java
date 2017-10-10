package br.com.ddmsoftware.brazillianflags;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dmoraes on 10/10/2017.
 */

public class BrazilianFlags {

    public String estado;
    public int flag;

    List<BrazilianFlags> allFlagsList;



    public BrazilianFlags() {

    }


    public BrazilianFlags(String estado, int flag) {
        this.estado = estado;
        this.flag = flag;
    }

    public List loadAllFlags(){

        allFlagsList = new ArrayList<>();

        allFlagsList.add(new BrazilianFlags("Acre", R.drawable.acre));


        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.acre_text), R.drawable.acre));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.alagoas_text), R.drawable.alagoas));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.amapa_text), R.drawable.amapa));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.amazonas_text), R.drawable.amazonas));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.bahia_text), R.drawable.bahia));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.ceara_text), R.drawable.ceara));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.distrito_federal_text), R.drawable.distrito_federal));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.espirito_santo_text), R.drawable.espirito_santo));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.goias_text), R.drawable.goias));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.maranhao_text), R.drawable.maranhao));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.mato_grosso_text), R.drawable.mato_grosso));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.mato_grosso_do_sul_text), R.drawable.mato_grosso_do_sul));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.minas_gerais_text), R.drawable.minas_gerais));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.para_text), R.drawable.para));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.paraiba_text), R.drawable.paraiba));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.parana_text), R.drawable.parana));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.pernambuco_text), R.drawable.pernambuco));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.piaui_text), R.drawable.piaui));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.rio_de_janeiro_text), R.drawable.rio_de_janeiro));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.rio_grande_do_norte_text), R.drawable.rio_grande_do_norte));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.rio_grande_do_sul_text), R.drawable.rio_grande_do_sul));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.rondonia_text), R.drawable.rondonia));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.roraima_text), R.drawable.roraima));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.santa_catarina_text), R.drawable.santa_catarina));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.sao_paulo_text), R.drawable.sao_paulo));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.sergipe_text), R.drawable.sergipe));
        allFlagsList.add(new BrazilianFlags(Resources.getSystem().getResourceName(R.string.tocantins_text), R.drawable.tocantins));

        return allFlagsList;
    }

}
