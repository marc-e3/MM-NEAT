cd ..
cd ..
java -jar dist/MM-NEATv2.jar runNumber:0 randomSeed:0 maxGens:200 mu:25 io:true netio:true base:HNMsPacMan mating:true task:edu.utexas.cs.nn.tasks.mspacman.MsPacManTask cleanOldNetworks:true pacManLevelTimeLimit:8000 pacmanInputOutputMediator:edu.utexas.cs.nn.tasks.mspacman.sensors.MsPacManHyperNEATMediator trials:1 log:HNMsPacMan-tester saveTo:HNMsPacMan hyperNEAT:true genotype:edu.utexas.cs.nn.evolution.genotypes.HyperNEATCPPNGenotype allowMultipleFunctions:true fs:false ftype:1 netChangeActivationRate:0.3 watch:true monitorSubstrates:true showNetworks:true showCPPN:true stepByStep:true
