package com.moringaschool.talkspace.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moringaschool.talkspace.Adapters.CommunityForums;
import com.moringaschool.talkspace.Adapters.ForumsGeneral;
import com.moringaschool.talkspace.Adapters.MentalHealth;
import com.moringaschool.talkspace.Adapters.TherapyForums;
import com.moringaschool.talkspace.Models.ForumsModel;
import com.moringaschool.talkspace.R;
import com.moringaschool.talkspace.databinding.FragmentForumsBinding;

import java.util.ArrayList;

public class ForumsFragment extends Fragment {
    FragmentForumsBinding  binding;
    RecyclerView generalRec, communityRec, therapyRec,mentalRec;
    ArrayList<ForumsModel> forumsModels;
    CommunityForums communityForums;
    ForumsGeneral forumsGeneral;
    TherapyForums therapyForums;
    MentalHealth mentalHealth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentForumsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //RecyclerViews
        generalRec =root.findViewById(R.id.recyclerView);
        communityRec =root.findViewById(R.id.recyclerView2);
        therapyRec =root.findViewById(R.id.recyclerView1);
        mentalRec =root.findViewById(R.id.recyclerView3);
        //general
        forumsModels =new ArrayList<>();

        forumsModels.add(new ForumsModel(R.drawable.image1,"Test Forum A"));
        forumsModels.add(new ForumsModel(R.drawable.image2,"Test Forum B"));
        forumsModels.add(new ForumsModel(R.drawable.image3,"Test Forum C"));
        forumsModels.add(new ForumsModel(R.drawable.image4,"Test Forum D"));
        forumsModels.add(new ForumsModel(R.drawable.image5,"Test Forum E"));

        forumsGeneral = new ForumsGeneral(getActivity(), forumsModels, this);
        generalRec.setAdapter(forumsGeneral);
        generalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        generalRec.setHasFixedSize(true);
        generalRec.setNestedScrollingEnabled(false);

        //therapy
        forumsModels =new ArrayList<>();

        forumsModels.add(new ForumsModel(R.drawable.image5,"Generation Equality Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image3,"My First Time"));
        forumsModels.add(new ForumsModel(R.drawable.image2,"Media & Advocacy"));
        forumsModels.add(new ForumsModel(R.drawable.image1,"Centers"));
        forumsModels.add(new ForumsModel(R.drawable.image4,"Centers"));

        therapyForums = new TherapyForums(getActivity(), forumsModels, this);
        therapyRec.setAdapter(therapyForums);
        therapyRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        therapyRec.setHasFixedSize(true);
        therapyRec.setNestedScrollingEnabled(false);

        //community
        forumsModels =new ArrayList<>();

        forumsModels.add(new ForumsModel(R.drawable.image4,"Generation Equality Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image3,"My First Time"));
        forumsModels.add(new ForumsModel(R.drawable.image5,"Media & Advocacy"));
        forumsModels.add(new ForumsModel(R.drawable.image2,"Centers"));
        forumsModels.add(new ForumsModel(R.drawable.image1,"Centers"));

        communityForums = new CommunityForums(getActivity(), forumsModels, this);
        communityRec.setAdapter(communityForums);
        communityRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        communityRec.setHasFixedSize(true);
        communityRec.setNestedScrollingEnabled(false);
        //Mental Health
        forumsModels =new ArrayList<>();

        forumsModels.add(new ForumsModel(R.drawable.image4,"Depression Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image3,"Anxiety Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image5,"Bipolar disorder Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image2,"Schizophrenia Forum"));
        forumsModels.add(new ForumsModel(R.drawable.image1,"Obsessive-compulsive disorder (OCD)"));

        mentalHealth = new MentalHealth(getActivity(), forumsModels, this);
        mentalRec.setAdapter(mentalHealth);
        mentalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        mentalRec.setHasFixedSize(true);
        mentalRec.setNestedScrollingEnabled(false);


        return root;
    }
}