package easyway2seventh.com.menudemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout;
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        switch (item.getItemId()){
            case R.id.id_red_color :
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                return true;
            case R.id.id_green_color :
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                return true;
            case R.id.id_blue_color :
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                return true;
            case R.id.id_purple_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
                return true;
            default:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                return true;
        }
        //return super.onOptionsItemSelected(item);
    }
}
