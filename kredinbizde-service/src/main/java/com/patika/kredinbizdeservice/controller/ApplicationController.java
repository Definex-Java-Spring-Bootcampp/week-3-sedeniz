package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/{bank}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createApplication(@RequestBody ApplicationRequest request, @PathVariable String bank) {
        return ResponseEntity.ok().body(applicationService.createApplication(request, bank));
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<List<Application>> getApplicationsByUser(@PathVariable String email) {
        List<Application> applications = applicationService.getApplicationsByUserEmail(email);
        if (applications.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(applications);
    }


}
