package edu.itsco.miagendaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import edu.itsco.miagendaapp.modelos.Contacto

class NuevoContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_contacto)

        val txtNombre: EditText = findViewById(R.id.txt_nombre)
        val txtTelefono: EditText = findViewById(R.id.txt_telefono)
        val txtEmail: EditText = findViewById(R.id.txt_email)

        val btnAddContacto: Button = findViewById(R.id.btn_add_contacto)

        btnAddContacto.setOnClickListener {

            val nombre = txtNombre.text.toString()
            val telefono = txtTelefono.text.toString()
            val email = txtEmail.text.toString()

            val contacto = Contacto(nombre, telefono, email)

            //Asignamos el contacto en el intent
            intent.putExtra("CONTACTO",contacto)

            setResult(RESULT_OK,intent)
            Toast.makeText(this.applicationContext,"CONTACTO AGREGADO CORRECTAMENTE",
            Toast.LENGTH_SHORT).show()

            //Finalizo el activity
            finish()

        }
    }
}