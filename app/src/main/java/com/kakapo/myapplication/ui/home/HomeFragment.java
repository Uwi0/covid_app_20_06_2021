package com.kakapo.myapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.kakapo.myapplication.PentunjukIsolasiActivity;
import com.kakapo.myapplication.R;
import com.kakapo.myapplication.SelfCheckUpActivity;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CardView cvSelfCekUp = getView().findViewById(R.id.cv_self_cek);
        CardView cvPetunjukIsolasi = getView().findViewById(R.id.cv_petunjuk);


        cvSelfCekUp.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SelfCheckUpActivity.class);
            startActivity(intent);
        });

        cvPetunjukIsolasi.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), PentunjukIsolasiActivity.class);
            startActivity(intent);
        });
    }
}