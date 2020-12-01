package com.vadia.aplikasikesehatanmental.UIPasien

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.ListSesi
import com.vadia.aplikasikesehatanmental.R
import com.vadia.aplikasikesehatanmental.UIPasien.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class DaftarKonselingFragment : Fragment() {
    lateinit var view: ViewGroup
    private val db = Firebase.firestore
    //private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }

         */
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.jadwal_item_list, container, false)as ViewGroup

        // Set the adapter(OLD)
        /*
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
               // adapter = AdapterListJadwal(DummyContent.ITEMS)
            }
        }

         */

        return view
    }

    override fun onStart() {
        super.onStart()
        //adapter = AdapterListJadwal(DummyContent.ITEMS)
        initRecyclerView(view)
    }
    /*
    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            DaftarKonselingFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }

     */

    private fun initRecyclerView(view:View){
        //val today=
        val docRef=db.collection("jadwal_sesi").whereEqualTo("id_psikiater","psikiater?")
        docRef.addSnapshotListener { snapshot, error ->
            if(error!=null){
                Log.w(TAG,"Listen Failed",error)
            }
            val listJadwalKonseling=ArrayList<ListSesi>()
            var satuanSesi: ListSesi? =null
            for(list in snapshot!!){

                list.getString("nama_psikiater")?.let{
                    satuanSesi!!.namaPsikiater=it
                }
                list.getString("jadwal_sesi")
            }
        }

    }
}