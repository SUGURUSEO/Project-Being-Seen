package com.example.myapplication.DonorUiFrontend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class DnUserProfileViewBalanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dn_user_profile_view_balance);

        //Logout button
        final Button button = (Button) findViewById(R.id.DnPfLogoutButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        //Edit profile
        final Button EditPfButton = (Button) findViewById(R.id.DnEditPfButton);

        EditPfButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), DnUserProfileEditActivity.class);
                startActivity(i);
            }
        });

        Switch profileSwitch = (Switch) findViewById(R.id.ProfileSwitch);
        profileSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Intent i = new Intent(getApplicationContext(), DnUserProfileViewDonationActivity.class);
                    startActivity(i);
                } else {
                    // The toggle is disabled
                    Intent i = new Intent(getApplicationContext(), DnUserProfileViewBalanceActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
