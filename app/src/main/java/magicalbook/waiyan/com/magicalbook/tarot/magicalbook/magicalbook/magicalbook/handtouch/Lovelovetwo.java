package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMEditText;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 5/21/2018.
 */

public class Lovelovetwo extends AppCompatActivity {
    private ImageView heartimg1, heartimg2;
    private MMTextView lovetext, lovet;
    private String[] ary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.love_love_two);

        //using background tint
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        int i = getIntent().getExtras().getInt("number");

        ary = getResources().getStringArray(R.array.lovelove);
        heartimg1 = findViewById(R.id.heart_img1);
        heartimg2 = findViewById(R.id.heart_img2);
        lovetext = findViewById(R.id.lovett);
        lovet = findViewById(R.id.lovet);

        lovetext.setMMText(ary[i - 1] + "");


        YoYo.with(Techniques.RubberBand)
                .duration(2000)
                .playOn(heartimg1);
        YoYo.with(Techniques.RubberBand)
                .duration(2000)
                .playOn(heartimg2);
        YoYo.with(Techniques.FadeInUp)
                .duration(2500)
                .playOn(lovetext);
        YoYo.with(Techniques.BounceInDown)
                .duration(2000)
                .playOn(lovet);
    }
}
