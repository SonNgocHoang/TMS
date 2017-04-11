package tms.com.libre.tms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.libre.mylibs.MyUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcLogin extends AppCompatActivity implements View.OnClickListener {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_login);
        init();
    }

    public void init() {
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                break;
        }
    }

    public void actionLogin() {
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();
        if (email.equals("")) {
            MyUtils.showToast(getApplicationContext(), getResources().getString(R.string.email_empty));
        } else if (password.equals("")) {
            MyUtils.showToast(getApplicationContext(), getResources().getString(R.string.password_empty));
        } else if(!isValidEmail(email)){
            MyUtils.showToast(getApplicationContext(), getResources().getString(R.string.invalid_email));
        }else{
            loginFinal();
        }
    }

    public void loginFinal(){

    }

    private boolean isValidEmail(String emailInput) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailInput);
        return matcher.matches();
    }

}
