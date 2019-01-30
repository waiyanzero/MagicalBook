package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import magicalbook.waiyan.com.magicalbook.R;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.main.LinedEditText;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.main.MainActivity;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMButtonView;
import me.myatminsoe.mdetect.MMTextView;


/**
 * Created by user on 2/10/2018.
 */

public class HandtouchAnswer extends AppCompatActivity {

    private LinedEditText textAnswer;
    private MMTextView txt;
    private LinearLayout layout;
    private MMButtonView btn1;
    private int question_no = 0;
    private int table_no = 0;
    private String information = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.handtouch_answer);

        SystemBarTintManager tintManager=new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);

        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        information = getIntent().getExtras().getString("data");
        question_no = Integer.parseInt(information.split("/")[0]);
        table_no = Integer.parseInt(information.split("/")[1]);
        layout=findViewById(R.id.layout_tt);


        textAnswer = findViewById(R.id.textAnswer);
        txt=findViewById(R.id.title_answer);
        btn1=findViewById(R.id.btnAgain);

        //Toast.makeText(getApplicationContext(), question_no + " " + table_no, Toast.LENGTH_SHORT).show();


        //data array for handtouch answer
        String[] de = getResources().getStringArray(R.array.answer1);
        String[] pa = getResources().getStringArray(R.array.answer2);
        String[] see = getResources().getStringArray(R.array.answer3);
        String[] har = getResources().getStringArray(R.array.answer4);
        String[] taung = getResources().getStringArray(R.array.answer5);
        String[] nine = getResources().getStringArray(R.array.answer6);
        String[] yar = getResources().getStringArray(R.array.answer7);
        String[] thone = getResources().getStringArray(R.array.answer8);
        String[] sal = getResources().getStringArray(R.array.answer9);
        String[] koe = getResources().getStringArray(R.array.answer10);
        String[] zon = getResources().getStringArray(R.array.answer11);
        String[] la = getResources().getStringArray(R.array.answer12);
        String[] t5 = getResources().getStringArray(R.array.answer13);
        String[] yat = getResources().getStringArray(R.array.answer14);
        String[] ta = getResources().getStringArray(R.array.answer15);
        String[] na = getResources().getStringArray(R.array.answer16);
        String[] ga = getResources().getStringArray(R.array.answer17);
        String[] nway = getResources().getStringArray(R.array.answer18);
        String[] day = getResources().getStringArray(R.array.answer19);
        String[] nan = getResources().getStringArray(R.array.answer20);
        String[] net = getResources().getStringArray(R.array.answer21);
        String[] eight = getResources().getStringArray(R.array.answer22);
        String[] nar = getResources().getStringArray(R.array.answer23);
        String[] ye = getResources().getStringArray(R.array.answer24);
        String[] twin = getResources().getStringArray(R.array.answer25);
        String[] ee = getResources().getStringArray(R.array.answer26);
        String[] myay = getResources().getStringArray(R.array.answer27);
        String[] ka = getResources().getStringArray(R.array.answer28);
        String[] bar = getResources().getStringArray(R.array.answer29);
        String[] thoe = getResources().getStringArray(R.array.answer30);
        String[] kit = getResources().getStringArray(R.array.answer31);
        String[] taa = getResources().getStringArray(R.array.answer32);
        String[] aa = getResources().getStringArray(R.array.answer33);
        String[] lal = getResources().getStringArray(R.array.answer34);
        String[] yout = getResources().getStringArray(R.array.answer35);
        String[] shi = getResources().getStringArray(R.array.answer36);
        String[] kae = getResources().getStringArray(R.array.answer37);
        String[] thaw = getResources().getStringArray(R.array.answer38);
        String[] min = getResources().getStringArray(R.array.answer39);
        String[] thein = getResources().getStringArray(R.array.answer40);
        String[] kha = getResources().getStringArray(R.array.answer41);
        String[] so = getResources().getStringArray(R.array.answer42);
        String[] these = getResources().getStringArray(R.array.answer43);
        String[] lu = getResources().getStringArray(R.array.answer44);
        String[] thar = getResources().getStringArray(R.array.answer45);
        String[] tick = getResources().getStringArray(R.array.answer46);
        String[] oo = getResources().getStringArray(R.array.answer47);
        String[] se = getResources().getStringArray(R.array.answer48);
        String[] yin = getResources().getStringArray(R.array.answer49);
        String[] htar = getResources().getStringArray(R.array.answer50);
        String[] tae = getResources().getStringArray(R.array.answer51);
        String[] ma = getResources().getStringArray(R.array.answer52);
        String[] yan = getResources().getStringArray(R.array.answer53);
        String[] htoo = getResources().getStringArray(R.array.answer54);
        String[] linn = getResources().getStringArray(R.array.answer55);
        String[] lat = getResources().getStringArray(R.array.answer56);
        String[] htout = getResources().getStringArray(R.array.answer57);
        String[] bay = getResources().getStringArray(R.array.answer58);
        String[] din = getResources().getStringArray(R.array.answer59);
        String[] kyan = getResources().getStringArray(R.array.answer60);
        String[] gyi = getResources().getStringArray(R.array.answer61);
        String[] phit = getResources().getStringArray(R.array.answer62);
        String[] tha = getResources().getStringArray(R.array.answer63);
        String[] dee = getResources().getStringArray(R.array.answer64);

        if (question_no == 1) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
        }

        else if (question_no == 2) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
        }
        else if (question_no == 3) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
        }

        else if (question_no == 4) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
        }
        else if (question_no == 5) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
        }
        else if (question_no == 6) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
        }
        else if (question_no == 7) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
        }
        else if (question_no == 8) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
        }
        else if (question_no == 9) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
        }
        else if (question_no == 10) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
        }
        else if (question_no == 11) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
        }
        else if (question_no == 12) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
        }
        else if (question_no == 13) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
        }
        else if (question_no == 14) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
        }
        else if (question_no == 15) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
        }
        else if (question_no == 16) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
        }
        else if (question_no == 17) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
        }
        else if (question_no == 18) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
        }
        else if (question_no == 19) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
        }
        else if (question_no == 20) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
        }
        else if (question_no == 21) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
        }
        else if (question_no == 22) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
        }
        else if (question_no == 23) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
        }
        else if (question_no == 24) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
        }
        else if (question_no == 25) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
        }
        else if (question_no == 26) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
        }
        else if (question_no == 27) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
        }
        else if (question_no == 28) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
        }
        else if (question_no == 29) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
        }
        else if (question_no == 30) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
        }
        else if (question_no == 31) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
        }
        else if (question_no == 32) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
        }
        else if (question_no == 33) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
        }
        else if (question_no == 34) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
        }
        else if (question_no == 35) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
        }
        else if (question_no == 36) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
        }
        else if (question_no == 37) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
        }
        else if (question_no == 38) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
        }
        else if (question_no == 39) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
        }
        else if (question_no == 40) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
        }
        else if (question_no == 41) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
        }
        else if (question_no == 42) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
        }
        else if (question_no == 43) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
        }
        else if (question_no == 44) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
        }
        else if (question_no == 45) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
        }
        else if (question_no == 46) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
        }
        else if (question_no == 47) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
        }
        else if (question_no == 48) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
        }
        else if (question_no == 49) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
        }
        else if (question_no == 50) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
        }
        else if (question_no == 51) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
        }
        else if (question_no == 52) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
        }
        else if (question_no == 53) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
        }
        else if (question_no == 54) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
        }
        else if (question_no == 55) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
        }
        else if (question_no == 56) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
        }
        else if (question_no == 57) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
        }
        else if (question_no == 58) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(kyan[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(de[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(zon[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(net[--table_no]));
        }
        else if (question_no == 59) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(kit[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(kha[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(tae[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(gyi[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(pa[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(la[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(eight[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(taa[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(so[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(ma[--table_no]));
        }
        else if (question_no == 60) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(phit[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(see[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(t5[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(nar[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(aa[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(these[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(yan[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(tha[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(har[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(yat[--table_no]));
        }
        else if (question_no == 61) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(ye[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(lal[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(lu[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(htoo[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(dee[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(taung[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(ta[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(twin[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(yout[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(thar[--table_no]));
        }
        else if (question_no == 62) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(linn[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(nine[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(na[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(ee[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(shi[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(tick[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(lat[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(yar[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(ga[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(myay[--table_no]));
        }
        else if (question_no == 63) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(kae[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(oo[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(htout[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(thone[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(nway[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(ka[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(thaw[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(se[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(bay[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(sal[--table_no]));
        }
        else if (question_no == 64) {
            if (table_no == 1)
                textAnswer.setText(MDetect.INSTANCE.getText(day[--table_no]));
            else if (table_no == 2)
                textAnswer.setText(MDetect.INSTANCE.getText(bar[--table_no]));
            else if (table_no == 3)
                textAnswer.setText(MDetect.INSTANCE.getText(min[--table_no]));
            else if (table_no == 4)
                textAnswer.setText(MDetect.INSTANCE.getText(yin[--table_no]));
            else if (table_no == 5)
                textAnswer.setText(MDetect.INSTANCE.getText(din[--table_no]));
            else if (table_no == 6)
                textAnswer.setText(MDetect.INSTANCE.getText(koe[--table_no]));
            else if (table_no == 7)
                textAnswer.setText(MDetect.INSTANCE.getText(nan[--table_no]));
            else if (table_no == 8)
                textAnswer.setText(MDetect.INSTANCE.getText(thoe[--table_no]));
            else if (table_no == 9)
                textAnswer.setText(MDetect.INSTANCE.getText(thein[--table_no]));
            else if (table_no == 10)
                textAnswer.setText(MDetect.INSTANCE.getText(htar[--table_no]));
        }

        YoYo.with(Techniques.BounceInRight)
                .duration(1500)
                .playOn(textAnswer);
        YoYo.with(Techniques.BounceInLeft)
                .duration(1500)
                .playOn(txt);
        YoYo.with(Techniques.BounceInDown)
                .duration(1500)
                .playOn(layout);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HandtouchAnswer.this,HandtouchQuestion.class));
                finish();
            }
        });
    }
}
