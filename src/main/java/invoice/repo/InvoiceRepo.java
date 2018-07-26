package invoice.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import invoice.entity.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice,Long> {

}
