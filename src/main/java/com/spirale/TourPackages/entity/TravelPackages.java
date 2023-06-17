package com.spirale.TourPackages.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.Instant;
@Entity
public class TravelPackages {

	@Id	
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer packageId;
	
	private String packageName;
	private String destination;
	
	
     @Column(name="description",length=1024)
	private String description;
     
	private String duration;
	private Integer price;
	
	private Instant createdAt;
	private Instant updateAt;
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
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
		return Objects.hash(createdAt, description, destination, duration, packageId, packageName, price, updateAt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelPackages other = (TravelPackages) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(description, other.description)
				&& Objects.equals(destination, other.destination) && Objects.equals(duration, other.duration)
				&& Objects.equals(packageId, other.packageId) && Objects.equals(packageName, other.packageName)
				&& Objects.equals(price, other.price) && Objects.equals(updateAt, other.updateAt);
	}
	
	public TravelPackages() {
		// TODO Auto-generated constructor stub
	}
	public TravelPackages(Integer packageId, String packageName, String destination, String description,
			String duration, Integer price, Instant createdAt, Instant updateAt) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.destination = destination;
		this.description = description;
		this.duration = duration;
		this.price = price;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	
	/*
	 * @OneToMany( targetEntity = Booking.class, cascade= CascadeType.ALL)
	 * 
	 * @JoinColumn(name="packageId") Set<Booking> bookingList;
	 */
	
  
	
}
