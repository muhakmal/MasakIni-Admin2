package com.baskom.masakini.drawercontent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by akmalmuhamad on 20/11/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position){
        if(position ==0){
            return new ResepTabActivity();
        }else return new VideoTabActivity();
    }


    @Override
    public int getCount() {
        return 2;
    }
}
