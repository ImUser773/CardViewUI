package com.iamdeveloper.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        de.hdodenhof.circleimageview.CircleImageView image = (CircleImageView) findViewById(R.id.image_circle);
        image.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }
}
