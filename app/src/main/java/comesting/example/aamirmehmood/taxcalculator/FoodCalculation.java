package comesting.example.aamirmehmood.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FoodCalculation extends AppCompatActivity {
    String[] items=new String[] {"<Select Food Catageory>","bakery","Resturant","Dairy Product"};
    EditText etfoodprice;
    Button result;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_calculation);
        spinner = (Spinner) findViewById(R.id.spinnerfoodid);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
