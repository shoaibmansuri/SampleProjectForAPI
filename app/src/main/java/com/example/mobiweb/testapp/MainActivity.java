package com.example.mobiweb.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.mobiweb.testapp.api.NetWorkWrapper;
import com.example.mobiweb.testapp.beanResponse.FriendFollowersOutput;
import com.example.mobiweb.testapp.beanResponse.TestInput;
import com.example.mobiweb.testapp.beanResponse.TestOutput;
import com.example.mobiweb.testapp.util.Utils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private BFollowerAdapter bFollowerAdapter;
    private ArrayList<FriendFollowersOutput.DataBean.MembersBean> mDataBeans;
    private TextView tvdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponets();
    }

    private void initComponets() {

        tvdata = (TextView) findViewById(R.id.tv_set_data);
        mRecyclerView = (RecyclerView) findViewById(R.id.rc_friends);
        mDataBeans = new ArrayList<>();

        /*mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        bFollowerAdapter = new BFollowerAdapter(this, mDataBeans,userId);
        final LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(bFollowerAdapter);
*/
        apiCall();
    }

    private void apiCall() {
        if (Utils.isNetworkAvail()) {


            TestInput testInput = new TestInput();
            testInput.setUserId("123");

            Call<TestOutput> testOutputCall = NetWorkWrapper.getInstance().forgotPasswordCall(testInput);

            testOutputCall.enqueue(new Callback<TestOutput>() {
                @Override
                public void onResponse(Call<TestOutput> call, Response<TestOutput> response) {

                    tvdata.setText(response.body().getUserId());
                    Log.v("test",response.body().getUserId());
                }

                @Override
                public void onFailure(Call<TestOutput> call, Throwable t) {
                    Log.v("test",t.getMessage());
                }
            });







            /*FriendFollowersInput mFriendFollowersInput = new FriendFollowersInput();
            mFriendFollowersInput.setLoginSessionKey("");
            mFriendFollowersInput.setType(filterType);
            mFriendFollowersInput.setPageNo(pageNo + "");
            mFriendFollowersInput.setPageSize(pageSize + "");
            mFriendFollowersInput.setUID(userId);
            mFriendFollowersInput.setGetRoleType("");

            mFriendFollowersInteracterimpl.run(Utils.getDefaultHeader(), mFriendFollowersInput, new FriendFollowersInteracterimpl.OnFinishListener() {
                @Override
                public void onError(@NonNull String errorMessage) {
                    showError(errorMessage);
                    mProgressView.setVisibility(View.GONE);
                    isLoading = false;
                }

                @Override
                public void onSuccess(FriendFollowersOutput mFriendFollowersOutput) {
                    mProgressView.setVisibility(View.GONE);

                    if (totalRecords == -1) {
                        totalRecords = mFriendFollowersOutput.getTotalRecords();
                    }
                    final List<FriendFollowersOutput.DataBean.MembersBean> outputData = mFriendFollowersOutput.getData().getMembers();
                    if (totalRecords != -1 && outputData != null) {
                        for (int i = 0; i < outputData.size(); i++) {
                            mDataBeans.add(outputData.get(i));
                        }
                        pageNo++;
                        if (outputData.size() == pageSize && totalRecords > mDataBeans.size()) {
                            isLoading = false;
                        }
                    }
                }

                @Override
                public void onNoRecord() {
                    mProgressView.setVisibility(View.GONE);
                    mLinearLayoutNoRecord.setVisibility(View.VISIBLE);
                }
            });*/
        }
    }


}
