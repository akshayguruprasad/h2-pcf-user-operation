package com.indream.pcfflow.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.indream.pcfflow.model.User;
@Transactional
public interface UserRepo extends PagingAndSortingRepository<User, String>{

}
