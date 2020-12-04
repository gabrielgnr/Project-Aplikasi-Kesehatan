// Generated by view binder compiler. Do not edit!
package com.vadia.aplikasikesehatanmental.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.vadia.aplikasikesehatanmental.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class JadwalItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView jadwalSesi;

  @NonNull
  public final TextView psikiaterPemeriksa;

  private JadwalItemBinding(@NonNull LinearLayout rootView, @NonNull TextView jadwalSesi,
      @NonNull TextView psikiaterPemeriksa) {
    this.rootView = rootView;
    this.jadwalSesi = jadwalSesi;
    this.psikiaterPemeriksa = psikiaterPemeriksa;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static JadwalItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JadwalItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.jadwal_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JadwalItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.jadwal_sesi;
      TextView jadwalSesi = rootView.findViewById(id);
      if (jadwalSesi == null) {
        break missingId;
      }

      id = R.id.psikiater_pemeriksa;
      TextView psikiaterPemeriksa = rootView.findViewById(id);
      if (psikiaterPemeriksa == null) {
        break missingId;
      }

      return new JadwalItemBinding((LinearLayout) rootView, jadwalSesi, psikiaterPemeriksa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}