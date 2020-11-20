package ferry.julyo.wildriftmastery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import ferry.julyo.wildriftmastery.databinding.ActivityProfileDataBindingBinding;

public class ProfileActivity extends AppCompatActivity {



    private ActivityProfileDataBindingBinding activityProfileDataBindingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_data_binding);


        activityProfileDataBindingBinding= DataBindingUtil.setContentView(this,R.layout.activity_profile_data_binding);
        activityProfileDataBindingBinding.setDatabinding(getCurrentDataBinding());
    }

    private DataBinding getCurrentDataBinding(){
        DataBinding db = new DataBinding();
        db.setStudentName("Mohammad Ferry Julyo");
        db.setStudentNim("1941723008");
        db.setStudentMatkul("Pemograman Mobile");
        return db;
    }

    public void onClickBack(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}