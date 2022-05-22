package com.musiks.backend.music;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MusicController {

    MusicRepository musicRepository;

    @GetMapping("/hello")
    public String hello() {
        musicRepository.save(new Music(1L, "Hello"));
        return "Hello world";
    }

    @GetMapping
    public List<Music> all() {
        return musicRepository.findAll();
    }
}
