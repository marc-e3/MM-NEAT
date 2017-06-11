cd ..
cd ..
java -jar dist/MM-NEATv2.jar runNumber:%1 randomSeed:%1 base:isolatedconflict maxGens:200 mu:100 io:true netio:true mating:true task:edu.utexas.cs.nn.tasks.mspacman.MsPacManPillsVsEdibleFromCornersMultitask highLevel:true infiniteEdibleTime:false pacManLevelTimeLimit:8000 pacmanInputOutputMediator:edu.utexas.cs.nn.tasks.mspacman.sensors.mediators.IICheckEachDirectionMediator trials:10 log:IsolatedConflict-MMD saveTo:MMD fs:false edibleTime:200 trapped:true mazePowerPillGhostMapping:data/pacman/PowerPillToGhostLocationMapping.txt removePillsNearPowerPills:true mmdRate:0.1 perLinkMutateRate:0.05 netLinkRate:0.4 netSpliceRate:0.2 crossoverRate:0.5
