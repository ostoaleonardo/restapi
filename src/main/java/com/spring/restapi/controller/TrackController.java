package com.spring.restapi.controller;

import com.spring.restapi.entity.Track;
import com.spring.restapi.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tracks")
public class TrackController {

    @Autowired
    private TrackService service;

    @GetMapping
    public List<Track> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Track> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/save")
    public Track save(@RequestBody Track track) {
        return service.save(track);
    }

    @PutMapping("/update")
    public Track update(@RequestBody Track track) {
        return service.save(track);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
