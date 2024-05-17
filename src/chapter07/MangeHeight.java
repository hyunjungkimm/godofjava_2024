package chapter07;

public class MangeHeight {
    int[][] gradeHeights;

    public static void main(String[] args) {
        MangeHeight mangeHeight = new MangeHeight();
        mangeHeight.setData();
        for(int i = 1; i <= 5; i++){
            mangeHeight.printHeight(i);
        }

        int number = 1;
        while(number < 6) {
            mangeHeight.printAverage(number);
            number++;
        }

    }

    public void setData() {
       gradeHeights = new int[][]{{170,180,173,175,177},
               {160,165,167,186},{157,177,187,176},{173,182,181}, {170,180,165,177,172}};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No. : " + classNo);
        for(int heights : gradeHeights[classNo-1]){
            System.out.println(heights);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No. : " + classNo);
        double sum = 0;
        double studentCount = gradeHeights[classNo-1].length;
        for(int heights : gradeHeights[classNo-1]){
            sum += heights;
        }
            double avg = sum / studentCount;
            System.out.println("Height average : "  +avg);
    }
}
