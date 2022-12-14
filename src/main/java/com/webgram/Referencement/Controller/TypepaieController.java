package com.webgram.Referencement.Controller;

import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Entity.Typepaie;
import com.webgram.Referencement.Service.EmployeeService;
import com.webgram.Referencement.Service.TypepaieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.aspectj.apache.bcel.Constants.types;

@RequiredArgsConstructor
@RequestMapping("/typ")
@CrossOrigin(origins = "http://localhost:4200")
public class TypepaieController {

    @Autowired

    private TypepaieService typepaieService;



    //Add new types
    @GetMapping("/addTypepaie")
    public Typepaie addTypepaie(@RequestBody Typepaie typepaie){
        return typepaieService.addTypepaie(typepaie);
    }
    // Add more than 1 Types
    @PostMapping("/addTypepaies")
    public List<Typepaie> addAllTypepaie(@RequestBody List<Typepaie> typepaies){
        return  typepaieService.addAllTypepaie(typepaies);
    }
    // Get typepaie by Id
    @GetMapping("/getTypepaieByID/{id}")
    public Typepaie getTypepaieById(@PathVariable int id){
        return typepaieService.getTypesByID(id);
    }
    // Get typepaie by type
    @GetMapping("/getTypepaieByName/{name}")

    public Typepaie getTypepaieByName(@PathVariable String name){
        return typepaieService.getTypesByName(name);
    }
    // Update typepaie
    @PutMapping("/updateTypepaie")
    public Typepaie updateTypepaie(@RequestBody Typepaie typepaie) {

        return typepaieService.updateTypepaie(typepaie);
    }

    // Delete typepaie
    @DeleteMapping("/deleteTypepaieById/{id}")
    public boolean deleteTypepaieByID(@PathVariable int id) {
        return typepaieService.deleteTypepaieByID(id);
    }


    // Get all typepaie
    @GetMapping("/getAll")
    public List<Typepaie> getAllTypepaie() {
        return typepaieService.getAllTypepaies();
    }



}
