package com.example.autocompletelistview2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    private AutoCompleteTextView autoCompleteTextView;
    private String[] countries = {"shanghai","zhenghou","chongqing","qingdao","xian","qinghai","anhui"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list,countries);
        autoCompleteTextView.setAdapter(adapter);
        //Toast.makeText(getApplicationContext(),"你选择的是:"+autoCompleteTextView.getText(),Toast.LENGTH_SHORT).show();
    }
}
