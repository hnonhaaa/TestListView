package com.example.hnonhaaa.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hnonhaaa.testlistview.adapter.AnimalListAdapter;
import com.example.hnonhaaa.testlistview.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayList<Animal> mData ;
    private AnimalListAdapter mAdapter;
    private ArrayList<Animal> aList = AnimalData.animalList ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        mListView = (ListView) findViewById(R.id.list_view);

        if(savedInstanceState == null){
            aList = new ArrayList<>() ;
        }

        aList.add(new Animal("Cat" , R.drawable.cat)) ;
        aList.add(new Animal("Dog" , R.drawable.dog)) ;
        aList.add(new Animal("Dolphin" , R.drawable.dolphin)) ;
        aList.add(new Animal("Koala" , R.drawable.koala)) ;
        aList.add(new Animal("Lion" , R.drawable.lion)) ;
        aList.add(new Animal("Owl" , R.drawable.owl)) ;
        aList.add(new Animal("Penguin" , R.drawable.penguin)) ;
        aList.add(new Animal("Pig" , R.drawable.pig)) ;
        aList.add(new Animal("Rabbit" , R.drawable.rabbit)) ;
        aList.add(new Animal("Tiger" , R.drawable.tiger)) ;

        mAdapter = new AnimalListAdapter(this , R.layout.item , aList) ;
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animalName =  aList.get(position);
                //Toast.makeText(MainActivity.this , animalName.name , Toast.LENGTH_SHORT).show() ;
                Intent innt = new Intent(MainActivity.this , AnimalDetailsActivity.class) ;
                //innt.putExtra("name", animalName.name) ;
                //innt.putExtra("picture" , animalName.picture ) ;
                innt.putExtra("position", position);
                startActivity(innt);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //create button add top right
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.main , menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // เหมือนใช้ listener
        int itemId = item.getItemId() ;
        switch (itemId){
            case R.id.action_add :
                addAnimal();
                return true ;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void addAnimal() {
        Animal a = new Animal(
                "งู",
                R.mipmap.ic_launcher
        ) ;
        AnimalData.animalList.add(0,a) ;

        mAdapter.notifyDataSetChanged();// แจ้ว adapter ให้มันรู้ ให้มันไปอัพเดทใหม่ อัติโนมัติ


    }
}
