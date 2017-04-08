package com.dp.IteratorPattern;

import java.util.*;

public class Song90s implements SongIterator{
	HashMap<Integer, SongInfo> bestSongs;
	Integer count = 0;
	public Song90s(){
		bestSongs  = new HashMap<>();
		addSong("Imagine", "JL", 1971);
		addSong("Hotel California", "Eagles", 1974);
	}
	
	public void addSong(String songName, String bandName, int yearReleased){
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		bestSongs.put(count, song);
		count++;
	}
	

	@Override
	public Iterator<SongInfo> createIterator() {
		return bestSongs.values().iterator();
	}

}
