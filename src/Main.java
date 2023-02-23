import static javafx.application.Platform.exit;

public class Main {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPos = 0;

        while (startPos <= WIN_POSITION) {
            int rollingDice = (int) (Math.random() * 10) % 6 + 1;
            //Snake or ladder option--sol
            int sol = (int) (Math.random() * 10) % 3;

            switch (sol) {
                case LADDER:
                    startPos += rollingDice;
                    if(startPos>WIN_POSITION){
                        startPos-=rollingDice;
                    }
                    break;
                case SNAKE:
                    startPos -= rollingDice;
                    break;
            }

            if(startPos<0){
                startPos=0;
            }

            if(startPos==WIN_POSITION){
                System.out.println("Player Reached Win Position");
                break;
            }

            System.out.println("Position of player:-"+startPos);
        }

    }
}