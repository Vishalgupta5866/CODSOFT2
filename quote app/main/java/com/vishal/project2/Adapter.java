package com.vishal.project2;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Dataone>quoteData;
    Context context;

    public Adapter(ArrayList<Dataone> quoteData,Context context) {
        this.quoteData = quoteData;
        this.context=context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.designpagetwo,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder,  int position) {

        holder.quotetext.setText(quoteData.get(position).getQuote());




        //copppppy
        holder.copytext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label",quoteData.get(position).getQuote());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(context ,"copied", Toast.LENGTH_SHORT).show();
            }
        });


        ///share
        holder.sendtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent txtIntent = new Intent(android.content.Intent.ACTION_SEND);
                txtIntent .setType("text/plain");

                txtIntent .putExtra(android.content.Intent.EXTRA_TEXT, quoteData.get(position).getQuote());
                context.startActivity(Intent.createChooser(txtIntent ,"Share"));
                Toast.makeText(context, "share", Toast.LENGTH_LONG).show();
            }
        });


        holder.favroitetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Added to favroute", Toast.LENGTH_SHORT).show();

            }
        });




    }

    @Override
    public int getItemCount() {
        return quoteData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView quotetext;
        TextView sendtext;
        TextView copytext;
        TextView favroitetext;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            quotetext=itemView.findViewById(R.id.quotetext);
            sendtext=itemView.findViewById(R.id.sendtext);
            copytext=itemView.findViewById(R.id.copytext);
            favroitetext=itemView.findViewById(R.id.favouritetext);

        }
    }
}
