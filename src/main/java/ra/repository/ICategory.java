package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ra.model.Category;

@Repository
public interface ICategory extends PagingAndSortingRepository<Category, Long> {
}
