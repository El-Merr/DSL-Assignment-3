/*
 * generated by Xtext 2.27.0
 */
package nl.tue.dsldesign.robot.validation;

import org.eclipse.xtext.validation.Check;

import nl.tue.dsldesign.robot.metamodel.Robot;
import nl.tue.dsldesign.robot.metamodel.Step;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class RobotValidator extends AbstractRobotValidator {
	
	int MAX_STEP_DISTANCE = 5;
	int BOUND = 10;
	
	// checks that step distances are not negative
	@Check
	public void checkDistanceNonNegative(Robot r) {
		for (Step s : r.getSteps()) {
			if (s.getDistance() < 0) {
				error("A step's distance must be positive", s, null);
			}
		}
	}
	
	// checks if no two sequential steps have the same direction
	@Check
	public void checkNoSequentialDirections(Robot r) {
		String prevDirection = "";
		for (Step s : r.getSteps()) {
			if (s.getDirection().toString().equals(prevDirection)) {
				error("Two squential steps cannot have the same direction. \n "
						+ "Combine the step's distance instead", s, null);
			}
			prevDirection = s.getDirection().toString();
		}
	}
	
	// checks if the step distance is lower than the max step size
	@Check
	public void checkMaxStepSize(Robot r) {
		
		for (Step s : r.getSteps()) {
			if (s.getDistance() > MAX_STEP_DISTANCE) {
				error("The maximum distance per step is "+MAX_STEP_DISTANCE, s, null);
			}
		}
	}
	// checks if the robot goes out of bounds at any time
	@Check
	public void checkOutOfBounds(Robot r) {
		int xPos = r.getInitial().getXPos();
		int yPos = r.getInitial().getYPos();
		for (Step s : r.getSteps()) {
			if (s.getDirection().toString().equals("up")) {
				yPos += s.getDistance();
			} else if (s.getDirection().toString().equals("down"))	{
				yPos -= s.getDistance();
			} else if (s.getDirection().toString().equals("right")) {
				xPos += s.getDistance();
			} else {
				xPos -= s.getDistance();
			}
			if(Math.abs(xPos) > BOUND || Math.abs(yPos) > BOUND) {
				error("The robot's position must be between 10 or -10 at all times", r, null);	
			}
		}
	}
	// Checks if the robot's initial position is within bounds
	@Check
	public void checkInitialPosition(Robot r) {
		int xPos = r.getInitial().getXPos();
		int yPos = r.getInitial().getYPos();
		if(Math.abs(xPos) > BOUND || Math.abs(yPos) > BOUND) {
			error("The initial position must be between 10 or -10", r.getInitial(), null);
		}
	}
	
}
