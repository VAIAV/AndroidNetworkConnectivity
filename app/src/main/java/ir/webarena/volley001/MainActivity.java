package ir.webarena.volley001;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Context context;
    NetworkInfo networkInfo;
    TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (TextView) findViewById(R.id.myText);
        myText.setText("HEY");
        ConnectionDetector cd = new ConnectionDetector(this);
        if (cd.isNetworkAbailable()){
            myText.setText(cd.getConnectionType());
        } else {
            myText.setText("not connected");
        }
    }

}
