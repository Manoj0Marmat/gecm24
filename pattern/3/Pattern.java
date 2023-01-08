class Pattern{
    public static void main(String[] main){
        for(int i=1;i<=3;++i){
            for(int j=1;j<=3;++j){
                if(i==2){
                    if(j==1) System.out.print("!");
                    else if(j==2) System.out.print("@");
                    else System.out.print("~");
                }else System.out.print("*");
            }
            System.out.println();
        }
    }
}
