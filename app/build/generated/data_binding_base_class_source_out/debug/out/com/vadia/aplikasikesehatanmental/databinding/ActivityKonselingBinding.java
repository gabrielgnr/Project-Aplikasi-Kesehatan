// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKonselingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout chatLayout;

  @NonNull
  public final RelativeLayout chatPemeriksa;

  @NonNull
  public final TextInputEditText chatbox;

  @NonNull
  public final ScrollView chats;

  @NonNull
  public final ListView listOfMessages;

  @NonNull
  public final TextView namaPsikiater;

  @NonNull
  public final ImageView profilePsikiater;

  @NonNull
  public final ImageView sendMessages;

  @NonNull
  public final TextView sesiJam;

  @NonNull
  public final TextView tanggalSesi;

  private ActivityKonselingBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout chatLayout, @NonNull RelativeLayout chatPemeriksa,
      @NonNull TextInputEditText chatbox, @NonNull ScrollView chats,
      @NonNull ListView listOfMessages, @NonNull TextView namaPsikiater,
      @NonNull ImageView profilePsikiater, @NonNull ImageView sendMessages,
      @NonNull TextView sesiJam, @NonNull TextView tanggalSesi) {
    this.rootView = rootView;
    this.chatLayout = chatLayout;
    this.chatPemeriksa = chatPemeriksa;
    this.chatbox = chatbox;
    this.chats = chats;
    this.listOfMessages = listOfMessages;
    this.namaPsikiater = namaPsikiater;
    this.profilePsikiater = profilePsikiater;
    this.sendMessages = sendMessages;
    this.sesiJam = sesiJam;
    this.tanggalSesi = tanggalSesi;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKonselingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKonselingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_konseling, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKonselingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chat_layout;
      RelativeLayout chatLayout = rootView.findViewById(id);
      if (chatLayout == null) {
        break missingId;
      }

      id = R.id.chat_pemeriksa;
      RelativeLayout chatPemeriksa = rootView.findViewById(id);
      if (chatPemeriksa == null) {
        break missingId;
      }

      id = R.id.chatbox;
      TextInputEditText chatbox = rootView.findViewById(id);
      if (chatbox == null) {
        break missingId;
      }

      id = R.id.chats;
      ScrollView chats = rootView.findViewById(id);
      if (chats == null) {
        break missingId;
      }

      id = R.id.list_of_messages;
      ListView listOfMessages = rootView.findViewById(id);
      if (listOfMessages == null) {
        break missingId;
      }

      id = R.id.nama_psikiater;
      TextView namaPsikiater = rootView.findViewById(id);
      if (namaPsikiater == null) {
        break missingId;
      }

      id = R.id.profile_psikiater;
      ImageView profilePsikiater = rootView.findViewById(id);
      if (profilePsikiater == null) {
        break missingId;
      }

      id = R.id.send_messages;
      ImageView sendMessages = rootView.findViewById(id);
      if (sendMessages == null) {
        break missingId;
      }

      id = R.id.sesi_jam;
      TextView sesiJam = rootView.findViewById(id);
      if (sesiJam == null) {
        break missingId;
      }

      id = R.id.tanggal_sesi;
      TextView tanggalSesi = rootView.findViewById(id);
      if (tanggalSesi == null) {
        break missingId;
      }

      return new ActivityKonselingBinding((ConstraintLayout) rootView, chatLayout, chatPemeriksa,
          chatbox, chats, listOfMessages, namaPsikiater, profilePsikiater, sendMessages, sesiJam,
          tanggalSesi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}