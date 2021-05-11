package day06;

public class Test4 {
    public static void main(String[] args) {
        cout();
    }

    public static void cout() {
        int[] min={22,51,62,15,83,17};
        int j=0;
        for (int i = 1; i <min.length ; i++) {
            if(min[i]<min[j])
                j=i;
        }
        System.out.println(min[j]);
    }

}
