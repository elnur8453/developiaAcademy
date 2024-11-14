package az.developia.balance_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import az.developia.balance_management.entity.IncomeCategoryEntity;

@Repository
public interface IncomeCategoryRepository extends JpaRepository<IncomeCategoryEntity, Integer>{

	@Query(value = "select * from income_categories limit ?1,?2",nativeQuery = true)
	List<IncomeCategoryEntity> findAllPagination(String name, int begin, int length);

}
