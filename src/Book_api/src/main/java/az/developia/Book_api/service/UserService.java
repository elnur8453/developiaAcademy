package az.developia.Book_api.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import az.developia.Book_api.entity.UserEntity;
import az.developia.Book_api.repository.UserRepository;
import az.developia.Book_api.request.UserAddRequestDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private UserRepository repo;

	public void add(UserAddRequestDTO req) {
		String parol = req.getPassword();
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String bcryptParol = "{bcrypt}" + encoder.encode(parol);
		
		UserEntity u = new UserEntity(req.getUsername(), bcryptParol, 1);
		repo.save(u);
		
		repo.addUserAuthorities(req.getUsername());
	}

}
