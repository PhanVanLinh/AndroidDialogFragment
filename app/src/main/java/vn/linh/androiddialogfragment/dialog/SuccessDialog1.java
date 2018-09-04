package vn.linh.androiddialogfragment.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import vn.linh.androiddialogfragment.R;

public class SuccessDialog1 extends DialogFragment {

    public static final String MESSAGE = "MESSAGE";

    public static SuccessDialog1 newInstance(String message) {
        Bundle args = new Bundle();
        args.putString(MESSAGE, message);
        SuccessDialog1 fragment = new SuccessDialog1();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_success, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        final Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        }
        super.onActivityCreated(savedInstanceState);
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String message = getArguments().getString(MESSAGE, "");
        TextView tvMessage = view.findViewById(R.id.text_message);
        tvMessage.setText(message);
    }
}
