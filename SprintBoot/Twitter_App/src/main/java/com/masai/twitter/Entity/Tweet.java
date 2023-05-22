package com.masai.twitter.Entity;

import java.util.*;
public class Tweet {
private String tweetId;
private String userId;
private String content;
private List<String> likeAndRetweet;
public Tweet(String tweetId, String userId, String content, List<String> likeAndRetweet) {
	super();
	this.tweetId = tweetId;
	this.userId = userId;
	this.content = content;
	this.likeAndRetweet = likeAndRetweet;
}
public String getTweetId() {
	return tweetId;
}
public void setTweetId(String tweetId) {
	this.tweetId = tweetId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public List<String> getLikeAndRetweet() {
	return likeAndRetweet;
}
public void setLikeAndRetweet(List<String> likeAndRetweet) {
	this.likeAndRetweet = likeAndRetweet;
}
@Override
public String toString() {
	return "Tweet [tweetId=" + tweetId + ", userId=" + userId + ", content=" + content + ", likeAndRetweet="
			+ likeAndRetweet + "]";
}



}
