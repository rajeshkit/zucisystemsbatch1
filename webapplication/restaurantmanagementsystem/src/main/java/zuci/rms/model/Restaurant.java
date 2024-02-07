package zuci.rms.model;

import java.util.Date;

public class Restaurant {
	private int restaurantId;
	private String restaurantName;
	private String restaurantAddress;
	private long restaurantPhone;
	private Date restaurantDoe;
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int restaurantId, String restaurantName, String restaurantAddress, long restaurantPhone,
			Date restaurantDoe) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantPhone = restaurantPhone;
		this.restaurantDoe = restaurantDoe;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public long getRestaurantPhone() {
		return restaurantPhone;
	}
	public void setRestaurantPhone(long restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}
	public Date getRestaurantDoe() {
		return restaurantDoe;
	}
	public void setRestaurantDoe(Date restaurantDoe) {
		this.restaurantDoe = restaurantDoe;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantAddress=" + restaurantAddress + ", restaurantPhone=" + restaurantPhone
				+ ", restaurantDoe=" + restaurantDoe + "]";
	}
	

}
