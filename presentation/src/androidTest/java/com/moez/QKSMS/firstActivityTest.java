package com.moez.QKSMS;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import androidx.appcompat.app.AppCompatActivity;

public class firstActivityTest {
    private firstActivity example;

    @Before
    public void setUp() throws Exception{
        example = new firstActivity();
    }

    @Test
    public void onCreate() throws Exception{
        Intent intent = new Intent();
        //intent.setClass(PassData.this,)
        Bundle mBundle = new Bundle();
        mBundle.putString("Test","This is a test.");
        intent.putExtras(mBundle);
        //Bundle savedInstanceState;
        assertEquals("Test",example.onCreate(mBundle));
    }
}