package id.or.codelabs.sidenavigation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences preferences =
                getSharedPreferences("my_preferences", MODE_PRIVATE);
        if(!preferences.getBoolean("walkthrough_complete", false)){

            Intent walkthrough = new Intent(this, Walkthrough.class);
            startActivity(walkthrough);

            finish();
            return;
        }
    }
}
