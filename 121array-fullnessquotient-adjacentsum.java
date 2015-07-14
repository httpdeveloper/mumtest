class mumtest{
	
	 /**
	  * [is121Array description]
	  * @param  a [description]
	  * @return   [description]
	  */
	 public static int is121Array(int[ ] a)
    {

        int n = a.length;
        int m = (int) n / 2 + 1;

        for(int i=0; i < m; i++){

            if((i==0 && a[i]!=1) || a[i] != a[n-1] || (m==n && a[i]!=2) ){

                return 0;
            }

            n--;

        }



        return 1;
    }

    /**
     * [fullnessQuotient description]
     * @param  n [description]
     * @return   [description]
     */
    public static int fullnessQuotient(int n){


        if(n < 0) return -1;

        int j =0;
        int sum = 0;
        int mul = 1;
        int m = 0;
        int p = 0;
        int r = 0;
        int count = 0;
        boolean flag = true;

        for(int i=2; i <= 9; i++){

            sum=0;
            mul = 1;
            flag = true;

            while(flag){
                mul *= i;
                if(mul > n){
                   flag = false; 
                }else{
                     sum += mul;
                }
            }

            if(!flag){

                if(sum < n){

                    m = n - sum;
                    r =  m % i;
                    p = (int) m / i;

                    if(sum +  p * i  + r == n && r > 0){
                        count++;
                    }

                }
            }
        }

        return count;
    }

    /**
     * [largestAdjacentSum description]
     * @param  a [description]
     * @return   [description]
     */
    public static int largestAdjacentSum(int[ ] a)
    {

        int sum =0;

        for(int i=0; i < a.length - 1; i++){


               if( a[i] + a[i+1] > sum){

                    sum = a[i] + a[i+1];
               }
        }

        return sum;
    }

}