public class PrimeCount {
    static boolean isPrime(int num) {
        int flag=0,i;

        if (num == 1||num ==0) {
            flag = 1;
        }

        for(i=2;i<=(num/2);i++){
           if(num%i==0){
                flag = 1;
                break;
           }
        }

        if(flag==0){
            return true;
        }

        return false;
    }

    static int primtCount(int start, int end) {
        int count=0;
        if(start>end){
            return 0;
        }

        if(start<0){
            start=0;
        }

        if(end<0){
            end=0;
        }

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(primtCount(10,30));
        System.out.println(primtCount(11,29));
        System.out.println(primtCount(20,22));
        System.out.println(primtCount(1,1));
        System.out.println(primtCount(5,5));
        System.out.println(primtCount(6,2));
        System.out.println(primtCount(-10,6));
    }
}
