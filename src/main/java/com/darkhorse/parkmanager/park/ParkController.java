package com.darkhorse.parkmanager.park;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/parks")
public class ParkController {

    @GetMapping()
    public ResponseEntity<?> getAllParks() {
        return new ResponseEntity<String>("Hellow", HttpStatus.OK);

    }
    

}
