package invoice.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Invoice {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String client;
	private long vatRate;
	private Date invoiceDate;
	@OneToMany
	private List<LineItem> lineItem = new ArrayList<LineItem>();
	
	public BigDecimal getSubTotal() {
		
		double sum = 0; 
		for(LineItem x: lineItem) {
			sum = sum + x.getLineTotal().doubleValue();
		}
		
		BigDecimal subTot = new BigDecimal(sum);
		return subTot;
		
	}
	
	public BigDecimal getVat() {
		BigDecimal vat = new BigDecimal("0.15");
		BigDecimal vatPrice = getSubTotal().multiply(vat);
		return vatPrice;
		
	}
	
	
	public BigDecimal getTotal() {
		
		BigDecimal garndTotal = getSubTotal().subtract(getVat());
		return garndTotal;
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public long getVatRate() {
		return vatRate;
	}

	public void setVatRate(long vatRate) {
		this.vatRate = vatRate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}
	
	
	
	
}
