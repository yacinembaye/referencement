package com.webgram.Referencement.Controller;


import com.webgram.Referencement.Entity.Banque;
import com.webgram.Referencement.Service.BanqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ban")
@CrossOrigin(origins = "http://localhost:4200")
public class BanqueController {

    @Autowired
    private BanqueService banqueService;



    //Add new Banque
    @GetMapping("/addBanque")
    public Banque addBanque(@RequestBody Banque banque){
        return banqueService.addBanque(banque);
    }
    //Add more 1 Banque
    @PostMapping("/addBanques")
    public List<Banque>addAllBanque(@RequestBody List<Banque> banques){
        return banqueService.addAllBanques(banques);
    }
    //Get banque by id
    @GetMapping("/getBanqueByID/{id}")
    public Banque getBanqueById(@PathVariable int id){
        return banqueService.getBanqueByID(id);
    }
    //Get banque By Name
    @GetMapping("/getBanqueByName/{name}")
    public Banque getBanqueByName(@PathVariable String name){
        return banqueService.getBanqueByName(name);
    }
    //update Banque
    @PutMapping("/updateBanque")
    public Banque updateBasnque(@RequestBody Banque banque){
        return banqueService.updateBanque(banque);
    }
    //delete Banque
    @DeleteMapping("/deleteBanqueById/{id}")
    public boolean deleteBanqueByID(@PathVariable int id){
        return banqueService.deleteBanqueByID(id);
    }
    //Get All Banque
    @GetMapping("/getAll")
    public List<Banque> getAllBanque(){
        return banqueService.getAllBanques();
    }
}
