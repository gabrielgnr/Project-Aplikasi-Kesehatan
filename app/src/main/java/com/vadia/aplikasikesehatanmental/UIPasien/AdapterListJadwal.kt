package com.vadia.aplikasikesehatanmental.UIPasien

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.ListSesi
import com.vadia.aplikasikesehatanmental.R

import com.vadia.aplikasikesehatanmental.UIPasien.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class AdapterListJadwal(private val listJadwal  : List<ListSesi>) : RecyclerView.Adapter<AdapterListJadwal.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.jadwal_item, parent, false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listJadwal[position]
       // holder.sesi.text = item.id
        //holder.namaPemeriksa.text = item.content
    }

    override fun getItemCount(): Int = listJadwal.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(list: ListSesi) {
          //  itemView.jadwal_sesi.text=list.jadwalSesi
          //  itemView.psikiater_pemeriksa.text=list.nama
        }



        /*
        override fun toString(): String {
            return super.toString() + " '" + namaPemeriksa.text + "'"
        }

         */
    }

}