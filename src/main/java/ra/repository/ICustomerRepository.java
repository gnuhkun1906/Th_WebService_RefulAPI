package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.Customer;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
