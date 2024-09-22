package az.developia.Book_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import az.developia.Book_api.entity.CustomerViewEntity;

@Repository
public interface CustomerViewRepository extends JpaRepository<CustomerViewEntity, Long> {
	
	
}
