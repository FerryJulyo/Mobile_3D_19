# Laporan Kuis # 2


![Logo Polinema](polinema.png)<br>



### Splash Screen

1. .<br>
   
   ![contoh screenshot](1.png)<br>


<br><br>
### Navigation and Data Binding

1. DataBinding.java<br>

package ferry.julyo.wildriftmastery;

public class DataBinding {
    private String Name;
    private String Nim;
    private String Matkul;
    private String Akun;

    public DataBinding(String Name,String Matkul, String Akun, String Nim){
        this.Name = Name;
        this.Nim = Nim;
        this.Matkul = Matkul;
        this.Akun = Akun;
    }

    public DataBinding(){

    }

    public String getName() {

        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getAkun() {

        return Akun;
    }

    public void setAkun(String Akun){
        this.Akun = Akun;
    }

    public String getMatkul(){
        return Matkul;
    }

    public void setMatkul(String Matkul){
        this.Matkul = Matkul;
    }
}


2. ProfileAcivity.java<br>

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
        setContentView(R.layout.about_us);


        activityProfileDataBindingBinding= DataBindingUtil.setContentView(this,R.layout.about_us);
        activityProfileDataBindingBinding.setDatabinding(getCurrentDataBinding());
    }

    private DataBinding getCurrentDataBinding(){
        DataBinding db = new DataBinding();
        db.setName("Mohammad Ferry Julyo");
        db.setNim("1941723008");
        db.setMatkul("Pemograman Mobile");
        return db;
    }

    public void onClickBack(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}


3. home_activity.xml<br><!-- 

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/background"
    android:orientation="vertical">


    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <include layout="@layout/header_activity"></include>

        <LinearLayout
            android:id="@+id/header"
            android:layout_width="match_parent"
            android:layout_height="80dp"
            android:orientation="vertical"
            android:background="@color/panelGelap"
            android:clickable="true">

            <ImageView
                android:id="@+id/logoHeader"
                android:layout_width="wrap_content"
                android:layout_marginBottom="10dp"
                android:layout_height="wrap_content"
                android:scaleType="centerInside"
                app:srcCompat="@drawable/logo" />

        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_below="@id/header"
            android:layout_marginTop="7dp"
            android:background="@color/panelAbu"
            android:orientation="horizontal"
            android:id="@+id/champion"
            >

            <ImageButton
                android:id="@+id/btnCham"
                android:layout_width="117dp"
                android:layout_height="wrap_content"
                android:layout_gravity="left"
                android:layout_marginLeft="5dp"
                android:layout_marginRight="50dp"
                android:backgroundTint="#00FFFFFF"
                android:scaleType="centerInside"
                app:srcCompat="@drawable/hero"></ImageButton>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Champion"
                android:layout_gravity="center"
                android:textSize="33dp"
                android:textColor="@color/text"
                ></TextView>

        </LinearLayout>


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_below="@id/champion"
            android:layout_marginTop="7dp"
            android:background="@color/panelAbu"
            android:orientation="horizontal"
            android:id="@+id/item"
            >

            <ImageButton
                android:id="@+id/btnItem"
                android:layout_width="117dp"
                android:layout_height="wrap_content"
                android:layout_gravity="left"
                android:layout_marginLeft="5dp"
                android:layout_marginRight="50dp"
                android:backgroundTint="#00FFFFFF"
                android:scaleType="centerInside"
                app:srcCompat="@drawable/item"></ImageButton>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Item"
                android:layout_gravity="center"
                android:textSize="33dp"
                android:textColor="@color/text"
                ></TextView>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_below="@id/item"
            android:layout_marginTop="7dp"
            android:background="@color/panelAbu"
            android:orientation="horizontal"
            android:id="@+id/voice"
            >

            <ImageButton
                android:id="@+id/btnVoice"
                android:layout_width="117dp"
                android:layout_height="wrap_content"
                android:layout_gravity="left"
                android:layout_marginLeft="5dp"
                android:layout_marginRight="50dp"
                android:backgroundTint="#00FFFFFF"
                android:scaleType="centerInside"
                app:srcCompat="@drawable/sound"></ImageButton>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Voice"
                android:layout_gravity="center"
                android:textSize="33dp"
                android:textColor="@color/text"
                ></TextView>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_below="@id/voice"
            android:layout_marginTop="7dp"
            android:background="@color/panelAbu"
            android:orientation="horizontal"
            android:id="@+id/wallpapers"
            >

            <ImageButton
                android:id="@+id/btnWall"
                android:layout_width="117dp"
                android:layout_height="wrap_content"
                android:layout_gravity="left"
                android:layout_marginLeft="5dp"
                android:layout_marginRight="50dp"
                android:backgroundTint="#00FFFFFF"
                android:scaleType="centerInside"
                app:srcCompat="@drawable/wildrift"></ImageButton>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Item"
                android:layout_gravity="center"
                android:textSize="33dp"
                android:textColor="@color/text"
                ></TextView>

        </LinearLayout>

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="bottom">

            <include layout="@layout/footer_activity"></include>
        </RelativeLayout>

    </RelativeLayout>

</androidx.constraintlayout.widget.ConstraintLayout>

 -->

4. about_us.xml<br>
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>
        <variable
            name="databinding"
            type="ferry.julyo.wildriftmastery.DataBinding" />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/background"
        tools:context=".ProfileActivity">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/cardview_shadow_start_color"
            android:onClick="onClickBack"
            android:padding="10dp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">

            <ImageView
                android:id="@+id/back1"
                android:layout_width="25dp"
                android:layout_height="25dp"
                android:layout_marginTop="1dp"
                android:layout_marginLeft="10dp"
                android:src="@drawable/kembali"/>

            <Space
                android:id="@+id/space1"
                android:layout_width="10dp"
                android:layout_height="wrap_content"
                android:layout_toRightOf="@+id/back1"/>

            <TextView
                android:id="@+id/kembali1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_toRightOf="@id/space1"
                android:text="Kembali"
                android:textColor="@color/text"
                android:textSize="16sp"/>
        </RelativeLayout>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="60dp"
            android:gravity="center"
            android:text="About Us"
            android:textColor="@color/text"
            android:textSize="30sp"
            android:textStyle="bold"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_marginBottom="304dp"
            android:alignmentMode="alignMargins"
            android:background="@color/text"
            android:columnOrderPreserved="false"
            android:orientation="vertical"
            android:padding="14dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_editor_absoluteX="0dp"
            tools:layout_editor_absoluteX="0dp">

            <LinearLayout
                android:id="@+id/lay1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:gravity="center"
                android:orientation="vertical">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="Nama :"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />

                <TextView
                    android:id="@+id/tvStudentName"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="@{databinding.studentName}"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:gravity="center"
                android:orientation="vertical"
                app:layout_constraintTop_toTopOf="@id/lay1">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="NIM :"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />>

                <TextView
                    android:id="@+id/tvStudentNim"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="@{databinding.studentNim}"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:gravity="center"
                android:orientation="vertical"
                app:layout_constraintTop_toTopOf="@id/lay1">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="Mata Kuliah :"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />>

                <TextView
                    android:id="@+id/tvStudentMatkul"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:text="@{databinding.studentMatkul}"
                    android:textColor="#000"
                    android:textSize="20sp"
                    android:textStyle="bold" />
            </LinearLayout>

        </LinearLayout>

    </androidx.constraintlayout.widget.ConstraintLayout>

</layout>


<br><br>![contoh screenshot](2.png)<br>

<br><br>![contoh screenshot](4.png)<br>



<br><br>
### Without Data Binding

1. .<br>
   
   ![contoh screenshot](3.png)<br>




				
<br><br>
### Task : 2

Perbedaan data binding dengan view model adalah data binding memungkinkan mengikat komponen UI dalam tata letak ke sumber data di aplikasi menggunakan format deklaratif, bukan secara terprogram. Dengan mengikat komponen dalam file tata letak dapat menghapus banyak panggilan framework UI dalam aktivitas,yang menjadikannya lebih sederhana dan lebih mudah dikelola. 
<br>
Data binding dan view model digunakan ketika untuk menyimpan dan mengelola data terkait UI.<br>
Reference : modul library binding




<br><br>
### Task : 3
   
Fragment merupakan bagian dari sebuah activity yang mana sebuah fragment tidak akan ada bila tidak ada sebuah activity karena fragment membutuhkan akses dari activity untuk dapat dijalankan.<br>
Salah satu perbedaan utama antara activity dan fragment adalah bahwa ketika activity berada dalam status di background, activity tersebut ditempatkan dalam tumpukan di bawah. Hal ini memungkinkan suatu activity untuk dilanjutkan kembali (resume) ketika user menekan tombol 'Back'. Sebaliknya fragment tidak otomatis ditempatkan di tumpukan bawah ketika berada dalam status background.<br>

Kita bisa menggunakan activity untuk menampilkan user interface (UI), melakukan berbagai kegiatan yang diperlukan di dalam aplikasi tersebut seperti berpindah dari satu tampilan ke tampilan lainnya, menjalankan program lain, dll<br>
Reference : https://socs.binus.ac.id/2017/09/26/activity-dan-fragment-di-android-studio/#:~:text=Fragment%20merupakan%20bagian%20dari%20sebuah,dari%20activity%20untuk%20dapat%20dijalankan.<br>
https://www.jodemy.com/2018/03/tanya-jawab-activity-fragment-dan-intent.html

   
   

### Mohammad Ferry Julyo, 2020