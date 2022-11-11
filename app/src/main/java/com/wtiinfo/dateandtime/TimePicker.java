package com.wtiinfo.dateandtime;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new TimePickerDialog(getActivity(), this, 18, 30, true);
    }

    @Override
    public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
        String msg = String.format("Você escolheu o horário: %02d:%02d", hour, minute);
        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }
}
