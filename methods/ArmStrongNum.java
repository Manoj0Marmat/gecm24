class ArmStrongNum{
    public static void main(String[] args){
        checkArmStrongNum(1634);
    }
    public static void checkArmStrongNum(int num){
        int sum = 0, count,rem, temp = num ;
        count = getNumOfDigit(temp);
        while(temp!=0){
            rem = temp%10;
            sum += getPowerOfNum(rem, count);
            temp/=10;
        }
        if (sum == num) {
            System.out.println(num+" is Arm Strong Number");
        } else {
            System.out.println(num+" is Arm Not Strong Number");
        }
    } 

    public static int getNumOfDigit(int num){
        int count = 0;
        while(num!=0){
            ++count;
            num/=10;
        }
        return count;
    }

    public static int getPowerOfNum(int n, int m){
        int result = 1;
        for(int i=1;i<=m;++i){
            result *= n;
        }
        return result;
    }
}
