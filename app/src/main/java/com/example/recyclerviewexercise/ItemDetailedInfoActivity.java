package com.example.recyclerviewexercise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailedInfoActivity extends AppCompatActivity {

    public static void actionStart(Context context, String name, int imageId) {
        Intent intent = new Intent(context, ItemDetailedInfoActivity.class);
        intent.putExtra("param1", name);
        intent.putExtra("param2", imageId);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detailed_info);
        ImageView imageView = (ImageView)findViewById(R.id.fruit_image);
        TextView textView = (TextView)findViewById(R.id.fruit_name);
        Intent intent = getIntent();
        String name = intent.getStringExtra("param1");
        int imageId = intent.getExtras().getInt("param2");
        imageView.setImageResource(imageId);
        textView.setText(name);
    }
}
