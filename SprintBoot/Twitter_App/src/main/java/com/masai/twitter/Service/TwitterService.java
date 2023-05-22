package com.masai.twitter.Service;

import java.util.*;

import com.masai.twitter.Entity.*;
import com.masai.twitter.Exception.NotFoundException;

import jakarta.annotation.PostConstruct;

public class TwitterService {
	private final Map<String, User> users = new HashMap<>();
	private final Map<String, Tweet> tweets = new HashMap<>();
	private final Map<String, Like> likes = new HashMap<>();
	private final Map<String, Retweet> retweets = new HashMap<>();
	
	@PostConstruct
	public void init() {
		User user1 = new User("u1", "Nitish", "nitish@mail.com");
		User user2 = new User("u2", "Naman", "naman@mail.com");
		User user3 = new User("u3", "Kannu", "nk@mail.com");
		users.put(user1.getUserid(), user1);
		users.put(user2.getUserid(), user2);
		users.put(user3.getUserid(), user3);
		
		Tweet tweet1 = new Tweet("t1", "u1", "Pic of the Day", Arrays.asList("u1","u2","u3"));
//		tweets.put(tweet1.getTweetId(),tweet1);
		tweets.put(tweet1.getTweetId(), tweet1);
		
		Like like1 = new Like("l1", "u1", "t1");
		
		likes.put(like1.getTweetId(), like1);
		
		Retweet rt1 = new Retweet("rt1", "u1", "t1");
		retweets.put(rt1.getRetweetId(), rt1);
		
	}
	
	
	//functions that has been given
	public void addUser(User user) {
		String userId = user.getUserid();
		userValidation(userId);
		users.put(user.getUserid(), user);
	}

	
	public void addTweet(Tweet tweet) {
		String tweetId = tweet.getTweetId();
		tweetValidation(tweetId);
		tweets.put(tweet.getTweetId(), tweet);
		
	}
	
	public void likeTweet(Like like) {
		String tweetid = like.getTweetId();
		tweetValidation(tweetid);
		
		String userId = like.getUserId();
		userValidation(userId);
		
		likes.put(like.getTweetId(), like);
	}
	
	
	public void retweet(Retweet rt) {
		String tweetId = rt.getTweetId();
		tweetValidation(tweetId);
		
		String userId = rt.getUserId();
		userValidation(userId);
		
		retweets.put(tweetId, rt);
	}
	
	public List<Tweet> tweetHistoryOfUser(String userid){
		User user = users.get(userid);
		
		if(user==null) {
			throw new NotFoundException("User not exists");
		}
		 
		List<Tweet> tweetlist = new ArrayList<>();
		
		for(Tweet tw : tweets.values()) {
			if(tw.getUserId().equals(userid)) {
				tweetlist.add(tw);
			}
		}
		
		return tweetlist;
	}
	
	//Validation parts below
	
	public void tweetValidation(String tweetid) {
		User user = users.get(tweets.get(tweetid));
		
		if(user==null) {
			throw new NotFoundException("User not exists");
		}
	}

	public void userValidation(String userId) {
		User user = users.get(userId);
		
		if(user==null) {
			throw new NotFoundException("User not exists");
		}
	}
	
}
