class mumtest{
	
	 public static int checkConcatenatedSum(int n, int catlen){

            int m = n;
            int a;
            int mul;
            int sum = 0;
            int b;

            while(m>0){
                a = m % 10;
                mul = 1;
                b=0;
                for(int i=1; i < catlen; i++){

                    mul *= 10;
                    b += mul * a;
                }
                sum += b + a;
                m = m / 10;
            }

            if(sum == n) return 1;

           return 0; 
    }

    public static int isSequencedArray(int[ ] a, int m, int n)
    {
        
        int j;
        int len = 0;
        for(int k=m; k <= n; k++) len++;
      
        if(a.length < len) return 0;

        for(int i=0; i < a.length; i++){
            j = i+1;
            if(j < a.length && a[j]  < a[i]) return 0;
            if(!(a[i] >= m && a[i] <= n)) return 0;
        }

        return 1;
    }

    public static int largestPrimeFactor(int n){

            if(n<=1) return 0;

            int m = n /2;
            int sqrt;
            boolean isPrime;
            int lpf=0;
            for(int i=2; i <= m; i++){
                if(n%i==0){
                    if(i%2!=0||i==2){
                        sqrt = (int) Math.sqrt(i);
                            isPrime = true;

                        for(int j=3;j<=sqrt;j+=2){

                            if(i%j==0){
                             isPrime = false;

                            }    

                        }

                        if(isPrime){
                            lpf = i;
            
                        }

                    }

                }
            }

            return lpf;
    }

    public static int[ ] encodeNumber(int n)
    {

        int[] b=new int[]{};
        boolean prime;
        int a;
        int m = n/2;//(int) Math.sqrt(n) + 1;
        int nn = n;
        int mul = 1;
        int k=0;
        int size=1;

        for(int j=2; j <= m; j++){
            if(j%2!=0 || j==2){
                 prime = true;
                 a = (int) Math.sqrt(j);
                for(int i=3;i <= a; i+=2){
                    if(j%i==0){

                       prime = false;
                    }
                }

             if(prime){
                    boolean f = true;
                    while(f){
                        if(nn % j == 0){
                            mul *= j;
                            if(k==0){
                                b = new int[k+1];
                            }
                            if(k == b.length){
                                int[] c = new int[b.length];
                                c = b;
                                b = new int[k+1];
                                for(int x=0;x < c.length; x++){
                                    b[x] = c[x];
                                }
                            }
                            b[k] = j;
                            if(mul == n){
                                /*
                                for(int i=0;i<b.length;i++){
                                    print(b[i]);
                                }*/
                                return b;
                            }

                            k++;
                            nn = nn / j;
                        }else{
                            f = false;
                        }
                    }
                }
            }
        }

        if(n>1)
            b = new int[]{n};

        /*
        for(int i=0;i<b.length;i++){
            print(b[i]);
        }*/

        return b;
    }

    public static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
    // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
      int i=0; // index into a
      int k=0; // index into pattern
      int matches = 0;  // how many times current pattern character has been matched so far
      for (i=0; i<len; i++)  {
            if (a[i] == pattern[k])
              matches++;   // current pattern character was matched
            else if (matches == 0 || k == patternLen-1)
              return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            else { // advance to next pattern character {
               k++;
               if(a[i]!=pattern[k]){
                    return 0;
               }
            } // end of else
           // end of for

        }

       // print(matches);
        //print(i);
        //print(len);
      // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
      if (i==len && k==patternLen-1) return 1; else return 0;
    }

     public static void doIntegerBasedRounding(int[ ] a, int n){
        float result;
        if(n>0){
            for(int i=0;i<a.length;i++){
                 result =  (float) ( ( (float) a[i]/n) * n ) / n;
                if(result>0 && result < 0.5)
                    a[i] = 0;
                else if(result>=0.5 && result < 1.5)
                    a[i] = n;
                else if(result>=1.5 && result < 2.5)
                    a[i] = n * 2;
                else if(result >= 2.5 && result < 3.5)
                    a[i] = n * 3;
                else if(result >= 3.5 && result < 4.5)
                    a[i] = n *  4;
            }

        }

        /*
        for(int i=0;i<a.length;i++){
           print(a[i]);
        }*/
    }

    public static int isCubePowerful(int n)
    {

        int cubsum=0;
        int mul;
        int m = n;
        int digit;
         while(m>0){
            mul = 1;
            digit = m % 10;
            for(int i=1; i <=3 ;i++){
                mul *= digit;
            }
            cubsum += mul;
            m = m / 10;
        }

        if(n>0 && cubsum==n) return 1;
        return 0;
    }

    public static int decodeArray(int[ ] a){

        int value;
        int sum=0;
        int mul = 1;

        for(int i=a.length-1; i > 0; i--){
            value = a[i] - a[i-1];
            if(value<0) value *= -1;
            sum += (mul * value);
            mul *= 10;
        }

        if(a[0]<0) sum *= -1;
        return sum;
    }

    public static int isZeroPlentiful(int[ ] a){

        int matches=0;
        int zeroseq=0;
        for(int i=0; i < a.length; i++){
            if(a[i]==0){
                if(matches > 0){
                    if(a[i]==a[i-1]){
                        matches++;
                    }
                }else
                    matches++;

                if(i==a.length-1){
                    if(matches>=4){
                        zeroseq++;
                        matches=0;
                     }
                }   
            }else{
                 if(matches>=4){
                    zeroseq++;
                    matches=0;
                 }
            }
        
        }
        return zeroseq;
    }

    public static int isDigitIncreasing(int n)
    {

        int digitSum;
        int m;
        int mul;
        int increaseDigitSum=0;
        for(int i=1;i<=9;i++){
            m=n;
            mul = 1;
            digitSum = 0;
            increaseDigitSum =0;

            while(m>0){

                digitSum += (mul * i);
                increaseDigitSum += digitSum;
                mul *= 10;
                m = m / 10;
            }

            if(increaseDigitSum==n){
                 print(i);
                return 1;
            }

        }

        return 0;
    }
}