package pe.com.android.aprendiendoandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {
    String operador, mostrar , reserva="";
    Double resultado;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btnUno = (Button)findViewById(R.id.Uno);
        Button btnDos = (Button)findViewById(R.id.Dos);
        Button  btnTres = (Button)findViewById(R.id.Tres);
        Button btnCuatro = (Button)findViewById(R.id.Cuatro);
        Button btnCinco = (Button)findViewById(R.id.Cinco);
        Button btnSeis = (Button)findViewById(R.id.Seis);
        Button btnSiete = (Button)findViewById(R.id.Siete);
        Button btnOcho = (Button)findViewById(R.id.Ocho);
        Button btnNueve = (Button)findViewById(R.id.Nueve);
        Button btnSuma = (Button)findViewById(R.id.Suma);
        Button btnResta = (Button)findViewById(R.id.Resta);
        Button btnMultiplica = (Button)findViewById(R.id.Multiplica);
        Button btnDivide = (Button)findViewById(R.id.Divide);
        Button btnClean = (Button)findViewById(R.id.Clean);
        Button btnBorrar = (Button)findViewById(R.id.Borrar);
        final TextView Resultado = (TextView)findViewById(R.id.Etiqueta);
        Button btnPunto = (Button)findViewById(R.id.Punto);
        Button btnIgual = (Button)findViewById(R.id.Igual);

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if (Resultado.getText().toString().length()>0) {
                    reserva = Resultado.getText().toString();
                    operador = "+";
                    Resultado.setText("");
                }else{
                    Toast.makeText(Calculadora.this,"Ingrese un numero",Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if (Resultado.getText().toString().length()>0) {
                    reserva = Resultado.getText().toString();
                    operador = "-";
                    Resultado.setText("");
                }else{
                    Toast.makeText(Calculadora.this,"Ingrese un numero",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
                Resultado.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (Resultado.getText().toString().length()>0) {
                    mostrar = Resultado.getText().toString();
                    mostrar = mostrar.substring(0, mostrar.length() - 1);
                    Resultado.setText(mostrar);
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });

    }
}