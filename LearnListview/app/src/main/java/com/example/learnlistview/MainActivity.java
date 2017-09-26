package com.example.learnlistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] items = {"One","Two","Three","Four","Five","Six","Seven"};
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btnView);
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items));//设置列表适配器  下面是另外一种格式
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,items));
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);//这句话的作用是表明有选项，如果我们不设置这句话，缺省值为none，就算我们点击，也不会出现选中变色效果
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        button.setText(items[position]);
    }
}
