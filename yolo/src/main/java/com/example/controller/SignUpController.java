package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.SignUpDAO;
import com.example.entity.SignUp;

@RestController
@RequestMapping("/")
public class SignUpController {

	@Autowired
	SignUpDAO signupDAO;

	// 查詢全部的users
	@GetMapping("/user")
	public List<SignUp> getAllUsers() {
		return signupDAO.findAll();

	}

	// 查詢特定user 使用id
	@RequestMapping(value = "/{useraccount}")
	public Optional<SignUp> read(@PathVariable String useraccount) {
		return signupDAO.findById(useraccount);
	}

	// 新增
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody SignUp signup) {
		signupDAO.save(signup);
	}

	// 更改
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody SignUp signup) {
		signupDAO.save(signup);

	}

	// 刪除
	@RequestMapping(value = "/{useraccount}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String useraccount) {
		signupDAO.deleteById(useraccount);

	}

}

//	/* save an user */
//	@PostMapping("/user")
//	public SignUp createUser(@Valid @RequestBody SignUp signup) {
//		return signupDAO.save(signup);
//
//	}
//
//	/* get all users */
//	@GetMapping("/user")
//	public List<SignUp> getAllUsers() {
//		return signupDAO.findAll();
//
//	}
//
//	/* get user by signupid */
//	@GetMapping("/user/{id}")
//	public ResponseEntity<Optional<SignUp>> getUserById(@PathVariable(value = "id") Long signupid) {
//
//		Optional<SignUp> signup = signupDAO.findOne(signupid);
//		if (signup == null) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().body(signup);
//	}
//
//	/* update an user by signupid */
//	@PutMapping("/user/{id}")
//	public ResponseEntity<SignUp> updateUser(@PathVariable(value = "id") Long signupid,
//			@Valid @RequestBody SignUp userDetails) {
//		Optional<SignUp> signup = signupDAO.findOne(signupid);
//		if (signup == null) {
//			return ResponseEntity.notFound().build();
//		}
//		SignUp s = new SignUp();
//		s.setUser_account(userDetails.getUser_account());
//		s.setEmail(userDetails.getEmail());
//		s.setPassword(userDetails.getPassword());
//
//		SignUp updateUser = signupDAO.save(s);
//		return ResponseEntity.ok().body(updateUser);
//
//	}
//		 
//
//	/* delete an user */
//	@DeleteMapping("/user/{id}")
//	public ResponseEntity<SignUp> deleteUser(@PathVariable(value = "id") Long signupid) {
//		Optional<SignUp> signup = signupDAO.findOne(signupid  );
//		if (signup == null) {
//			return ResponseEntity.notFound().build();
//		}
//		SignUp s = new SignUp();
//		signupDAO.delete(s);
//		return ResponseEntity.ok().build();
//
//	}
