package ProjectPersonal.example.ProjectPersonal.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import ProjectPersonal.example.ProjectPersonal.models.User;
import ProjectPersonal.example.ProjectPersonal.services.ServiceUser;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "/api/comments")
public class controllerUser {
    @Autowired
    private ServiceUser service;


    @GetMapping(value ="")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAll());
    }
    

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> get(@PathVariable Long id){
        Optional<User> oUser = service.findById(id);
        if(oUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUser.get());
    }

    @PostMapping(value ="")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody User user){
        try{
            return ResponseEntity.ok(service.save(user));
        }catch(Exception e){
            return ResponseEntity.status(500).body("Error");
        }
    }

    @DeleteMapping(value ="/{id}")
    public void erase(@PathVariable Long id){
        service.deleteById(id);
    }

    @PutMapping( "/{id}")
    public ResponseEntity<?> update(@RequestBody User userDetails, @PathVariable Long id){
        Optional<User> user = service.findById(id);
        if(!user.isPresent()){
            return ResponseEntity.notFound().build();
        }

        user.get().setName(userDetails.getName());
        user.get().setComment(userDetails.getComment());
        return ResponseEntity.status(201).body(service.save(user.get()));
    }
}
   





