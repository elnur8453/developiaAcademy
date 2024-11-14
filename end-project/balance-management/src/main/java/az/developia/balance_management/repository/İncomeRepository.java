package az.developia.balance_management.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import az.developia.balance_management.entity.IncomeEntity;

@Repository
public interface İncomeRepository extends JpaRepository<IncomeEntity, Integer>{

	@Query(value = "SELECT * FROM incomes LIMIT ?1,?2", nativeQuery = true)
	List<IncomeEntity> getAllIncome(Integer begin, Integer length);
	
	@Query(value = "SELECT * FROM incomes i WHERE i.category_id = ?1 AND i.date BETWEEN ?2 AND ?3 LIMIT ?4,?5", nativeQuery = true)
	List<IncomeEntity> getAllIncomeByFilter(Integer categoryId, LocalDate startDate, LocalDate endDate, Integer begin, Integer length);

	@Query(value = "SELECT * FROM incomes i WHERE i.date BETWEEN ?1 AND ?2 LIMIT ?3,?4", nativeQuery = true)
	List<IncomeEntity> getAllIncomeByDate(LocalDate startDate, LocalDate endDate, Integer begin, Integer length);

	

}
