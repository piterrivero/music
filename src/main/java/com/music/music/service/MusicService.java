package com.music.music.service;

import com.music.music.entity.Music;
import com.music.music.repository.MusicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MusicService {

    private final MusicRepository musicRepository;

    public List<Music> getAllMusic() {
        return musicRepository.getAllMusic();
    }

}
