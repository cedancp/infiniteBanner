package com.cedancp.recylerbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cedancp.infinitebanner.InfiniteBanner;
import com.cedancp.infinitebanner.InfiniteBannerView;
import com.cedancp.infinitebanner.md.HorizontalItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InfiniteBannerView infiniteBannerView = (InfiniteBannerView) findViewById(R.id.infinitebanner);
        List<HorizontalItem> items = new ArrayList<>();
        items.add(new HorizontalItem("Testing banner with drawable",R.mipmap.ic_launcher));
        items.add(new HorizontalItem("Testing banner with url","http://i.imgur.com/DvpvklR.png"));
        InfiniteBanner infiniteBanner = new InfiniteBanner(getApplicationContext(),infiniteBannerView,items);
        infiniteBanner.setTextStyle(R.style.text_item);
        infiniteBanner.setSpeed(10);
        infiniteBanner.startScroll();

    }
}
