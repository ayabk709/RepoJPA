package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepisitory extends JpaRepository<Product,Long> {
//C EST LA PARTIE DAO
    //bnisba la partie metier on definier des methode qui stok les crud

    @Query("select p from Product p where p.name like :x")
    List<Product> search(@Param("x") String name);

    List<Product> findByNameStartingWith(String prefix);
}
