package ir.webarena.volley001;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by r.mazarei on 11/1/2016.
 */
public class ConnectionDetector {
    private Context context;
    String connectionType;

    public ConnectionDetector(Context context) {
        this.context = context;
    }

    public boolean isNetworkAbailable(){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            this.connectionType = networkInfo.getTypeName();
            return true;
        }
        return false;
    }

    public String getConnectionType() {
        return connectionType;
    }
}
