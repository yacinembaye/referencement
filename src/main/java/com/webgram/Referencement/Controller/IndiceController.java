package com.webgram.Referencement.Controller;


import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Entity.Indice;
import com.webgram.Referencement.Service.EmployeeService;
import com.webgram.Referencement.Service.IndiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ind")
public class IndiceController {

    @Autowired

    private IndiceService indiceService;



    //Add new indice
    @GetMapping("/addIndice")
    public Indice addIndice(@RequestBody Indice indice){
        return indiceService.addIndice(indice);
    }
    // Add more than 1 indice
    @PostMapping("/addIndices")
    public List<Indice> addAllIndice(@RequestBody List<Indice> indices){
        return  indiceService.addAllIndices(indices);
    }
    // Get indice by Id
    @GetMapping("/getIndiceByID/{id}")
    public Indice getIndiceById(@PathVariable int id){
        return indiceService.getIndiceByID(id);
    }
    // Get indice by name
    @GetMapping("/getIndiceByName/{name}")

    public Indice getIndiceByName(@PathVariable String name){
        return indiceService.getIndiceByName(name);
    }
    // Update indice
    @PutMapping("/updateIndice")
    public Indice updateIndice(@RequestBody Indice indice) {

        return indiceService.updateIndice(indice);
    }

    // Delete indice
    @DeleteMapping("/deleteIndiceById/{id}")
    public boolean deleteIndiceByID(@PathVariable int id) {
        return indiceService.deleteIndiceByID(id);
    }


    // Get all indice
    @GetMapping("/getAll")
    public List<Indice> getAllIndice() {
        return indiceService.getAllIndices();
    }



}
