package com.example.circlecee;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerViewAdapter extends FragmentStatePagerAdapter {
    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new log();
                break;
            case 1:
                fragment=new sign();
                break;
            default:
                fragment=null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
