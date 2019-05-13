package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override public Fragment getItem(int position) {
        switch (position){
            case 0: return new Summary();
            case 1: return new DescriptionTab();
            case 2: return new RestaurantTab();
            case 3: return new HotelTab();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Tab 1";
            case 1: return "Tab 2";
            case 2: return "Tab 3";
            case 3: return "Tab 4";
            default: return null;
        }
    }
}
