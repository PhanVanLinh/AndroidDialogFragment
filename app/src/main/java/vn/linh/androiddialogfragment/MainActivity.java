package vn.linh.androiddialogfragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import vn.linh.androiddialogfragment.dialog.SuccessDialog1;
import vn.linh.androiddialogfragment.dialog.SuccessDialog2;
import vn.linh.androiddialogfragment.dialog.SuccessDialog3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_show_dialog_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                SuccessDialog1 userInfoDialog = SuccessDialog1.newInstance("Login successfully");
                userInfoDialog.show(fm, null);
            }
        });

        findViewById(R.id.button_show_dialog_fragment_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                SuccessDialog2 userInfoDialog = SuccessDialog2.newInstance("Login successfully");
                userInfoDialog.show(fm, null);
            }
        });

        findViewById(R.id.button_show_dialog_fragment_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                SuccessDialog3 userInfoDialog = SuccessDialog3.newInstance("Login successfully");
                userInfoDialog.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.DialogFullScreen);
                userInfoDialog.show(fm, null);
            }
        });
    }
}
