package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.JokesClass;
import com.fleek.www.jokesuilibrary.JokeDisplayingActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment
        extends Fragment implements EndpointsAsyncTask.OnTaskCompleted {

    private ProgressBar progressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        progressBar = (ProgressBar) root.findViewById(R.id.progress);

        Button button = (Button) root.findViewById(R.id.bn_tell_joke);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JokesClass jokesClass = new JokesClass();
                Pair pair = new Pair(getActivity(), jokesClass.getAJoke());
                new EndpointsAsyncTask(getActivity(), progressBar, MainActivityFragment.this).execute(pair);
            }
        });


        return root;
    }


    @Override
    public void onTaskCompleted(String joke) {
        Intent intent = new Intent(getActivity(), JokeDisplayingActivity.class);
        intent.putExtra("joke", joke);
        startActivity(intent);
    }
}
