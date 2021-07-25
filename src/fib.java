/**
 * 斐波那契数列
 */
class fib{
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fib(20));
    }
}

/**
 * 利用递加方式减少重复递归次数
 */
class Solution2{
    public int fit(int n){
        if (n==1||n==0){
            return n;
        }
        int a=0,b=1;
        int sum=a+b;
        for (int i=2;i<n;i++){
            a=b;
            b=sum;
            sum=a+b%1000000007;
        }
        return sum;
    }
}
/**
 * 简单的递归存在性能问题
 * 大量重复的递归计算
 */
class Solution {
    public int fib(int n) {
        int fibRes=sum(n);
        return fibRes%1000000007;
    }
    public int sum(int a){
        if(a==1){
            return 1;
        }
        if(a==0){
            return 0;
        }
        return sum(a-1)+sum(a-2);
    }
}