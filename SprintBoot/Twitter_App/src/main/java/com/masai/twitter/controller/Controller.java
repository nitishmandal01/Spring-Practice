package com.masai.twitter.controller;

import org.springframework.http.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.masai.twitter.Entity.*;
import com.masai.twitter.Service.TwitterService;

public class Controller {
	
	TwitterService twitterservice;
	
	@PostMapping("/user")
	@ResponseStatus (HttpStatus.CREATED)
	public void addUser(@RequestBody User user) {
		twitterservice.addUser(user);
	}
	
	@PostMapping("/tweet")
	@ResponseStatus (HttpStatus.CREATED)
	public void addTweet(@RequestBody Tweet tweet) {
		twitterservice.addTweet(tweet);
	}
	
	@PostMapping("/like")
	@ResponseStatus (HttpStatus.CREATED)
	public void liketweet(@RequestBody Like like) {
		twitterservice.likeTweet(like);
	}
	
	@PostMapping("/retweet")
	@ResponseStatus (HttpStatus.CREATED)
	public void reTweet(@RequestBody Retweet rt) {
		twitterservice.retweet(rt);
	}
	
	
	 @GetMapping("/users")
	    public ResponseEntity<List<Tweet>> tweetHistory(String userId) {
	    	
	    	List<Tweet> tweetlist = twitterservice.tweetHistoryOfUser(userId);
	    	ResponseEntity<List<Tweet>> tweets = new ResponseEntity<List<Tweet>>(tweetlist, HttpStatus.FOUND);
			return tweets;
	    }
	
	
}
