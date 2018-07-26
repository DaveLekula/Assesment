package invoice.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
@Entity
public class LineItem {
	
	private long id;
	private long quantity;
	private String description;
	private BigDecimal unitprice;
	
	public BigDecimal getLineTotal() {
		
		BigDecimal quantityVal = new BigDecimal(quantity);
		BigDecimal lineTotal = quantityVal.multiply(unitprice);
		return lineTotal;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}
	
	
	
	

}
