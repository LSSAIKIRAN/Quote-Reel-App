package com.example.quotereelsapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.quotereelsapp.fragments.CategoryFragment;
import com.example.quotereelsapp.fragments.FavoriteFragment;
import com.example.quotereelsapp.fragments.HomeFragment;
import com.example.quotereelsapp.fragments.SettingsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
            default:
                return new HomeFragment();
            case 1:
                return new CategoryFragment();
            case 2:
                return new FavoriteFragment();
            case 3:
                return new SettingsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
