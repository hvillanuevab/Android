package pe.com.android.aprendiendoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button btnCalculadora= findViewById(R.id.btnCalculadora);
        Button btnBotton= findViewById(R.id.btnBotton);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Calculadora.class);
                startActivity(intent);
            }
        });

        btnBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(
                        MainActivity.this,
                        BottonActivity.class);
                startActivity(intent);
            }
        });



    }
}
