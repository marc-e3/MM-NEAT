java -jar dist/MM-NEATv2.jar runNumber:%1 randomSeed:%1 base:torus trials:7 maxGens:100 mu:100 io:true netio:true mating:false fs:true task:edu.utexas.cs.nn.tasks.gridTorus.TorusEvolvedPredatorsVsStaticPreyTask log:PredVsStaticPreyTeam-Control saveTo:Control allowDoNothingActionForPredators:true torusPreys:10 torusPredators:3 staticPreyController:edu.utexas.cs.nn.gridTorus.controllers.PreyFleeClosestPredatorController torusSenseTeammates:true