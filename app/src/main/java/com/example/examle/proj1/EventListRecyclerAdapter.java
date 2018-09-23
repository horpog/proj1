package com.example.examle.proj1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.examle.proj1.Domain.Event;

import java.util.List;

public class EventListRecyclerAdapter extends RecyclerView.Adapter<EventListRecyclerAdapter.ListViewHolder> {
        private Context context;
        private List<Event> events;


        public EventListRecyclerAdapter(Context context, List<Event> items) {

            this.context = context;
            this.events = items;
        }

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.event_list_item, parent, false);
            return new EventListRecyclerAdapter.ListViewHolder(view);
        }

        public void setEvents(List<Event> events) {
            this.events = events;
        }

        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {
            Event item = events.get(position);
            holder.title.setText(item.getTitle());
            holder.description.setText(item.getTitle());
            holder.eventDate.setText("1396/05/05");
            holder.reminderDate.setText("1396/05/04");

        }

        @Override
        public int getItemCount() {
            return events.size();
        }

        public class ListViewHolder extends RecyclerView.ViewHolder {
            private TextView title;
            private TextView description;
            private TextView eventDate;
            private TextView reminderDate;

            public ListViewHolder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.event_title);
                description = (TextView) itemView.findViewById(R.id.event_description);
                eventDate = (TextView) itemView.findViewById(R.id.event_date);
                reminderDate = (TextView) itemView.findViewById(R.id.reminder_date);

            }
        }

}
