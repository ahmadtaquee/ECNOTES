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

public class sem4 extends AppCompatActivity {
    Bundle subject;
    Toolbar toolbar;
    Intent intent;
    private Button maths;
    private Button ec;
    private Button emft;
    private Button ds;
    private Button emi;
    private Button psycho;
    private Button hv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        maths = (Button) findViewById(R.id.maths);
        ec = (Button) findViewById(R.id.ec);
        emft = (Button) findViewById(R.id.emft);
        ds = (Button) findViewById(R.id.ds);
        emi = (Button) findViewById(R.id.emi);
        psycho = (Button) findViewById(R.id.psycho);
        hv = (Button) findViewById(R.id.hv);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "maths");
                startActivity(intent);
            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "ec");
                startActivity(intent);
            }
        });
        emft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "emft");
                startActivity(intent);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "ds");
                startActivity(intent);
            }
        });
        emi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "emi");
                startActivity(intent);
            }
        });
        psycho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "psycho");
                startActivity(intent);
            }
        });
        hv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                Intent intent = new Intent(sem4.this, unit.class);
                intent.putExtra("subject", "hv");
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
                intent = new Intent(sem4.this, about.class);
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
