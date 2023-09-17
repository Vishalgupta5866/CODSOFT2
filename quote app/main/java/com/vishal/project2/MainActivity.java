package com.vishal.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Dataone> quoteData =new ArrayList<>();

    RecyclerView recycledata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Dataone dataone=new Dataone("If You Are The Best In the Room Then You Are In Wrong Room ");
        Dataone dataone1=new Dataone("When you change your thoughts, remember to also change your world ");
        Dataone dataone2=new Dataone(" Just one small positive thought in the morning can change your whole day");
        Dataone dataone3=new Dataone("We cannot solve problems with the kind of thinking we employed when we came up with them");
        Dataone dataone4=new Dataone("Learn as if you will live forever, live like you will die tomorrow");
        Dataone dataone5=new Dataone("Success usually comes to those who are too busy looking for it");

        Dataone dataone10=new Dataone("Setting goals is the first step in turning the invisible into the visible");
        Dataone dataone11=new Dataone("Education is the most powerful weapon which you can use to change the world");
        Dataone dataone12=new Dataone("The most difficult thing is the decision to act, the rest is merely tenacity");
        Dataone dataone13=new Dataone("You can’t be that kid standing at the top of the waterslide, overthinking it. You have to go down the chute");
        Dataone dataone14=new Dataone("Success is stumbling from failure to failure with no loss of enthusiasm");
        Dataone dataone15=new Dataone("Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence.");
        Dataone dataone16=new Dataone("Coming together is a beginning. Keeping together is progress. Working together is success");
        Dataone dataone17=new Dataone("Mondays are the start of the work week which offer new beginnings 52 times a year");
        Dataone dataone18=new Dataone("You can get everything in life you want if you will just help enough other people get what they want");
        Dataone dataone19=new Dataone("Don't bunt. Aim out of the ballpark. Aim for the company of immortals");
        Dataone dataone20=new Dataone("The only one who can tell you “you can’t win” is you and you don’t have to listen");


        quoteData.add(dataone1);
        quoteData.add(dataone2);
        quoteData.add(dataone3);
        quoteData.add(dataone4);
        quoteData.add(dataone5);

        quoteData.add(dataone10);

        quoteData.add(dataone11);
        quoteData.add(dataone12);

        quoteData.add(dataone13);
        quoteData.add(dataone14);

        quoteData.add(dataone15);
        quoteData.add(dataone16);

        quoteData.add(dataone17);
        quoteData.add(dataone18);

        quoteData.add(dataone19);
        quoteData.add(dataone20);







        RecyclerView recyclerView=findViewById(R.id.recycledata);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getApplicationContext());
        Adapter adapter=new Adapter(quoteData,getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


    }
}