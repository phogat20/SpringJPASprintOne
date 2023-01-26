package com.admin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Cafe {

	@Id
	private int cafeId;

	@NotNull(message = "Please enter Owner's Name!")
	private String ownerName;

	@Email(message = "Please enter a vaild E-mail address!")
	private String email;

	private String gender;

	@Pattern(regexp = "^\\d{10}$", message = "Invaild Mobile Number!")
	private String mobileNo;

	@Min(60)
	private String age;

	@NotNull(message = "Please enter location of your cafe")
	private String place;

	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cafe(int cafeId, @NotNull(message = "Please enter Owner's Name!") String ownerName,
			@Email(message = "Please enter a vaild E-mail address!") String email, String gender,
			@Pattern(regexp = "^\\d{10}$", message = "Invaild Mobile Number!") String mobileNo, @Min(60) String age,
			@NotNull(message = "Please enter location of your cafe") String place) {
		super();
		this.cafeId = cafeId;
		this.ownerName = ownerName;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.age = age;
		this.place = place;
	}

	public int getCafeId() {
		return cafeId;
	}

	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", ownerName=" + ownerName + ", email=" + email + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", age=" + age + ", place=" + place + "]";
	}
	
	
}
