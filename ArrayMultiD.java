public class ArrayMultiD {
    public static void main(String[] args) {
        int a[][] ={
            {20, 30, 40},
            {50, 60, 70},
            {50, 80, 90}
        };
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }   
}