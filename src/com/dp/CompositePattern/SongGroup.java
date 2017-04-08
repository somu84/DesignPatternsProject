package com.dp.CompositePattern;

import java.util.*;

public class SongGroup extends SongComponent {
	
	ArrayList<SongComponent> songComponent = new ArrayList<>();
	
	String groupName;
	String groupDescr;
	
	public SongGroup(String newGrpN, String descr){
		groupName = newGrpN;
		groupDescr = descr;
	}
	
	public String getGroupName(){return groupName;}
	public String getGroupDescr(){return groupDescr;}
	
	
	public void add(SongComponent newComp){
		songComponent.add(newComp);
	}
	
	public void remove(SongComponent newComp){
		songComponent.remove(newComp);
	}
	
	public SongComponent getComponent(int indx){
		return songComponent.get(indx);
	}
	
	public void display(){
		System.out.println(groupName+" "+groupDescr);
		
		Iterator<SongComponent> sI = songComponent.iterator();
		while(sI.hasNext()){
			SongComponent s = sI.next();
			s.display();
		}
	}
}
