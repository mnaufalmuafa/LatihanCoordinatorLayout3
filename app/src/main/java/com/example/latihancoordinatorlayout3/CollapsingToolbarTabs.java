package com.example.latihancoordinatorlayout3;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.example.latihancoordinatorlayout3.fragment.DokterRSFragment;
import com.example.latihancoordinatorlayout3.fragment.LayananFragment;
import com.example.latihancoordinatorlayout3.fragment.ProfilRSFragment;
import com.squareup.picasso.Picasso;

public class CollapsingToolbarTabs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toobar_tabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final TextView ToolbarTV = findViewById(R.id.ToolbarTV);
        ToolbarTV.setText(" ");
        toolbar.getNavigationIcon().setColorFilter(getColor(R.color.black), PorterDuff.Mode.SRC_IN);
        /*
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Profil RS");
        //mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Layanan");
        //mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Dokter");
        mViewPagerAdapter.addFragment(new ProfilRSFragment(), "Profil RS");
        mViewPagerAdapter.addFragment(new LayananFragment(), "Layanan");
        mViewPagerAdapter.addFragment(new DokterRSFragment(), "Dokter RS");
        mViewPager.setAdapter(mViewPagerAdapter);*/

        ViewPager mViewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 1");
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 2");
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 3");
        mViewPager.setAdapter(mViewPagerAdapter);


        XTabLayout tabLayout = (XTabLayout) findViewById(R.id.tabs);
        tabLayout.setxTabDisplayNum(3);
        tabLayout.setupWithViewPager(mViewPager);

        ImageView imageViewMusic = findViewById(R.id.imaViewMusic);
        Picasso.with(this).load("https://firebasestorage.googleapis.com/v0/b/medgency.appspot.com/o/Latihanku%2Fpemula%2FRSI%20Singkil.JPG?alt=media&token=a987c411-d672-495c-b471-6a839cc0be72").fit().into(imageViewMusic);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = true;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    ToolbarTV.setText("Siloam Salampari");
                    isShow = true;
                } else if(isShow) {
                    ToolbarTV.setText(" ");//careful there should a space between double quote otherwise it wont work
                    isShow = false;
                }
            }
        });
    }
}
