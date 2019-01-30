package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMButtonView;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 2/4/2018.
 */

public class HandtouchTable extends AppCompatActivity implements View.OnClickListener {
    private Context context = this;
    private FloatingActionButton fab;
    private TextView txt1, txt2, txt3, txt4, txt5,txt_count;
    private MMButtonView start;
    private int qnumber;
    private int n = 0, c = 0;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80, b81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.handtouch_table);

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);

        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        getSupportActionBar().setTitle(MDetect.INSTANCE.getText("Magical Book"));


        //Question Number
        qnumber = getIntent().getExtras().getInt("qnumber");

        fab = findViewById(R.id.luckyFab);
        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);
        b10 = findViewById(R.id.bt10);

        b11 = findViewById(R.id.bt11);
        b12 = findViewById(R.id.bt12);
        b13 = findViewById(R.id.bt13);
        b14 = findViewById(R.id.bt14);
        b15 = findViewById(R.id.bt15);
        b16 = findViewById(R.id.bt16);
        b17 = findViewById(R.id.bt17);
        b18 = findViewById(R.id.bt18);
        b19 = findViewById(R.id.bt19);
        b20 = findViewById(R.id.bt20);

        b21 = findViewById(R.id.bt21);
        b22 = findViewById(R.id.bt22);
        b23 = findViewById(R.id.bt23);
        b24 = findViewById(R.id.bt24);
        b25 = findViewById(R.id.bt25);
        b26 = findViewById(R.id.bt26);
        b27 = findViewById(R.id.bt27);
        b28 = findViewById(R.id.bt28);
        b29 = findViewById(R.id.bt29);
        b30 = findViewById(R.id.bt30);

        b31 = findViewById(R.id.bt31);
        b32 = findViewById(R.id.bt32);
        b33 = findViewById(R.id.bt33);
        b34 = findViewById(R.id.bt34);
        b35 = findViewById(R.id.bt35);
        b36 = findViewById(R.id.bt36);
        b37 = findViewById(R.id.bt37);
        b38 = findViewById(R.id.bt38);
        b39 = findViewById(R.id.bt39);
        b40 = findViewById(R.id.bt40);

        b41 = findViewById(R.id.bt41);
        b42 = findViewById(R.id.bt42);
        b43 = findViewById(R.id.bt43);
        b44 = findViewById(R.id.bt44);
        b45 = findViewById(R.id.bt45);
        b46 = findViewById(R.id.bt46);
        b47 = findViewById(R.id.bt47);
        b48 = findViewById(R.id.bt48);
        b49 = findViewById(R.id.bt49);
        b50 = findViewById(R.id.bt50);

        b51 = findViewById(R.id.bt51);
        b52 = findViewById(R.id.bt52);
        b53 = findViewById(R.id.bt53);
        b54 = findViewById(R.id.bt54);
        b55 = findViewById(R.id.bt55);
        b56 = findViewById(R.id.bt56);
        b57 = findViewById(R.id.bt57);
        b58 = findViewById(R.id.bt58);
        b59 = findViewById(R.id.bt59);
        b60 = findViewById(R.id.bt60);

        b61 = findViewById(R.id.bt61);
        b62 = findViewById(R.id.bt62);
        b63 = findViewById(R.id.bt63);
        b64 = findViewById(R.id.bt64);
        b65 = findViewById(R.id.bt65);
        b66 = findViewById(R.id.bt66);
        b67 = findViewById(R.id.bt67);
        b68 = findViewById(R.id.bt68);
        b69 = findViewById(R.id.bt69);
        b70 = findViewById(R.id.bt70);

        b71 = findViewById(R.id.bt71);
        b72 = findViewById(R.id.bt72);
        b73 = findViewById(R.id.bt73);
        b74 = findViewById(R.id.bt74);
        b75 = findViewById(R.id.bt75);
        b76 = findViewById(R.id.bt76);
        b77 = findViewById(R.id.bt77);
        b78 = findViewById(R.id.bt78);
        b79 = findViewById(R.id.bt79);
        b80 = findViewById(R.id.bt80);

        b81 = findViewById(R.id.bt81);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);
        b45.setOnClickListener(this);
        b46.setOnClickListener(this);
        b47.setOnClickListener(this);
        b48.setOnClickListener(this);
        b49.setOnClickListener(this);
        b50.setOnClickListener(this);
        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b54.setOnClickListener(this);
        b55.setOnClickListener(this);
        b56.setOnClickListener(this);
        b57.setOnClickListener(this);
        b58.setOnClickListener(this);
        b59.setOnClickListener(this);
        b60.setOnClickListener(this);
        b61.setOnClickListener(this);
        b62.setOnClickListener(this);
        b63.setOnClickListener(this);
        b64.setOnClickListener(this);
        b65.setOnClickListener(this);
        b66.setOnClickListener(this);
        b67.setOnClickListener(this);
        b68.setOnClickListener(this);
        b69.setOnClickListener(this);
        b70.setOnClickListener(this);
        b71.setOnClickListener(this);
        b72.setOnClickListener(this);
        b73.setOnClickListener(this);
        b74.setOnClickListener(this);
        b75.setOnClickListener(this);
        b76.setOnClickListener(this);
        b77.setOnClickListener(this);
        b78.setOnClickListener(this);
        b79.setOnClickListener(this);
        b80.setOnClickListener(this);
        b81.setOnClickListener(this);

        fab.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bt1:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt2:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt3:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt4:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt5:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt6:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt7:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt8:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt9:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt10:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt11:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt12:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt13:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt14:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt15:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt16:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt17:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt18:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt19:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt20:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt21:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt22:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt23:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt24:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt25:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt26:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt27:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt28:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt29:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt30:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt31:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt32:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt33:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt34:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt35:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt36:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt37:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt38:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt39:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt40:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt41:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt42:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt43:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt44:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt45:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt46:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt47:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt48:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt49:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt50:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt51:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt52:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt53:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt54:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt55:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt56:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt57:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt58:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt59:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt60:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt61:
                goAnswer(qnumber, 9);
                break;
            case R.id.bt62:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt63:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt64:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt65:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt66:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt67:
                goAnswer(qnumber, 7);
                break;
            case R.id.bt68:
                goAnswer(qnumber, 5);
                break;
            case R.id.bt69:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt70:
                goAnswer(qnumber, 4);
                break;
            case R.id.bt71:
                goAnswer(qnumber, 2);
                break;
            case R.id.bt72:
                goAnswer(qnumber, 10);
                break;
            case R.id.bt73:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt74:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt75:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt76:
                goAnswer(qnumber, 6);
                break;
            case R.id.bt77:
                goAnswer(qnumber, 1);
                break;
            case R.id.bt78:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt79:
                goAnswer(qnumber, 3);
                break;
            case R.id.bt80:
                goAnswer(qnumber, 8);
                break;
            case R.id.bt81:
                goAnswer(qnumber, 5);
                break;
            case R.id.luckyFab:

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.handtouch_lucky, null);

                txt1 = view.findViewById(R.id.lucky_one);
                txt2 = view.findViewById(R.id.lucky_two);
                txt3 = view.findViewById(R.id.lucky_three);
                txt4 = view.findViewById(R.id.lucky_four);
                txt5 = view.findViewById(R.id.lucky_five);
                start = view.findViewById(R.id.start_btn);
                txt_count=view.findViewById(R.id.txt_count);

                //reset count and number
                c=0;
                n=0;

                start.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (c < 2) {

                            YoYo.with(Techniques.Tada)
                                    .duration(1000)
                                    .playOn(txt1);
                            YoYo.with(Techniques.Bounce)
                                    .duration(1000)
                                    .playOn(txt2);
                            YoYo.with(Techniques.Wobble)
                                    .duration(1000)
                                    .playOn(txt3);
                            YoYo.with(Techniques.Wobble)
                                    .duration(1000)
                                    .playOn(txt4);
                            YoYo.with(Techniques.Bounce)
                                    .duration(1000)
                                    .playOn(txt5);
                            int[] number = new int[5];
                            Random r = new Random();
                            for (int i = 0; i < 5; i++) {
                                number[i] = r.nextInt(2);
                            }
                            /*
                            txt1.setText(number[0] + "");
                            txt2.setText(number[1] + "");
                            txt3.setText(number[2] + "");
                            txt4.setText(number[3] + "");
                            txt5.setText(number[4] + "");
                            */
                            getResult(txt1,number[0]);
                            getResult(txt2,number[1]);
                            getResult(txt3,number[2]);
                            getResult(txt4,number[3]);
                            getResult(txt5,number[4]);


                            for (int i = 0; i < number.length; i++) {
                                n += number[i];
                            }

                            start.setMMText("နောက်တစ်ကြိမ်နှိပ်ပါ");
                            if(c==1)
                            {
                                if(n==0)
                                {
                                    n=1;
                                }
                                txt_count.setVisibility(View.VISIBLE);
                                new CountDownTimer(6000,1000)
                                {
                                    @Override
                                    public void onTick(long millisUntilFinished) {
                                        txt_count.setText(""+millisUntilFinished/1000);
                                    }

                                    @Override
                                    public void onFinish() {
                                        Intent i = new Intent(getApplicationContext(), HandtouchAnswer.class);
                                        i.putExtra("data", qnumber + "/" + n);
                                        startActivity(i);
                                        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                                        finish();
                                    }
                                }.start();


                            }
                            c++;
                        }

                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
        }

    }



    public void goAnswer(final int question_number, final int table_number) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.handtouch_custom_table_dialog, null);
        builder.setView(v);
        final AlertDialog dialog = builder.create();


        MMTextView tv = v.findViewById(R.id.dtext1);
        MMButtonView btnOk = v.findViewById(R.id.btnOk);
        MMButtonView btnCancel = v.findViewById(R.id.btnCancel);

        tv.setMMText(changeMMnumber(table_number) + "");
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(getApplicationContext(), HandtouchAnswer.class);
                i.putExtra("data", question_number + "/" + table_number);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    public String changeMMnumber(int i) {
        String mmnumber = "";
        switch (i) {
            case 1:
                mmnumber = "၁";
                break;
            case 2:
                mmnumber = "၂";
                break;
            case 3:
                mmnumber = "၃";
                break;
            case 4:
                mmnumber = "၄";
                break;
            case 5:
                mmnumber = "၅";
                break;
            case 6:
                mmnumber = "၆";
                break;
            case 7:
                mmnumber = "၇";
                break;
            case 8:
                mmnumber = "၈";
                break;
            case 9:
                mmnumber = "၉";
                break;
            case 10:
                mmnumber = "၁၀";
                break;

        }
        return mmnumber;
    }

    public void getResult(TextView txt,int r)
    {
        if(r==0)
        {
            //txt.setText("-");
            txt.setText("");
            txt.setBackgroundResource(R.drawable.handtouch_lucky);
        }
        else if(r==1)
        {
           // txt.setText("*");
            txt.setText("");
            txt.setBackgroundResource(R.drawable.handtouch_lucky2);
        }
    }
}
