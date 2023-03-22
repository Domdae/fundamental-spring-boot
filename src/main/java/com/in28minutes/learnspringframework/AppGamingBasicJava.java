package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.Game.GameRunner;
import com.in28minutes.learnspringframework.Game.MarioGame;
import com.in28minutes.learnspringframework.Game.PacmanGame;
import com.in28minutes.learnspringframework.Game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
