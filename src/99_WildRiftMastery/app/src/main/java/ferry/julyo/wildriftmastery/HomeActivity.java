package ferry.julyo.wildriftmastery;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private ImageButton aboutUs;

    Intent pindah;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        aboutUs =(ImageButton) findViewById(R.id.aboutUs);

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(pindah);
                finish();
            }
        });

}
}
