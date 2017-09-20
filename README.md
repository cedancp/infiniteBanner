# infiniteBanner

This librrary is a simple recyclerView with automatic scroll like a news banner for Android

## Install

Gradle
compile 'com.cedancp.infinitebanner:infinitebanner:1.0.0'

## Getting Started

add this view to your xml layout file:

<com.cedancp.infinitebanner.InfiniteBannerView
        android:id="@+id/infinitebanner"
        android:layout_width="wrap_content"
        android:layout_height="50dp"></com.cedancp.infinitebanner.InfiniteBannerView>

Instantiate the infiniteBanner in your activity or fragment:

InfiniteBannerView infiniteBannerView = (InfiniteBannerView) findViewById(R.id.infinitebanner);

Add items to a list of items:

List<HorizontalItem> items = new ArrayList<>();

items.add(new HorizontalItem("Testing banner with drawable",R.mipmap.ic_launcher));
items.add(new HorizontalItem("Testing banner with url","http://i.imgur.com/DvpvklR.png"));


InfiniteBanner infiniteBanner = new InfiniteBanner(getApplicationContext(),infiniteBannerView,items);

You can set a custom style for the text:

infiniteBanner.setTextStyle(R.style.text_item);

You can set the speed of the scroll:

infiniteBanner.setSpeed(10); //Default speed 10. 1 is the fastest

And finally start the scroll

infiniteBanner.startScroll();

## Contributing

This is a proyect in early phase of development please let me know about issues and new features you would like to include.
