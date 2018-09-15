package singh.rahul.com.app53;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgNetworkType;
    Button btnGetNetworkStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imgNetworkType =(ImageView) findViewById(R.id.imgNetworkType);
    btnGetNetworkStatus = (Button) findViewById(R.id.btnGetNetworkStatus);
    btnGetNetworkStatus.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {

int statusinfo = NetworkInfo.getNetworkStatus(MainActivity.this);
if(statusinfo == 1)
{
    imgNetworkType.setImageDrawable(getResources().getDrawable(R.drawable.wifiinternet));

    Toast.makeText(MainActivity.this, "wifi internet", Toast.LENGTH_SHORT).show();

}
else if(statusinfo == 0)
{
    imgNetworkType.setImageDrawable(getResources().getDrawable(R.drawable.mobileinternet));
    Toast.makeText(MainActivity.this, "Moblie Internet", Toast.LENGTH_SHORT).show();
}
else {
    imgNetworkType.setImageDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
    Toast.makeText(MainActivity.this, "Unknown", Toast.LENGTH_SHORT).show();
}

    }
}
