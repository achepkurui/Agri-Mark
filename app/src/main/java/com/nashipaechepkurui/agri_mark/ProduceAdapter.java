package com.nashipaechepkurui.agri_mark;

/**
 * Created by Student on 11/24/2016.
 */
import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

/**
 * Created by Student on 11/24/2016.
 */
public class ProduceAdapter extends RecyclerView.Adapter<ProduceAdapter.MyViewHolder> {

    private Context mContext;
    private List<Produce> produceList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }


    public ProduceAdapter(Context mContext, List<Produce> produceList) {
        this.mContext = mContext;
        this.produceList = produceList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.produce_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Produce album = produceList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getAmountOfProduce() + " produce");

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}