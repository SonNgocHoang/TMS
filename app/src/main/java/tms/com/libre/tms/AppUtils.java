package tms.com.libre.tms;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by quangnv on 4/11/17.
 */

public class AppUtils {
    private ProgressDialog progressDialog;



    public  void showProgressDialog(Context context, String message){
         progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public  void dismissProgressDialog(){
        if(progressDialog!=null){
            progressDialog.dismiss();
        }
    }
}
