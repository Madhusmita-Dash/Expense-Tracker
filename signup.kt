<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background_color"
    android:padding="16dp"
    tools:ignore="ExtraText">

    <!-- Sign Up Title -->
    <TextView
        android:id="@+id/tvSignUp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:text="Sign up"
        android:textColor="@color/white"
        android:textSize="30sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <!-- Subheading TextView -->
    <TextView
        android:id="@+id/CreateAccount"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:padding="10dp"
        android:text="Create your account"
        android:textColor="@color/white"
        android:textSize="16sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tvSignUp" />

    <!-- Username EditText -->
    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/username"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/CreateAccount">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etUsername"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:drawableStart="@drawable/baseline_person_24"
            android:drawablePadding="10dp"
            android:background="@drawable/corner"
            android:hint="Username"
            android:inputType="textPersonName"
            android:padding="15dp" />
    </com.google.android.material.textfield.TextInputLayout>

    <!-- Email EditText -->
    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/email"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/username">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:drawableStart="@drawable/baseline_email_24"
            android:drawablePadding="10dp"
            android:background="@drawable/corner"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:padding="15dp" />
    </com.google.android.material.textfield.TextInputLayout>

    <!-- Password EditText -->
    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/Password"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/email">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:drawableStart="@drawable/baseline_lock_24"
            android:drawablePadding="10dp"
            android:hint="Password"
            android:background="@drawable/corner"
            android:inputType="textPassword"
            android:padding="15dp" />
    </com.google.android.material.textfield.TextInputLayout>

    <!-- Sign Up Button -->

    <!-- Or Text -->

    <Button
        android:id="@+id/btnSignUp"
        android:layout_width="327dp"
        android:layout_height="73dp"
        android:layout_marginTop="52dp"
        android:backgroundTint="@color/customTeal"
        android:elevation="4dp"
        android:fontFamily="@font/kdam_thmor_pro"
        android:gravity="center"
        android:padding="12dp"
        android:text="Signup"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/Password"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/tvOr"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="Or"
        android:textColor="@color/white"
        android:textSize="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/btnSignUp" />

    <!-- Google Sign In Button with Image -->

    <!-- Already have an account Text -->
    <!--
    <LinearLayout
        android:id="@+id/GoogleSignIn"
        android:layout_width="436dp"
        android:layout_height="53dp"
        android:layout_marginLeft="30dp"
        android:layout_marginTop="6dp"
        android:backgroundTint="@color/customTeal"
        android:orientation="horizontal"
        android:padding="2dp"
        app:layout_constraintBottom_toTopOf="@+id/tvAlreadyHaveAccount"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tvOr"
        app:layout_constraintVertical_bias="0.0">

        <ImageView
            android:layout_width="79dp"
            android:layout_height="match_parent"
            android:layout_gravity="center"
            android:src="@drawable/google" />

        <TextView
            android:layout_width="172dp"
            android:layout_height="25dp"
            android:layout_gravity="center"
            android:text="Sign in with Google"
            android:textColor="@color/white"
            android:textSize="18sp"
            android:textStyle="bold" />

    </LinearLayout>
    -->

    <TextView
        android:id="@+id/tvAlreadyHaveAccount"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Already have an account? Log in"
        android:textColor="@color/white"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvOr"
        app:layout_constraintVertical_bias="0.328"
        tools:ignore="MissingConstraints" />

</androidx.constraintlayout.widget.ConstraintLayout>
 
