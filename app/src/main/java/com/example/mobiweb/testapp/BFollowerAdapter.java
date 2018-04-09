package com.example.mobiweb.testapp;

import android.app.Fragment;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.mobiweb.testapp.beanResponse.FriendFollowersOutput;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import java.util.List;

/**
 * Created by mobiweb on 13/11/17.
 */

public class BFollowerAdapter extends RecyclerView.Adapter<BFollowerHolder> {

    private List<FriendFollowersOutput.DataBean.MembersBean> mArrayList;
    private Fragment mFragment;
    private String userId;

    public BFollowerAdapter(Fragment mFragment, List<FriendFollowersOutput.DataBean.MembersBean> mArrayList, String userId) {
        this.mFragment = mFragment;
        this.mArrayList = mArrayList;
        this.userId = userId;
    }

    @Override
    public BFollowerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BFollowerHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_followers, parent, false));
    }

    @Override
    public void onBindViewHolder(final BFollowerHolder holder, final int position) {

        final FriendFollowersOutput.DataBean.MembersBean membersBean = mArrayList.get(position);

        holder.tvUserName.setText(membersBean.getFirstName() + " " + membersBean.getLastName());
        if (membersBean.getRoleID().endsWith("2")) {
            holder.tvUserType.setText("user");
        } else if (membersBean.getRoleID().endsWith("6")) {
            holder.tvUserType.setText("musician");
        } else if (membersBean.getRoleID().endsWith("5")) {
            holder.tvUserType.setText("business");
        }

        Uri uri = Uri.parse(membersBean.getProfilePicURL());
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                .setResizeOptions(new ResizeOptions(100, 100))
                .setCacheChoice(ImageRequest.CacheChoice.DEFAULT)
                .build();
        holder.mSimpleDraweeViewImgFriend.setController(
                Fresco.newDraweeControllerBuilder()
                        .setOldController(holder.mSimpleDraweeViewImgFriend.getController())
                        .setImageRequest(request)
                        .build());


    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }


}
