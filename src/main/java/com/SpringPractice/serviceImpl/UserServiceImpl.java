package com.SpringPractice.serviceImpl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringPractice.constant.UserConstant;
import com.SpringPractice.entity.User;
import com.SpringPractice.entity.UserSaveHistory;
import com.SpringPractice.repository.UserRepository;
import com.SpringPractice.repository.UserSaveHistoryRepository;
import com.SpringPractice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	/*
	 * @Autowired private UserSaveHistory userSaveHistory;
	 */
	
	@Autowired
	private UserSaveHistoryRepository userSaveHistoryRepository;

	@Override
	public String saveUser(User user) {
		User savedUser = this.userRepo.save(user);
		UserSaveHistory usersave =new UserSaveHistory();
		if(savedUser != null) {
			usersave.setUserName(savedUser.getUserName());
			usersave.setUserQualification(savedUser.getUserQualification());
			usersave.setHistoryTime(new Date());
			usersave.setUserAge(savedUser.getUserAge());
		}
		this.userSaveHistoryRepository.save(usersave);
		
	  return UserConstant.SaveUser;
	}

	@Override
	public User youngeAgeAndHighSalary() {
		
		List<User> allUser = this.userRepo.findAll();
		User flatMap = allUser.stream().min(Comparator.comparingInt(User::getUserAge))
		        .flatMap(youngestuser -> allUser.stream()
				.filter(users -> users.getUserAge()==youngestuser.getUserAge())
				.max(Comparator.comparingInt(User::getUserSalary))).get();
		
		return flatMap;
	}
	

}
