public class Main {
    public static void main(String[] args) throws ExpFactorial{
        int res= getFactorial(0);
        System.out.println("the result: "+res);
    }

    public static int getFactorial(int var) throws ExpFactorial {
        if (var<1 || var>10){
            throw new ExpFactorial();
        }else{
            int res=1;
            for(int i=1;i<var;i++){
                res+=res*i;
            }
            return res;
        }
    }
}