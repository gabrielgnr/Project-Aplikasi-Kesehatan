// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgetPasswdBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText sendEmail;

  @NonNull
  public final TextView sendEmailToReset;

  private ActivityForgetPasswdBinding(@NonNull RelativeLayout rootView, @NonNull EditText sendEmail,
      @NonNull TextView sendEmailToReset) {
    this.rootView = rootView;
    this.sendEmail = sendEmail;
    this.sendEmailToReset = sendEmailToReset;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgetPasswdBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgetPasswdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forget_passwd, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgetPasswdBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.send_email;
      EditText sendEmail = rootView.findViewById(id);
      if (sendEmail == null) {
        break missingId;
      }

      id = R.id.send_email_to_reset;
      TextView sendEmailToReset = rootView.findViewById(id);
      if (sendEmailToReset == null) {
        break missingId;
      }

      return new ActivityForgetPasswdBinding((RelativeLayout) rootView, sendEmail,
          sendEmailToReset);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
