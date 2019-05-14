package com.example.superb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog_acsanitization extends AppCompatDialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("A.C Sanitization").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setMessage("This protection is designed to disinfect the Air conditioner ducts and to improve air quality\n" +
                "Cleans the Air conditioner coils and ducts \n" +
                "Disinfects the ducts and helps to stop build up of mould Removes all bad and foul odors from the ducts\n" +
                "Improves in-car air quality for the well being of driver and passengers.\n");
        return builder.create();
    }


}
