package com.ppmessage.sdk.core.query;

/**
 * Created by ppmessage on 5/9/16.
 */
public interface IQuery {

    interface OnQueryCallback {
        void onCompleted(Object object);
    }

    //查询对话-根据对话UUID
    void queryConversation(String conversationUUID, OnQueryCallback queryCallback);
    //查询用户？
    void queryUser(String userUUID, OnQueryCallback queryCallback);

}
