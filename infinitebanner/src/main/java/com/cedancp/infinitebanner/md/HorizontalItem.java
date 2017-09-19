package com.cedancp.infinitebanner.md;

/**
 * Created by cedancp on 9/12/17.
 */

public class HorizontalItem {

    public String mainText;
    public String url;
    public int drawable;

    public HorizontalItem(String mainText,String url){
        this.mainText = mainText;
        this.url = url;
    }

    public HorizontalItem(String mainText,int drawable){
        this.mainText = mainText;
        this.drawable = drawable;
    }
}
