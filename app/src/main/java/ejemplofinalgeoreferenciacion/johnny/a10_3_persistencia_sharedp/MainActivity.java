package ejemplofinalgeoreferenciacion.johnny.a10_3_persistencia_sharedp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtApellido, txtEdad;
    SharedPreferences persitencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        txtEdad = (EditText) findViewById(R.id.txtEdad);

    }

    public void guardarDatos(View view) {
        persitencia = getSharedPreferences("usuario", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = persitencia.edit();
        editor.putString("nombre", txtNombre.getText().toString());
        editor.putString("apellido", txtApellido.getText().toString());
        editor.putInt("edad", Integer.parseInt(txtEdad.getText().toString()));
        editor.commit();
        //finish();
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
