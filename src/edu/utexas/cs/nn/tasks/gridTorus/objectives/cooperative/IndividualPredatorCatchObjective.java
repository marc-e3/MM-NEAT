package edu.utexas.cs.nn.tasks.gridTorus.objectives.cooperative;

import edu.utexas.cs.nn.evolution.Organism;
import edu.utexas.cs.nn.networks.Network;
import edu.utexas.cs.nn.tasks.gridTorus.objectives.GridTorusObjective;

/**
 * 
 * @author rollinsa
 * 
 *         Find the score of the predator based on how many prey it killed
 */
public class IndividualPredatorCatchObjective<T extends Network> extends GridTorusObjective<T> {

	int predIndex = 0;
	
	/**
	 * Creates an IndividualPredatorCatchObjective for the given predator, where the score
	 * is how many prey the given predator has caught
	 * @param pred, predator index
	 */
	public IndividualPredatorCatchObjective(int pred){
		predIndex = pred;
	}
	
	
	@Override
	/**
	 * Find the score of the predator based on how many prey it killed
	 */
	public double fitness(Organism<T> individual) {
		// return a score based on number of caught prey by this predator
		return game.getPreyCatchesForThisPred(predIndex);
	}

}