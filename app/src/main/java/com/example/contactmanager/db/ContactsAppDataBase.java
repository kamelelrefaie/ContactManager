package com.example.contactmanager.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.contactmanager.db.entity.Contact;

@Database(entities = {Contact.class},version = 1)
public  abstract  class  ContactsAppDataBase extends RoomDatabase {
    public  abstract   ContactDao getContactDao();
}
