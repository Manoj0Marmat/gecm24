class StrongNum{
    public static void main(String[] args){
        checkStrong(145);
    }

    public static void checkStrong(int num){
        int sum = 0, temp = num, rem;
        while (temp!=0) {
            rem = temp%10;
            sum += fact(rem);
            temp/=10;
        }
        if (sum == num) {
            System.out.println(num+" is Strong Number");
        } else {
            System.out.println(num+" is Not Strong Number");
        }
    }

    public static int fact(int num){
        int result = 1; 
        for(int i=1; i<=num; ++i) result *= i;
        return result;
    }
}
