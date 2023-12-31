package com.masdika.jmppertemuan2;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.masdika.jmppertemuan2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnOk.setOnClickListener(v -> {
            if (binding.nameInput.getText().length() == 0) {
                Toast.makeText(this, "Input kosong", Toast.LENGTH_SHORT).show();
            } else {
                binding.tvHelloName.setText("Hello " + binding.nameInput.getText() + "!\nPeserta VSGA");
            }
        });
    }
}