package exercise.springjpa.ProdactManager.service;

import exercise.springjpa.ProdactManager.domain.Product;
import exercise.springjpa.ProdactManager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listAll() {
        return repository.findAll();
    }

    public void save(Product product) {
        repository.save(product);
    }

    public Product get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
