package baseball;

public class Score {
    private int ball;
    private int strike;

    public Score(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        if(ball >= 0) {
            this.ball = ball;
        } else {
            this.ball = 0;
        }
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        if (strike >= 0){
            this.strike = strike;
        } else {
            this.strike = 0;
        }
    }

    public void print(){
        if (this.ball == 0 && this.strike == 0){
            System.out.println("nothing");
        } else {
            System.out.println(this.ball + "볼 " + this.strike + "스트라이크");
        }

    }

    public boolean isAnswer(){
        if (ball == 0 && strike == GamePlayer.NUMBER_LENGTH){
            return true;
        }
        return false;
    }

}
