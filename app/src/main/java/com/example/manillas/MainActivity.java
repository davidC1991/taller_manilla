package com.example.manillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Spinner SpnMaterial;
    private Spinner SpnTipo;
    private Spinner SpnDije;
    private Spinner SpnMoneda;
    private TextView valorUnidad;
    private TextView valorPagar;
    private EditText cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        valorUnidad=(TextView)findViewById(R.id.lblValorUnidad);
        valorPagar=(TextView) findViewById(R.id.lblvalorPagar);
        cantidad=(EditText)findViewById(R.id.txtCantidad);
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

        SpnMaterial.setAdapter(adapterMaterial);
        SpnDije.setAdapter(adapterDije);
        SpnTipo.setAdapter(adapterTipo);
        SpnMoneda.setAdapter(adapterMoneda);


    }

    public void calcular(View v){
        int cant=1,valUnidad,peso=3200;
        boolean divisa=false;
        String materialSel=SpnMaterial.getSelectedItem().toString();
        String dijeSel=SpnDije.getSelectedItem().toString();
        String tipoSel=SpnTipo.getSelectedItem().toString();
        String monedaSel=SpnMoneda.getSelectedItem().toString();

        int valTotal;

        cant=Integer.parseInt(cantidad.getText().toString());
        //---------------------------------------------------
        if(monedaSel.equals("Dolar")){
            divisa=true;
        }else if(monedaSel.equals("Peso")){
            divisa=false;
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
           &&dijeSel.equals("Martillo")
           &&(tipoSel.equals("Oro")||tipoSel.equals("Oro Rosado"))
        ){
            valUnidad=100;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
                &&dijeSel.equals("Martillo")
                &&tipoSel.equals("Plata")
        ){

            valUnidad=80;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
                &&dijeSel.equals("Martillo")
                &&tipoSel.equals("Niquel")
        ){
            valUnidad=70;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
                &&dijeSel.equals("Ancla")
                &&(tipoSel.equals("Oro")||tipoSel.equals("Oro Rosado"))
        ){
            valUnidad=120;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
                &&dijeSel.equals("Ancla")
                &&tipoSel.equals("Plata")
        ){
            valUnidad=100;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuero")
                &&dijeSel.equals("Ancla")
                &&tipoSel.equals("Niquel")
        ){
            valUnidad=90;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Martillo")
                &&(tipoSel.equals("Oro")||tipoSel.equals("Oro Rosado"))
        ){
            valUnidad=90;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Martillo")
                &&tipoSel.equals("Plata")
        ){
            valUnidad=70;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Martillo")
                &&tipoSel.equals("Niquel")
        ){
            valUnidad=50;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Ancla")
                &&(tipoSel.equals("Oro")||tipoSel.equals("Oro Rosado"))
        ){
            valUnidad=110;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Ancla")
                &&tipoSel.equals("Plata")
        ){
            valUnidad=90;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
        //---------------------------------------------------
        if(materialSel.equals("Cuerda")
                &&dijeSel.equals("Ancla")
                &&tipoSel.equals("Niquel")
        ){
            valUnidad=80;
            valTotal=calcularTotal(valUnidad,cant);
            valorUnidad.setText("" +valUnidad);
            valorPagar.setText("" +valTotal);
        }
    }

    public int calcularTotal(int valorUnidad, int total){
        return valorUnidad*total;
    }

}
