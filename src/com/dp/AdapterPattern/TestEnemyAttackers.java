package com.dp.AdapterPattern;

public class TestEnemyAttackers {
	
	public static void main(String[] args){
		EnemyTank tank = new EnemyTank();
		tank.assignDriver("Han Solo");
		tank.driveForward();
		tank.fireWeapon();
		EnemyRobot newRobot = new EnemyRobot();
		EnemyAttacker robot = new EnemyRobotAdapter(newRobot);
		robot.assignDriver("Han Solo");
		robot.driveForward();
		robot.fireWeapon();
	}

}
