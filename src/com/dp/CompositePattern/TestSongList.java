package com.dp.CompositePattern;

public class TestSongList {
	public static void main(String[] args){
		SongComponent ind = new SongGroup("Industrial", "");
		SongComponent mtl = new SongGroup("Metal", "");
		
		
		SongComponent everySong = new SongGroup("Song List", "All Songs");
		
		everySong.add(ind);
		
		ind.add(new Song("HQWEWE", "INI", 1990));
		ind.add(mtl);
		
		DiscJokey cJ = new DiscJokey(everySong);
		cJ.getSongList();
	}
}
