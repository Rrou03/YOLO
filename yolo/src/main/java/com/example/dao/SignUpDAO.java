package com.example.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.entity.SignUp;
import com.example.repository.SignUpRepository;


public interface SignUpDAO extends JpaRepository<SignUp,String> {
	
	
	
}



//
//@Service
//public class SignUpDAO {
//	@Autowired
//	SignUpRepository signupRepository;
//	
//	/* save user */
//	public SignUp save(SignUp signup) {
//		return signupRepository.save(signup);
//	}
//	
//	/* search all user */
//	public List<SignUp> findAll(){
//		return signupRepository.findAll();
//	}
//	
//	/* get user */
//	public Optional<SignUp> findOne(Long signupid) {//change Long to String
//		return signupRepository.findById(signupid);
//	}
//	
//	
//	/* delete user */
//	public void delete(SignUp signup) {
//		signupRepository.delete(signup);
//	}
//}


