package com.halfdrop.david.logginggeofencingapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import static com.jayway.awaitility.Awaitility.await;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;


/**
 * Created by DavidiMac on 15/04/2017.
 */

public class FirebaseTest {
    @Test
    public void connectToDatabase() throws Exception {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        await().atMost(20, TimeUnit.SECONDS);
        assertThat(database, notNullValue());
    }
}
