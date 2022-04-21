package com.ain_2_20_adis_kerimov.doctors3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Consult> list = new ArrayList<>();
    private MainAdapter adapter;
    private Button btnAdd;
    public static final String KEY1 = "key";
    private static final int REQUEST_CODE = 2;
    public static final int REQUEST_COD = 3;
    private int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.rv_doctors);
        btnAdd = findViewById(R.id.btnAdd);
        setInitialData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainAdapter((ArrayList<Consult>) list, this);
        recyclerView.setAdapter(adapter);

//        adapter.setOnClickListener((MainAdapter.ItemClickListener) this);

//        new ItemTouchHelper(simpleCallback).attachToRecyclerView(recyclerView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
//
//            Consult consult = (Consult) data.getSerializableExtra(ApplicationActivity.KEY);
//            adapter.addData(consult);
//
//        }
//        if (requestCode == REQUEST_COD && resultCode == RESULT_OK && data != null) {
//            Consult consult = (Consult) data.getSerializableExtra(ApplicationActivity.KEY);
//            adapter.changeData(consult, position);
//        }

    }

//    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(
//            ItemTouchHelper.UP | ItemTouchHelper.DOWN,
//
//            ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT
//
//    ) {
//        @Override
//        public boolean onMove(@NonNull RecyclerView recyclerView,
//                              @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
//
//            int positionDrag = viewHolder.getAdapterPosition();
//            int positionTarget = target.getAdapterPosition();
//
//            Collections.swap(adapter.list, positionDrag, positionTarget);
//            adapter.notifyItemMoved(positionDrag, positionTarget);
//
//            return true;
//        }

//        @Override
//        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
//            adapter.list.remove(viewHolder.getAdapterPosition());
//            adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
//        }
//    };


    public void onItemClick(int position) {
//        this.position =position;
//        Intent intent = new Intent(MainActivity.this, ApplicationActivity.class);
//        intent.putExtra(KEY1, adapter.list.get(position));
//        startActivityForResult(intent, REQUEST_COD);
//

    }

    private void setInitialData(){

        list.add(new Consult ("Айгерим Будайчиева", "+996(554)648880", R.drawable.doctor_09));
        list.add(new Consult ("Даниил Жуков", "+996(700)331526", R.drawable.doctor_09));
        list.add(new Consult ("Ульяна Лебедева", "+996(700)796225", R.drawable.doctor_09));
        list.add(new Consult ("Мазда Айдарбеков", "+996(700)362926", R.drawable.doctor_09));
        list.add(new Consult ("Жоомарт Жолдошев", "+996(700)990903", R.drawable.doctor_09));
        list.add(new Consult ("Святослав Попов", "+996(700)443941", R.drawable.doctor_09));
        list.add(new Consult ("Стефания Родионова", "+996(700)888326", R.drawable.doctor_09));
        list.add(new Consult ("Ксения Демидова", "+996(700)992158", R.drawable.doctor_09));
        list.add(new Consult ("Вадим Борисов", "+996(700)413773", R.drawable.doctor_09));

    }

}

