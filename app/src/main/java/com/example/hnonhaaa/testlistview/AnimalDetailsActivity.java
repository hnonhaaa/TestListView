package com.example.hnonhaaa.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);
        ImageView animalImageView = (ImageView) findViewById(R.id.animal_Image_View);
        TextView nameTextView = (TextView) findViewById(R.id.name_text_View);

        Intent innt = getIntent() ;
        String name = innt.getStringExtra("name") ;
        int picture = innt.getIntExtra("picture" , 0) ;

        int hnon = innt.getIntExtra("position" , 0) ;// อันนี้ยังไม่เสร็จ
        nameTextView.setText(name);
        animalImageView.setImageResource(picture);
        getSupportActionBar().setTitle(name); // set tab top app
    }
}
