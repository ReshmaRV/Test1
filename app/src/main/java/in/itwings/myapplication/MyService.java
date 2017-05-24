package in.itwings.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    Double lati,longi;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        GPSTracker gpsT=new GPSTracker(this);
        lati = gpsT.getLatitude();
        longi=gpsT.getLongitude();
        Toast.makeText(getApplicationContext(), lati+""+longi,Toast.LENGTH_LONG).show();
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
