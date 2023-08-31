import java.util.Scanner;

public class MockExam{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 1;
        String name;
        int time;
        double avg = 0;
        int sum = 0;
        int winnerTime = 0;
        String winnerName = "lukas";

        while(number != 0){

        System.out.println("1. Insert results");
        System.out.println("2. Display average time");
        System.out.println("3. Display winner and best time");
        System.out.println("0. Exit");
        number = scan.nextInt();

        if(number == 1){
            sum = 0;
            avg = 0;
            for(int i = 1; i <= 5; i++){
            name = scan.next();
            time = scan.nextInt();
            sum = sum + time;
            avg++;
            if(winnerTime < time){
                winnerTime = time;
                winnerName = name;
            }
            
            }
        }
            else if(number == 2){

        System.out.println(sum / avg);
            }
            else if(number == 3){

        System.out.println(winnerName + winnerTime);
            }

        }
        
        
    }
}