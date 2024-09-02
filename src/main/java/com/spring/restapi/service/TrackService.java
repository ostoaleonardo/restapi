package com.spring.restapi.service;

import com.spring.restapi.entity.Track;
import com.spring.restapi.repository.ITrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    @Autowired
    private ITrackRepository repository;

    public String index() {
        return "Tracks";
    }

    public List<Track> findAll() {
        return repository.findAll();
    }

    public Optional<Track> findById(Long id) {
        return repository.findById(id);
    }

    public Track save(Track track) {
        return repository.save(track);
    }

    public Track update(Track track) {
        return repository.save(track);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
