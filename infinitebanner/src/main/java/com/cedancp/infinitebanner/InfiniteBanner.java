package com.cedancp.infinitebanner;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;

import com.cedancp.infinitebanner.md.HorizontalItem;

import java.util.List;

/**
 * Created by cedancp on 9/19/17.
 */

public class InfiniteBanner {

    Context context;
    InfiniteBannerView view;
    List<HorizontalItem> items;
    InfiniteAdapter infiniteAdapter;
    int scrollSpeed = 15;
    final Handler handler = new Handler();
    Runnable runnable;

    public InfiniteBanner(Context context, InfiniteBannerView view, List<HorizontalItem> items){
        this.context = context;
        this.view = view;
        this.items = items;

        infiniteAdapter = new InfiniteAdapter(items,context);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        view.setLayoutManager(layoutManager );

        view.setAdapter(infiniteAdapter);
    }

    public void setTextStyle(int style){
        infiniteAdapter.setTextStyle(style);
    }

    public void setSpeed(int speed){
        scrollSpeed = speed;
    }

    public void startScroll(){

        runnable = new Runnable() {
            @Override
            public void run() {
                view.scrollBy(2, 0);
                handler.postDelayed(this, scrollSpeed);
            }
        };

        handler.postDelayed(runnable,scrollSpeed);
    }

}
