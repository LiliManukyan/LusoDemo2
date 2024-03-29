// Generated by view binder compiler. Do not edit!
package com.example.lusod2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.lusod2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button4;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText editTextText;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText editTextTextPassword2;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull Button button4, @NonNull EditText editTextPhone, @NonNull EditText editTextText,
      @NonNull EditText editTextTextEmailAddress, @NonNull EditText editTextTextPassword,
      @NonNull EditText editTextTextPassword2) {
    this.rootView = rootView;
    this.button = button;
    this.button4 = button4;
    this.editTextPhone = editTextPhone;
    this.editTextText = editTextText;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPassword2 = editTextTextPassword2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      EditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.editTextText;
      EditText editTextText = ViewBindings.findChildViewById(rootView, id);
      if (editTextText == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword2;
      EditText editTextTextPassword2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword2 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, button, button4, editTextPhone,
          editTextText, editTextTextEmailAddress, editTextTextPassword, editTextTextPassword2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
