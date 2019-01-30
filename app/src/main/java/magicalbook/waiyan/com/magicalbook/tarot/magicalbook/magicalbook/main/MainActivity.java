package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import magicalbook.waiyan.com.magicalbook.R;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch.HandtouchMain;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch.HandtouchQuestion;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch.Lovelove;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch.MaharboatBegin;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch.MaharboatMain;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.tarot.TarotMain;
import me.myatminsoe.mdetect.MDetect;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView main_logo;
    private CardView layout_handtouch,layout_tarot,layout_birthday,layout_maharbot,layout_comingsoon;
    private ViewFlipper myflipper_one,myflipper_two,myflipper_three,myflipper_four;
    private Animation in,out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.main);

        //using background tint
        SystemBarTintManager tintManager=new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        myflipper_one=findViewById(R.id.myflipper1);
        myflipper_one.setFlipInterval(3000);
        in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        myflipper_one.setInAnimation(in);
        out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        myflipper_one.setOutAnimation(out);
        myflipper_one.startFlipping();

        myflipper_two=findViewById(R.id.myflipper2);
        myflipper_two.setFlipInterval(3000);
        in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        myflipper_two.setInAnimation(in);
        out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        myflipper_two.setOutAnimation(out);
        myflipper_two.startFlipping();

        myflipper_three=findViewById(R.id.myflipper3);
        myflipper_three.setFlipInterval(3000);
        in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        myflipper_three.setInAnimation(in);
        out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        myflipper_three.setOutAnimation(out);
        myflipper_three.startFlipping();

        myflipper_four=findViewById(R.id.myflipper4);
        myflipper_four.setFlipInterval(3000);
        in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        myflipper_four.setInAnimation(in);
        out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        myflipper_four.setOutAnimation(out);
        myflipper_four.startFlipping();

        layout_handtouch=findViewById(R.id.layout_handtouch);
        layout_tarot=findViewById(R.id.layout_tarot);
        layout_birthday=findViewById(R.id.layout_lovelove);
        layout_maharbot=findViewById(R.id.layout_maharbot);
        layout_comingsoon=findViewById(R.id.layout_comingsoon);

        layout_handtouch.setOnClickListener(this);
        layout_tarot.setOnClickListener(this);
        layout_birthday.setOnClickListener(this);
        layout_maharbot.setOnClickListener(this);
        layout_comingsoon.setOnClickListener(this);

        /*
        layout_tarot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TarotMain.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });

        layout_hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HandtouchMain.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
        layout_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MaharboatBegin.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
        layout_lovelove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lovelove.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
        layout_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        //do animation for android view objects
        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .playOn(layout_hand);
        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .playOn(layout_tarot);
        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .playOn(layout_board);
        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .playOn(layout_lovelove);
        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .playOn(layout_exit);
        YoYo.with(Techniques.ZoomInDown)
                .duration(1000)
                .playOn(main_logo);
                */
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Intent.ACTION_MAIN);
        back.addCategory(Intent.CATEGORY_HOME);
        back.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(back);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.layout_handtouch:
                startActivity(new Intent(MainActivity.this,HandtouchQuestion.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                break;

            case R.id.layout_lovelove:
                startActivity(new Intent(MainActivity.this,Lovelove.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                break;

            case R.id.layout_tarot:
                startActivity(new Intent(MainActivity.this,TarotMain.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                break;

            case R.id.layout_maharbot:
                startActivity(new Intent(MainActivity.this,MaharboatBegin.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                break;

            case R.id.layout_comingsoon:
                Toast.makeText(getApplicationContext(),"Wait for next update!",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
