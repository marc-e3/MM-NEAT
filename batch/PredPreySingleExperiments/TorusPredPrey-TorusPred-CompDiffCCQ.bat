cd ..
cd ..
java -jar dist/MM-NEATv2.jar runNumber:%1 randomSeed:%1 base:toruscompete teams:10 maxGens:500 mu:100 io:true netio:true mating:false fs:false task:edu.utexas.cs.nn.tasks.gridTorus.cooperativeAndCompetitive.CompetitiveAndCooperativePredatorsVsPreyTask log:TorusCompete-DiffCCQ saveTo:DiffCCQ allowDoNothingActionForPredators:true torusPreys:2 torusPredators:3 predatorCatchClose:false predatorCoOpCCQ:true preyRRM:false preyCoOpCCQ:true torusSenseTeammates:true ea:edu.utexas.cs.nn.evolution.nsga2.CoevolutionNSGA2 experiment:edu.utexas.cs.nn.experiment.evolution.LimitedMultiplePopulationGenerationalEAExperiment teamLog:true bestTeamScore:false saveAllChampions:true