package com.example.mobiweb.testapp.beanResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mobiweb on 13/11/17.
 */

public class FriendFollowersOutput {


    /**
     * ResponseCode : 200
     * Data : {"Members":[{"PaidUserName":null,"FirstName":"WildCat X","ProfilePicture":"bpjoint_70f21458612631.png","UserID":"141","UserGuID":"56f0a865bb2b4","LastName":"","Email":"christopher.richardson8@gmail.com","School":"","RoleID":"6","Location":"","HomeTown":"Carson, CA, United States","BusinessTypeID":"0","MessagePrivacy":"everyone","Mfriend":"","ProfilePicURL":"https://s3-us-west-1.amazonaws.com/ybann-live/uploads/profile/192x192/bpjoint_70f21458612631.png","ProfilePicURLForTag":"https://s3-us-west-1.amazonaws.com/ybann-live/uploads/profile/36x36/bpjoint_70f21458612631.png","FriendStatus":4,"ShowFollowBtn":1,"FollowStatus":"Follow","ShowFriendsBtn":1,"ProfileLink":"https://www.ybann.com/user/56f0a865bb2b4","MySelf":0,"musician_verified_status":"0"}]}
     * ServiceName : api/users/allUsers
     * Message : Success
     * TotalRecords : 1
     * PageNo : 1
     * PageSize : 12
     */

    @SerializedName("ResponseCode")
    private int ResponseCode;
    @SerializedName("Data")
    private DataBean Data;
    @SerializedName("ServiceName")
    private String ServiceName;
    @SerializedName("Message")
    private String Message;
    @SerializedName("TotalRecords")
    private int TotalRecords;
    @SerializedName("PageNo")
    private String PageNo;
    @SerializedName("PageSize")
    private String PageSize;

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public DataBean getData() {
        return Data;
    }

    public void setData(DataBean Data) {
        this.Data = Data;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getTotalRecords() {
        return TotalRecords;
    }

    public void setTotalRecords(int TotalRecords) {
        this.TotalRecords = TotalRecords;
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

    public static class DataBean {
        @SerializedName("Members")
        private List<MembersBean> Members;

        public List<MembersBean> getMembers() {
            return Members;
        }

        public void setMembers(List<MembersBean> Members) {
            this.Members = Members;
        }

        public static class MembersBean {
            /**
             * PaidUserName : null
             * FirstName : WildCat X
             * ProfilePicture : bpjoint_70f21458612631.png
             * UserID : 141
             * UserGuID : 56f0a865bb2b4
             * LastName :
             * Email : christopher.richardson8@gmail.com
             * School :
             * RoleID : 6
             * Location :
             * HomeTown : Carson, CA, United States
             * BusinessTypeID : 0
             * MessagePrivacy : everyone
             * Mfriend :
             * ProfilePicURL : https://s3-us-west-1.amazonaws.com/ybann-live/uploads/profile/192x192/bpjoint_70f21458612631.png
             * ProfilePicURLForTag : https://s3-us-west-1.amazonaws.com/ybann-live/uploads/profile/36x36/bpjoint_70f21458612631.png
             * FriendStatus : 4
             * ShowFollowBtn : 1
             * FollowStatus : Follow
             * ShowFriendsBtn : 1
             * ProfileLink : https://www.ybann.com/user/56f0a865bb2b4
             * MySelf : 0
             * musician_verified_status : 0
             */

            @SerializedName("PaidUserName")
            private Object PaidUserName;
            @SerializedName("FirstName")
            private String FirstName;
            @SerializedName("ProfilePicture")
            private String ProfilePicture;
            @SerializedName("UserID")
            private String UserID;
            @SerializedName("UserGuID")
            private String UserGuID;
            @SerializedName("LastName")
            private String LastName;
            @SerializedName("Email")
            private String Email;
            @SerializedName("School")
            private String School;
            @SerializedName("RoleID")
            private String RoleID;
            @SerializedName("Location")
            private String Location;
            @SerializedName("HomeTown")
            private String HomeTown;
            @SerializedName("BusinessTypeID")
            private String BusinessTypeID;
            @SerializedName("MessagePrivacy")
            private String MessagePrivacy;
            @SerializedName("Mfriend")
            private String Mfriend;
            @SerializedName("ProfilePicURL")
            private String ProfilePicURL;
            @SerializedName("ProfilePicURLForTag")
            private String ProfilePicURLForTag;
            @SerializedName("FriendStatus")
            private int FriendStatus;
            @SerializedName("ShowFollowBtn")
            private int ShowFollowBtn;
            @SerializedName("FollowStatus")
            private String FollowStatus;
            @SerializedName("ShowFriendsBtn")
            private int ShowFriendsBtn;
            @SerializedName("ProfileLink")
            private String ProfileLink;
            @SerializedName("MySelf")
            private int MySelf;
            @SerializedName("musician_verified_status")
            private String musicianVerifiedStatus;

            public Object getPaidUserName() {
                return PaidUserName;
            }

            public void setPaidUserName(Object PaidUserName) {
                this.PaidUserName = PaidUserName;
            }

            public String getFirstName() {
                return FirstName;
            }

            public void setFirstName(String FirstName) {
                this.FirstName = FirstName;
            }

            public String getProfilePicture() {
                return ProfilePicture;
            }

            public void setProfilePicture(String ProfilePicture) {
                this.ProfilePicture = ProfilePicture;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String UserID) {
                this.UserID = UserID;
            }

            public String getUserGuID() {
                return UserGuID;
            }

            public void setUserGuID(String UserGuID) {
                this.UserGuID = UserGuID;
            }

            public String getLastName() {
                return LastName;
            }

            public void setLastName(String LastName) {
                this.LastName = LastName;
            }

            public String getEmail() {
                return Email;
            }

            public void setEmail(String Email) {
                this.Email = Email;
            }

            public String getSchool() {
                return School;
            }

            public void setSchool(String School) {
                this.School = School;
            }

            public String getRoleID() {
                return RoleID;
            }

            public void setRoleID(String RoleID) {
                this.RoleID = RoleID;
            }

            public String getLocation() {
                return Location;
            }

            public void setLocation(String Location) {
                this.Location = Location;
            }

            public String getHomeTown() {
                return HomeTown;
            }

            public void setHomeTown(String HomeTown) {
                this.HomeTown = HomeTown;
            }

            public String getBusinessTypeID() {
                return BusinessTypeID;
            }

            public void setBusinessTypeID(String BusinessTypeID) {
                this.BusinessTypeID = BusinessTypeID;
            }

            public String getMessagePrivacy() {
                return MessagePrivacy;
            }

            public void setMessagePrivacy(String MessagePrivacy) {
                this.MessagePrivacy = MessagePrivacy;
            }

            public String getMfriend() {
                return Mfriend;
            }

            public void setMfriend(String Mfriend) {
                this.Mfriend = Mfriend;
            }

            public String getProfilePicURL() {
                return ProfilePicURL;
            }

            public void setProfilePicURL(String ProfilePicURL) {
                this.ProfilePicURL = ProfilePicURL;
            }

            public String getProfilePicURLForTag() {
                return ProfilePicURLForTag;
            }

            public void setProfilePicURLForTag(String ProfilePicURLForTag) {
                this.ProfilePicURLForTag = ProfilePicURLForTag;
            }

            public int getFriendStatus() {
                return FriendStatus;
            }

            public void setFriendStatus(int FriendStatus) {
                this.FriendStatus = FriendStatus;
            }

            public int getShowFollowBtn() {
                return ShowFollowBtn;
            }

            public void setShowFollowBtn(int ShowFollowBtn) {
                this.ShowFollowBtn = ShowFollowBtn;
            }

            public String getFollowStatus() {
                return FollowStatus;
            }

            public void setFollowStatus(String FollowStatus) {
                this.FollowStatus = FollowStatus;
            }

            public int getShowFriendsBtn() {
                return ShowFriendsBtn;
            }

            public void setShowFriendsBtn(int ShowFriendsBtn) {
                this.ShowFriendsBtn = ShowFriendsBtn;
            }

            public String getProfileLink() {
                return ProfileLink;
            }

            public void setProfileLink(String ProfileLink) {
                this.ProfileLink = ProfileLink;
            }

            public int getMySelf() {
                return MySelf;
            }

            public void setMySelf(int MySelf) {
                this.MySelf = MySelf;
            }

            public String getMusicianVerifiedStatus() {
                return musicianVerifiedStatus;
            }

            public void setMusicianVerifiedStatus(String musicianVerifiedStatus) {
                this.musicianVerifiedStatus = musicianVerifiedStatus;
            }
        }
    }
}
