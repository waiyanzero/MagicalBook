package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.tarot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.rolandl.carousel.Carousel;
import fr.rolandl.carousel.CarouselAdapter;
import fr.rolandl.carousel.CarouselBaseAdapter;
import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMButtonView;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 2/2/2018.
 */

public class TarotMain extends AppCompatActivity{
    private Context context=this;
    private MMButtonView card1,card2,card3,card4,card5,choose;
    private MMTextView txt1,txt2,txt3,txt4,txt5,txt6;
    private ImageView image1,image2,image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.tarot_main);

        SystemBarTintManager tintManager=new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);

        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        txt1=findViewById(R.id.text1);
        txt2=findViewById(R.id.text2);
        txt3=findViewById(R.id.text3);
        txt4=findViewById(R.id.text4);
        txt5=findViewById(R.id.text5);
        txt6=findViewById(R.id.text6);

        choose=findViewById(R.id.btn_choose);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);

        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);



        //YoYo.with(Techniques.BounceIn).duration(500).playOn(carousel);
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose.setVisibility(View.INVISIBLE);

                YoYo.with(Techniques.ZoomOutUp)
                        .duration(1000)
                        .playOn(txt1);
                YoYo.with(Techniques.RotateOut)
                        .duration(1000)
                        .playOn(image1);

                txt2.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                txt3.setVisibility(View.VISIBLE);

                card1.setVisibility(View.VISIBLE);
                card2.setVisibility(View.VISIBLE);
                card3.setVisibility(View.VISIBLE);
                card4.setVisibility(View.VISIBLE);
                card5.setVisibility(View.VISIBLE);

                YoYo.with(Techniques.BounceInLeft)
                        .duration(1000)
                        .playOn(txt2);
                YoYo.with(Techniques.BounceInRight)
                        .duration(1000)
                        .playOn(txt3);
                YoYo.with(Techniques.RotateIn)
                        .duration(1000)
                        .playOn(image2);

                YoYo.with(Techniques.ZoomInDown)
                        .duration(1000)
                        .playOn(card1);
                YoYo.with(Techniques.ZoomInDown)
                        .duration(1000)
                        .playOn(card2);
                YoYo.with(Techniques.ZoomInDown)
                        .duration(1000)
                        .playOn(card3);
                YoYo.with(Techniques.ZoomInDown)
                        .duration(1000)
                        .playOn(card4);
                YoYo.with(Techniques.ZoomInDown)
                        .duration(1000)
                        .playOn(card5);
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarotStart();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarotStart();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarotStart();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarotStart();
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarotStart();
            }
        });

    }

    public void tarotStart()
    {

        /*
        card1.setVisibility(View.INVISIBLE);
        card2.setVisibility(View.INVISIBLE);
        card3.setVisibility(View.INVISIBLE);
        card4.setVisibility(View.INVISIBLE);
        card5.setVisibility(View.INVISIBLE);

        image2.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
        */

        image3.setVisibility(View.VISIBLE);

        txt4.setVisibility(View.VISIBLE);
        txt5.setVisibility(View.VISIBLE);
        txt6.setVisibility(View.VISIBLE);

        new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txt4.setMMText((millisUntilFinished/1000)+"");
            }

            @Override
            public void onFinish() {
                Random random=new Random();
                int condition= random.nextInt(2);

                Intent i=new Intent(context,TarotCalculate.class);
                i.putExtra("cardNo",condition);
                startActivity(i);
                finish();
            }
        }.start();

        YoYo.with(Techniques.ZoomOutLeft)
                .duration(1000)
                .playOn(txt2);
        YoYo.with(Techniques.ZoomOutRight)
                .duration(1000)
                .playOn(txt3);
        YoYo.with(Techniques.RotateOut)
                .duration(1000)
                .playOn(image2);

        YoYo.with(Techniques.ZoomOutUp)
                .duration(1000)
                .playOn(card1);
        YoYo.with(Techniques.ZoomOutUp)
                .duration(1000)
                .playOn(card2);
        YoYo.with(Techniques.ZoomOutUp)
                .duration(1000)
                .playOn(card3);
        YoYo.with(Techniques.ZoomOutUp)
                .duration(1000)
                .playOn(card4);
        YoYo.with(Techniques.ZoomOutUp)
                .duration(1000)
                .playOn(card5);

        YoYo.with(Techniques.RotateIn)
                .duration(1000)
                .playOn(txt4);
        YoYo.with(Techniques.BounceInLeft)
                .duration(1000)
                .playOn(txt5);
        YoYo.with(Techniques.BounceInRight)
                .duration(1000)
                .playOn(txt6);

        YoYo.with(Techniques.RotateIn)
                .duration(2000)
                .playOn(image3);

    }
}
