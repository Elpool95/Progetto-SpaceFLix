package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prodotti.Customer;

public interface RepoCustomer extends JpaRepository<Customer,String>{

}
