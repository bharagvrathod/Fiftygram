package edu.harvard.cs50.fiftygram;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivityImpl extends MainActivity {

    public void onPointerCaptureChanged(boolean hasCapture) {
        class MainActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
                @Override
                public void onCreate(@Nullable Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                }
            }

        }
    }

