package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_seattreatment extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Upholstery Correction").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("In this treatment, a thorough cleaning of the fabric is carried out by a proprietary chemical. This removes the dirt, dust & grime including very tough stains like chocolates, coffee/ tea etc. The aerosol used to clean the surface dries very quickly, hence leaving no bad odors and making the interiors fresh. Cleans & Protects: Carpets + Interior Vinyl + Fabric + Plastics + Rubber surfaces + Removes all dirt and restores leather seats and side padding + Produces a true color of fabric giving a natural and rich appearance.\n");
        return builder.create();
    }



}
