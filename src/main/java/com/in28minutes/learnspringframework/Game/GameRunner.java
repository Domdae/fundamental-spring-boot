package com.in28minutes.learnspringframework.Game;

public class GameRunner {
    private SuperContraGame game;
    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Runnning game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
