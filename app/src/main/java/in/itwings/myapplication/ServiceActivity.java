package in.itwings.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
       //Toast.makeText(getApplicationContext(), "inside service activity",Toast.LENGTH_LONG).show();

        startService(new Intent(this, MyService1.class));

    }
}
