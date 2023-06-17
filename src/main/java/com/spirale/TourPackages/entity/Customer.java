package com.spirale.TourPackages.entity;

import java.time.Instant;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

	@NotBlank(message="name is required")
	private String name;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@NotBlank(message="email is required")
	@Email(message="invalid email fromat")
	@Column( unique=true)
	private String email;
	
	@NotBlank(message="Password is required")
	/* @Size(min=4, max=20,message="Password must be between 8 to 20 characters") */
	private String password;
	
	@NotBlank(message="confirm Password is required")
	private String confirmPassword;

	
	
	private Instant createdAt;
	private Instant updateAt;
	  
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer customerId, @NotBlank(message = "name is required") String name, UserRole role,
			@NotBlank(message = "email is required") @Email(message = "invalid email fromat") String email,
			@NotBlank(message = "Password is required") String password,
			@NotBlank(message = "confirm Password is required") String confirmPassword, Instant createdAt,
			Instant updateAt) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public UserRole getRole() {
		return role;
	}


	public void setRole(UserRole role) {
		this.role = role;
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


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public Instant getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}


	public Instant getUpdateAt() {
		return updateAt;
	}


	public void setUpdateAt(Instant updateAt) {
		this.updateAt = updateAt;
	}


	


	@Override
	public int hashCode() {
		return Objects.hash(confirmPassword, createdAt, customerId, email, name, password, role, updateAt);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(confirmPassword, other.confirmPassword) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(updateAt, other.updateAt);
	}


	public enum UserRole{
		Admin,
		Customer,
		Transport,
		Ticketservice,
		Hotel
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", role=" + role + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", createdAt=" + createdAt
				+ ", updateAt=" + updateAt + "]";
	}
}
