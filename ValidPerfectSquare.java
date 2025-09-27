class ValidPerfectSquare {
    public static void main(String[] args) {
        
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int s=1,e=num/2;

        if(num==1) return true;
        while(s<=e){
            int mid= s+(e-s)/2;
            long a= (long)mid*mid;
            if(a == num){
                return true;
            }
            else if(a<num){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}