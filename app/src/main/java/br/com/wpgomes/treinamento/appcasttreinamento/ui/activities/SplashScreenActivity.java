package br.com.wpgomes.treinamento.appcasttreinamento.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import br.com.wpgomes.treinamento.appcasttreinamento.R;
import br.com.wpgomes.treinamento.appcasttreinamento.ui.adapters.CustomPagerAdapter;

/**
 * Created by wgomes on 21/09/16.
 */

public class SplashScreenActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        loadGalleryImages();

        relativeLayout = (RelativeLayout) findViewById(R.id.skip);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });

    }

    private void loadGalleryImages() {

        CustomPagerAdapter adapter = new CustomPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewpager);

        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);

    }

}