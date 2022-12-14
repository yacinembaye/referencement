package com.webgram.Referencement.Repository;

import com.webgram.Referencement.Entity.Banque;
import com.webgram.Referencement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<Banque, Integer> {

    Banque getByName (String name  );


    Banque findByName(String name);
}
