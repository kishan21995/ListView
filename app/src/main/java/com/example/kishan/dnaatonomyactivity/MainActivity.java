package com.example.kishan.dnaatonomyactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES={R.drawable.png_one,R.drawable.png_two,R.drawable.png_three,R.drawable.png_four,R.drawable.png_five,R.drawable.png_six};
    String[] NAMES={"Introduction to Atonomy","Bones,joints and Cartilage","Skin,Connective Tissue and ligament","Cardiovasclr,Lymphatic","Introduction to Anotomy","Lymphatic and nerv"};
    String[] DESCRIPTIONS={"25 MCQ","25 MCQ","25 MCQ","25 MCQ","25 MCQ","25 MCQ"};
    String[] DESCRIPTIONSS={"4.5","4.5","4.5","4.5","4.5","4.5"};
    int[] IMAGESS={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};//



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class  CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView1=(ImageView)view.findViewById(R.id.imageView6);//

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);
            TextView textView_descriptions=(TextView)view.findViewById(R.id.textView_descriptions);

            imageView1.setImageResource(IMAGESS[i]);//


            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);
            textView_descriptions.setText(DESCRIPTIONSS[i]);


            return view;
        }
    }
}
