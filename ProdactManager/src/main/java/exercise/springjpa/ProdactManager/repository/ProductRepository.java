package exercise.springjpa.ProdactManager.repository;

import exercise.springjpa.ProdactManager.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
