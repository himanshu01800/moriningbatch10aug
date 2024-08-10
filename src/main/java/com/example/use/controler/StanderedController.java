package com.example.use.controler;

import com.example.use.entity.Standered;
import com.example.use.service.StanderedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standered")
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class StanderedController {

    private  final StanderedService standeredService;

    public StanderedController(StanderedService standeredService) {
        this.standeredService = standeredService;
    }

     @GetMapping
    public ResponseEntity<List<Standered>> getStandered() {
        return ResponseEntity.ok(standeredService.getAllStandered());
     }
     @PostMapping
    public ResponseEntity<Boolean> addStandered(@RequestBody Standered standered) {
        return ResponseEntity.ok(standeredService.addStandered(standered));
     }

     @PutMapping
    public ResponseEntity<Boolean> updateStandered(@RequestBody Standered standered) {
        return ResponseEntity.ok(standeredService.editStandered(standered));
     }
     @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteStandered(@PathVariable int id) {
        return ResponseEntity.ok(standeredService.deleteStandered(id));
     }
}
