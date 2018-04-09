package com.example.mobiweb.testapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by mobiweb on 13/11/17.
 */

public class BFollowerHolder extends RecyclerView.ViewHolder {

    TextView tvUserName;
    TextView tvUserType;

    /*@BindView(R.id.ctv_user_type)
    CustomTextView tvUserType;*/

    //@BindView(R.id.sdv_follower_pic)
    SimpleDraweeView mSimpleDraweeViewImgFriend;


    public BFollowerHolder(View itemView) {
        super(itemView);
//        ButterKnife.bind(this, itemView);
    }
}
