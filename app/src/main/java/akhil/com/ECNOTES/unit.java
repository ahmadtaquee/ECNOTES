package akhil.com.ECNOTES;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class unit extends AppCompatActivity {
    Toolbar toolbar;
    private Button btnunit1, btnunit2, btnunit3, btnunit4, btnunit5;
    private String unit1 = "aa", unit2 = "", unit3 = "cc", unit4 = "dd", unit5 = "ss";
    private Intent intent = new Intent(Intent.ACTION_VIEW);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Bundle sbb = getIntent().getExtras();
        String subject = sbb.getString("subject");
        Toast.makeText(this, subject, Toast.LENGTH_LONG).show();
        btnunit1 = (Button) findViewById(R.id.button1);
        btnunit2 = (Button) findViewById(R.id.button2);
        btnunit3 = (Button) findViewById(R.id.button3);
        btnunit4 = (Button) findViewById(R.id.button4);
        btnunit5 = (Button) findViewById(R.id.button5);
        if (subject.equals("maths")) {
            unit1 = "a";
            unit2 = "http://www.google.com";
            unit3 = "http://drive.google.com/file/d/0B4Ea9nQibE0URVRHdWdaZmVxZVE/view?usp=drivesdk";
            unit4 = "http://goo.gl/SKAINX";
            unit5 = "d";
        } else if (subject.equals("ec")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("emft")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("ds")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("emi")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("psycho")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("hv")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("stld")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("fed")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("signal")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("nas")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("cyber")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else if (subject.equals("socio")) {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        } else {
            unit1 = "";
            unit2 = "";
            unit3 = "";
            unit4 = "";
            unit5 = "";
        }
        btnunit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse(unit1));
                Toast.makeText(unit.this, "hello", Toast.LENGTH_LONG).show();
                //startActivity(intent);

            }
        });
        btnunit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        btnunit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse(unit3));
                startActivity(intent);

            }
        });
        btnunit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse(unit4));
                startActivity(intent);

            }
        });
        btnunit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse(unit5));
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about: {
                intent = new Intent(unit.this, about.class);
                startActivity(intent);
                return true;
            }
            case R.id.action_share:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.applink));
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            //case R.id.action_share
        }
        return true;
    }


}
