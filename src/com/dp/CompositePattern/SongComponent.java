package com.dp.CompositePattern;

public abstract class SongComponent {
	
	public void add (SongComponent newSongComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove (SongComponent newSongComponent){
		throw new UnsupportedOperationException();
	}
	
	public SongComponent getComponent (SongComponent newSongComponent){
		throw new UnsupportedOperationException();
	}
	
	public String getSongName(){
		throw new UnsupportedOperationException();
	}
	
	public String getBandName(){
		throw new UnsupportedOperationException();
	}
	
	public int getYear(){
		throw new UnsupportedOperationException();
	}
	
	public void display(){
		throw new UnsupportedOperationException();
	}
}
