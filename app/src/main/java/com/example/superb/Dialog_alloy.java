package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_alloy extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Alloy Wheel Treatment").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("This treatment is designed for cleaning and protection of the alloy wheels. One of the biggest challenges being faced is in protecting alloy wheels from brake dust and grime. This, in-turn leaves spider web cracks on the alloy wheels and cannot be repaired. The beauty and sheen of the alloy wheels is lost in the process. This application is aimed at restoring the lost sheen of the alloy wheels and also ensuring long-term protection.\n" +
                "\n" +
                "-Grime\n" +
                "-Only regular washing needed after Protection\n" +
                "-No need for expensive alloy wheel cleaners\n" +
                "-No cracking or scaling off of the Alloy coating.\n");
        return builder.create();
    }



}
