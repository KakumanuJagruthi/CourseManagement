package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Educator;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.EducatorRepository;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private EducatorRepository educatorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Admin checkadminLogin(String uname, String pwd) 
	{
		
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public List<Educator> ViewAllEducators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> ViewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteedu(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletestu(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long educount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long stucount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
