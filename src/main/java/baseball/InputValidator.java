package baseball;

import java.util.Arrays;

/***
 * user의 Input 검증
 */
public class InputValidator {
    public static boolean check(String number){
        // 길이 부족하게 입력
        if (number.length() != GamePlayer.NUMBER_LENGTH){
            return false;
        }

        // 문자 입력
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e){
            return false;
        }

        // 중복된 숫자 입력
        boolean[] usedNumber = new boolean[10]{};
        Arrays.fill(usedNumber, Boolean.FALSE);

        for(int i = 0; i < number.length(); i++){
            int idx = Character.getNumericValue(number.charAt(i));
            if (usedNumber[idx] == false){
                usedNumber[idx] = true;
            } else {
                return false;
            }
        }

        return true;
    }
}
