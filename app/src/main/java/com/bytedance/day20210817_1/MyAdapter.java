package com.bytedance.day20210817_1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<String> list;

    public MyAdapter(List<String> list){
        this.list=list;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        Log.d("marden","onCreateViewHolder:"+myViewHolder);
        return myViewHolder;
    }




    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MyAdapter.MyViewHolder holder, int position) {
        Log.d("marden","onBindViewHolder:"+holder+"------position:"+position);
        String temp=list.get(position);
        holder.bindData(temp);
    }




    @Override
    public int getItemCount() {
        return list.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.my_textview);
        }

        public void bindData(String str){
            textView.setText(str);
        }




    }
}
