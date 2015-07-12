class mumtest{
	
	 /**
	  * [isPacked description]
	  * @param  a [description]
	  * @return   [description]
	  */
	 public static int isPacked(int[ ] a){

        int count;
        int k;

        for(int i=0; i < a.length; i++){

            count=0;
            k=0;

            for(int j=0; j < a.length; j++){

                if(a[i] > 0 && a[j] > 0 && a[i] == a[j]){

                    if(count > 0 && a[j-1]!=a[j]) return 0;

                    count++;
                }
            }

            if(count ==0 || a[i]!=count){

                return 0;
            }
        }

        return 1;
    }

     /**
      * [isOddHeavy description]
      * @param  a [description]
      * @return   [description]
      */
     public static int isOddHeavy(int[ ] a){

        int nOdd = 0;

        for(int i=0; i < a.length; i++){

            if(a[i]%2!=0) nOdd++;

            for(int j=0; j < a.length; j++){

                if(a[i]%2!=0 && a[j]%2==0 && !(a[i] > a[j])){

                    return 0;

                }
            }
        }

        return (nOdd > 0 ) ? 1 : 0;
    }
    /**
     * [getExponent description]
     * @param  n [description]
     * @param  p [description]
     * @return   [description]
     */
    public static int getExponent(int n, int p)
    {

        if(p <= 1) return -1;

        if(n<0){
            n *= -1;
        }

        int mul=1;
        int maxExp = 0;
        int m = 0;

        while(mul <= n){
            mul *= p;
            if(n%mul==0){
                maxExp++;
                m=maxExp;
            }
        }
        return m;

    }

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


}