package com.revature.revpages.vote.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Vote {

	@Id
	@Column(name = "VOTE_ID")
	@GeneratedValue(generator = "VOTE_ID_SEQ", strategy = GenerationType.AUTO)
	@SequenceGenerator(sequenceName = "VOTE_ID_SEQ", name = "VOTE_ID_SEQ", allocationSize = 1, initialValue = 1)
	private long id;

	/**
	 * Id of the Post
	 */
	@Column(name = "POST_ID")
	private long postId;

	/**
	 * User who made the upvote/downvote
	 */
	@Column(name = "USER_ID")
	private int userId;

	/**
	 * Will be true for an upvote and will be false for a downvote
	 */
	@Column(name = "IS_UPVOTE")
	private boolean upvote;

	public Vote() {
		super();
	}

	public Vote(long postId, int userId, boolean upvote) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.upvote = upvote;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isUpvote() {
		return upvote;
	}

	public void setUpvote(boolean upvote) {
		this.upvote = upvote;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", postId=" + postId + ", userId=" + userId + ", upvote=" + upvote + "]";
	}

}
