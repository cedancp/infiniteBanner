package com.cedancp.infinitebanner;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cedancp on 9/12/17.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{

    public TextView tv_main;
    public ImageView iv_left;

    public ItemViewHolder(View itemView) {
        super(itemView);
        tv_main = (TextView) itemView.findViewById(R.id.tv_main);
        iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
    }
}
