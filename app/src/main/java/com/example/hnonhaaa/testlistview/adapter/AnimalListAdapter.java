package com.example.hnonhaaa.testlistview.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hnonhaaa.testlistview.R;
import com.example.hnonhaaa.testlistview.model.Animal;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.hnonhaaa.testlistview.R.id.parent;

/**
 * Created by HNONHAAA on 10/29/2017.
 */

public class AnimalListAdapter extends  ArrayAdapter<Animal>{
    private Context mContext ;
    private ArrayList<Animal> mAnimalList;
    private int mLayoutResId ;

    public AnimalListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);
        this.mContext = context ;
        this.mLayoutResId = resource ;
        this.mAnimalList = objects ;
    }

    public View getView(int position , @Nullable View convertView ,@NonNull ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(mContext) ;

        View v= convertView;
        if(v==null){
            v = inflater.inflate(mLayoutResId,
                    null);
        }

        ImageView iv = (ImageView) v.findViewById(R.id.imageVieww) ;
        TextView tv = (TextView) v.findViewById(R.id.textVieww) ;

        Animal animal = mAnimalList.get(position) ;

        iv.setImageResource(animal.picture);
        tv.setText(animal.name);




        return v ;
    }
}
