package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_rubbing extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Superb Rubbing and Glaze").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("Over the time cars paint erodes due to the effects of sunlight, UV radiation, acid rain, salt, dirt, bird droppings and Air pollution. We give NEW LOOK TO PAINTED SURFACES by repairing the paint scratches, swirls marks, dullness, etc by using special rubbing compounds and imported polishes approved by the car manufacturers.\n");
        return builder.create();
    }

}
