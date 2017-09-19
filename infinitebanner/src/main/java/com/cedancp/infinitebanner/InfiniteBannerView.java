package com.cedancp.infinitebanner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by cedancp on 9/11/17.
 */

public class InfiniteBannerView extends RecyclerView {


    public InfiniteBannerView(Context context) {
        super(context);
    }

    public InfiniteBannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
    }

    @Override
    public void setLayoutManager(LayoutManager layout) {
        super.setLayoutManager(layout);
    }
}
