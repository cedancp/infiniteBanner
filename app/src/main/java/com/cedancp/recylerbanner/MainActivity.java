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

        InfiniteBannerView infiniteBanner = (InfiniteBannerView) findViewById(R.id.infinitebanner);
        List<HorizontalItem> items = new ArrayList<>();
        items.add(new HorizontalItem("Probando",R.mipmap.ic_launcher));
        items.add(new HorizontalItem("Probando 2","http://i.imgur.com/DvpvklR.png"));
        InfiniteBanner infiniteBanner1 = new InfiniteBanner(getApplicationContext(),infiniteBanner,items);
        infiniteBanner1.setTextStyle(R.style.text_item);
        infiniteBanner1.startScroll();

    }
}
