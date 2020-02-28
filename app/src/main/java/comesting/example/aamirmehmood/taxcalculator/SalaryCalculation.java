package comesting.example.aamirmehmood.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class SalaryCalculation extends AppCompatActivity
{
    String[] items=new String[] {"<Select Duration>","Yearly"};
    EditText etsalary;
    Button result;
    Spinner spinner;
    //////////////////////////////////////////AAMIR    MEHMOOOD////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary_calculation);
        //add valuse in spinner
         spinner = (Spinner) findViewById(R.id.spinnersalaryid);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String sr=spinner.getSelectedItem().toString();
                if (spinner.getItemAtPosition(i).equals("<Select Duration>")){
                    Toast.makeText(SalaryCalculation.this,"please Select Duration",Toast.LENGTH_SHORT).show();

                }else if (spinner.getItemAtPosition(i).equals("Yearly")){
                    Toast.makeText(SalaryCalculation.this,"Year",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });





        etsalary=findViewById(R.id.etsalaryid);


        //click on btn
        result=findViewById(R.id.calbtnid);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               CalculateTax();
            }
        });


    }

    private void CalculateTax() {

        try {
            if(etsalary.getText().toString().trim().equalsIgnoreCase("")){
                etsalary.setError("Enter Salary Here");
                Toast.makeText(SalaryCalculation.this,"Please enter Salary...",Toast.LENGTH_SHORT).show();
            }else {
                Double a = Double.parseDouble(etsalary.getText().toString());
                if (a<=600000 ) {
                    //below 6 lakh no tax
                    Toast.makeText(SalaryCalculation.this, "no tax", Toast.LENGTH_SHORT).show();
                }else if(a>=600000 ){
                    //above 6 lakh 5 percent tax




                    double tax = (5*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=1200000){
                    //above 12 lakh 10 percent tax




                    double tax = (10*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=1800000){
                    //above 18 lakh 15 percent tax




                    double tax = (15*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=2500000 ){
                    //above 25 lakh 17.5 percent tax




                    double tax = (17.5*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=3500000 ){
                    //above 35 lakh 20 percent tax




                    double tax = (20*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=5000000 ){
                    //above 50 lakh 22.5 percent tax




                    double tax = (22.5*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=8000000  ){




                    double tax = (25*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=12000000  ){
                    //caryyy on tax




                    double tax = (27.5*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=30000000 ){




                    double tax = (30*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=50000000 ){




                    double tax = (32.5*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }else if(a>=75000000 ){




                    double tax = (35*a)/100;


                    Log.e("1","a=" +a);

                    Log.e("3","tax=" +tax);

                    TextView etShowtax = findViewById(R.id.showtaxid);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    etShowtax.setText(nm.format(tax));
                }





            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
