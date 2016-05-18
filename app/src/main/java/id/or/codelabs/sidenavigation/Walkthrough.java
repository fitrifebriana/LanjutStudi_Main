package id.or.codelabs.sidenavigation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.or.codelabs.lanjutstudi.adapter.WalkthroughAdapter;
import id.or.codelabs.lanjutstudi.utility.CirclePageIndicator;

public class Walkthrough extends AppCompatActivity {
    WalkthroughAdapter adapter;
    ViewPager viewPager;
    private Button btnNext;
    private Button btnSkip;
    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        initView();
        btnNext.setVisibility(View.GONE);
        adapter = new WalkthroughAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);

        indicator.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(final int position) {
                if (position == 2) {
                    btnSkip.setVisibility(View.GONE);
                    btnNext.setVisibility(View.VISIBLE);
                }
                else{
                    btnSkip.setVisibility(View.VISIBLE);
                    btnNext.setVisibility(View.GONE);
                }
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finishWalkthrough();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishWalkthrough();
            }
        });
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager_intro);
        btnSkip = (Button) findViewById(R.id.skip_button);
        btnNext = (Button) findViewById(R.id.next_button);
        indicator = (CirclePageIndicator) findViewById(R.id.walkthrough_indicator);
    }

    private void finishWalkthrough() {
        SharedPreferences preferences = getSharedPreferences("my_preferences", MODE_PRIVATE);

        preferences.edit().putBoolean("walkthrough_complete", true).apply();

        Intent main = new Intent(this, Login.class);
        startActivity(main);
        finish();
    }

}