package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prodotti.Sale;

public interface RepoSale extends JpaRepository<Sale,String>{

}
