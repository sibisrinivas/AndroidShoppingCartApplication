package com.android.deepak.vdeliver.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RestaurantList extends Activity {
   TextView bawarchi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_list);
        bawarchi = (TextView) findViewById(R.id.bawarchi);
                bawarchi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(RestaurantList.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
