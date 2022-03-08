package com.cursoandroid.app4alcoolougasolina;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        String textAlcool = Objects.requireNonNull(((TextInputEditText) findViewById(R.id.textAlcool)).getText()).toString();
        String textGasolina = Objects.requireNonNull(((TextInputEditText) findViewById(R.id.textGasolina)).getText()).toString();
        TextView textResultado = findViewById(R.id.textResultado);

        if(!textAlcool.isEmpty() && !textGasolina.isEmpty()){
            double doubleAlcool = Double.parseDouble(textAlcool);
            double doubleGasolina = Double.parseDouble(textGasolina);
            double resultado = doubleAlcool/doubleGasolina;

            textResultado.setText((resultado >= 0.7)? "Melhor Gasolina": "Melhor Alcool");
        }else {
            textResultado.setText("Preencha ambos os campos");
        }
    }
}