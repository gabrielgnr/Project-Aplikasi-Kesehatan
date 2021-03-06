// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarPasienBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final View dashboard;

  @NonNull
  public final ImageButton menu;

  @NonNull
  public final ImageView notificatio;

  @NonNull
  public final ImageView profileImg;

  @NonNull
  public final TextView selamatDat;

  private ToolbarPasienBinding(@NonNull RelativeLayout rootView, @NonNull View dashboard,
      @NonNull ImageButton menu, @NonNull ImageView notificatio, @NonNull ImageView profileImg,
      @NonNull TextView selamatDat) {
    this.rootView = rootView;
    this.dashboard = dashboard;
    this.menu = menu;
    this.notificatio = notificatio;
    this.profileImg = profileImg;
    this.selamatDat = selamatDat;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarPasienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarPasienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_pasien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarPasienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dashboard;
      View dashboard = rootView.findViewById(id);
      if (dashboard == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageButton menu = rootView.findViewById(id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.notificatio;
      ImageView notificatio = rootView.findViewById(id);
      if (notificatio == null) {
        break missingId;
      }

      id = R.id.profile_img;
      ImageView profileImg = rootView.findViewById(id);
      if (profileImg == null) {
        break missingId;
      }

      id = R.id.selamat_dat;
      TextView selamatDat = rootView.findViewById(id);
      if (selamatDat == null) {
        break missingId;
      }

      return new ToolbarPasienBinding((RelativeLayout) rootView, dashboard, menu, notificatio,
          profileImg, selamatDat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
