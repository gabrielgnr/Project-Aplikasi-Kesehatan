// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppBarMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView daftarKons;

  @NonNull
  public final View daftarKonseling;

  @NonNull
  public final View dashboard;

  @NonNull
  public final RelativeLayout fillRegist;

  @NonNull
  public final RelativeLayout history;

  @NonNull
  public final TextView lihatKonseling;

  @NonNull
  public final View lihatKonselor;

  @NonNull
  public final RelativeLayout menu24pxO;

  @NonNull
  public final ImageView notificatio;

  @NonNull
  public final ImageView profileImg;

  @NonNull
  public final TextView riwayatKon;

  @NonNull
  public final View riwayatKonseling;

  @NonNull
  public final RelativeLayout seeCounselor;

  @NonNull
  public final TextView selamatDat;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView upcomingCo;

  @NonNull
  public final View upcomingPlaceholder;

  private AppBarMainBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView daftarKons,
      @NonNull View daftarKonseling, @NonNull View dashboard, @NonNull RelativeLayout fillRegist,
      @NonNull RelativeLayout history, @NonNull TextView lihatKonseling,
      @NonNull View lihatKonselor, @NonNull RelativeLayout menu24pxO,
      @NonNull ImageView notificatio, @NonNull ImageView profileImg, @NonNull TextView riwayatKon,
      @NonNull View riwayatKonseling, @NonNull RelativeLayout seeCounselor,
      @NonNull TextView selamatDat, @NonNull Toolbar toolbar, @NonNull TextView upcomingCo,
      @NonNull View upcomingPlaceholder) {
    this.rootView = rootView;
    this.daftarKons = daftarKons;
    this.daftarKonseling = daftarKonseling;
    this.dashboard = dashboard;
    this.fillRegist = fillRegist;
    this.history = history;
    this.lihatKonseling = lihatKonseling;
    this.lihatKonselor = lihatKonselor;
    this.menu24pxO = menu24pxO;
    this.notificatio = notificatio;
    this.profileImg = profileImg;
    this.riwayatKon = riwayatKon;
    this.riwayatKonseling = riwayatKonseling;
    this.seeCounselor = seeCounselor;
    this.selamatDat = selamatDat;
    this.toolbar = toolbar;
    this.upcomingCo = upcomingCo;
    this.upcomingPlaceholder = upcomingPlaceholder;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppBarMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppBarMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.app_bar_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppBarMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.daftar_kons;
      TextView daftarKons = rootView.findViewById(id);
      if (daftarKons == null) {
        break missingId;
      }

      id = R.id.daftar_konseling;
      View daftarKonseling = rootView.findViewById(id);
      if (daftarKonseling == null) {
        break missingId;
      }

      id = R.id.dashboard;
      View dashboard = rootView.findViewById(id);
      if (dashboard == null) {
        break missingId;
      }

      id = R.id.fill_regist;
      RelativeLayout fillRegist = rootView.findViewById(id);
      if (fillRegist == null) {
        break missingId;
      }

      id = R.id.history;
      RelativeLayout history = rootView.findViewById(id);
      if (history == null) {
        break missingId;
      }

      id = R.id.lihat_konseling;
      TextView lihatKonseling = rootView.findViewById(id);
      if (lihatKonseling == null) {
        break missingId;
      }

      id = R.id.lihat_konselor;
      View lihatKonselor = rootView.findViewById(id);
      if (lihatKonselor == null) {
        break missingId;
      }

      id = R.id.menu_24px_o;
      RelativeLayout menu24pxO = rootView.findViewById(id);
      if (menu24pxO == null) {
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

      id = R.id.riwayat_kon;
      TextView riwayatKon = rootView.findViewById(id);
      if (riwayatKon == null) {
        break missingId;
      }

      id = R.id.riwayat_konseling;
      View riwayatKonseling = rootView.findViewById(id);
      if (riwayatKonseling == null) {
        break missingId;
      }

      id = R.id.see_counselor;
      RelativeLayout seeCounselor = rootView.findViewById(id);
      if (seeCounselor == null) {
        break missingId;
      }

      id = R.id.selamat_dat;
      TextView selamatDat = rootView.findViewById(id);
      if (selamatDat == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.upcoming_co;
      TextView upcomingCo = rootView.findViewById(id);
      if (upcomingCo == null) {
        break missingId;
      }

      id = R.id.upcoming_placeholder;
      View upcomingPlaceholder = rootView.findViewById(id);
      if (upcomingPlaceholder == null) {
        break missingId;
      }

      return new AppBarMainBinding((CoordinatorLayout) rootView, daftarKons, daftarKonseling,
          dashboard, fillRegist, history, lihatKonseling, lihatKonselor, menu24pxO, notificatio,
          profileImg, riwayatKon, riwayatKonseling, seeCounselor, selamatDat, toolbar, upcomingCo,
          upcomingPlaceholder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}