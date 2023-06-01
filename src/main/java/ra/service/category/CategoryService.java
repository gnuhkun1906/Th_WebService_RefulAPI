package ra.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Category;
import ra.repository.IBlogRepository;
import ra.repository.ICategory;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategory category;
    @Override
    public Iterable<Category> findAll() {
        return category.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return category.findById(id);
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
