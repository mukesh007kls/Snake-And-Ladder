import static javafx.application.Platform.exit;

public class Main {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPos = 0;
        //number of time dice rolled -- notdr
        int notdr = 0;

        while (startPos <= WIN_POSITION) {
            int rollingDice = (int) (Math.random() * 10) % 6 + 1;
            notdr++;
            //Snake or ladder option--sol
            int sol = (int) (Math.random() * 10) % 3;

            switch (sol) {
                case LADDER:
                    startPos += rollingDice;
                    if (startPos > WIN_POSITION) {
                        startPos -= rollingDice;
                    }
                    break;
                case SNAKE:
                    startPos -= rollingDice;
                    break;
            }

            if (startPos < 0) {
                startPos = 0;
            }

            if (startPos == WIN_POSITION) {
                System.out.println("Player Reached Win Position:- " + startPos + " Number of time dice rolled:- " + notdr);
                break;
            }

            System.out.println("Position of player:- " + startPos + " Number of time dice rolled:- " + notdr);
        }

    }
}