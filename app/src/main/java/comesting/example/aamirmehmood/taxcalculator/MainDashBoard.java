package comesting.example.aamirmehmood.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainDashBoard extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dash_board);
        CardView cardView1=findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainDashBoard.this,CarCalculation.class);
                startActivity(intent);
                Toast.makeText(MainDashBoard.this, "Fisrt", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainDashBoard.this, "Fisrt", Toast.LENGTH_SHORT).show();



                Toast.makeText(MainDashBoard.this, "Fisrt", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainDashBoard.this, "Fisrt", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
