package magicalbook.waiyan.com.magicalbook.tarot.magicalbook.magicalbook.magicalbook.handtouch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import magicalbook.waiyan.com.magicalbook.R;
import me.myatminsoe.mdetect.MMTextView;


/**
 * Created by user on 2/4/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    LayoutInflater inflater;
    Context context;
    Activity activity;
    List<ItemManager> data = Collections.emptyList();


    public MyAdapter(Context context, List<ItemManager> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.handtouch_recyclerlist, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        ItemManager current = data.get(position);
        holder.number.setText((current.number) + "");
        holder.text.setMMText(current.text);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView number;
        private MMTextView text;

        private final Context context;
        private Button btnAsk;

        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();


            btnAsk = itemView.findViewById(R.id.btnAsk);
            number = itemView.findViewById(R.id.mynumber);
            text = itemView.findViewById(R.id.mytext);

            btnAsk.setOnClickListener(this);
            btnAsk.setClickable(true);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            ((Activity)context).finish();
            activity=(Activity)context;

            intent = new Intent(context, HandtouchTable.class);
            intent.putExtra("qnumber", (getAdapterPosition() + 1));
            context.startActivity(intent);
            activity.overridePendingTransition(R.anim.slide_in, R.anim.slide_out);


        }
    }
}
