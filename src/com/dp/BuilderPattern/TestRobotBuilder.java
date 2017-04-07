package com.dp.BuilderPattern;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotEngineer engineer = new RobotEngineer(oldStyleRobot);
		
		engineer.makeRobot();
		
		Robot firstRobot = engineer.getRobot();
		
		System.out.println("Robot Built");
		System.out.println("Robot Head: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso: "+firstRobot.getRobotTorso());
		System.out.println("Robot Arms: "+firstRobot.getRobotArms());
		System.out.println("Robot Head: "+firstRobot.getRobotLegs());
		
	}

}
