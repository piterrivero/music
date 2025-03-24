package com.music.music.repository;

import com.music.music.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository {

    public List<Music> getAllMusic() {
        List<Music> musicList = new ArrayList<>();

        Music m1 = new Music(1, "Iron Maiden", "Fear of the Dark");
        musicList.add(m1);

        Music m2 = new Music(2, "Black Sabbath", "Paranoid");
        musicList.add(m2);

        Music m3 = new Music(3, "ACDC", "Back in Black");
        musicList.add(m3);

        Music m4 = new Music(4, "Metallica", "Master of Puppets");
        musicList.add(m4);

        Music m5 = new Music(5, "Ozzy Osbourne", "Bark at the moon");
        musicList.add(m5);

        return musicList;
    }

}
