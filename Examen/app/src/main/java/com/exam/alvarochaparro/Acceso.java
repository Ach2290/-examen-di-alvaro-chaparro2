package com.exam.alvarochaparro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    Button boton = findViewById(R.id.button3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Acceso.this, Registro.class);
                startActivity(intent);
            }
        });
    }




    public void mostrarAlertDialog(View view) {
        // Crea un objeto AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        EditText nuevacontraseña = new EditText(this);
        nuevacontraseña.setInputType(InputType.TYPE_CLASS_TEXT);
        nuevacontraseña.setHint("nuevomail@example.com");

        builder.setView(nuevacontraseña);
        // Configura el título y el mensaje
        builder.setTitle("NUEVA CONTRASEÑA");
        builder.setMessage("INGRESA EL MAIL REGISTRADO");

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Acceso.this, "ugvgbvfbvfyf", Toast.LENGTH_SHORT).show();
            }
        });



        // Crea y muestra el cuadro de diálogo
        builder.create().show();
    }
}