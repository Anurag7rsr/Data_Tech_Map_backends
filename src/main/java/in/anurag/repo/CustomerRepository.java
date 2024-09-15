package in.anurag.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anurag.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
