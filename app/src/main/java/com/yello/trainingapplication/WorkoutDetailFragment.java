package com.yello.trainingapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    int numerWork=0;

    public  void chooseWorkout(int num){
        this.numerWork=num;

    }


    public WorkoutDetailFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_workout_detail, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if(view !=null){
            TextView tv1 = (TextView)view.findViewById(R.id.textTittle);
            tv1.setText(Workout.workArray[numerWork].getName());
            TextView tv2 =(TextView)view.findViewById(R.id.textDescription);
            tv2.setText(Workout.workArray[numerWork].getDescription());
        }
    }
}
