package com.teamphonix.wordlock.activities.wordlock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.teamphonix.wordlock.R;
import com.teamphonix.wordlock.activities.lock.GestureUnlockActivity;
import com.teamphonix.wordlock.base.AppConstants;

public class WordLockScreenImageActivity extends AppCompatActivity {
    CoordinatorLayout coordinatorLayout;
    private String pkgName;
    private String actionFrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_lock_screen_imageview);

        EditText ET1 = findViewById(R.id.et1);
        EditText ET2 = findViewById(R.id.et2);
        EditText ET3 = findViewById(R.id.et3);
        EditText ET4 = findViewById(R.id.et4);
        EditText ET5 = findViewById(R.id.et5);
        EditText ET6 = findViewById(R.id.et6);
        EditText ET7 = findViewById(R.id.et7);
        EditText ET8 = findViewById(R.id.et8);
        EditText ET9 = findViewById(R.id.et9);
        Button mBtnOk = findViewById(R.id.btnOk);
        Button mBtnSkip = findViewById(R.id.btnSkip);
        TextView mTextViewWord = findViewById(R.id.wordView);
        CheckBox mCheckBoxHelpEye = findViewById(R.id.checkBoxHelpEye);
        String correctWord = "Telescope";

        pkgName = getIntent().getStringExtra(AppConstants.LOCK_PACKAGE_NAME);
        actionFrom = getIntent().getStringExtra(AppConstants.LOCK_FROM);

        ET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET1.getText().toString().length() == 1) {
                    ET2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET2.getText().toString().length() == 1) {
                    ET3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET3.getText().toString().length() == 1) {
                    ET4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET4.getText().toString().length() == 1) {
                    ET5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET5.getText().toString().length() == 1) {
                    ET6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET6.getText().toString().length() == 1) {
                    ET7.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET7.getText().toString().length() == 1) {
                    ET8.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        ET8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (ET8.getText().toString().length() == 1) {
                    ET9.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredWord = ET1.getText().toString() + ET2.getText().toString() + ET3.getText().toString() + ET4.getText().toString() + ET5.getText().toString() + ET6.getText().toString() + ET7.getText().toString() + ET8.getText().toString() + ET9.getText().toString();
                String errorMsg = "Guessed word not correct";
                String successMsg = "Guessed word is matching";
                Toast toast;

                if (enteredWord.equalsIgnoreCase(correctWord)) {
                    //should go to app
                    toast = Toast.makeText(getApplicationContext(),
                            successMsg,
                            Toast.LENGTH_SHORT);
                    Intent intent = new Intent(WordLockScreenImageActivity.this, GestureUnlockActivity.class);
                    intent.putExtra(AppConstants.LOCK_PACKAGE_NAME, pkgName);
                    intent.putExtra(AppConstants.LOCK_FROM, AppConstants.LOCK_FROM_FINISH);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();

                } else {
                    toast = Toast.makeText(getApplicationContext(),
                            errorMsg,
                            Toast.LENGTH_SHORT);
                }
                toast.show();
            }
        });

        mCheckBoxHelpEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckBoxHelpEye.isChecked()) {
                    mTextViewWord.setText(correctWord);
                } else {
                    mTextViewWord.setText("");
                }
            }
        });

    }
}