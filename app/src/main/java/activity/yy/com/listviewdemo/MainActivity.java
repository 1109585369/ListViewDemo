package activity.yy.com.listviewdemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //无须使用布局文件
        String[] arr={"孙悟空","猪八戒","唐僧"};
        //创建ArrayAdapter对象
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arr);
        //设置该窗口显示列表
        setListAdapter(adapter);
    }
}
