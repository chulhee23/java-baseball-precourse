package baseball;
import utils.RandomUtils;

public class AnswerGenerator {
    public static String generate(int answerLength){
        String answer = "";
        if (answerLength < 1) {
            throw new IllegalArgumentException();
        }

        // make random numbers
        while(answerLength > 0){
            String randomNumber = Integer.toString(RandomUtils.nextInt(1,9));
            if (!answer.contains(randomNumber)) {
                answer += randomNumber;
                answerLength -= 1;
            }
        }
        return answer;

    }
}
