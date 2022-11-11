package com.wtiinfo.dateandtime;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(), this, 2022, 10, 11);
    }

    @Override
    public void onDateSet(android.widget.DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
        String msg = String.format("Data escolhida: %02d/%02d/%d", dayOfMonth, monthOfYear + 1, year);
        Toast.makeText(getActivity(),  msg, Toast.LENGTH_LONG).show();
    }
}
