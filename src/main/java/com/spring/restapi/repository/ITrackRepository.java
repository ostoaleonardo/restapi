package com.spring.restapi.repository;

import com.spring.restapi.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrackRepository extends JpaRepository<Track, Long> {
}
