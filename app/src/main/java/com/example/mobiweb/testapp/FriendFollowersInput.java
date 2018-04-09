package com.example.mobiweb.testapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mobiweb on 13/11/17.
 */

public class FriendFollowersInput {

    /**
     * LoginSessionKey : 861e2bfd1b36c17e13716b534e960dbe
     * Type : Following
     * PageNo : 1
     * PageSize : 12
     * UID : 37
     * GetRoleType :
     */

    @SerializedName("LoginSessionKey")
    private String LoginSessionKey;
    @SerializedName("Type")
    private String Type;
    @SerializedName("PageNo")
    private String PageNo;
    @SerializedName("PageSize")
    private String PageSize;
    @SerializedName("UID")
    private String UID;
    @SerializedName("GetRoleType")
    private String GetRoleType;

    public String getLoginSessionKey() {
        return LoginSessionKey;
    }

    public void setLoginSessionKey(String LoginSessionKey) {
        this.LoginSessionKey = LoginSessionKey;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPageNo() {
        return PageNo;
    }

    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    public String getPageSize() {
        return PageSize;
    }

    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getGetRoleType() {
        return GetRoleType;
    }

    public void setGetRoleType(String GetRoleType) {
        this.GetRoleType = GetRoleType;
    }
}
