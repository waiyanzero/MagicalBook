package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.MMButtonView;
import me.myatminsoe.mdetect.MMTextView;
import mmcalendar.Astro;
import mmcalendar.AstroConverter;
import mmcalendar.Language;
import mmcalendar.LanguageCatalog;
import mmcalendar.MyanmarDate;
import mmcalendar.MyanmarDateConverter;

import static java.util.Locale.ENGLISH;

/**
 * Created by user on 5/11/2018.
 */

public class MaharboatBegin extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private MyanmarDate time;
    private MMButtonView btnChoose, btnStart;
    private MMTextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16;
    private String fortuneDay = "",weekyDay="",zarta="";
    private int mmyear=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.maharboat_begin);

        //using background tint
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        btnChoose = findViewById(R.id.btnCalendar);
        btnStart = findViewById(R.id.btnMhbStart);

        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        txt3 = findViewById(R.id.text3);
        txt4 = findViewById(R.id.text4);
        txt5 = findViewById(R.id.text5);
        txt6 = findViewById(R.id.text6);
        txt7 = findViewById(R.id.text7);
        txt8 = findViewById(R.id.text8);
        txt9 = findViewById(R.id.text9);
        txt10 = findViewById(R.id.text10);
        txt11 = findViewById(R.id.text11);
        txt12 = findViewById(R.id.text12);
        txt13 = findViewById(R.id.text13);
        txt14 = findViewById(R.id.text14);
        txt15 = findViewById(R.id.text15);
        txt16 = findViewById(R.id.text16);


               /* String[] zz=new String[3];
                zz=(editText.getText().toString()).split("/");

                int a=Integer.parseInt(zz[0]);
                int b=Integer.parseInt(zz[1]);
                int c=Integer.parseInt(zz[2]);
                date= MyanmarDateConverter.convert(a,b,c);

                Toast.makeText(getApplicationContext(),date.getYear()+" "+date.getMonth(),Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MaharboatBegin.this,MaharboatMain.class));
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                */

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        MaharboatBegin.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.setVersion(DatePickerDialog.Version.VERSION_2);
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MaharboatBegin.this,MaharboatMain.class);
                i.putExtra("year",mmyear);
                i.putExtra("day",weekyDay);
                i.putExtra("zarta",zarta);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });

    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = "Date: " + dayOfMonth + " . " + (monthOfYear + 1) + " . " + year;
        btnChoose.setText(date.toLowerCase());

        //for myanmar calendar data
        time = MyanmarDateConverter.convert(year, (monthOfYear + 1), dayOfMonth);

        //for astrological calendar
        Astro astro = AstroConverter.convert(time);

        //for visible
        txt2.setVisibility(View.VISIBLE);
        txt3.setVisibility(View.VISIBLE);
        txt4.setVisibility(View.VISIBLE);
        txt5.setVisibility(View.VISIBLE);
        txt6.setVisibility(View.VISIBLE);
        txt7.setVisibility(View.VISIBLE);
        txt8.setVisibility(View.VISIBLE);
        txt9.setVisibility(View.VISIBLE);
        txt10.setVisibility(View.VISIBLE);
        txt11.setVisibility(View.VISIBLE);
        txt12.setVisibility(View.VISIBLE);
        txt13.setVisibility(View.VISIBLE);
        txt14.setVisibility(View.VISIBLE);
        txt15.setVisibility(View.VISIBLE);
        txt16.setVisibility(View.VISIBLE);
        btnStart.setVisibility(View.VISIBLE);

        txt4.setMMText(time.getYear() + "");
        txt6.setMMText(time.getBuddhistEra() + " ခု");
        txt7.setMMText(time.getMonthName() + "");
        txt9.setMMText(time.getFortnightDay() + "");
        txt11.setMMText(time.getWeekDay() + "");
        txt13.setMMText(astro.getMahabote() + "");

        LanguageCatalog languageCatalog = new LanguageCatalog(Language.ENGLISH);
        weekyDay=time.getWeekDay(languageCatalog);
        mmyear=time.getYearInt();
        zarta=astro.getMahabote();

        if (astro.getYatyaza() == 1) {
            fortuneDay = " - ရက်ရာဇာ";
        } else if (astro.getPyathada() == 1) {
            fortuneDay = " - ပြဿဒါး";
        } else {
            fortuneDay = "";
        }

        txt15.setMMText("( " + time.getMoonPhase() + fortuneDay + " )");

        YoYo.with(Techniques.BounceInLeft).duration(1000).playOn(txt2);

        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt3);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt4);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt5);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt6);

        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt7);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt8);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt9);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt10);

        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt11);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt12);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt13);
        YoYo.with(Techniques.BounceInRight).duration(1000).playOn(txt14);

        YoYo.with(Techniques.ZoomIn).duration(1000).playOn(txt15);

        YoYo.with(Techniques.SlideInLeft).duration(1000).playOn(txt16);
        YoYo.with(Techniques.SlideInRight).duration(1000).playOn(btnStart);


        //Toast.makeText(getApplicationContext(), "Year " + time.getYear() + "\nMonth " + time.getMonth() + " \n MoonPhase " + time.getMoonPhase() + "\nFortnightDay " +time.getFortnightDay() + "\n WeekyDay" + time.getWeekDay() + "\nBuddhistEra " + time.getBuddhistEra(), Toast.LENGTH_SHORT).show();

        //Toast.makeText(getApplicationContext(),astro.getAmyeittasote()+"\n"+astro.getNagahle()+"\n"+astro.getMahabote()+"\n"+astro.getPyathada()+"\n"+astro.getYatyaza(),Toast.LENGTH_SHORT).show();
    }


}
