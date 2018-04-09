package com.example.mobiweb.testapp.api;

import com.example.mobiweb.testapp.beanResponse.TestInput;
import com.example.mobiweb.testapp.beanResponse.TestOutput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * This interface will describe service methods.
 */

public interface NetWorkInterface {

   /* @POST("api/login")
    Call<LoginOutput> loginCall(
            @HeaderMap Map<String, String> headers,
            @Body LoginInput mLoginInput);

    @POST("api/recovery_password/recoverypassword")
    Call<DefaultOutput> forgotPasswordCall(@Body ForgotPasswordInput mForgotPasswordInput);
*/

    @POST("posts")
    Call<TestOutput> testOutput(@Body TestInput testInput);

}
