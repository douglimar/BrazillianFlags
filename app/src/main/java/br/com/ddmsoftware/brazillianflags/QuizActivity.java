package br.com.ddmsoftware.brazillianflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Random;

public class QuizActivity extends AppCompatActivity{

    int iLoadedFlag;
    int iCountErros, iCountAcertos = 0;

    Button btn1, btn2, btn3,btn4,btn5,btn6;
    TextView tvResultado;

    TextView tvAcertos;
    TextView tvErros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btnVoltar = (Button) findViewById(R.id.btnQuiz_Back);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvAcertos = (TextView)findViewById(R.id.tvCountAcertos);
        tvErros   = (TextView)findViewById(R.id.tvCountErros);

        loadNextFlag();

    }

    private void loadNextFlag(){

        final String[] aEstados = new String[6];
        final int[] aOriginalIndexImage = new int[6];

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        Random random = new Random();

        int iTotalBotoes = 6;
        BrazilianFlags brazilianFlags = new BrazilianFlags();
        List<BrazilianFlags> tempList = brazilianFlags.loadAllFlags();

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        for (int x = 0; x < iTotalBotoes; x++) {

            int i = random.nextInt(tempList.size());
            aEstados[x] = tempList.get(i).estado.toString();
            aOriginalIndexImage[x] = i;
        }

        btn1.setText(aEstados[0]);
        btn2.setText(aEstados[1]);
        btn3.setText(aEstados[2]);
        btn4.setText(aEstados[3]);
        btn5.setText(aEstados[4]);
        btn6.setText(aEstados[5]);

        enableButtons(true);

        iLoadedFlag = random.nextInt(aEstados.length);
        imageView.setImageResource(tempList.get(aOriginalIndexImage[iLoadedFlag]).flag);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn1.getText().toString(),aEstados[iLoadedFlag]);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn2.getText().toString(),aEstados[iLoadedFlag]);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn3.getText().toString(),aEstados[iLoadedFlag]);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn4.getText().toString(),aEstados[iLoadedFlag]);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn5.getText().toString(),aEstados[iLoadedFlag]);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comparaResultado(btn6.getText().toString(),aEstados[iLoadedFlag]);
            }
        });


    }

    private void enableButtons(Boolean pDisable) {

        btn1.setEnabled(pDisable);
        btn2.setEnabled(pDisable);
        btn3.setEnabled(pDisable);
        btn4.setEnabled(pDisable);
        btn5.setEnabled(pDisable);
        btn6.setEnabled(pDisable);
    }

    private void comparaResultado(String botaoClicado, String bandeiraCarregada) {

        //String retorno = "RESPOSTA INCORRETA. A BANDEIRA É: " + bandeiraCarregada;
        String retorno = "RESPOSTA INCORRETA";
        tvResultado.setTextColor(getResources().getColor(R.color.incorrect_answer));

        if (botaoClicado.equals(bandeiraCarregada)) {
            tvResultado.setTextColor(getResources().getColor(R.color.correct_answer));
            retorno = "RESPOSTA CORRETA";
            iCountAcertos++;
        } else
            iCountErros++;

        //tvAcertos.setText(iCountAcertos);
        //tvErros.setText(iCountErros);

        tvAcertos.setText(String.valueOf(iCountAcertos));
        tvErros.setText(String.valueOf(iCountErros));

        tvResultado.setText(retorno);
        enableButtons(false);

        loadNextFlag();
    };
}
