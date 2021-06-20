package com.kakapo.myapplication.ui.kuizFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kakapo.myapplication.R;

public class Kuiz2Fragment extends Fragment {

    public Kuiz2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kuiz2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnIya = getView().findViewById(R.id.btn_iya);
        Button btnTidak = getView().findViewById(R.id.btn_tidak);
        Button btnKembali = getView().findViewById(R.id.btn_kembali);

        btnIya.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.action_to_hasilPositifFragment);
        });

        btnTidak.setOnClickListener(v ->{
            Navigation.findNavController(v).navigate(R.id.action_to_kuiz3Fragment);
        });

        btnKembali.setOnClickListener(v ->{
            if (getActivity() != null){
                getActivity().finish();
            }
        });
    }
}