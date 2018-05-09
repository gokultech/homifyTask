package com.example.easynotes.controller;

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
    
    // Get All Notes
    @GetMapping("/professionals")
    public List<Professional> getAllNotes() {
        return professionalRepository.findAll();
    }

    // Create a new professional
    
    @PostMapping("/professionals")
    public Professional createNote(@Valid @RequestBody Professional professional) {
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
        

        Professional updatedProfessional = professionalRepository.save(professional);
        return updatedProfessional;
    }

    // Delete a professional
    
    
    
    
}
