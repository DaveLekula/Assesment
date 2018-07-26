package invoice.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import invoice.entity.Invoice;

@Service
public class InvoiceService {
	private BigDecimal vat;
	private BigDecimal subtotal;
	private BigDecimal total;
	private Invoice invoice;
	
	public InvoiceService sendFullInvoice(Invoice inv) {
		vat = inv.getVat();
		subtotal = inv.getSubTotal();
		total = inv.getTotal();
		invoice = inv;
		return this;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
