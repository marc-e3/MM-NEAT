# Usage:   postBestWatch.bat <experiment directory> <log prefix> <run type> <run number> <number of trials per individual>
# Example: postBestWatch.bat onelifeconflict OneLifeConflict OneModule 0 5
java -jar "dist/MM-NEATv2.jar" runNumber:$4 parallelEvaluations:false experiment:edu.utexas.cs.nn.experiment.BestNetworkExperiment base:$1 log:$2-$3 saveTo:$3 trials:$5 watch:true showNetworks:true io:false netio:false onlyWatchPareto:true printFitness:true animateNetwork:false monitorInputs:true modePheremone:true
