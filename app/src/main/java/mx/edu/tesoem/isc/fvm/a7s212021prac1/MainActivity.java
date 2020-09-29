package mx.edu.tesoem.isc.fvm.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtnombre = findViewById(R.id.txtnombre);
    }


    public void Pantalla1(View v){
        Intent intent = new Intent(this, frmuno.class);
        startActivity(intent);
    }

    public void Pantalla2(View v){
        Intent intent = new Intent(this, ParametroActivity.class);
        intent.putExtra("Nombre",txtnombre.getText().toString());
        startActivity(intent);


    }
}