package com.webgram.Referencement.Service;

import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Entity.Indice;
import com.webgram.Referencement.Repository.EmployeeRepository;
import com.webgram.Referencement.Repository.IndiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndiceService {
    @Autowired

    private IndiceRepository indiceRepository;

    public Indice addIndice(Indice indice) {
        return indiceRepository.save(indice);
    }

    public List<Indice>
    addAllIndices(List<Indice> indices) {
        return indiceRepository.saveAll(indices);
    }

    public Indice getIndiceByID(int id) {
        return indiceRepository.findById(id).orElse(null);
    }

    public Indice getIndiceByName(String name) {
        return indiceRepository.findByName(name);
    }

    public Indice updateIndice(Indice indice) {
        Indice existingIND = indiceRepository.findById(indice.getId()).orElse(null);
        System.out.println(indice);
        if (existingIND == null) {
            System.out.println("Emp not found");
            return indiceRepository.save(indice);
        } else {
            existingIND.setName(indice.getName());


        }
        return indice;

    }

    public boolean deleteIndiceByID(int id) {
        Indice existingIND = indiceRepository.getById(id);
        if (existingIND != null) {
            indiceRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public List<Indice> getAllIndices() {
        return indiceRepository.findAll();
    }

}
