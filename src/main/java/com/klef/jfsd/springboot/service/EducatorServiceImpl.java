package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Educator;
import com.klef.jfsd.springboot.repository.EducatorRepository;

@Service
public class EducatorServiceImpl implements EducatorService {
	
	@Autowired
	private EducatorRepository educatorRepository;

	@Override
	public Educator checkedulogin(String email, String pwd) {
		return educatorRepository.checkedulogin(email, pwd);
	}

	@Override
	public String registerEducator(Educator educator) {
		// TODO Auto-generated method stub
		return null;
	}

}
