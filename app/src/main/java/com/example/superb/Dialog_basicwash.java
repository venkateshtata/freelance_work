package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;

public class Dialog_basicwash extends AppCompatDialogFragment {

    //String mess = getResources().getString(R.string.basicwash);


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

//        LayoutInflater inflater = getActivity().getLayoutInflater();
//        View view = inflater.inflate(R.layout.dialog_layout, null);

        builder.setTitle("Basic Wash").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("Complete vacuuming of cars incl. seats and boot + Washing and cleaning of foot mats + Body Shampooing and washing including door frames + Tyre arches cleaning + Underbody wash + Engine hot water wash and dressing + Side doors cleaning + Dash board cleaning and polishing + tires and alloy wheels treatment + Car perfume spray.\n");
        return builder.create();
    }
}
