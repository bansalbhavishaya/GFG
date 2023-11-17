public class MinSum {
    int min(int i,int s1,int s2, int arr[],int n,int dp[][]){

        

        if(i==n){

            return Math.abs(s1-s2);

        }

        if(dp[i][Math.abs(s1-s2)]!=-1) return dp[i][Math.abs(s1-s2)];

        int a= min(i+1,s1+arr[i],s2,arr,n,dp);

        int b=min(i+1,s1,s2+arr[i],arr,n,dp);

        return dp[i][Math.abs(s1-s2)]=Math.min(a,b);

    }

 public int minDifference(int arr[], int n) 

 { 

     int sum=0;

     for(int i:arr) sum+=i;

     int dp[][]=new int[n+1][sum+1];

     for(int[] a:dp)

     Arrays.fill(a,-1);

     

     return min(0,0,0,arr,n,dp);

 } 

}

