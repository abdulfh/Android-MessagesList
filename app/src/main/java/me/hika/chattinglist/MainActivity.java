package me.hika.chattinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import me.hika.chattinglist.adapter.MessageAdapter;
import me.hika.chattinglist.model.MessageModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ArrayList<MessageModel> messagesList = new ArrayList<>();
        for (int i=0;i<10;i++) {
            messagesList.add(new MessageModel("Hi", i % 2 == 0 ? MessageAdapter.MESSAGE_TYPE_IN : MessageAdapter.MESSAGE_TYPE_OUT));
        }

        MessageAdapter adapter = new MessageAdapter(messagesList, this);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}