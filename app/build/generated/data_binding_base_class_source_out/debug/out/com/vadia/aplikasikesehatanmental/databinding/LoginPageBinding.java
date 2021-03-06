// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginPageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView belumPunyaAkun;

  @NonNull
  public final TextView logIn;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView rememberMe;

  @NonNull
  public final CheckBox rememberMeCheckbox;

  @NonNull
  public final TextView signUp;

  @NonNull
  public final EditText username;

  private LoginPageBinding(@NonNull ScrollView rootView, @NonNull TextView belumPunyaAkun,
      @NonNull TextView logIn, @NonNull EditText password, @NonNull TextView rememberMe,
      @NonNull CheckBox rememberMeCheckbox, @NonNull TextView signUp, @NonNull EditText username) {
    this.rootView = rootView;
    this.belumPunyaAkun = belumPunyaAkun;
    this.logIn = logIn;
    this.password = password;
    this.rememberMe = rememberMe;
    this.rememberMeCheckbox = rememberMeCheckbox;
    this.signUp = signUp;
    this.username = username;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.login_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.belum_punya_akun;
      TextView belumPunyaAkun = rootView.findViewById(id);
      if (belumPunyaAkun == null) {
        break missingId;
      }

      id = R.id.log_in;
      TextView logIn = rootView.findViewById(id);
      if (logIn == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.remember_me;
      TextView rememberMe = rootView.findViewById(id);
      if (rememberMe == null) {
        break missingId;
      }

      id = R.id.remember_me_checkbox;
      CheckBox rememberMeCheckbox = rootView.findViewById(id);
      if (rememberMeCheckbox == null) {
        break missingId;
      }

      id = R.id.sign_up;
      TextView signUp = rootView.findViewById(id);
      if (signUp == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = rootView.findViewById(id);
      if (username == null) {
        break missingId;
      }

      return new LoginPageBinding((ScrollView) rootView, belumPunyaAkun, logIn, password,
          rememberMe, rememberMeCheckbox, signUp, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
