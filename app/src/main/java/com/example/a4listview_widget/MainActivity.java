package com.example.a4listview_widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class
MainActivity extends AppCompatActivity {
    private final static String YHMZ="yhmz";
    private final static String BJ="bj";
    private final static String XH="xh";
    private final static String XB="xb";
    private final static String SJH="sjh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] yhmzs={"小明","小李","张书","飞飞"};
        String[] bjs={"1班","5班","3班","6班"};
        String[] xhs={"034","056","044","078"};
        String[] xbs={"男","男","女","女"};
        String[] sjhs={"3365","2722","0344","2545"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<yhmzs.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(YHMZ, yhmzs[i]);
            item.put(BJ, bjs[i]);
            item.put(XH, xhs[i]);
            item.put(XB, xbs[i]);
            item.put(SJH, sjhs[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{YHMZ,BJ,XH,XB,SJH},new int[]{R.id.textview1,R.id.textview2,R.id.textview3,R.id.textview4,R.id.textview5});
        ListView list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(adapter);
    }
}
