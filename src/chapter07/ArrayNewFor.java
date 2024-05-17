package chapter07;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor arrayNewFor = new ArrayNewFor();
        arrayNewFor.newFor();
        arrayNewFor.twoDimFor();
    }

    public void newFor() {
        int[] oneDim = new int[] { 1, 2, 3 };
        for(int data : oneDim) {
            System.out.println(data);
        }
    }

    public void twoDimFor(){
        int[][] twoDim = {{1,2,3},{4,5,6}};
        for(int[] dim : twoDim) {
            for(int data : dim) {
                System.out.println(data);
            }
        }

    }
}
