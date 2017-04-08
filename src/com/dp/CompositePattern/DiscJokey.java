package com.dp.CompositePattern;

public class DiscJokey {
	
	SongComponent songList;
	
	public DiscJokey(SongComponent newS){
		songList = newS;
	}
	
	public void getSongList(){
		songList.display();
	}

}
