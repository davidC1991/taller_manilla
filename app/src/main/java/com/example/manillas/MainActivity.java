package com.example.manillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner SpnMaterial;
        Spinner SpnTipo;
        Spinner SpnDije;
        Spinner SpnMoneda;
        TextView valorUnidad;
        TextView valorPagar;

        valorUnidad=(TextView)findViewById(R.id.lblValorUnidad);
        valorPagar=(TextView) findViewById(R.id.lblvalorPagar);
        SpnMaterial=(Spinner)findViewById(R.id.spinnerMaterial);
        SpnDije=(Spinner)findViewById(R.id.spinnerDije);
        SpnTipo=(Spinner)findViewById(R.id.spinnerTipo);
        SpnMoneda=(Spinner)findViewById(R.id.spinnerMoneda);

        String [] opcMaterial={"Cuero","Cuerda"};
        String [] opcDije={"Martillo","Ancla"};
        String [] opcTipo={"Oro","Oro Rosado","Plata","Niquel"};
        String [] opcMoneda={"Dolar","Peso"};

        ArrayAdapter<String> adapterMaterial = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcMaterial);
        ArrayAdapter<String> adapterDije = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcDije);
        ArrayAdapter<String> adapterTipo = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcTipo);
        ArrayAdapter<String> adapterMoneda = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcMoneda);

        
    }
}
