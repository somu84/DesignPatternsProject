package com.dp.BuilderPattern;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public OldRobotBuilder(){
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Atimantium Torso");
		
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Tin Arms");
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Dilithium Legs");
		
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}
	

}
