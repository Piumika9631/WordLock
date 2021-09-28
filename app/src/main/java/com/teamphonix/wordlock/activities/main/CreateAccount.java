package com.teamphonix.wordlock.activities.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.teamphonix.wordlock.R;
import com.teamphonix.wordlock.base.AppConstants;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final EditText mInputUsername = findViewById(R.id.InputUsername);
        final EditText mInputEmail = findViewById(R.id.InputEmail);
        final EditText mInputPwd = findViewById(R.id.InputPwd);
        final EditText mInputRetypePwd = findViewById(R.id.InputRetypePwd);
        final CheckBox mCheckBoxAgreePrivacy = findViewById(R.id.CheckBoxAgreePrivacy);
        final Button mBtnRegister = findViewById(R.id.BtnRegister);
        final TextView mTxtLogin = findViewById(R.id.TxtLogin);
        final SharedPreferences mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            String errorMsg;

            @Override
            public void onClick(View view) {

                boolean haveError = false;

                if (mInputUsername.getText().toString().equals("")) {
                    haveError = true;
                    errorMsg = "User name cannot be empty";
                    showErrorToast(errorMsg);
                }
                if (mInputEmail.getText().toString().equals("")) {
                    // need to validate email
                    haveError = true;
                    errorMsg = "Email cannot be empty";
                    showErrorToast(errorMsg);
                }
                if (mInputPwd.getText().toString().equals("")) {
                    haveError = true;
                    errorMsg = "Password cannot be empty";
                    showErrorToast(errorMsg);
                }
                if (!mInputPwd.getText().toString().equals(mInputRetypePwd.getText().toString())) {
                    // increase password strength
                    haveError = true;
                    errorMsg = "Passwords are not matching";
                    showErrorToast(errorMsg);
                }
                if (!mCheckBoxAgreePrivacy.isChecked()) {
                    haveError = true;
                    errorMsg = "You should agree our privacy policy";
                    showErrorToast(errorMsg);
                }
                if (!haveError) {
                    mSharedPreferences.edit().putBoolean(AppConstants.SHARED_PREFERENCE_REGISTERED_USER, true).apply();
                    Intent intent2 = new Intent(CreateAccount.this, MainActivity.class);
                    startActivity(intent2);
                    finish();
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
            }
        });
    }

    private void showErrorToast(String errorMsg) {
        Toast toast = Toast.makeText(getApplicationContext(),
                errorMsg,
                Toast.LENGTH_SHORT);
//        View view = toast.getView();
//        view.setBackgroundColor(getResources().getColor(R.color.red));
        toast.show();
    }
}