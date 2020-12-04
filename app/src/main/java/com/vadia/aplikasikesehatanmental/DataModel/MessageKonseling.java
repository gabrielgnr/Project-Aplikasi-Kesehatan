package com.vadia.aplikasikesehatanmental.DataModel;

import java.util.Date;

public class MessageKonseling {
    private String messageText;
    private long messageTime;

    public MessageKonseling(String messageText) {
        this.messageText = messageText;


        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public MessageKonseling(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }


    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
