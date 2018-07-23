package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "usertest")
@EntityListeners(AuditingEntityListener.class) // 多加
public class SignUp {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
	@Id
	@NotBlank
	private String user_account;
	@NotBlank
	private String email;
	@NotBlank 
	private String password;

	private transient MultipartFile photoFile;
	private String selfie;

	public SignUp() {
	}

	

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MultipartFile getPhotoFile() {
		return photoFile;
	}

	public void setPhotoFile(MultipartFile photoFile) {
		this.photoFile = photoFile;
	}

	public String getSelfie() {
		return selfie;
	}

	public void setSelfie(String selfie) {
		this.selfie = selfie;
	}

	// 搞懂
	public void setPhoto() {
		this.selfie = photoFile.getOriginalFilename();
	}

}
