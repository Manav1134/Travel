package com.spirale.TourPackages.entity;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookingId;
	private Integer totalAmount;
	private Instant bookingDate;
	private Integer noOfTravelers;
	private String paymentMode;
	private String bookingStatus;
	private String paymentStatus;
	
   private Integer pacakgeId;
   private Integer customerId;
   private Integer hotelId;
   private Integer transportId;
   private Integer agencyId;
   private Integer foodId;

   
	private Instant updateAt;

	
	
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingId, Integer totalAmount, Instant bookingDate, Integer noOfTravelers,
			String paymentMode, String bookingStatus, String paymentStatus, Integer pacakgeId, Integer customerId,
			Integer hotelId, Integer transportId, Integer agencyId, Integer foodId, Instant updateAt) {
		super();
		this.bookingId = bookingId;
		this.totalAmount = totalAmount;
		this.bookingDate = bookingDate;
		this.noOfTravelers = noOfTravelers;
		this.paymentMode = paymentMode;
		this.bookingStatus = bookingStatus;
		this.paymentStatus = paymentStatus;
		this.pacakgeId = pacakgeId;
		this.customerId = customerId;
		this.hotelId = hotelId;
		this.transportId = transportId;
		this.agencyId = agencyId;
		this.foodId = foodId;
		this.updateAt = updateAt;
	}


	public Integer getBookingId() {
		return bookingId;
	}


	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}


	public Integer getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}


	public Instant getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Instant bookingDate) {
		this.bookingDate = bookingDate;
	}


	public Integer getNoOfTravelers() {
		return noOfTravelers;
	}


	public void setNoOfTravelers(Integer noOfTravelers) {
		this.noOfTravelers = noOfTravelers;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Integer getPacakgeId() {
		return pacakgeId;
	}


	public void setPacakgeId(Integer pacakgeId) {
		this.pacakgeId = pacakgeId;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public Integer getHotelId() {
		return hotelId;
	}


	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}


	public Integer getTransportId() {
		return transportId;
	}


	public void setTransportId(Integer transportId) {
		this.transportId = transportId;
	}


	public Integer getAgencyId() {
		return agencyId;
	}


	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}


	public Integer getFoodId() {
		return foodId;
	}


	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}


	


	public Instant getUpdateAt() {
		return updateAt;
	}


	public void setUpdateAt(Instant updateAt) {
		this.updateAt = updateAt;
	}
	

	
	
	@Override
	public int hashCode() {
		return Objects.hash(agencyId, bookingDate, bookingId, bookingStatus, customerId, foodId, hotelId, noOfTravelers,
				pacakgeId, paymentMode, paymentStatus, totalAmount, transportId, updateAt);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(agencyId, other.agencyId) && Objects.equals(bookingDate, other.bookingDate)
				&& Objects.equals(bookingId, other.bookingId) && Objects.equals(bookingStatus, other.bookingStatus)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(foodId, other.foodId)
				&& Objects.equals(hotelId, other.hotelId) && Objects.equals(noOfTravelers, other.noOfTravelers)
				&& Objects.equals(pacakgeId, other.pacakgeId) && Objects.equals(paymentMode, other.paymentMode)
				&& Objects.equals(paymentStatus, other.paymentStatus) && Objects.equals(totalAmount, other.totalAmount)
				&& Objects.equals(transportId, other.transportId) && Objects.equals(updateAt, other.updateAt);
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", totalAmount=" + totalAmount + ", bookingDate=" + bookingDate
				+ ", noOfTravelers=" + noOfTravelers + ", paymentMode=" + paymentMode + ", bookingStatus="
				+ bookingStatus + ", paymentStatus=" + paymentStatus + ", pacakgeId=" + pacakgeId + ", customerId="
				+ customerId + ", hotelId=" + hotelId + ", transportId=" + transportId + ", agencyId=" + agencyId
				+ ", foodId=" + foodId + ", updateAt=" + updateAt + "]";
	}





}