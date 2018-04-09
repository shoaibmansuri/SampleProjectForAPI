package com.example.mobiweb.testapp.api;

import com.example.mobiweb.testapp.BuildConfig;
import com.example.mobiweb.testapp.beanResponse.TestInput;
import com.example.mobiweb.testapp.beanResponse.TestOutput;
import com.example.mobiweb.testapp.util.Constant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkWrapper {

    private static NetWorkWrapper mServiceWrapper;
    private NetWorkInterface mNetWorkInterface;

    public static NetWorkWrapper getInstance() {
        if (mServiceWrapper == null)
            mServiceWrapper = new NetWorkWrapper();
        return mServiceWrapper;
    }

    private NetWorkWrapper() {
        HttpLoggingInterceptor mHttpLoggingInterceptor = new HttpLoggingInterceptor();
        mHttpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder mBuilder = new OkHttpClient.Builder();
        mBuilder.sslSocketFactory(getSSLSocketFactory(), getX509TrustManager());
        mBuilder.connectTimeout(Constant.API_CONNECTION_TIMEOUT, TimeUnit.MINUTES);
        mBuilder.readTimeout(Constant.API_READ_TIMEOUT, TimeUnit.MINUTES);
        if (BuildConfig.DEBUG) mBuilder.addInterceptor(mHttpLoggingInterceptor);

        OkHttpClient mOkHttpClient = mBuilder.build();

        Gson mGson = new GsonBuilder()/*.setLenient()*//*.disableHtmlEscaping()*/.create();
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(Constant.WS_URL)
                .addConverterFactory(GsonConverterFactory.create(mGson))
                // .addConverterFactory(ScalarsConverterFactory.create())
                .client(mOkHttpClient)
                .build();
        mNetWorkInterface = mRetrofit.create(NetWorkInterface.class);
    }


    private static X509TrustManager getX509TrustManager() {
        return new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[]{};
            }

            public void checkClientTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {
            }
        };
    }

    private static SSLSocketFactory getSSLSocketFactory() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            return sslSocketFactory;
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            return null;
        }

    }


    /*public Call<LoginOutput> loginCall(@HeaderMap Map<String, String> headers,
                                       LoginInput mLoginInput) {
        return mNetWorkInterface.loginCall(headers,
                mLoginInput);
    }

    public Call<DefaultOutput> forgotPasswordCall(ForgotPasswordInput mForgotPasswordInput) {
        return mNetWorkInterface.forgotPasswordCall(mForgotPasswordInput);
    }
*/

    public Call<TestOutput> forgotPasswordCall(TestInput testInput) {
        return mNetWorkInterface.testOutput(testInput);
    }
}



