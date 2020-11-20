package ferry.julyo.wildriftmastery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.databinding.DataBindingUtil;
import ferry.julyo.wildriftmastery.ActivityMainBinding;



public class DataBinding extends Activity {
    private ImageButton btnChampion, btnItem, btnVoice, btnWallpaper;

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChampion = (ImageButton) findViewById(R.id.btnCham);
        btnItem = (ImageButton) findViewById(R.id.btnItem);
        btnVoice = (ImageButton) findViewById(R.id.btnVoice);
        btnWallpaper = (ImageButton) findViewById(R.id.btnWall);

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutFragment();
            }
        });



        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setChampion(getCurrentTitle());
        activityMainBinding.setItem(getCurrentTitle());
        activityMainBinding.setVoice(getCurrentTitle());
    }

    public void AboutFragment(){
        Intent intent = new Intent(this, AboutFragment.class);
        startActivity(intent);
    }

    private Title getCurrentTitle(){
        Title title = new Title();
        title.setBtnChampName("Champion");
        title.setBtnItemName("Item");
        title.setBtnVoiceName("Voice");
        title.setBtnWallName("Wallpapers");
        return title;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

