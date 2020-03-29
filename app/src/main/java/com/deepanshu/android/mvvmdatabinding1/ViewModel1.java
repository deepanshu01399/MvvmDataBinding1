package com.deepanshu.android.mvvmdatabinding1;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.ViewModel;

public class ViewModel1 extends ViewModel {
    String Name=null;
    String Password=null;
     AuthInterface authInterface=null;
     @Bindable
    public void loginCLick(View view){
        authInterface.onStarting();
        if(Name.isEmpty() || Password.isEmpty()){
            authInterface.onFailure();
        }else
            authInterface.onSuccess();

    }
}
