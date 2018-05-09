package com.example.homifytest.controller;

import com.example.homifytest.exception.ResourceNotFoundException;
import com.example.homifytest.model.Professional;
import com.example.homifytest.repository.ProfessionalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfessionalController {

    @Autowired
    ProfessionalRepository professionalRepository;
    
    
    // Create a new professional
    
    @PostMapping("/professionals")
    public Professional createProfessional(@Valid @RequestBody Professional professional) {
        return professionalRepository.save(professional);
    }

    // Get a Single professional
    
    @GetMapping("/professionals/{id}")
    public Professional getProfessionalById(@PathVariable(value = "id") Long professionalId) {
        return professionalRepository.findById(professionalId)
                .orElseThrow(() -> new ResourceNotFoundException("Professional", "id", professionalId));
    }

    // Update a professional
    @PutMapping("/professionals/{id}")
    public Professional updateProfessional(@PathVariable(value = "id") Long professionalId,
                                            @Valid @RequestBody Professional professionalDetails) {

        Professional professional = professionalRepository.findById(professionalId)
                .orElseThrow(() -> new ResourceNotFoundException("Professional", "id", professionalId));

        professional.setHeader(professionalDetails.getHeader());
        professional.setFirstname(professionalDetails.getFirstname());
        professional.setLastname(professionalDetails.getLastname());
        professional.setUsername(professionalDetails.getUsername());
        professional.setCompanyname(professionalDetails.getCompanyname());
        professional.setPhone(professionalDetails.getPhone());
        professional.setEmail(professionalDetails.getEmail());
        professional.setWebsite(professionalDetails.getWebsite());
        professional.setCity(professionalDetails.getCity());
        professional.setCountry(professionalDetails.getCountry());
        professional.setLatitude(professionalDetails.getLatitude());
        professional.setLongitude(professionalDetails.getLongitude());
        professional.setTypes(professionalDetails.getTypes());
        professional.setProjects(professionalDetails.getProjects());
        
        
        Professional updatedProfessional = professionalRepository.save(professional);
        return updatedProfessional;
    }

    // Delete a professional
    @DeleteMapping("/professionals/{id}")
    public ResponseEntity<?> deleteProfessional(@PathVariable(value = "id") Long professionalId) 
    {
        Professional professional = professionalRepository.findById(professionalId)
            .orElseThrow(() -> new ResourceNotFoundException("Professional", "id", professionalId));

        professionalRepository.delete(professional);

        return ResponseEntity.ok().build();
    }
    
 // Get All Professionals for a given period of date
    @GetMapping("/professionals")
    public List<Professional> getAllProfessionals() {
        return professionalRepository.findAll();
    }
    
    }
