package com.cedancp.infinitebanner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cedancp.infinitebanner.md.HorizontalItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cedancp on 9/12/17.
 */

public class InfiniteAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<HorizontalItem> items = new ArrayList<>();
    private Context context;
    private int textStyle;

    public InfiniteAdapter(List<HorizontalItem> items, Context context){
        this.items = items;
        this.context = context;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ItemViewHolder holder = new ItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        if(items.size() > 0) {
            holder.itemView.setVisibility(View.VISIBLE);
            int positionInList = position % items.size();
            holder.tv_main.setText(items.get(positionInList).mainText);
            holder.tv_main.setTextAppearance(context,textStyle);

            if(items.get(positionInList).url != null){
                System.out.println("URLLLLLLLLL " + items.get(positionInList).url);
                Picasso.with(context)
                        .load(items.get(positionInList).url)
                        .into(holder.iv_left);
            }else{
                holder.iv_left.setImageResource(items.get(positionInList).drawable);
            }
        }else{
            holder.itemView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public void setTextStyle(int style){
        this.textStyle = style;
        notifyDataSetChanged();
    }
}
