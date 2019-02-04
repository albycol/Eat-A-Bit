package col.alb.eatabit.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

import col.alb.eatabit.R;

public class Register extends AppCompatActivity implements TextWatcher {

    EditText emailEt;
    EditText passwordEt;
    EditText phoneEt;
    Button signinBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        emailEt = findViewById(R.id.mail1);
        emailEt.addTextChangedListener(this);
        passwordEt = findViewById(R.id.password);
        passwordEt.addTextChangedListener(this);
        phoneEt = findViewById(R.id.phonenumb);
        phoneEt.addTextChangedListener(this);
        signinBtn = findViewById(R.id.signin);


        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private boolean checkEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean checkPhone(String ph) {
        return Patterns.PHONE.matcher(ph).matches();
    }

    private void validate() {
        String e = emailEt.getText().toString();
        String p = passwordEt.getText().toString();
        String ph = phoneEt.getText().toString();
        if (checkEmail(e) && p.length() > 6 && checkPhone(ph)) {
            signinBtn.setEnabled(true);

        } else {
            signinBtn.setEnabled(false);
        }
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        validate();
    }
}
