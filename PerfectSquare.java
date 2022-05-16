public class PerfectSquare {
    static int nextPerfectSquare(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        int i = 1;
        while (i * i < n) {
            i++;
        }
        if(i*i==n){
            i++;
            return i*i;
        }
        return i*i;
    }
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }
}
