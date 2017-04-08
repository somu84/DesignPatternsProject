package com.dp.IteratorPattern;

public class RadioStation {
	
	public static void main(String[] args){
		Song70s s7 = new Song70s();
		Song80s s8 = new Song80s();
		Song90s s9 = new Song90s();
		
		DiscJokey dj = new DiscJokey(s7, s8, s9);
		dj.showTheSongs();
	}

}
