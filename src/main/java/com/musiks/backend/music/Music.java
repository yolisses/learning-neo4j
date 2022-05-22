package com.musiks.backend.music;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node
@Data
@AllArgsConstructor
public class Music {
    @Id private Long id;
    @Property private String name;
}
