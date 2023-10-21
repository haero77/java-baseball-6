package baseball.controller;

import baseball.console.InputManager;
import baseball.console.OutputManager;
import baseball.model.BallMaker;
import baseball.model.BaseballJudge;

public class GameManager {

    private InputManager inputManager;
    private OutputManager outputManager;
    private BallMaker ballMaker;
    private BaseballJudge baseballJudge;

    private GameManager() {
    }

    public static GameManager create() {
        GameManager gameManager = new GameManager();
        gameManager.init();
        return gameManager;
    }

    private void init() {
        this.inputManager = new InputManager();
        this.outputManager = new OutputManager();
        this.ballMaker = new BallMaker();
    }

    public void start() {
        outputManager.printGameStartText();
        this.baseballJudge = new BaseballJudge(ballMaker.createBall());
    }

}
