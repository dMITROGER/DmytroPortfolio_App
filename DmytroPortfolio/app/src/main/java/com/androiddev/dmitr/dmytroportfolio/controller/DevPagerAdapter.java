package com.androiddev.dmitr.dmytroportfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.androiddev.dmitr.dmytroportfolio.views.AboutFragment;
import com.androiddev.dmitr.dmytroportfolio.views.ContactFragment;
import com.androiddev.dmitr.dmytroportfolio.views.EducationFragment;
import com.androiddev.dmitr.dmytroportfolio.views.SkillsFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new EducationFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: return "ABOUT";
            case 1: return "EDUCATION";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}


