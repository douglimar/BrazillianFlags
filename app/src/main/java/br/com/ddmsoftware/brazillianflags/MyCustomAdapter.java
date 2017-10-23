package br.com.ddmsoftware.brazillianflags;

import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dmoraes on 19/10/2017.
 */

public class MyCustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final List<String> values;

    public MyCustomAdapter(Context context, List<String> values) {
        super(context, R.layout.item_row, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_row, parent,false);
        TextView textView = (TextView) rowView.findViewById(R.id.tvItemRow);
        ImageView imageView =(ImageView) rowView.findViewById(R.id.imgImageRow);

        textView.setText(values.get(position).toString());

        if (textView.getText().equals("Acre")                    ) imageView.setImageResource(R.drawable.acre);
        else if (textView.getText().equals("Amapá")              ) imageView.setImageResource(R.drawable.amapa);
        else if (textView.getText().equals("Alagoas")            ) imageView.setImageResource(R.drawable.alagoas);
        else if (textView.getText().equals("Amazonas")           ) imageView.setImageResource(R.drawable.amazonas);
        else if (textView.getText().equals("Bahia")              ) imageView.setImageResource(R.drawable.bahia);
        else if (textView.getText().equals("Ceará")              ) imageView.setImageResource(R.drawable.ceara);
        else if (textView.getText().equals("Distrito Federal")   ) imageView.setImageResource(R.drawable.distrito_federal);
        else if (textView.getText().equals("Espirito Santo")     ) imageView.setImageResource(R.drawable.espirito_santo);
        else if (textView.getText().equals("Goiás")              ) imageView.setImageResource(R.drawable.goias);
        else if (textView.getText().equals("Maranhão")           ) imageView.setImageResource(R.drawable.maranhao);
        else if (textView.getText().equals("Mato Grosso")        ) imageView.setImageResource(R.drawable.mato_grosso);
        else if (textView.getText().equals("Mato Grosso do Sul") ) imageView.setImageResource(R.drawable.mato_grosso_do_sul);
        else if (textView.getText().equals("Minas Gerais")       ) imageView.setImageResource(R.drawable.minas_gerais);
        else if (textView.getText().equals("Pará")               ) imageView.setImageResource(R.drawable.para);
        else if (textView.getText().equals("Paraíba")            ) imageView.setImageResource(R.drawable.paraiba);
        else if (textView.getText().equals("Paraná")             ) imageView.setImageResource(R.drawable.parana);
        else if (textView.getText().equals("Pernambuco")         ) imageView.setImageResource(R.drawable.pernambuco);
        else if (textView.getText().equals("Piauí")              ) imageView.setImageResource(R.drawable.piaui);
        else if (textView.getText().equals("Rio de Janeiro")     ) imageView.setImageResource(R.drawable.rio_de_janeiro);
        else if (textView.getText().equals("Rio Grande do Norte")) imageView.setImageResource(R.drawable.rio_grande_do_norte);
        else if (textView.getText().equals("Rio Grande do Sul")  ) imageView.setImageResource(R.drawable.rio_grande_do_sul);
        else if (textView.getText().equals("Rondonia")           ) imageView.setImageResource(R.drawable.rondonia);
        else if (textView.getText().equals("Roraima")            ) imageView.setImageResource(R.drawable.roraima);
        else if (textView.getText().equals("Santa Catarina")     ) imageView.setImageResource(R.drawable.santa_catarina);
        else if (textView.getText().equals("São Paulo")          ) imageView.setImageResource(R.drawable.sao_paulo);
        else if (textView.getText().equals("Sergipe")            ) imageView.setImageResource(R.drawable.sergipe);
        else if (textView.getText().equals("Tocantins")          ) imageView.setImageResource(R.drawable.tocantins);

        return rowView;
    }
}
