public class Main {
    public static final int LADDER=1;
    public static final int SNAKE=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPos=0;
        int rollingDice=(int) (Math.random()*10)%6 + 1;
        //Snake or ladder option--sol
        int sol=(int) (Math.random()*10)%3;
        switch (sol){
            case LADDER:
                startPos+=rollingDice;
                break;
            case SNAKE:
                startPos-=rollingDice;
                break;
        }
        System.out.println(startPos);
    }
}