package com.deepanshu.android.mvvmdatabinding1;



import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.deepanshu.android.mvvmdatabinding1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements AuthInterface {
    private ViewModel1 viewModel;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        viewModel = ViewModelProviders.of(this).get(ViewModel1.class);
        binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setLoginViewModel(viewModel);
       // binding.getRoot();
        viewModel.authInterface=this;

    }

    @Override
    public void onSuccess() {
        Toast.makeText(this,"login successfull", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onFailure() {
        Toast.makeText(this,"loginFailure",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStarting() {
        Toast.makeText(this,"starting method",Toast.LENGTH_LONG).show();

    }
}
