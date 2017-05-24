package in.itwings.myapplication;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;
import android.widget.Toast;

public class MyService1 extends Service {
    double lati,longi;
    public MyService1() {
    }

    @Override

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {


        GPSTracker gpsT=new GPSTracker(this);
        lati = gpsT.getLatitude();
        longi=gpsT.getLongitude();
        Toast.makeText(getApplicationContext(), lati+""+longi,Toast.LENGTH_LONG).show();

    }
}