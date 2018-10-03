package l.com.ldk.duykhanh.bestui.LOGIN;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import l.com.ldk.duykhanh.bestui.R;

public class LoginPageActivity extends AppCompatActivity {

    TextView signin,signup,signin_signup_txt,forgot_password;
    CircleImageView circleImageView;
    Button btnSingIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        signin_signup_txt = findViewById(R.id.signin_signup_txt);
        forgot_password = findViewById(R.id.forgot_password);
        circleImageView = findViewById(R.id.circleImageView);
        btnSingIn = findViewById(R.id.btnSingIn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin.setTextColor(Color.parseColor("#FFFFFF"));
                signin.setBackgroundColor(Color.parseColor("#d21515"));
                signup.setTextColor(Color.parseColor("#d21515"));
                signup.setBackgroundResource(R.drawable.bordershape);
                circleImageView.setImageResource(R.drawable.sigin_boy_img);
                signin_signup_txt.setText("Sign In");
                btnSingIn.setText("Sign In");
                forgot_password.setVisibility(View.VISIBLE);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup.setTextColor(Color.parseColor("#ffffff"));
                signup.setBackgroundColor(Color.parseColor("#d21515"));
                signin.setTextColor(Color.parseColor("#d21515"));
                signin.setBackgroundResource(R.drawable.bordershape);
                circleImageView.setImageResource(R.drawable.sigup_boy_img);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
Intent intent = new Intent(LoginPageActivity.this,RegistrationActivity.class);
startActivity(intent);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                signin.setTextColor(Color.parseColor("#FFFFFF"));
                                signin.setBackgroundColor(Color.parseColor("#d21515"));
                                signup.setTextColor(Color.parseColor("#d21515"));
                                signup.setBackgroundResource(R.drawable.bordershape);
                                circleImageView.setImageResource(R.drawable.sigin_boy_img);
                                signin_signup_txt.setText("Sign In");
                                btnSingIn.setText("Sign In");
                                forgot_password.setVisibility(View.VISIBLE);
                            }
                        }, 1000);
                    }
                }, 500);

            }
        });

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPageActivity.this,NavigationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
