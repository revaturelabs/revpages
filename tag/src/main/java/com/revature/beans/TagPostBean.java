package com.revature.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="tag")

public class TagPostBean {

	@Id
	@Column
	@SequenceGenerator(allocationSize=1, name="postseq", sequenceName="postseqgen")
	@GeneratedValue(generator="postseq", strategy=GenerationType.SEQUENCE)
	private Long tag_id;
	@Column
	private Long post_id;
	public Long getTag_id() {
		return tag_id;
	}
	public void setTag_id(Long tag_id) {
		this.tag_id = tag_id;
	}
	public Long getPost_id() {
		return post_id;
	}
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	
}
