package com.hadi.mustafaall;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hadi.mustafaall.adapter.ContactsAdapter;
import com.hadi.mustafaall.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {

    private RecyclerView contactsRv;

    private ContactsAdapter contactsAdapter;

    private List<Contact> contacts = new ArrayList<>();

    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;

        contacts.add(new Contact("Hadi", "+201128282353"));
        contacts.add(new Contact("Moustafa", "+201128282353"));
        contacts.add(new Contact("Mohamed", "+201128282353"));
        contacts.add(new Contact("Kiro", "+201128282353"));
        contacts.add(new Contact("Salama", "+201128282353"));
        contacts.add(new Contact("Sawsan", "+201128282353"));
        contacts.add(new Contact("Zaki", "+201128282353"));
        contacts.add(new Contact("Ahmed", "+201128282353"));
        contacts.add(new Contact("Batty", "+201128282353"));
        contacts.add(new Contact("Zyad", "+201128282353"));
        contacts.add(new Contact("Marwan", "+201128282353"));
        contacts.add(new Contact("Khaled", "+201128282353"));
        contacts.add(new Contact("Hwayda", "+201128282353"));
    }

    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_contacts, container, false);

        contactsRv = rootView.findViewById(R.id.contacts_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        contactsRv.setLayoutManager(layoutManager);

        contactsAdapter = new ContactsAdapter(contacts);

        contactsRv.setAdapter(contactsAdapter);

        return rootView;
    }

}
