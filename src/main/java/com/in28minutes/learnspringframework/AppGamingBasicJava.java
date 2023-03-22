package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.Game.GameRunner;
import com.in28minutes.learnspringframework.Game.MarioGame;
import com.in28minutes.learnspringframework.Game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
