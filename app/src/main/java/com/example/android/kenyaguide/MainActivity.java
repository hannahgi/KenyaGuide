package com.example.android.kenyaguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.android.kenyaguide.Fragments.EthnicGroups;
import com.example.android.kenyaguide.Fragments.GameParksFragment;
import com.example.android.kenyaguide.Fragments.HotelsFragment;
import com.example.android.kenyaguide.Fragments.SafariFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);
        ViewPager vp=(ViewPager)findViewById (R.id.viewpager);
        this.addPages (vp);
        TabLayout tabLayout=(TabLayout) findViewById (R.id.tab);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager (vp);
        tabLayout.setOnTabSelectedListener (listener (vp));
    }
    private void addPages(ViewPager Pager){
        MFragmentPagerAdapter adapter=new MFragmentPagerAdapter (getSupportFragmentManager ());
        adapter.addFragment (new EthnicGroups (),getString(R.string.ethnicGroups));
        adapter.addFragment (new GameParksFragment(),getString(R.string.gameParks));
        adapter.addFragment (new HotelsFragment (),getString(R.string.hotels));
        adapter.addFragment (new SafariFragment (),getString(R.string.safari));
        Pager.setAdapter (adapter);

    }
    private TabLayout.OnTabSelectedListener listener(final ViewPager Pager){
        return  new TabLayout.OnTabSelectedListener () {
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                Pager.setCurrentItem (tab.getPosition ());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

}
