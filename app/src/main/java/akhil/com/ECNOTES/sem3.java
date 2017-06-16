package akhil.com.ECNOTES;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class sem3 extends AppCompatActivity {
    Toolbar toolbar;
    Intent intent;
    private Button nas, cyber, socio, elective, signal, fed, stld;

    //  private Intent intentstldunits = new Intent(); private Intent intentfedunits = new Intent(); private Intent intentsignalunit = new Intent(); private Intent intentnetworkunit = new Intent(); private Intent intentcyberunit = new Intent(); private Intent intentsociounit = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        stld = (Button) findViewById(R.id.stld);
        fed = (Button) findViewById(R.id.fed);
        signal = (Button) findViewById(R.id.signal);
        nas = (Button) findViewById(R.id.nas);
        cyber = (Button) findViewById(R.id.cyber);
        socio = (Button) findViewById(R.id.socio);
        elective = (Button) findViewById(R.id.elective);
        stld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "stld");
                startActivity(intent);
            }
        });
        fed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {

                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "fed");
                startActivity(intent);
            }
        });
        signal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "signal");
                startActivity(intent);
            }
        });
        nas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "nas");
                startActivity(intent);
            }
        });
        cyber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "cyber");
                startActivity(intent);
            }
        });
        socio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "socio");
                startActivity(intent);
            }
        });
        elective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {

                Intent intent = new Intent(sem3.this, unit.class);
                intent.putExtra("subject", "elective");
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
                intent = new Intent(sem3.this, about.class);
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

    private void initializeLogic() {
    }

    // created automatically
    private void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    private int getRandom(int _minValue, int _maxValue) {
        Random random = new Random();
        return random.nextInt(_maxValue - _minValue + 1) + _minValue;
    }

    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx)) _result.add((double) _arr.keyAt(_iIdx));
        }
        return _result;
    }
}
