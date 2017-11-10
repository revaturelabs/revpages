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
public class TagBean {

	@Id
	@Column
	@SequenceGenerator(allocationSize=1, name="postseq", sequenceName="postseqgen")
	@GeneratedValue(generator="postseq", strategy=GenerationType.SEQUENCE)
	private Long tag_id;
	@Column
	private String tag_value;
	public Long getTag_id() {
		return tag_id;
	}
	public void setTag_id(Long tag_id) {
		this.tag_id = tag_id;
	}
	public String getTag_value() {
		return tag_value;
	}
	public void setTag_value(String tag_value) {
		this.tag_value = tag_value;
	}
	
}
