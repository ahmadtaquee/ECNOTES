package akhil.com.ECNOTES;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class main extends AppCompatActivity {
    Toolbar toolbar;
    Intent intent;
    private Button sem3, sem4, btn_lateset_update;

    //private ArrayList<String> Sem5 = new ArrayList<String>();
    //private Intent intentSubject = new Intent();
    //private Intent intentsubjectsem4 = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initialize();

        //OnCreateOPtionMenu();
        // initializeLogic();
    }

    private void initialize() {
        sem3 = (Button) findViewById(R.id.btn_sem3);
        sem4 = (Button) findViewById(R.id.btn_sem4);
        btn_lateset_update = (Button) findViewById(R.id.btn_latest);
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                //intentSubject.setClass(getApplicationContext(), SubjectActivity.class);
                intent = new Intent(main.this, sem3.class);
                startActivity(intent);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                intent = new Intent(main.this, sem4.class);
                startActivity(intent);
            }
        });
        btn_lateset_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent = new Intent(main.this, update.class);
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
                intent = new Intent(main.this, about.class);
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
    /*
    private void initializeLogic() { }
    //Fri 21 Apr, 2017 at 16:29

    // created automatically
    private void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show(); }
    private int getRandom(int _minValue ,int _maxValue){ Random random = new Random();
        return random.nextInt(_maxValue - _minValue + 1) + _minValue; }
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) { ArrayList<Double> _result = new ArrayList<Double>(); SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx)) _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result; }*/
}