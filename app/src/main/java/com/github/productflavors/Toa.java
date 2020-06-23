package com.github.productflavors;

import android.content.Context;
import android.widget.Toast;

public class Toa {
    public static void toast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
