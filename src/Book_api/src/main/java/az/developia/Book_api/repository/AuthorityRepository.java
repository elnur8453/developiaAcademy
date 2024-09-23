package az.developia.Book_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.Book_api.entity.AuthorityEntity;

public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long>{
    List<AuthorityEntity> findAllByUsername(String Username);
}
