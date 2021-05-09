package com.example.contactmanager.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.contactmanager.db.entity.Contact;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    public long addContact(Contact contact);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Query("SELECT * from contacts")
    public List<Contact> getContacts();

    @Query("SELECT * FROM contacts WHERE contact_id ==:contactID")
    public Contact getContact(long contactID);




}
