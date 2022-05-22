package com.musiks.backend.music;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@AllArgsConstructor
public class Music {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
