package com.music.music.controller;

import com.music.music.dto.MusicDto;
import com.music.music.entity.Music;
import com.music.music.service.MusicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/music")
public class MusicController {

    private final MusicService musicService;

    @GetMapping("/list")
    public ResponseEntity<List<Music>> list() {
        List<Music> music = musicService.getAllMusic();
        if (music.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(music);
    }

}
