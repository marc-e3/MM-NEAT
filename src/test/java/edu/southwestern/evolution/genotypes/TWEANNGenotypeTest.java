package edu.southwestern.evolution.genotypes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.southwestern.MMNEAT.MMNEAT;
import edu.southwestern.evolution.EvolutionaryHistory;
import edu.southwestern.evolution.genotypes.TWEANNGenotype.LinkGene;
import edu.southwestern.evolution.genotypes.TWEANNGenotype.NodeGene;
import edu.southwestern.parameters.CommonConstants;
import edu.southwestern.parameters.Parameters;
import edu.southwestern.util.stats.StatisticsUtilities;

public class TWEANNGenotypeTest {

	final static int MUTATIONS1 = 10;

	@Before
	public void setup() {
		// Default test params for tests that don't need more specific settings
		Parameters.initializeParameterCollections(
				new String[] { "io:false", "netio:false" });
		MMNEAT.clearClasses();
		EvolutionaryHistory.setInnovation(0);
		EvolutionaryHistory.setHighestGenotypeId(0);
	}

	@After
	public void tearDown() throws Exception {
		MMNEAT.clearClasses();
	}
	
	@Test
	public void test_Equals() {
		Parameters.initializeParameterCollections(
				new String[] { "io:false", "netio:false", "allowMultipleFunctions:true", "recurrency:false" });
		MMNEAT.loadClasses();

		TWEANNGenotype tg1 = new TWEANNGenotype(5, 2, 0);
		TWEANNGenotype tg2 = new TWEANNGenotype(5, 2, 0);

		MMNEAT.genotype = tg1.copy();
		EvolutionaryHistory.initArchetype(0);

		TWEANNGenotype check = tg1;
		assertTrue(check.equals(tg1));
		assertFalse(tg1.equals(tg2));
		for (int i = 0; i < MUTATIONS1; i++) {
			tg1.mutate();
			tg2.mutate();
		}
	}

	@Test
	public void test_sameStructure() {
		Parameters.initializeParameterCollections(
				new String[] { "io:false", "netio:false", "allowMultipleFunctions:true", "recurrency:false" });
		CommonConstants.freezeBeforeModeMutation = true;
		MMNEAT.loadClasses();

		TWEANNGenotype tg1 = new TWEANNGenotype(5, 2, 0);
		TWEANNGenotype tg2 = new TWEANNGenotype(5, 2, 0);
		MMNEAT.genotype = tg1.copy();
		EvolutionaryHistory.initArchetype(0);

		for (int i = 0; i < MUTATIONS1; i++) {
			tg1.mutate();
			tg2.mutate();
		}

		TWEANNGenotype tg1Copy = (TWEANNGenotype) tg1.copy();
		assertTrue(TWEANNGenotype.sameStructure(tg1Copy, tg1));
		assertFalse(TWEANNGenotype.sameStructure(tg1, tg2));
	}

	@Test
	public void test_getLinksBetween() {
		TWEANNGenotype tg1 = new TWEANNGenotype(2, 1, 0);
		LinkGene lg = tg1.getLinkBetween(-1, -3);
		assertTrue(lg != null);
		assertTrue(lg.sourceInnovation == -1);
		assertTrue(lg.targetInnovation == -3);
	}

	@Test
	public void test_biggestInnovation() {
		EvolutionaryHistory.archetypes = null;
		EvolutionaryHistory.setInnovation(0l); // reset
		Parameters.initializeParameterCollections(
				new String[] { "io:false", "netio:false", "allowMultipleFunctions:true", "recurrency:false" });
		MMNEAT.loadClasses();
		TWEANNGenotype tg1 = new TWEANNGenotype(5, 2, 0);
		MMNEAT.genotype = tg1.copy();
		EvolutionaryHistory.initArchetype(0);

		for (int i = 0; i < MUTATIONS1; i++) {
			tg1.mutate();
		}

//		System.out.println(tg1);
//		System.out.println(EvolutionaryHistory.largestUnusedInnovationNumber);
//		MiscUtil.waitForReadStringAndEnterKeyPress();
		
		ArrayList<NodeGene> tg1Genes = tg1.nodes;
		ArrayList<LinkGene> tg1Links = tg1.links;

		long[] tg1innoGene = new long[tg1Genes.size()];
		long[] tg1innoLink = new long[tg1Links.size()];
		for (int i = 0; i < tg1Genes.size(); i++) {
			tg1innoGene[i] = tg1Genes.get(i).innovation;
		}
		for (int i = 0; i < tg1Links.size(); i++) {
			tg1innoLink[i] = tg1Links.get(i).innovation;
		}
		long trueMaxInnoGene = StatisticsUtilities.maximum(tg1innoGene);
		long trueMaxInnoLink = StatisticsUtilities.maximum(tg1innoLink);
		long trueMaxInno = Math.max(trueMaxInnoGene, trueMaxInnoLink);
		long maxInno = tg1.biggestInnovation();

		assertEquals(trueMaxInno,maxInno); // Failed?
	}
}
