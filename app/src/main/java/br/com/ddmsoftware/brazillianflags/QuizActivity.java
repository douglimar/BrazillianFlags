package br.com.ddmsoftware.brazillianflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        BrazilianFlags brazilianFlags = new BrazilianFlags();

        List tempList = brazilianFlags.loadAllFlags();

        Button btn1 = (Button)findViewById(R.id.button);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);

        btn1.setText(tempList.get(0).toString());
        btn2.setText(tempList.get(0).toString());
        btn3.setText(tempList.get(0).toString());
        btn4.setText(tempList.get(0).toString());
        btn5.setText(tempList.get(0).toString());
        btn6.setText(tempList.get(0).toString());


    }

    /*
    public List<BrazilianFlags> loadQuizItems(int iQtyFlags, List pFlagList) {

        Random random = new Random();

        List tempList = new ArrayList<BrazilianFlags>();

        int i = 0;

        for (int x=0; x <= iQtyFlags; x++) {

            i = random.nextInt(pFlagList.size());

            tempList.add(pFlagList.get(x));

        }
    }
*/
}
