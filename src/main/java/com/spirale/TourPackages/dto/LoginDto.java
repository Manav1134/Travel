package com.spirale.TourPackages.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class LoginDto {
	
		
		private String email;
		private String password;
		private Collection<? extends GrantedAuthority> role;
		public LoginDto() {
			
		}
		public LoginDto(String email, String password) {
			super();
			this.email = email;
			this.password = password;
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
		@Override
		public String toString() {
			return "LoginDto [email=" + email + ", password=" + password + "]";
		}
		
		public void setRole(Collection<? extends GrantedAuthority> role) {
			this.role = role;
		}

		public Collection<? extends GrantedAuthority> getRole() {
			return role;
		}

	}
