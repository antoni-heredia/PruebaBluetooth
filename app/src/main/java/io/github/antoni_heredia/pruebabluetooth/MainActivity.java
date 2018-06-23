package io.github.antoni_heredia.pruebabluetooth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter bAdapter;
    Button btnBuscar = (Button) findViewById(R.id.btnBuscar);
    Spinner spnBluetooth = (Spinner) findViewById(R.id.spnBluetooth);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bAdapter = BluetoothAdapter.getDefaultAdapter();
        if(bAdapter == null)
        {
            btnBuscar.setEnabled(false);
            spnBluetooth.setEnabled(false);
        }

    }

    public void btnBuscarOnclick(View v){

    }


}
