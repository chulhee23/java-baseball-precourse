package baseball;


public class AnswerCounter {
    public static Score calculateScore(String userInput, String answer){
        int strikeCount = 0;
        int ballCount = 0;


        // count
        for(int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) == answer.charAt(i)) {
                strikeCount++;
            } else if(answer.contains(String.valueOf(userInput.charAt(i)))) {
                ballCount++;
            }
        }

        Score score = new Score(ballCount, strikeCount);

        return score;


    }


}
