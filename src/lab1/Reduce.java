package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int start) {
        int count = 0;
        while(start != 0) {
            if (start % 2 == 0) {
                start /= 2;
            } else {
                start -= 1;
            }
            count++;
        }
        return count;
    }
}