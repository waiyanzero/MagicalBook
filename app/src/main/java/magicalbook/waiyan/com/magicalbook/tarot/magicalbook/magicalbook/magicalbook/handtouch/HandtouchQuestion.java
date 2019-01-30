package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import java.util.ArrayList;
import java.util.List;
import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MDetect;


/**
 * Created by waiyan on 2/2/2018.
 */

public class HandtouchQuestion extends AppCompatActivity
{
    private RecyclerView recycler;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MDetect.INSTANCE.init(this);
        setContentView(R.layout.handtouch_question);

        SystemBarTintManager tintManager=new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);

        tintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimary));
        tintManager.setTintColor(getResources().getColor(R.color.colorPrimaryDark));

        //getSupportActionBar().setTitle(MDetect.INSTANCE.getText("Magical Book"));

        recycler=findViewById(R.id.recyclerView);

        recycler.addItemDecoration(new SimpleDividerItemDecoration(this));
        adapter=new MyAdapter(this,getData());
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<ItemManager> getData()
    {
        String[] text=getResources().getStringArray(R.array.question);

        List<ItemManager> info=new ArrayList<>();

        for(int i=0;i<text.length;i++)
        {
            ItemManager manager=new ItemManager();
            manager.number=(i+1);
            manager.text=text[i];

            info.add(manager);
        }
        return info;
    }
}
