package zyy.math.fjnu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab3 extends AppCompatActivity{
    private ListView list;
    private String[] names = new  String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageids = new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

        List<Map<String,Object>> listItems = new ArrayList<>();
        list = (ListView) findViewById(R.id.listView1);
        for (int i = 0;i < names.length;i++){
            Map<String,Object> listItem = new HashMap<>();
            listItem.put("name",names[i]);
            listItem.put("image",imageids[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simple = new SimpleAdapter(this,listItems,R.layout.items,
                new String[]{"name","image"},
                new int[]{R.id.text,R.id.image});
        list.setAdapter(simple);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(Lab3.this, names[position]+"被点击了",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}
