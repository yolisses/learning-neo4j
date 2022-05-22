package com.musiks.backend.music;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Flux;

public interface MusicRepository extends ReactiveNeo4jRepository<Music,Long> {
    public Flux<Music> findAll();
}
