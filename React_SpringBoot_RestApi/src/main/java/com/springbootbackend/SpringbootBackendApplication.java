package com.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootbackend.model.User;
import com.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Kanna", "Varikoppula", "KannaVarikoppula@gmail.com"));
        this.userRepository.save(new User("Mehar", "mondeti", "MeharMondeti@gmail.com"));
        this.userRepository.save(new User("jeeva", "chandramalla", "jeevachandramalla@gmail.com"));
    }
}
