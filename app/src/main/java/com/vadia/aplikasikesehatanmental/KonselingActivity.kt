package com.vadia.aplikasikesehatanmental


import android.content.Intent
import android.os.Bundle
import android.text.format.DateFormat
import android.view.View
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.database.FirebaseListAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.MessageKonseling
import kotlinx.android.synthetic.main.activity_konseling.*


class KonselingActivity : AppCompatActivity() {
    private val db = Firebase.firestore
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konseling)
        val timeStamp=System.currentTimeMillis()/1000

        send_messages.setOnClickListener {
            val text=chatbox.text.toString()
            val chatMess=MessageKonseling(text)
            db.collection("chat_Konseling").document(auth.uid.toString())
                .collection("chat")
                .document(timeStamp.toString()).set(text)
            chatbox.setText("")
        }
        //setNamaPsikiater()

    }
    private fun displayChatMessages() {
        val listOfMessages: ListView = findViewById<View>(R.id.list_of_messages) as ListView

        val adapter = object : FirebaseListAdapter<MessageKonseling>(
            this, MessageKonseling::class.java,
            R.layout.message, FirebaseDatabase.getInstance().reference
        ) {
            override fun populateView(v: View, model: MessageKonseling, position: Int) {
                // Get references to the views of message.xml
                val messageText = v.findViewById<View>(R.id.message_text) as TextView
                val messageTime = v.findViewById<View>(R.id.message_time) as TextView

                // Set their text
                messageText.text = model.messageText


                // Format the date before showing it
                messageTime.text = DateFormat.format(
                    "dd-MM-yyyy (HH:mm:ss)",
                    model.messageTime
                )
            }
        }

        listOfMessages.adapter = adapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        displayChatMessages()
    }
}