package vn.linh.androiddialogfragment.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import vn.linh.androiddialogfragment.R;

public class SuccessDialog2 extends DialogFragment {

    public static final String MESSAGE = "MESSAGE";

    public static SuccessDialog2 newInstance(String message) {
        Bundle args = new Bundle();
        args.putString(MESSAGE, message);
        SuccessDialog2 fragment = new SuccessDialog2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_success);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.WRAP_CONTENT);
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        String message = getArguments().getString(MESSAGE, "");
        TextView tvMessage = dialog.findViewById(R.id.text_message);
        tvMessage.setText(message);
        return dialog;
    }
}
