package az.developia.balance_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import az.developia.balance_management.entity.ExpenseCategoryEntity;

@Repository
public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategoryEntity, Integer>{

	@Query(value = "select * from expense_categories limit ?1,?2",nativeQuery = true)
	List<ExpenseCategoryEntity> findAllPagination(String name, Integer begin, Integer length);

}
