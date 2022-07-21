package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabCounts;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCounts=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();

            case 1:
                return new ScienceFragment();

            case 2:
                return new HealthFragment();

            case 3:
                return new SportsFragment();

            case 4:
                return new TechFragment();

            case 5:
                return new EntertainmentFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
