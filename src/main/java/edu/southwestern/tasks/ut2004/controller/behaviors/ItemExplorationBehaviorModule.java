/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.southwestern.tasks.ut2004.controller.behaviors;

import cz.cuni.amis.pogamut.ut2004.bot.impl.UT2004BotModuleController;
import edu.southwestern.tasks.ut2004.controller.RandomItemPathExplorer;

/**
 *
 * @author Jacob Schrum
 */
public class ItemExplorationBehaviorModule extends RandomItemPathExplorer implements BehaviorModule {

	public boolean trigger(UT2004BotModuleController bot) {
		// Bottom level behavior
		return true;
	}
}
