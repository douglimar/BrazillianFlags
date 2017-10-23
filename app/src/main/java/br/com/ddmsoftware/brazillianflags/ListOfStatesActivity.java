package br.com.ddmsoftware.brazillianflags;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class ListOfStatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_states);

        Button btnVoltar = (Button)findViewById(R.id.btnListOfStates_Back);

        BrazilianFlags brazilianFlags = new BrazilianFlags();
        List<String> tempList = brazilianFlags.loadStates();

        MyCustomAdapter adapter = new MyCustomAdapter(this, tempList);

        ListView listView = (ListView) findViewById(R.id.lstStates);
        listView.setAdapter(adapter);


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
