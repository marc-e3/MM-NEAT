cd ..
cd ..
java -jar dist/MM-NEATv2.jar runNumber:%1 randomSeed:%1 base:animationbreeder trials:1 mu:16 maxGens:500 io:true netio:true mating:true fs:true task:edu.utexas.cs.nn.tasks.interactive.animationbreeder.AnimationBreederTask log:AnimationBreeder-Advanced saveTo:Advanced allowMultipleFunctions:true ftype:0 watch:false netChangeActivationRate:0.3 cleanFrequency:-1 recurrency:false saveInteractiveSelections:true simplifiedInteractiveInterface:false saveAllChampions:true cleanOldNetworks:false logTWEANNData:false logMutationAndLineage:true ea:edu.utexas.cs.nn.evolution.selectiveBreeding.SelectiveBreedingEA imageWidth:2000 imageHeight:2000 imageSize:200
