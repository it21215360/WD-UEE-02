package com.example.chatapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;


public class Prof_Calendar extends Fragment {

    private CalendarView calendarView;
    private ImageView imageView;
    private String strngdateSelected;
    private Button checkrv;

    private SharedViewModel sharedViewModel;

    //private DatabaseReference databaseReference;
    View vw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vw= inflater.inflate(R.layout.fragment_prof__calendar, container, false);

        calendarView = vw.findViewById(R.id.calendarView1);
        imageView = vw.findViewById(R.id.imageViewaddbtn);
        checkrv = vw.findViewById(R.id.rvmove);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        // Obtain the shared ViewModel
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                strngdateSelected = Integer.toString(dayOfMonth)+Integer.toString(month)+Integer.toString(year);
                calendarClicked();

                strngdateSelected = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year);
                sharedViewModel.setSelectedDate(strngdateSelected);
            }

        });

        // Set an OnClickListener for the "checkrv" button
        checkrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToViewScheduler();
            }
        });

        //databaseReference = FirebaseDatabase.getInstance().getReference("Calendar");
        return vw;
    }

    public void calendarClicked(){

    }
    private void openDialog() {
        ScheduleAddDialog exampleDialog = new ScheduleAddDialog();
        Bundle args = new Bundle();
        args.putString("selectedDate", strngdateSelected);
        exampleDialog.setArguments(args);
        exampleDialog.show(getActivity().getSupportFragmentManager(),"example Dialog" );

    }

    private void navigateToViewScheduler() {
        // Create an instance of the ViewScheduler fragment
        ViewScheduler viewSchedulerFragment = new ViewScheduler();

        // Get the FragmentManager
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

        // Start a new FragmentTransaction
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the ViewScheduler fragment
        transaction.replace(R.id.spflFragment, viewSchedulerFragment);
        transaction.addToBackStack(null); // Add to back stack to enable back navigation

        // Commit the transaction
        transaction.commit();
    }

}
