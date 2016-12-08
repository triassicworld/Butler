package com.neuron.butler.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.app.AlertDialog;
import android.widget.TextView;

import com.neuron.butler.R;

/**
 * Created by Victor on 11/10/2016.
 */

public class ThreeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private Context context;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_three, container, false);

        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        Spinner spinnerCategory = (Spinner) rootView.findViewById(R.id.spinner_category);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context, R.array.jobs_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(adapter);

        // components from main.xml

        Button button = (Button) rootView.findViewById(R.id.buttonInvite);
        final TextView textViewTeman = (TextView) rootView.findViewById(R.id.textviewFriends);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get prompts.xml view
                LayoutInflater layoutInflater = LayoutInflater.from(context);
                View promptView = layoutInflater.inflate(R.layout.prompt_invite, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // set prompts.xml to be the layout file of the alertdialog builder
                alertDialogBuilder.setView(promptView);
                final EditText input = (EditText) promptView.findViewById(R.id.edittext_inviteTeman);
                // setup a dialog window
                alertDialogBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // get user input and set it to result
                                textViewTeman.setText(input.getText());
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                // create an alert dialog
                AlertDialog alertD = alertDialogBuilder.create();
                alertD.show();
            }
        });

        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
