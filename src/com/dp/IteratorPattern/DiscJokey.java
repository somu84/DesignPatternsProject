package com.dp.IteratorPattern;

import java.util.Iterator;

public class DiscJokey {
	
	Song70s s1 = new Song70s();
	Song80s s2 = new Song80s();
	Song90s s3 = new Song90s();

	
	SongIterator it70; 
	SongIterator it80;
	SongIterator it90;
	
	public DiscJokey(SongIterator i1, SongIterator i2, SongIterator i3){
		it70 = i1;
		it80 = i2;
		it90 = i3;
	}
	
	public void showTheSongs(){
		Iterator<SongInfo> s70 = it70.createIterator();
		Iterator<SongInfo> s80 = it80.createIterator();
		Iterator<SongInfo> s90 = it90.createIterator();
		System.out.println("Songs of 70s");
		printTheSongs(s70);
		
		System.out.println("Songs of 80s");
		printTheSongs(s80);
		
		System.out.println("Songs of 90s");
		printTheSongs(s90);
		
	}
	
	private void printTheSongs(Iterator<SongInfo> it){
		while(it.hasNext()){
			SongInfo t = it.next();
			System.out.println("Song Name: "+t.getSongName()+" Band Name: "+t.getBandName()+ " Year "+t.getYearReleased() );
		}
	}
}
