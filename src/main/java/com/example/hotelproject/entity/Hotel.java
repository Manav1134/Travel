package com.example.hotelproject.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer hotelId;
	private Integer hoteltype;
	private String hotelname;
	private Integer hotelrent;
	@Override
	public int hashCode() {
		return Objects.hash(acroom, description, discount, feedback, foodList, hotelId, hotelname, hotelrent, hoteltype,
				non_acroom, occupied, roomavailable);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(acroom, other.acroom) && Objects.equals(description, other.description)
				&& Objects.equals(discount, other.discount) && Objects.equals(feedback, other.feedback)
				&& Objects.equals(foodList, other.foodList) && Objects.equals(hotelId, other.hotelId)
				&& Objects.equals(hotelname, other.hotelname) && Objects.equals(hotelrent, other.hotelrent)
				&& Objects.equals(hoteltype, other.hoteltype) && Objects.equals(non_acroom, other.non_acroom)
				&& Objects.equals(occupied, other.occupied) && Objects.equals(roomavailable, other.roomavailable);
	}

	private String description;
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hoteltype=" + hoteltype + ", hotelname=" + hotelname + ", hotelrent="
				+ hotelrent + ", description=" + description + ", discount=" + discount + ", acroom=" + acroom
				+ ", non_acroom=" + non_acroom + ", roomavailable=" + roomavailable + ", occupied=" + occupied
				+ ", feedback=" + feedback + ", foodList=" + foodList + "]";
	}
	public Hotel() {
		
	}

	public Hotel(Integer hotelId, Integer hoteltype, String hotelname, Integer hotelrent, String description,
			Integer discount, String acroom, String non_acroom, Integer roomavailable, Integer occupied,
			String feedback, Set<Food> foodList) {
		super();
		this.hotelId = hotelId;
		this.hoteltype = hoteltype;
		this.hotelname = hotelname;
		this.hotelrent = hotelrent;
		this.description = description;
		this.discount = discount;
		this.acroom = acroom;
		this.non_acroom = non_acroom;
		this.roomavailable = roomavailable;
		this.occupied = occupied;
		this.feedback = feedback;
		this.foodList = foodList;
	}
	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getHoteltype() {
		return hoteltype;
	}

	public void setHoteltype(Integer hoteltype) {
		this.hoteltype = hoteltype;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public Integer getHotelrent() {
		return hotelrent;
	}

	public void setHotelrent(Integer hotelrent) {
		this.hotelrent = hotelrent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getAcroom() {
		return acroom;
	}

	public void setAcroom(String acroom) {
		this.acroom = acroom;
	}

	public String getNon_acroom() {
		return non_acroom;
	}

	public void setNon_acroom(String non_acroom) {
		this.non_acroom = non_acroom;
	}

	public Integer getRoomavailable() {
		return roomavailable;
	}

	public void setRoomavailable(Integer roomavailable) {
		this.roomavailable = roomavailable;
	}

	public Integer getOccupied() {
		return occupied;
	}

	public void setOccupied(Integer occupied) {
		this.occupied = occupied;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Set<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(Set<Food> foodList) {
		this.foodList = foodList;
	}

	private Integer discount;
	private String acroom;
	private String non_acroom;
	private Integer roomavailable;
	private Integer occupied;
	private String feedback;
	
	@OneToMany(targetEntity=Food.class, cascade=CascadeType.ALL)
	@JoinColumn(name="hotelId")
	Set<Food> foodList;
	

}

