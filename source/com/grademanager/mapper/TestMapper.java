package com.grademanager.mapper;

import java.util.List;

import com.grademanager.beans.Name;

public interface TestMapper {

	List<Name> selectBean();

	int updateName(Name name1);

	int insertName(Name name1);

}
