package tms.com.libre.tms.serivces;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import tms.com.libre.tms.entry.LoginResponse;

/**
 * Created by hoanganhnguyen on 4/11/17.
 */

public interface AppServices {

    @GET("Account/GetValidationToken")
    public void login(@Query("email") String email, @Query("password") String password, Callback<LoginResponse> loginResponseCallback);
}
