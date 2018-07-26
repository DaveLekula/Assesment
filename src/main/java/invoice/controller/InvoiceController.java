package invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import invoice.entity.Invoice;
import invoice.repo.InvoiceRepo;

@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceRepo invoiceData;
	
	@RequestMapping(value ="/invoices",method = RequestMethod.POST)
	public void addInvoice(Invoice invoice) {
		
		invoiceData.save(invoice);
	}
	
	@RequestMapping("/invoices")
	public List<Invoice> viewAllInvoices(){
		
		
		List<Invoice> allInvoice = invoiceData.findAll();
		return allInvoice;
		
		
	}
	
	@RequestMapping("/invoices/{id}")
	public Invoice viewInvoice(@PathVariable String id) {
		long iD = Long.parseLong(id);
		if(invoiceData.existsById(iD)) {
			return invoiceData.getOne(iD);
		}
		return null;
	}
	

}
