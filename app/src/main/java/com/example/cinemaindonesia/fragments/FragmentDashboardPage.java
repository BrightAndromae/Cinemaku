package com.example.cinemaindonesia.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cinemaindonesia.MainDashboard;
import com.example.cinemaindonesia.MainDetailFilm;
import com.example.cinemaindonesia.MainLogin;
import com.example.cinemaindonesia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDashboardPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDashboardPage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentDashboardPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDashboardPage.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDashboardPage newInstance(String param1, String param2) {
        FragmentDashboardPage fragment = new FragmentDashboardPage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard_page, container, false);

        CardView myCardView = view.findViewById(R.id.exampleClicked);

        myCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainDetailFilm.class);
                startActivity(intent);
            }
        });



        return view;
    }
}