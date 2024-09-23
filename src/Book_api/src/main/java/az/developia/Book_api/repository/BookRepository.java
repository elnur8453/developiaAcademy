package az.developia.Book_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import az.developia.Book_api.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
	
	@Query(value = "SELECT * FROM books limit ?1,?2", nativeQuery = true)
	List<BookEntity> findAllPagination(Integer begin, Integer length);
	// findAllPagination(3,10)

	@Query(value = "SELECT count(*) FROM books", nativeQuery = true)
	Integer findAllCount();
	
	@Query(value = "SELECT * FROM books where name like %?1%", nativeQuery = true)
	List<BookEntity> findAllSearch(String name);
	
	@Query(value = "SELECT * FROM books where creator = %?1 limit ?2,?3", nativeQuery = true)
	List<BookEntity> findAllByCreatorPagination(String creator, Integer begin, Integer length);
}
