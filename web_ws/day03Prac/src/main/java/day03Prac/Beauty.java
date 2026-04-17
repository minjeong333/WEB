package day03Prac;

import java.util.ArrayList;

public class Beauty {
	
	String name;
	String product;
	int quantity;
	String price; // TO_CHAR를 썼기 때문에(포맷팅한 상태) 문자열로 받아야 오류가 안남 INT형으로 쓸거면 쿼리문에서 TO_CHAR를 뺄 것 !
	String orderStatus;
	String deliverStatus; // 배송상태에 NULL값이 있으므로 LEFT JOIN을 해줘야 값이 나옴

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuentity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	public String getDeliverStatus() {
		return deliverStatus;
	}

	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	//BeautyDAO에서 ResultSet 값을 담을 때 사용
	public Beauty(String name, String product, int quantity, String price, String orderStatus, String deliverStatus) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.orderStatus = orderStatus;
        this.deliverStatus = deliverStatus;
    }
	
	public Beauty() {
		
	}

	@Override
	public String toString() {
		return "Beauty [name=" + name + ", product=" + product + ", quantity=" + quantity + ", price=" + price
				+ ", orderStatus=" + orderStatus + ", deliverStatus=" + deliverStatus + "]";
	}

}
