package com.dp.CompositePattern;

public class Song extends SongComponent{
	String songName;
	String bandName;
	int year;
	
	public Song(String n, String b, int y){
		songName = n;
		bandName = b;
		year = y;
	}
	
	public String getSongName(){return songName;}
	public String getBandName() {return bandName;}
	public int getYear(){return year;}
	
	public void display(){
		System.out.println(songName+ " was by "+bandName+" year "+year);
	}
	
	

}
