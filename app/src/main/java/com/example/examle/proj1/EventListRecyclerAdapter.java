package com.example.examle.proj1;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.examle.proj1.Domain.Event;

import java.util.List;

public class EventListRecyclerAdapter extends RecyclerView.Adapter<EventListRecyclerAdapter.ListViewHolder> {
        private Context context;
        private List<Event> events;
        private int storeId;


        public EventListRecyclerAdapter(Context context, List<Event> items) {

            this.context = context;
            this.events = items;
        }

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.event_liset_item, parent, false);
            return new EventListRecyclerAdapter.ListViewHolder(view);
        }

        public void setEvents(List<Event> products) {
            this.events = products;
        }

        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {
            Event item = events.get(position);

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ListViewHolder extends RecyclerView.ViewHolder {


            public ListViewHolder(View itemView) {
                super(itemView);

            }
        }

}
