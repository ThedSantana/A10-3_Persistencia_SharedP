package ejemplofinalgeoreferenciacion.johnny.a10_3_persistencia_sharedp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView lblMensaje;
    SharedPreferences persistencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        lblMensaje = (TextView) findViewById(R.id.lblMensaje);
        cargarInformacion();

    }

    public void cargarInformacion() {
        persistencia = getSharedPreferences("usuario", Context.MODE_PRIVATE);
        lblMensaje.setText("Se almaceno el usuario con nombre "
                + persistencia.getString("nombre", "") + " "
                + persistencia.getString("apellido", "") + " y con "
                + persistencia.getInt("edad", 0) + " años");
    }


}
