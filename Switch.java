package Learning;

/**
 * Switch
 */
public class Switch {
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            default:
            System.out.println("Invalid Input");
            break;
        }
    }
}