package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_premiumwash extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Premium Wash").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("Complete dry cleaning of a interior including seats (carpet/leather), roof, mats and boot + Complete vacuuming of cars incl. seats and boot + Washing and cleaning of foot mats + Pre washing of car + Foam cleaning of exterior + Tyre arches cleaning + Underbody wash + Engine hot water wash and dressing + Washing and cleaning of door frames + Side doors cleaning and polishing + Body liquid polishing and waxing + Dash board cleaning and polishing + Tyre and alloy polishing + Scratch proof windshield spray + Car perfume spray\n");
        return builder.create();
    }


}
