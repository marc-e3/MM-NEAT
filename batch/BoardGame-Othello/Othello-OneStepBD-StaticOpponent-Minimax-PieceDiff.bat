cd ..
cd ..
java -jar dist/MM-NEATv2.jar runNumber:%1 randomSeed:%1 base:othello trials:10 maxGens:500 mu:100 io:true netio:true mating:true task:edu.utexas.cs.nn.tasks.boardGame.StaticOpponentBoardGameTask cleanOldNetworks:true fs:false log:Othello-OneStepMOBD-StaticOpponent-Minimax-PieceDiff saveTo:MOBD-StaticOpponent-Minimax-PieceDiff boardGame:boardGame.othello.Othello boardGameOpponent:boardGame.agents.treesearch.BoardGamePlayerMinimaxAlphaBetaPruning boardGameOpponentHeuristic:boardGame.heuristics.PieceDifferentialBoardGameHeuristic ea:edu.utexas.cs.nn.evolution.nsga2.bd.BDNSGA2