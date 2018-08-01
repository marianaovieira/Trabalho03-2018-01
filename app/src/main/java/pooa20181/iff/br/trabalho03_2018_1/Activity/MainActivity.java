package pooa20181.iff.br.trabalho03_2018_1.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pooa20181.iff.br.trabalho03_2018_1.R;

public class MainActivity extends AppCompatActivity {

    Button btOficina =(Button) findViewById(R.id.btnOficina);
    Button btMecanico = (Button) findViewById(R.id.btnMecanico);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btOficina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ListaOficina.class);
                startActivity(intent);
            }
        });

        btMecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ListaMecanico.class);
                startActivity(intent);
            }
        });


    }




    private Context getContext(){
        return this;
    }
}
