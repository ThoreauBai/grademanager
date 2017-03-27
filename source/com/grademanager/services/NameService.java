package com.grademanager.services;

import java.util.List;

import com.grademanager.beans.Name;

public interface NameService {

	List<Name> getAllName();

	int updateName(Name name1);

	int insertName(Name name1);
}
