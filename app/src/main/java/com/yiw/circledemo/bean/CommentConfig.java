package com.yiw.circledemo.bean;

@SuppressWarnings("ALL")
public class CommentConfig {

    public enum Type {
        PUBLIC("public"), REPLY("reply");

        private String value;

        private Type(String value) {
            this.value = value;
        }
    }

    public int circlePosition;
    public int commentPosition;
    public Type commentType;
    public User replyUser;

    @Override
    public String toString() {
        String replyUserStr = "";
        if (replyUser != null) {
            replyUserStr = replyUser.toString();
        }
        return "circlePosition = " + circlePosition
                + "; commentPosition = " + commentPosition
                + "; commentType ＝ " + commentType
                + "; replyUser = " + replyUserStr;
    }
}
