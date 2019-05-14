package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_engine extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Engine Coating").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("This treatment is designed to provide a high gloss and slippery coating on to the engine parts, hoses etc. The primary advantage of this treatment is to prevent the hoses and electrical wiring from getting bitten by rats so that a vehicle parked for a long duration is not a victim of such untoward incidents. Leaves a high, glossy, transparent surface finish\n" +
                "\n" +
                "Excellent resistance to:\n" +
                "\n" +
                "Petrol/Diesel+ Engine Oil + High Pressure water + Road grime + Avoids corrosion + Can be washed easily + Does not blister, crack, peel or yellow.\n");
        return builder.create();
    }


}
