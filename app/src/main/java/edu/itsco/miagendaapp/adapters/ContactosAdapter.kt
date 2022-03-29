package edu.itsco.miagendaapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.itsco.miagendaapp.R
import edu.itsco.miagendaapp.modelos.Contacto

class ContactosAdapter (private val listaContactos: ArrayList<Contacto>):
  RecyclerView.Adapter<ContactosAdapter.ViewHolder>() {

    class ViewHolder (view: View): RecyclerView.ViewHolder(view){

        val lbNombre: TextView
        val lbTelefono: TextView

        init {
            lbNombre = view.findViewById(R.id.lb_nombre)
            lbTelefono = view.findViewById(R.id.lb_telefono)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactosAdapter.ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.contacto_item,
        parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactosAdapter.ViewHolder, position: Int) {
        holder.lbNombre.text = listaContactos[position].nombre
        holder.lbTelefono.text = listaContactos[position].telefono
    }

    override fun getItemCount(): Int {
       return listaContactos.size
    }

    fun addContacto(contacto:Contacto){
        listaContactos.add(contacto)
        notifyDataSetChanged()
    }

}