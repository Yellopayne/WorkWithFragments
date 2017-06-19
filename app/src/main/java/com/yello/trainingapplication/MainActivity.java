package com.yello.trainingapplication;



import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements WorkoutListFragment.WorkoutListListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    @Override
    public void itemClicked(int id) {

        WorkoutDetailFragment wdf = new WorkoutDetailFragment();
        wdf.chooseWorkout(id);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frame_container,wdf);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
