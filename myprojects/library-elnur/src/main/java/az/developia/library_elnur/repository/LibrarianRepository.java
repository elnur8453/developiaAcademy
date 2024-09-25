package az.developia.library_elnur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import az.developia.library_elnur.entity.LibrarianEntity;

@Repository
public interface LibrarianRepository extends JpaRepository<LibrarianEntity, Long>{
}
