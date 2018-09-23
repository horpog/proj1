package com.example.examle.proj1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.examle.proj1.Domain.User;

import java.util.List;

public class ContactListRecyclerAdapter extends RecyclerView.Adapter<ContactListRecyclerAdapter.ListViewHolder> {
    private Context context;
    private List<User> users;


    public ContactListRecyclerAdapter(Context context, List<User> items) {

        this.context = context;
        this.users = items;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contacts_list_item, parent, false);
        return new ContactListRecyclerAdapter.ListViewHolder(view);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        User item = users.get(position);
        holder.firstName.setText(item.getFirstName());
        holder.lastName.setText(item.getLastName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView firstName;
        private TextView lastName;


        public ListViewHolder(View itemView) {
            super(itemView);
            firstName = (TextView) itemView.findViewById(R.id.contact_first_name);
            lastName = (TextView) itemView.findViewById(R.id.contact_last_name);


        }
    }
}
