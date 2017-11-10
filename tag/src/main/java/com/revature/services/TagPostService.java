package com.revature.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.TagPostBean;
import com.revature.revpages.tag.repository.TagBeanRepository;

@Service
public class TagPostService {

	@Autowired
	private TagBeanRepository tr;

	public TagBeanRepository getTr() {
		return tr;
	}

	public void setTr(TagBeanRepository tr) {
		this.tr = tr;
	}

	public List<TagPostBean> findAll() {
		return tr.findAll();
	}

	public TagPostBean Insert(TagPostBean tag) {
		return tr.save(tag);
	}
}
