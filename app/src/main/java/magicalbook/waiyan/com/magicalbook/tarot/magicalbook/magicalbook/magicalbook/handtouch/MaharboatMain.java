package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import magicalbook.waiyan.com.magicalbook.R;
import magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.main.LinedEditText;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMTextView;

/**
 * Created by user on 5/11/2018.
 */

public class MaharboatMain extends AppCompatActivity {

    private MMTextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt_mhb1, txt_mhb2;
    private LinedEditText text;
    private int mmyear = 0, condition_key = 0;
    private String weekyday = "", Zarta = "",zt="";
    private String mhb_number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.maharboat_main);

        //for background tint
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        //for mm year and day
        mmyear = getIntent().getExtras().getInt("year");
        weekyday = getIntent().getExtras().getString("day");
        zt=getIntent().getExtras().getString("zarta");
        condition_key = mmyear % 7;

        text = findViewById(R.id.maharboat_edit);

        txt_mhb1 = findViewById(R.id.txt_mhb1);
        txt_mhb2 = findViewById(R.id.txt_mhb2);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);
        txt9 = findViewById(R.id.txt9);

        isDayCondition(condition_key, weekyday);

        String[] ary_mhb=mhb_number.split("/");
        txt1.setMMText("");
        txt2.setMMText(ary_mhb[0]);
        txt3.setMMText("");
        txt4.setMMText(ary_mhb[1]);
        txt5.setMMText(ary_mhb[2]);
        txt6.setMMText(ary_mhb[3]);
        txt7.setMMText(ary_mhb[4]);
        txt8.setMMText(ary_mhb[5]);
        txt9.setMMText(ary_mhb[6]);

        txt_mhb1.setMMText("အကြွင်း "+ary_mhb[5]);
        txt_mhb2.setMMText(zt+"ဖွား");
        switch (Zarta) {
            case "Yarza":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.yarza)));
                break;
            case "Adipati":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.adipati)));
                break;
            case "Atun":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.atun)));
                break;
            case "Binga":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.binga)));
                break;
            case "Mayana":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.mayana)));
                break;
            case "Thike":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.thike)));
                break;
            case "Puti":
                text.setText(MDetect.INSTANCE.getText(getResources().getString(R.string.puti)));
                break;

        }


    }

    public void isDayCondition(int key, String wday) {
        if (key == 0) {
            mhb_number = "၄/၆/၂/၅/၃/ဝ/၁";
            switch (wday) {
                case "Sunday":
                    Zarta = "Puti";
                    break;
                case "Monday":
                    Zarta = "Thike";
                    break;
                case "Tuesday":
                    Zarta = "Mayana";
                    break;
                case "Wednesday":
                    Zarta = "Adipati";
                    break;
                case "Thursday":
                    Zarta = "Yarza";
                    break;
                case "Friday":
                    Zarta = "Atun";
                    break;
                case "Saturday":
                    Zarta = "Binga";
                    break;
            }
        } else if (key == 1) {
            mhb_number = "၅/ဝ/၃/၆/၄/၁/၂";
            switch (wday) {
                case "Sunday":
                    Zarta = "Binga";
                    break;
                case "Monday":
                    Zarta = "Puti";
                    break;
                case "Tuesday":
                    Zarta = "Thike";
                    break;
                case "Wednesday":
                    Zarta = "Mayana";
                    break;
                case "Thursday":
                    Zarta = "Adipati";
                    break;
                case "Friday":
                    Zarta = "Yarza";
                    break;
                case "Saturday":
                    Zarta = "Atun";
                    break;
            }
        } else if (key == 2) {
            mhb_number = "၆/၁/၄/ဝ/၅/၂/၃";
            switch (wday) {
                case "Sunday":
                    Zarta = "Atun";
                    break;
                case "Monday":
                    Zarta = "Binga";
                    break;
                case "Tuesday":
                    Zarta = "Puti";
                    break;
                case "Wednesday":
                    Zarta = "Thike";
                    break;
                case "Thursday":
                    Zarta = "Mayana";
                    break;
                case "Friday":
                    Zarta = "Adipati";
                    break;
                case "Saturday":
                    Zarta = "Yarza";
                    break;
            }
        } else if (key == 3) {
            mhb_number = "၀/၂/၅/၁/၆/၃/၄";
            switch (wday) {
                case "Sunday":
                    Zarta = "Yarza";
                    break;
                case "Monday":
                    Zarta = "Atun";
                    break;
                case "Tuesday":
                    Zarta = "Binga";
                    break;
                case "Wednesday":
                    Zarta = "Puti";
                    break;
                case "Thursday":
                    Zarta = "Thike";
                    break;
                case "Friday":
                    Zarta = "Mayana";
                    break;
                case "Saturday":
                    Zarta = "Adipati";
                    break;
            }
        } else if (key == 4) {
            mhb_number = "၁/၃/၆/၂/ဝ/၄/၅";
            switch (wday) {
                case "Sunday":
                    Zarta = "Adipati";
                    break;
                case "Monday":
                    Zarta = "Yarza";
                    break;
                case "Tuesday":
                    Zarta = "Atun";
                    break;
                case "Wednesday":
                    Zarta = "Binga";
                    break;
                case "Thursday":
                    Zarta = "Puti";
                    break;
                case "Friday":
                    Zarta = "Thike";
                    break;
                case "Saturday":
                    Zarta = "Mayana";
                    break;
            }
        } else if (key == 5) {
            mhb_number = "၂/၄/ဝ/၃/၁/၅/၆";
            switch (wday) {
                case "Sunday":
                    Zarta = "Mayana";
                    break;
                case "Monday":
                    Zarta = "Adipati";
                    break;
                case "Tuesday":
                    Zarta = "Yarza";
                    break;
                case "Wednesday":
                    Zarta = "Atun";
                    break;
                case "Thursday":
                    Zarta = "Binga";
                    break;
                case "Friday":
                    Zarta = "Puti";
                    break;
                case "Saturday":
                    Zarta = "Thike";
                    break;
            }
        } else if (key == 6) {
            mhb_number = "၃/၅/၁/၄/၂/၆/ဝ";
            switch (wday) {
                case "Sunday":
                    Zarta = "Thike";
                    break;
                case "Monday":
                    Zarta = "Mayana";
                    break;
                case "Tuesday":
                    Zarta = "Adipati";
                    break;
                case "Wednesday":
                    Zarta = "Yarza";
                    break;
                case "Thursday":
                    Zarta = "Atun";
                    break;
                case "Friday":
                    Zarta = "Binga";
                    break;
                case "Saturday":
                    Zarta = "Puti";
                    break;
            }
        }
    }


}
