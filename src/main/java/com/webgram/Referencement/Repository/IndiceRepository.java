package com.webgram.Referencement.Repository;

import com.webgram.Referencement.Entity.Indice;
import com.webgram.Referencement.Entity.Typepaie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndiceRepository extends JpaRepository<Indice,Integer> {

    Indice getByName (String name  );


    Indice   findByName ( String  name );
}
