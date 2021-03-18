
package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int idx = 0;
    boolean[] pwd = {false,false,false,false};
    Button[] ans = new Button[4];
    ImageView[]  img = new ImageView[4];
    Button[] btn = new Button[11];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img[0] = (ImageView)findViewById(R.id.red1);
        img[1] = (ImageView)findViewById(R.id.red2);
        img[2] = (ImageView)findViewById(R.id.red3);
        img[3] = (ImageView)findViewById(R.id.red4);

        ans[0] = (Button)findViewById((R.id.btn1));
        ans[1] = (Button)findViewById((R.id.btn2));
        ans[2] = (Button)findViewById((R.id.btn3));
        ans[3] = (Button)findViewById((R.id.btn4));

        for(int i =0;i<btn.length;i++){
            switch(i){
                case 0:
                    btn[0] = (Button)findViewById(R.id.btn0);
                    break;
                case 1:
                    btn[1] = (Button)findViewById(R.id.btn1);
                    break;
                case 2:
                    btn[2] = (Button)findViewById(R.id.btn2);
                    break;
                case 3:
                    btn[3] = (Button)findViewById(R.id.btn3);
                    break;
                case 4:
                    btn[4] = (Button)findViewById(R.id.btn4);
                    break;
                case 5:
                    btn[5] = (Button)findViewById(R.id.btn5);
                    break;
                case 6:
                    btn[6] = (Button)findViewById(R.id.btn6);
                    break;
                case 7:
                    btn[7] = (Button)findViewById(R.id.btn7);
                    break;
                case 8:
                    btn[8] = (Button)findViewById(R.id.btn8);
                    break;
                case 9:
                    btn[9] = (Button)findViewById(R.id.btn9);
                    break;
                case 10:
                    btn[10] = (Button)findViewById(R.id.btn10);
                    break;
                case 11:
                    btn[11] = (Button)findViewById(R.id.btn11);
                    break;
            }
            TextView result = (TextView) findViewById(R.id.textView);
            TextView result2 = (TextView) findViewById(R.id.textView2);
            btn[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    for(int i = 0;i<btn.length;i++){
                        if(ans[i].getId()==v.getId()){
                            result.setText(Integer.toString(v.getId()));
                            result2.setText(Integer.toString(btn[i].getId()));
                            pwd[idx]=true;
                            break;
                        }
                    }
                    for(int i = 0;i<img.length;i++){
                        if(i == idx){
                            img[i].setImageResource(R.drawable.red1);
                            idx++;
                            break;
                        }
                    }
                    if(idx == 4){
                        for(int i = 0;i<pwd.length;i++) {
                            if (!pwd[i]) {
                                for (int j = 0; j < ans.length; j++) {
                                    img[j].setImageResource(R.drawable.red2);
                                }
                                idx = 0;
                                break;
                            }
                        }
                        if(idx == 4){
                            for (int i = 0; i < ans.length; i++) {
                                img[i].setImageResource(R.drawable.light);
                            }
                        }
                        idx = 0;
                    }
                }
            });
        }

    }

}