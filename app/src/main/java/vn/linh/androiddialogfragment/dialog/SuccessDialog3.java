package vn.linh.androiddialogfragment.dialog;

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

public class SuccessDialog3 extends DialogFragment {

    public static final String MESSAGE = "MESSAGE";

    public static SuccessDialog3 newInstance(String message) {
        Bundle args = new Bundle();
        args.putString(MESSAGE, message);
        SuccessDialog3 fragment = new SuccessDialog3();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_success, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String message = getArguments().getString(MESSAGE, "");
        TextView tvMessage = view.findViewById(R.id.text_message);
        tvMessage.setText(message);
    }

    @Override
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.WRAP_CONTENT);
        }
    }
}
