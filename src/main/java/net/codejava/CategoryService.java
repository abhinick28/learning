package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repo;
    public void save(Category category){repo.save(category);}
}
