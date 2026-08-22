class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int product=1;
       
        
        while(n>0){
            int digit=n%10;
            n =n/10;
            sum+=digit;
            product*=digit;
        }
        int divisor=sum+product;
        if(original%divisor==0){
            return true;
        }
        return false;
    }
}
        
        
        
    