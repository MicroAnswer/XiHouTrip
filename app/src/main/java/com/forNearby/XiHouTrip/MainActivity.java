package com.forNearby.XiHouTrip;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener{
    BottomNavigationBar bottom_navigation_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation_bar= (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottom_navigation_bar.addItem(new BottomNavigationItem(R.mipmap.shouyeicon,"首页").setActiveColor(Color.parseColor("#36c47b")))
                .addItem(new BottomNavigationItem(R.mipmap.mudidiicon,"目的地").setActiveColor(Color.parseColor("#36c47b")))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"探索").setActiveColor(Color.parseColor("#36c47b")))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"我").setActiveColor(Color.parseColor("#36c47b")))
                .initialise();
        bottom_navigation_bar.setTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(int i) {

    }

    @Override
    public void onTabUnselected(int i) {

    }

    @Override
    public void onTabReselected(int i) {

    }
}
