package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.tarot;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.Random;
import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 2/2/2018.
 */

public class TarotCalculate extends AppCompatActivity{

    private int[] card = {R.drawable.the_fool_tarot, R.drawable.the_magician_tarot, R.drawable.the_high_priestess, R.drawable.the_empress_tarot, R.drawable.the_emperor_tarot, R.drawable.the_hierophant_tarot, R.drawable.the_lovers_tarot, R.drawable.the_chariot_tarot, R.drawable.the_strength_tarot, R.drawable.the_hermit_tarot, R.drawable.the_wheel_of_fortune_tarot, R.drawable.the_justic_tarot,
            R.drawable.the_hangedman_tarot, R.drawable.the_death_tarot, R.drawable.the_temperance_tarot, R.drawable.the_devil_tarot, R.drawable.the_tower_tarot, R.drawable.the_star_tarot, R.drawable.the_moon_tarot, R.drawable.the_sun_tarot, R.drawable.the_judgement_tarot, R.drawable.the_world_tarot};

    private ImageView img;
    private MMTextView textTitle, textBody;
    private MMTextView infoTitle,infoCard,infoMTitle;
    private CardView cardView;

    private String[] normalTarot;
    private String[] turnTarot;
    private String[] cardInformation;

    private int[] change = new int[22];
    private String[] dataChange = new String[22];
    private String[] infoChange = new String[22];

    private android.support.v7.widget.Toolbar toolbar;
    private CollapsingToolbarLayout ctoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.tarot_calculate);

       /* SystemBarTintManager tintManager=new SystemBarTintManager(TarotCalculate.this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));
        */


       //toolbar=findViewById(R.id.toolbar);
       //setSupportActionBar(toolbar);


        normalTarot = getResources().getStringArray(R.array.normalTarot);
        turnTarot = getResources().getStringArray(R.array.turnTarot);
        cardInformation = getResources().getStringArray(R.array.cardInformation);

        int conditions = getIntent().getExtras().getInt("cardNo");

        //Calculate For Tarot
        for (int i = 0; i < 22; i++) {
            Random random = new Random();
            int index = random.nextInt(22);

            change[i] = card[index];
            infoChange[i] = cardInformation[index];

            if (conditions == 0) {
                dataChange[i] = normalTarot[index];
            } else if (conditions == 1) {
                dataChange[i] = turnTarot[index];
            }
        }

        int number = ((change.length) / 2) + 1;


        img = findViewById(R.id.tarot_image);

        textTitle = findViewById(R.id.text_title_type);
        textBody = findViewById(R.id.text_body_type);
        infoTitle=findViewById(R.id.tarot_title_name);
        infoCard=findViewById(R.id.tarot_card_name);
        infoMTitle=findViewById(R.id.tarot_mm_title_name);

        cardView = findViewById(R.id.tarot_card);
        cardView.setVisibility(View.VISIBLE);


        //Animation for tarot views


        YoYo.with(Techniques.FadeIn)
                .duration(2000)
                .playOn(cardView);

        YoYo.with(Techniques.BounceInRight)
                .duration(2000)
                .playOn(findViewById(R.id.tarot_details));

        YoYo.with(Techniques.SlideInUp)
                .duration(2000)
                .playOn(findViewById(R.id.scroll));




        if (conditions == 0) {
            textTitle.setMMText("အတည့်အဓိပ္ပာယ် ဟောပြောချက်");
        } else if (conditions == 1) {
            textTitle.setMMText("ပြောင်းပြန် အဓိပ္ပာယ် ဟောပြောချက်");
        }

        String[] splitting=infoChange[number].split("/");
        infoTitle.setMMText(splitting[0]);
        infoCard.setMMText(splitting[1]);
        infoMTitle.setMMText(splitting[2]);

        img.setImageResource(change[number]);
        textBody.setMMText(dataChange[number] + "");

    }

}
