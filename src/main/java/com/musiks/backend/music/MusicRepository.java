package com.musiks.backend.music;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MusicRepository extends Neo4jRepository<Music, Long> {
}
