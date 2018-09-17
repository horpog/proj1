package com.example.examle.proj1;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setupToolbar();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.events_list);
        EventListRecyclerAdapter recycleAdapter = new EventListRecyclerAdapter(getApplicationContext(), FakeData.getEvents());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(recycleAdapter);
    }
    private void setupToolbar() {
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }


    @Override
    public void onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
