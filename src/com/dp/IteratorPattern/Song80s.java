package com.dp.IteratorPattern;

import java.util.*;

public class Song80s implements SongIterator{
	SongInfo[] bestSongs;
	int arrayValue = 0;
	public Song80s(){
		bestSongs  = new SongInfo[2];
		addSong("Imagine", "JL", 1971);
		addSong("Hotel California", "Eagles", 1974);
	}
	
	public void addSong(String songName, String bandName, int yearReleased){
		SongInfo song = new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrayValue] = song;
		arrayValue++;
	}
	

	@Override
	public Iterator<SongInfo> createIterator() {
		return Arrays.asList(bestSongs).iterator();
	}

}
