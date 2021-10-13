package baseball;


import java.util.Scanner;

public class UserInput {
    private static final String INPUT_TEXT = "숫자를 입력해주세요 : ";

    public static String getNumber(Scanner scanner){
        System.out.println(INPUT_TEXT);

        String inputNumber = scanner.nextLine();
        if (InputValidator.check(inputNumber)){
            return inputNumber;

        } else {
            throw new IllegalArgumentException();
        }

    }
}
