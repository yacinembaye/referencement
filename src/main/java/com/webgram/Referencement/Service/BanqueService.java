package com.webgram.Referencement.Service;


import com.webgram.Referencement.Entity.Banque;
import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Repository.BanqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BanqueService {

    @Autowired
    private BanqueRepository banqueRepository;

    public Banque addBanque(Banque banque){
        return banqueRepository.save(banque);
    }


    public List<Banque> addAllBanques(List<Banque> banques){

        return banqueRepository.saveAll(banques);
    }


    public Banque getBanqueByID(int id){
        return banqueRepository.findById(id).orElse(null);
    }


    public Banque getBanqueByName(String name) {
        return banqueRepository.findByName(name);
    }


    public Banque updateBanque(Banque banque){
        Banque existingBAN = banqueRepository.findById(banque.getId()).orElse(null);
        System.out.println(banque);
        if(existingBAN == null){
            System.out.println("Ban not found");
            return banqueRepository.save(banque);
        }else {
            existingBAN.setName(banque.getName());
            existingBAN.setNumeroservice(banque.getNumeroservice());
            existingBAN.setChefservice(banque.getChefservice());
        }
        return banque;
    }
    public boolean deleteBanqueByID(int id){
        Banque existingBAN = banqueRepository.getById(id);
        if (existingBAN != null) {
            banqueRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public List<Banque> getAllBanques() {
        return banqueRepository.findAll();
    }

}
