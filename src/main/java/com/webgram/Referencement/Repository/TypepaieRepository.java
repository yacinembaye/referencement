package com.webgram.Referencement.Repository;

import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Entity.Typepaie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TypepaieRepository extends JpaRepository<Typepaie , Integer> {
    Typepaie getByName (String name  );


    Typepaie  findByName ( String  name );

}
