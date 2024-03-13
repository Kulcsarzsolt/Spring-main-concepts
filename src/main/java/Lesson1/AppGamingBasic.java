package Lesson1;

import Lesson1.game.GameRunner;
import Lesson1.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args){
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
