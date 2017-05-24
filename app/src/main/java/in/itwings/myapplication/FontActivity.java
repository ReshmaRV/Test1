package in.itwings.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FontActivity extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);
        tx = (TextView)findViewById(R.id.text1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Black.ttf");
        tx.setTypeface(custom_font);
    }
}
