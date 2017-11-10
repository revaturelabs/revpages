package com.revature.beans;

import java.sql.Clob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@Column
	@SequenceGenerator(allocationSize=1, name="postseq", sequenceName="postseqgen")
	@GeneratedValue(generator="postseq", strategy=GenerationType.SEQUENCE)
	private Long post_id;
	@Column
	private Clob post_content;
	@Column
	private int user_id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private List<Post> child_post_id;
	
	
	public Long getPost_id() {
		return post_id;
	}
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	public Clob getPost_content() {
		return post_content;
	}
	public void setPost_content(Clob post_content) {
		this.post_content = post_content;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Post(Long post_id, Clob post_content, int user_id) {
		super();
		this.post_id = post_id;
		this.post_content = post_content;
		this.user_id = user_id;
	}	
	
	public Post(){
		
	}
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_content=" + post_content + ", user_id=" + user_id
				+ ", parent_post_id=" + "]";
	}
	
	
	
	
	
}
