package com.dp.IteratorPattern;

import java.util.*;

public class Song70s implements SongIterator{
	
	ArrayList<SongInfo> bestSongs;
	
	public Song70s(){
		bestSongs  = new ArrayList<>();
		addSong("Imagine", "JL", 1971);
		addSong("Hotel California", "Eagles", 1974);
	}
	
	public void addSong(String songName, String bandName, int yearReleased){
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(song);
	}
	

	@Override
	public Iterator<SongInfo> createIterator() {
		return bestSongs.iterator();
	}
	
}
