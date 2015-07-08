class mumtest{
	
	  /**
     * [isMinMaxDisjoint description]
     * @param  a [description]
     * @return  integer [description]
     */
    public static int isMinMaxDisjoint(int[ ] a)
    {

        if(a.length < 2) return 0;

        int count1=0;
        int count2=0;
        int tmp;
        int max,min,max1,min1,min2,max2;


        for (int i=0; i < a.length; i++){

            for (int j=0; j < a.length-1; j++){

                if(a[j] > a[j+1]){

                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;

                }
            }
        }

        max = a[a.length - 1];
        min = a[0];

        if(min == max || max - min == 1){

            return 0;
        }

        max2 = max;

        while(max2 > 0){
            max1 = max2 % 10;
            min2 = min;

            if(min2 < 0){

                min2 *= -1;
            }

            while(min2>0){

                min1 = min2 % 10;
                if(max1 == min1){

                    return 0;
                }

                min2 = min2 / 10;

            }

            max2 = max2 / 10;
        }


        for (int i=0; i < a.length; i++){

            if(min == a[i]){

                count1++;
            }

            if(count1 > 1) return 0;


            if(max == a[i]){

                count2++;
            }

            if(count2 > 1 ) return 0;

        }
        

        return 1;
    }

    /**
     * [smallest description]
     * @param  n [description]
     * @return   [description]
     */
    public static int smallest(int n){

        int start =1 ;
        int mul = 0;
        int count = 0;

        while(start > 0){
            count = 0;
            for(int i=1 ; i <=n ; i++){
                mul = start * i;
                while(mul>0){

                    if(mul % 10 == 2){

                        count++;
                        mul=0;
                    }

                    mul = mul / 10;
                }
            }

            if(n == count) return start;
            start++;
        }

        return 0;
    }

    public static int[ ] clusterCompression(int[ ] a){

        int count=1;
        for(int i=0; i < a.length-1; i++){
            if(a[i]!=a[i+1]){
                count++;
            }

        }

        int[] b= new int[count];

        int k = 0;
        for(int i=0; i < a.length-1; i++){
            if(a[i]!=a[i+1]){
                b[k] = a[i];
                k++;
            }
        }

        if(a.length > 0)    
            b[count-1] = a[a.length-1];

        return b;

    }

    public static int isRailroadTie(int[ ] a)
    {

        int sum = 0;

        if(a.length < 1) return 0;

        for (int i=0; i < a.length; i++){

            if(i==a.length-1){

                if(i==0){
                     return 0;
                }else{
                    if(a[a.length-1]==0) return 0;
                    else if(a[i-1]==0) return 0;
                }
            }else{

                if(i==0)
                {
                    if(a[i+1]==0 || a[i]==0) return 0;
                }else
                {

                        if(a[i]==0){

                            if(!(a[i-1]!=0 && a[i+1]!=0)) return 0;
                        }else{

                            if(a[i-1]!=0 && a[i+1]!=0) return 0;
                        }
                    }
                }
            }
           
        


        return 1;
    }
}