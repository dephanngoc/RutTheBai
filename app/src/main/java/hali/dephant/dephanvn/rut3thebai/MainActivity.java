package hali.dephant.dephanvn.rut3thebai;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static final Random rdm = new Random();

    private Button btnRut;
    private ImageView imgThe1, imgThe2, imgThe3;
    private TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRut = (Button) findViewById(R.id.btn_Rut);
        imgThe1 = (ImageView) findViewById(R.id.img_the1);
        imgThe2 = (ImageView) findViewById(R.id.img_the2);
        imgThe3 = (ImageView) findViewById(R.id.img_the3);


        t = (TextView) findViewById(R.id.textView);

        btnRut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l1 = RutBai(imgThe1);
                int l2 = RutBai(imgThe2);
                int l3 = RutBai(imgThe3);

                ArrayList baTay = new ArrayList();
                baTay.add(12);
                baTay.add(13);

                int diem1 = 0;
                int diem2 = 0;
                int diem3 = 0;

                String res = "";

                switch (l1) {
                    case 1:
                        diem1 = 1;
                        break;
                    case 2:
                        diem1 = 2;
                        break;
                    case 3:
                        diem1 = 3;
                        break;
                    case 4:
                        diem1 = 4;
                        break;
                    case 5:
                        diem1 = 5;
                        break;
                    case 6:
                        diem1 = 6;
                        break;
                    case 7:
                        diem1 = 7;
                        break;
                    case 8:
                        diem1 = 8;
                        break;
                    case 9:
                        diem1 = 9;
                        break;
                    case 10:
                        diem1 = 10;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        diem1 = 0;
                        break;
                     default:
                         break;
                }

                switch (l2) {
                    case 1:
                        diem2 = 1;
                        break;
                    case 2:
                        diem2 = 2;
                        break;
                    case 3:
                        diem2 = 3;
                        break;
                    case 4:
                        diem2 = 4;
                        break;
                    case 5:
                        diem2 = 5;
                        break;
                    case 6:
                        diem2 = 6;
                        break;
                    case 7:
                        diem2 = 7;
                        break;
                    case 8:
                        diem2 = 8;
                        break;
                    case 9:
                        diem2 = 9;
                        break;
                    case 10:
                        diem2 = 10;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        diem2 = 0;
                        break;
                    default:
                        break;
                }

                switch (l3) {
                    case 1:
                        diem3 = 1;
                        break;
                    case 2:
                        diem3 = 2;
                        break;
                    case 3:
                        diem3 = 3;
                        break;
                    case 4:
                        diem3 = 4;
                        break;
                    case 5:
                        diem3 = 5;
                        break;
                    case 6:
                        diem3 = 6;
                        break;
                    case 7:
                        diem3 = 7;
                        break;
                    case 8:
                        diem3 = 8;
                        break;
                    case 9:
                        diem3 = 9;
                        break;
                    case 10:
                        diem3 = 10;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        diem3 = 0;
                        break;
                    default:
                        break;
                }
                String temp = "";
                if (diem1 == 0 && diem2 == 0 && diem3 == 0) {
                    res = "Ba Tây";
                } else if (diem1 == 10 && diem2 == 10 && diem3 == 10) {
                    res = "Bù Chịch";
                } else {
                    temp = Integer.toString(diem1 + diem2 + diem3);
                    if (temp.length() > 1)
                        res = temp.substring(temp.length() - 1, temp.length());
                    else
                        res = temp;
                }

                t.setText(res + " nút");
                Log.d("DEPHAN", "13");
            }
        });

    }

    public static int randomBai(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }


    public int RutBai(ImageView the){
        int quanBai = randomBai(1, 13);
        int nuocBai = randomBai(0, 3);
        String []mapping = new String[]{"h", "c", "t", "p"};
        //1 - H
        //2 - C
        //3 - T
        //4 - P
         int res1 = getResources().getIdentifier(mapping[nuocBai] + quanBai, "drawable", "hali.dephant.dephanvn.rut3thebai");

         the.setImageResource(res1);
         return quanBai;
    }
}
