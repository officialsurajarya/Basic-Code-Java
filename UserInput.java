import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
    public static void main (String[] args) throws IOException{
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);
        System.out.print("Enter Passcode: ");
        String Pascode = br.readLine();
        System.out.println("Your Passcode is : "+ Pascode);
    }
}