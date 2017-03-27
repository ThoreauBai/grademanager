package com.grademanager.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grademanager.beans.Name;
import com.grademanager.mapper.TestMapper;
import com.grademanager.services.NameService;

@Service(value="nameService")
public class NameServiceImpl implements NameService{
	@Autowired
	private TestMapper testMapper;

	@Override
	public List<Name> getAllName() {
		return testMapper.selectBean();
	}

	@Override
	public int updateName(Name name1) {
		return testMapper.updateName(name1);
	}

	@Override
	public int insertName(Name name1) {
		// TODO Auto-generated method stub
		return testMapper.insertName(name1);
	}
	
	

}
