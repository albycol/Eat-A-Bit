package col.alb.eatabit.activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import col.alb.eatabit.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginBtn;
    TextView registerBtn;

    EditText emailEt;
    EditText passwordEt;

    Switch switchDark;

    LinearLayout linearL;

    TextView textdarkm;

    final static int len_pass = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //initialize UI controller
        emailEt = findViewById(R.id.email_et);
        passwordEt = findViewById(R.id.password_et);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.register);
        //switchDark=findViewById(R.id.switchb);
        linearL=findViewById(R.id.linearl);
        //textdarkm=findViewById(R.id.text_dark);





        if (hasIvitationCode()) {
            registerBtn.setVisibility(View.VISIBLE);
        }

        loginBtn.setOnClickListener(this);
        registerBtn.setOnClickListener(this);

        //textdarkm.setOnClickListener(this);
       /* switchDark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    linearL.setBackgroundResource(R.color.dark);
                    textdarkm.setTextColor(getResources().getColor(R.color.light));
                    emailEt.setTextColor(getResources().getColor(R.color.light));
                    passwordEt.setTextColor(getResources().getColor(R.color.light));
                }
                else{
                    linearL.setBackgroundResource(R.color.light);
                    textdarkm.setTextColor(getResources().getColor(R.color.dark));
                    emailEt.setTextColor(getResources().getColor(R.color.dark));
                    passwordEt.setTextColor(getResources().getColor(R.color.dark));
                }
            }
        });*/


        Log.i("Main Activity", "Activity created");
    }

    private boolean hasIvitationCode() {
        return true;
    }

    private boolean checkEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



    @Override
    public void onClick(View view) {
        //TODO do something
        if (view.getId() == R.id.loginBtn) {
            if(doLogin()){
                /*Intent intent = new Intent(this, col.alb.eatabit.Welcome.class);
                intent.putExtra("email",emailEt.getText().toString());
                startActivity(intent);*/
            }
        }else if(view.getId()==R.id.register){
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);
        }
    }
    private boolean doLogin() {
        if (!(checkEmail(emailEt.getText().toString()))) {
            showText("Email non valida");
            return false;
        }

        if (!(passwordEt.getText().toString().length() > len_pass)) {
            showText("Password errata");
            return false;
        }

        showText("Email valida");
        return true;



    }
    private void showText(String str) {
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

}

