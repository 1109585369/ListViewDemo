package activity.yy.com.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewTest extends AppCompatActivity {


    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;
    //定义字符串数组，作为提示的文本
    String[] books=new String[]{"疯狂JAVA讲义","疯狂Ajax讲义","疯狂XML讲义","疯狂WorkFlow讲义"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view_test);

        //创建一个arrayadapter封装数组
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,R.layout.simple_item,books);
        actv= (AutoCompleteTextView) findViewById(R.id.auto);
        //设置Adapter
        actv.setAdapter(aa);
        mauto.findViewById(R.id.mauto);
        mauto.setAdapter(aa);
        //为MultiAutoCompleteTextView设置分隔线
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
