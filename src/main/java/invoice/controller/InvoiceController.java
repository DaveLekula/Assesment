package invoice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import invoice.entity.Invoice;

@RestController
public class InvoiceController {
	
	
	@RequestMapping(value ="/invoices",method = RequestMethod.POST)
	public String addInvoice(Invoice invoice) {
		Invoice vInvoice = new Invoice();
		vInvoice = invoice;
		
		return ("redirect:/invoices");
		
	}
	
	@RequestMapping("/invoices")
	public List<Invoice> viewAllInvoices(){
		return null;
		
		
	}
	
	@RequestMapping("/invoices/id")
	public Invoice viewInvoice() {
		return null;
		
		
	}
	

}
