package com.hexaware.hotelroom.Exceptions;

public class BookingNotFoundException extends RuntimeException {
	private static final long serialVersionUID=1L;
	public String message;
	
	public BookingNotFoundException (String message) {
		super();
		this.message=message;
	}
	public String getMessage() {
		return message;
	}

}
