package sg.edu.rp.c346.id20031826.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

import sg.edu.rp.c346.id20031826.demotodolist.R;
import sg.edu.rp.c346.id20031826.demotodolist.ToDoItem;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ToDoItem> al;
    sg.edu.rp.c346.id20031826.demoandroidlist.CustomAdapter CAtodo;

    //ArrayAdapter<AndroidVersion> aa;

    sg.edu.rp.c346.id20031826.demoandroidlist.CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        al.add(item1);
        al.add(item2);


        //aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
        //lv.setAdapter(aa);

        adapter = new sg.edu.rp.c346.id20031826.demoandroidlist.CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(adapter);
    }
}