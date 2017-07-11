package activity.yy.com.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter extends AppCompatActivity {

    private  String[] names=new String[]{"虎头","弄玉","李清照","李白"};

    private  String[] desc=new String[]{"可爱的小女孩"};

    private int[] imageIds=new int[]{R.mipmap.ic_launcher};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

        //创建一个List集合,List集合的元素是Map
        List<Map<String,Object>> listItems=new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String,Object> listItem=new HashMap<String,Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("personName",names[i]);
            listItem.put("desc",desc[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        android.widget.SimpleAdapter simpleAdapter=new android.widget.SimpleAdapter(this,listItems,R.layout.simple_item,new String[]{"personName","header","desc"},new int[]{R.id.name,R.id.header,R.id.desc});
        ListView list= (ListView) findViewById(R.id.mylist);
        //为ListView设置Adapter
        list.setAdapter(simpleAdapter);

        //为ListView的列表的单击事件绑定事件监听器
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),names[position]+"被单击了",Toast.LENGTH_SHORT).show();

            }
        });
        //为ListView的列表项的选中事件绑定事件监听器
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),names[position]+"被选中了",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
