package com.kakapo.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.kakapo.myapplication.R;
import com.kakapo.myapplication.databinding.ActivitySelfCheckUpBinding;

public class SelfCheckUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySelfCheckUpBinding binding = ActivitySelfCheckUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}