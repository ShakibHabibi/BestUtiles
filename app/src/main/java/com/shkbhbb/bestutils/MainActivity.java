package com.shkbhbb.bestutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = findViewById(R.id.hello);
    List<Integer> integers = new ArrayList<>();
    integers.add(5);
    integers.add(50);
    integers.add(25);
    integers.add(7);
    integers.add(1);
    integers.add(10);
    integers.add(19);
    Sort sort = new Sort();
    List<Integer> sorted = sort.mergeSort(integers);
    textView.setText(sorted.toString());
  }
}
