package com.example.manillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Spinner SpnMaterial;
    private Spinner SpnTipo;
    private Spinner SpnDije;
    private Spinner SpnMoneda;
    private TextView valorUnidad;
    private TextView valorPagar;
    private TextView txtDivisa;
    private EditText cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        valorUnidad=(TextView)findViewById(R.id.lblValorUnidad);
        valorPagar=(TextView) findViewById(R.id.lblvalorPagar);
        txtDivisa=(TextView) findViewById(R.id.lblMonedaDetalle);
        cantidad=(EditText)findViewById(R.id.txtCantidad);
        SpnMaterial=(Spinner)findViewById(R.id.spinnerMaterial);
        SpnDije=(Spinner)findViewById(R.id.spinnerDije);
        SpnTipo=(Spinner)findViewById(R.id.spinnerTipo);
        SpnMoneda=(Spinner)findViewById(R.id.spinnerMoneda);

        String [] opcMaterial={getString(R.string.materialCuero),getString(R.string.materialCuerda)};
        String [] opcDije={getString(R.string.dijeMartillo),getString(R.string.dijeAncla)};
        String [] opcTipo={getString(R.string.tipoOro),getString(R.string.tipoOroRosado),getString(R.string.tipoPlata),getString(R.string.tipoNiquel)};
        String [] opcMoneda= {getString(R.string.monedaDolar), getString(R.string.monedaPeso)};

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
        int cant=1,valUnidad=0,peso=3200;
        boolean divisa=false;
        String materialSel=SpnMaterial.getSelectedItem().toString();
        String dijeSel=SpnDije.getSelectedItem().toString();
        String tipoSel=SpnTipo.getSelectedItem().toString();
        String monedaSel=SpnMoneda.getSelectedItem().toString();

        int valTotal;
        if(!cantidad.getText().toString().isEmpty()) {
            cant = Integer.parseInt(cantidad.getText().toString());


            //---------------------------------------------------
            if (monedaSel.equals(getString(R.string.monedaDolar))) {
                divisa = true;
                txtDivisa.setText(R.string.dolaresDivisa);
            } else if (monedaSel.equals(getString(R.string.monedaPeso))) {
                divisa = false;
                txtDivisa.setText(R.string.pesosDivisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && (tipoSel.equals(getString(R.string.tipoOro)) || tipoSel.equals(getString(R.string.tipoOroRosado)))
            ) {

                calcularTotal(cant, 100, divisa);

            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && tipoSel.equals(getString(R.string.tipoPlata))
            ) {

                calcularTotal(cant, 80, divisa);

            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && tipoSel.equals(getString(R.string.tipoNiquel))
            ) {
                calcularTotal(cant, 70, divisa);

            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && (tipoSel.equals(getString(R.string.tipoOro)) || tipoSel.equals(getString(R.string.tipoOroRosado)))
            ) {
                calcularTotal(cant, 120, divisa);

            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && tipoSel.equals(getString(R.string.tipoPlata))
            ) {
                calcularTotal(cant, 100, divisa);

            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuero))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && tipoSel.equals(getString(R.string.tipoNiquel))
            ) {
                calcularTotal(cant, 90, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && (tipoSel.equals(getString(R.string.tipoOro)) || tipoSel.equals(getString(R.string.tipoOroRosado)))
            ) {
                calcularTotal(cant, 90, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && tipoSel.equals(getString(R.string.tipoPlata))
            ) {
                calcularTotal(cant, 70, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeMartillo))
                    && tipoSel.equals(getString(R.string.tipoNiquel))
            ) {
                calcularTotal(cant, 50, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && (tipoSel.equals(getString(R.string.tipoOro)) || tipoSel.equals(getString(R.string.tipoOroRosado)))
            ) {
                calcularTotal(cant, 110, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && tipoSel.equals(getString(R.string.tipoPlata))
            ) {
                calcularTotal(cant, 90, divisa);
            }
            //---------------------------------------------------
            if (materialSel.equals(getString(R.string.materialCuerda))
                    && dijeSel.equals(getString(R.string.dijeAncla))
                    && tipoSel.equals(getString(R.string.tipoNiquel))
            ) {
                calcularTotal(cant, 80, divisa);
            }
        }else{
            Toast.makeText(this, R.string.ingresarCantidad,Toast.LENGTH_SHORT).show();
        }
    }

    public void calcularTotal(int cant, int valUnidad, boolean divisa){
        int val,valTotal;

        if(divisa) {
            val = valUnidad;
        }else{
            val=valUnidad*3200;
        }
        valTotal=val*cant;
        valorUnidad.setText("" +valUnidad);
        valorPagar.setText("" +valTotal);


    }

}
