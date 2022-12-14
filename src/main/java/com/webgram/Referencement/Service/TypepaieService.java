package com.webgram.Referencement.Service;


import com.webgram.Referencement.Entity.Typepaie;
import com.webgram.Referencement.Repository.TypepaieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypepaieService {

    @Autowired
    private TypepaieRepository typepaieRepository;

    public Typepaie addTypepaie(Typepaie typepaie) {
        return typepaieRepository.save(typepaie);
    }

    public List<Typepaie>
    addAllTypepaies(List<Typepaie> typepaies) {
        return typepaieRepository.saveAll(typepaies);
    }

    public Typepaie getTypesByID(int id) {
        return typepaieRepository.findById(id).orElse(null);
    }

    public Typepaie getTypesByName(String name) {
        return typepaieRepository.findByName(name);
    }

    public Typepaie updateTypepaie(Typepaie typepaie) {
        Typepaie existingTYP = typepaieRepository.findById(typepaie.getId()).orElse(null);
        System.out.println(typepaie);
        if (existingTYP == null) {
            System.out.println("Emp not found");
            return typepaieRepository.save(typepaie);
        } else {
            existingTYP.setName(typepaie.getName());


        }
        return typepaie;

    }

    public boolean deleteTypepaieByID(int id) {
        Typepaie existingTYP = typepaieRepository.getById(id);
        if (existingTYP!= null) {
            typepaieRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public List<Typepaie> getAllTypepaies() {
        return typepaieRepository.findAll();
    }

    public List<Typepaie> addAllTypepaie(List<Typepaie> typepaies) {
        return null;
    }



}
