package baseball;

import java.util.Scanner;

public class GamePlayer {
    public static final int NUMBER_LENGTH = 3;
    public static final String CORRECT_MESSAGE = "숫자를 모두 맞히셨습니다! 게임 종료";

    public static void playGame(Scanner scanner){
        // generate answer
        String answer = AnswerGenerator.generate(NUMBER_LENGTH);
        System.out.println(answer);
        // get user input
        Score score;
        do {
            String userInput = UserInput.getNumber(scanner);
            score = AnswerCounter.calculateScore(userInput, answer);
            score.print();
        } while (score.getStrike() != 3);



    }
}
