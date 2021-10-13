package baseball;

import java.util.Scanner;

public class GamePlayer {
    public static final int NUMBER_LENGTH = 3;
    private static final String CORRECT_MESSAGE = "숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_MESSAGE = "게임을 다시 하시겠습니까? \n1. 다시 시작 \n2. 게임 종료";

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
        System.out.println(CORRECT_MESSAGE);

        // restart game?
        restartGame(scanner);

    }

    private static void restartGame(Scanner scanner){
        System.out.println(RESTART_MESSAGE);
        String userInput = scanner.nextLine();
        System.out.println(userInput == "1");
        if (userInput.equals("1")) {
            playGame(scanner);
        } else if (userInput.equals("2")){
            return;
        }

        throw new IllegalArgumentException();
    }
}
