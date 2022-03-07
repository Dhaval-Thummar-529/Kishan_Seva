package com.dhaval.kishanseva.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dhaval.kishanseva.MainActivity;
import com.dhaval.kishanseva.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
        mAuth = FirebaseAuth.getInstance();
    }

    public void register(View view) {
        replaceFragment(new RegistrationFragment());
    }

    public void login(View view) {
        replaceFragment(new LoginFragment());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.flContainer, fragment);
        fr.isAddToBackStackAllowed();
        fr.commit();
        register.setVisibility(View.GONE);
        login.setVisibility(View.GONE);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
            finish();
        }
    }

}