package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.androidanimations.library.specials.in.LandingAnimator;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMButtonView;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 5/19/2018.
 */

public class Lovelove extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private MMButtonView btnYou, btnLove, btnStart;
    private MMTextView love_txt1,love_txt2,countdown_txt;
    private ImageView you_image, love_image,love_img1,love_img2,sign;
    private int condition = 0;
    private boolean check1 = false, check2 = false;
    private int you = 0, lover = 0, total = 0, result = 0;
    private String[] ary1 = new String[3];
    private String[] ary2 = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.love_love_one);

        //using background tint
        SystemBarTintManager tintManager=new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        btnYou = findViewById(R.id.btn_you);
        btnLove = findViewById(R.id.btn_love);
        btnStart = findViewById(R.id.btn_start);

        love_txt1=findViewById(R.id.love_txt1);
        love_txt2=findViewById(R.id.love_txt2);
        countdown_txt=findViewById(R.id.countDownText);

        love_img1=findViewById(R.id.love1);
        love_img2=findViewById(R.id.love2);

        you_image = findViewById(R.id.you_image);
        love_image = findViewById(R.id.love_image);
        sign=findViewById(R.id.sign_image);

        btnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar you = Calendar.getInstance();
                DatePickerDialog dpd_one = DatePickerDialog.newInstance(
                        Lovelove.this,
                        you.get(Calendar.YEAR),
                        you.get(Calendar.MONTH),
                        you.get(Calendar.DAY_OF_MONTH)
                );
                dpd_one.setVersion(DatePickerDialog.Version.VERSION_2);
                condition = 1;
                dpd_one.show(getFragmentManager(), "DatepickerdialogOne");
            }
        });

        btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar love = Calendar.getInstance();
                DatePickerDialog dpd_two = DatePickerDialog.newInstance(
                        Lovelove.this,
                        love.get(Calendar.YEAR),
                        love.get(Calendar.MONTH),
                        love.get(Calendar.DAY_OF_MONTH)
                );
                dpd_two.setVersion(DatePickerDialog.Version.VERSION_2);
                condition = 2;
                dpd_two.show(getFragmentManager(), "DatepickerdialogTwo");
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check1 == false || check2 == false) {
                    Toast.makeText(getApplicationContext(), MDetect.INSTANCE.getText("တစ်ခုခုရွေးချယ်ရန် ကျန်ရှိပါသေးသည်"), Toast.LENGTH_SHORT).show();
                } else {

                    btnStart.setClickable(false);

                    YoYo.with(Techniques.RubberBand)
                            .duration(1000)
                            .playOn(sign);

                    String st1 = btnYou.getMmText().toString();
                    String st2 = btnLove.getMmText().toString();
                    ary1 = st1.split("/");
                    ary2 = st2.split("/");
                    for (int i = 0; i < ary1.length; i++) {
                        total += Integer.parseInt(ary1[i]) + Integer.parseInt(ary2[i]);
                    }
                    Sum(total);

                    total=0;

                    new CountDownTimer(6000,1000)
                    {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            countdown_txt.setText((millisUntilFinished/1000)+"");
                        }

                        @Override
                        public void onFinish() {
                            Intent i=new Intent(Lovelove.this,Lovelovetwo.class);
                            i.putExtra("number",result);
                            startActivity(i);
                            finish();
                        }
                    }.start();

                    love_txt1.setVisibility(View.VISIBLE);
                    love_txt2.setVisibility(View.VISIBLE);
                    countdown_txt.setVisibility(View.VISIBLE);

                    YoYo.with(Techniques.ZoomOutLeft)
                            .duration(1000)
                            .playOn(love_img1);
                    YoYo.with(Techniques.ZoomOutRight)
                            .duration(1000)
                            .playOn(love_img2);

                    YoYo.with(Techniques.RubberBand)
                            .duration(1100)
                            .playOn(countdown_txt);
                    YoYo.with(Techniques.BounceInLeft)
                            .duration(1100)
                            .playOn(love_txt1);
                    YoYo.with(Techniques.BounceInRight)
                            .duration(1100)
                            .playOn(love_txt2);
                    
                }
            }
        });
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

        if (condition == 1) {
            btnYou.setMMText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            check1 = true;
            YoYo.with(Techniques.RubberBand)
                    .duration(1500)
                    .playOn(you_image);
        } else if (condition == 2) {
            btnLove.setMMText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            check2 = true;
            YoYo.with(Techniques.RubberBand)
                    .duration(1500)
                    .playOn(love_image);
        }
    }

    public void Sum(int i) {
        int x = 0;
        int y = 0;
        y = i;
        while ((y / 10) != 0) {
            x += (y % 10);
            y = y / 10;
        }
        x += y;
        if (x > 9) {
            Sum(x);
        } else if (x <= 9) {
            result = x;
        }
    }

}
