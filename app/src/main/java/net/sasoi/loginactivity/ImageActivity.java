package net.sasoi.loginactivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Ruf on 20/03/2018.
 */

public class ImageActivity extends AppCompatActivity{
    private CheckBox checkBox;
    private ImageView img_ok;
    private String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);
 /*
        Context context = getApplicationContext();

        text = "Hola Que tal";
        int duration = Toast.LENGTH_SHORT;
        //int duration = Toast.SHORT;
        Toast.makeText(context, text, duration).show();

        AlertDialog alertDialog = new AlertDialog.Builder(ImageActivity.this).create();
        alertDialog.setTitle("AVISO");
        alertDialog.setMessage("Alert MENSAJE PARA EL AVISO ");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

*/
        checkBox = (CheckBox)findViewById(R.id.id_check);
      //  img_ok = (ImageView) findViewById(R.id.ima_view_ok);


        checkBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    checkBox.setText(" Checkbos marcado! ");
                   // img_ok.setVisibility(View.VISIBLE);
                }
                else
                {
                    checkBox.setText(" Checkbos DESmarcado! ");
                   // img_ok.setVisibility(View.GONE);
                }
            }
        });

    }
}
