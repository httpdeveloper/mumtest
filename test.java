class test{

	public static void main(String[] args){

		//System.out.println(sqrt(5));
		//System.out.println(isPrime(4));
		//System.out.println(primeCountxx(10,3000000));
		//double x = (int)Math.sqrt(15);
      //System.out.println(x);
		//System.out.println(Math.sq)
		//
		
        //int[] a = new int[]{6};

		//System.out.println(max(a));



			//int[] a = new int[]{1, 1, 1, 1, 1, 1, 2};
			//System.out.println(isInertial(a));


			//int[] a = new int[]{9, 0, 2, -5, 7};
			//print(countSquarePairs(a));


			//int[] a = new int[]{1,1,0};
			//print(isMadhavArray(new int[]{1,0,0,0,2,3,4,5,1,2,3,4}));



			//print(bunnyEars(4));
			//
			

			//print(findPorcupineNumber(139));

			//print(gcd(14,21));
			//print(gcd(3768,1701));

			//print(count7(7177));

			//generateGuthrieSequence(13);

			tail();

	}

	/**
	 * [sqrt description]
	 * @param  n [description]
	 * @return   [description]
	 */

	public static double sqrt(int n){

		if(n <= 1){

			return n;
		}

		double  sqrt ,m;
		sqrt  = n / 2;
		do{
			m = sqrt;
			sqrt = (m + (n/m)) / 2;
		}while((m - sqrt) != 0);
		return sqrt;
	}

	/**
	 * [primeCount description]
	 * @param  start [description]
	 * @param  end   [description]
	 * @return       [description]
	 */

	public static int primeCount(int start, int end){


		if(!(start <= end) || (start==1 || end==1)){
			return 0;
		}

		if(!(start > 0)){
			start = 0;
		}

		int count = 0;

		for (int i = start; i <= end; i++){

			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
				System.out.println(i);

				count++;

				/*

				int a = (int) sqrt(i) + 1;

				//int a = i;

				//System.out.println(a);

				if(isPrime(a)){
					System.out.println(i);

					count++;
				}*/
			}
		}	

		return count;

	}

	/**
	 * [isPrime description]
	 * @param  n [description]
	 * @return   [description]
	 */

	public static boolean isPrime(int n){

		boolean prime = true;

		for(int i=3; i < n; i+=2){

			if(n%i==0){
				 prime = false;
				 break;
			}
		}

		return prime;
	}


	public static int primeCountxx(int start, int end) {
        int count = 0;

        if (start < 0) {
            start = 1;
        }

        if (end <= 1) {
            return 0;
        }

        for (int i = start; i <= end; i++) {
            double sq;
            if (i < 0) {
                sq = 0;
            } else {
                sq = sqrt(i);
            }

            int x = (int) sq + 1;
            boolean prime = true;
            if (i != 2 && i % 2 != 0) {
                for (int j = 3; j <= x; j+=2) {
                    if (i % j == 0) {
                        prime = false;
                    } else {
                        prime = prime && true;

                    }

                }
                if (prime) {
                    count++;
                }
            }
        }

        return count;
    }


    public static int max(int[] a){

    	int max = 0;

    	for(int i=0;i<a.length;i++){

    		if(a[i] > max){

    			max = a[i];
    		}

    	}

    	return max;
    }

    public static boolean hasOddNumber(int[] a){

    	boolean hasOddNumber = false;

    	for(int i=0;i<a.length;i++){

			if(a[i]%2!=0){
				hasOddNumber = true;
				break;
			}
		}

		return hasOddNumber;
    }

    public static void print(int n){
			System.out.println(n);

    }

    public static boolean hasOddGreaterThanEven(int[] a){


    	int max = max(a);

    				//System.out.println(max);


    	if(max%2!=0){
    		return false;
    	}




    	int len = a.length;

    	int[] oddArr = new int[len];
    	int[] evenArr = new int[len];

    	for(int i=0;i<a.length;i++){


    		if(a[i]!=max){

				if(a[i]%2==0){
					evenArr[i] = a[i];
				}else{
					oddArr[i] = a[i];
				}
			}
		}

    	for(int i=0;i<oddArr.length;i++){
	    	for(int j=0;j<evenArr.length;j++){
	    		if(oddArr[i] != evenArr[j]  && !(oddArr[i] > evenArr[j])){
	    			return false;
	    		}
	    	}

    	}

    	return true;



    }

    public static int isInertial(int[ ] a){

    	boolean hasOddNumber = hasOddNumber(a);

    	if(!hasOddNumber) return 0;

    	boolean hasOddGreaterThanEven = hasOddGreaterThanEven(a);

    	if(!hasOddGreaterThanEven) return 0;

    	return 1;

    }


    public static int countSquarePairs(int[] a){


    	if(a.length < 1){
    		return 0;
    	}

    	int count = 0;

    	int len = a.length;

    	for(int i=0; i < len; i++){

    		for(int j=0; j < len; j++){

    			if(a[i] > 0 && a[j] > 0 && a[i] < a[j]){

    				int k = a[i] + a[j];

    				int l = (int) sqrt(k);

    				System.out.println(l);

    				if(l * l == k){
						count++;

    				}
    			}
    		}
    	}


    	return count;
    }


    public static void arrayPrint(int[] a){

    	for(int i=0; i < a.length; i++){

    		print(a[i]);
		}	
    }

    public static int arraySum(int[] a ,int start ,int length){

    	int sum = 0;

    	int end = start + length;

    	for(int i=start; i < end; i++){

    		sum += a[i];
		}

		return sum;
    }

    public static boolean checkArrayLen(int[ ] a ,int n){


    	int allowLen = n * (n + 1) / 2;

    	//print(allowLen);

    	if (!(a.length >= allowLen)){

    		return false;
    	}


    	return true;

    }


    public static int findLength(int[] a){


    	if(a.length > 2){

	  	    for(int i=2; i < a.length; i++){

	  	    	 int n = i * (i + 1) / 2;

	  	    	 if(a.length == n){

	  	    	 	return n;
	  	    	 }

			}
		}

		return 0;
    }


    public static int isMadhavArray(int[ ] a){

    	int start = 0;
    	int length = 1;
    	boolean marr = false;
    	int preValue = a[0];
    	int nextValue = 0;
    	int n = findLength(a);


    	if(n > 0){

    		marr = true;

		  	    for(int i=0; i < n; i++){
		  	    	if(start + length <= a.length){
	  	    		nextValue = arraySum(a ,start ,length);

	  	    		if(preValue != nextValue){
	  	    			marr = marr && false;
	  	    		}else{
	  	    			marr = marr && true;
	  	    			preValue = nextValue;
	  	    		}

	  	    		start += length;
	  	    		length += 1;
	  	    		}
				}

			}


		if(marr)
			return 1;
		else
			return 0;
	
    }

    public static int bunnyEars(int bunnies) {
  
	  if(bunnies == 0)
	    return 0;

	  return bunnies +  bunnyEars(bunnies - 1);  
	   
	}

	public static int digitSum(int n){

		if(n==0) return 0;
		return (n % 10) + digitSum((int) n / 10);

	}


	public static int findPorcupineNumber(int n){

		while(n >= 0){

			n++;

			if(n%2!=0){

				int m = 0 ;

				if(isPrime(n)){

					m = n;

					boolean nextNumber = true;

					while(nextNumber){

						m++;

						if(isPrime(m)){
							nextNumber = false;
						}
					}


					if(n%10==9 && m%10==9){
						 return n;
					}
				}		
			}

		}

		return 0;
	}

	public static int count7(int n){

		if(n==0) return 0;

		int c = 0;
		int m =  n % 10;

		if(m==7){
			c = 1;
		}else{
			c = 0;
		}

		return c + count7(n/10);
	}

	public static int findPorcupineNumberx(int n){
        int sycoNum = n;
        boolean yuppie = true;

        while(yuppie){
            sycoNum++; 
            
            if(isPrime(sycoNum)){


                int temp1 = sycoNum; 
                boolean nxtPrimeFound = true;
                
                while(nxtPrimeFound){
                    temp1++;
                    if(isPrime(temp1)) nxtPrimeFound = false;
                }

                if(sycoNum==19){

                	print(temp1);
                }

                if((sycoNum % 10) == 9 && (temp1 % 10)== 9){
                   // System.out.println("Porcupine Number = " + sycoNum);
                    yuppie = false;
                    return sycoNum;
                }
            }
        }

        return 0;
     }

     public static int gcd(int a, int b){

     		


			if(b==0)
     			return a;
     		
     	
     		return gcd(b,a%b);
     }


     public static void generateGuthrieSequence(int n){

     		print(n);

     		int m = 0;

     		if(n%2==0)
     			m = n / 2;
     		else
     			m = (n * 3)  + 1;

     		if(n > 1 )
     		 	generateGuthrieSequence(m);

     }

     public static int isGuthrieSequence(int[ ] a){

     	if(!(a.length > 0)) return 0;

     	if(a[a.length - 1] != 1) return 0;

     	int b = 0;

     	for(int i=1; i < a.length; i++){

     		if(a[i-1] % 2 == 0)
     			b = a[i-1] / 2;
     		else
     			b = (a[i-1] * 3) + 1;

     		if(b != a[i])
     			return 0;
     		
     	}

     	return 1;

     }


     public static int stantonMeasure(int[ ] a){

     	int count1  = 0;
     	int count2 = 0;

     	for (int i=0; i < a.length; i++){

     		if(a[i] == 1){
     			count1++;
     		}
     	}


     	if(count1 > 0){

			for (int i=0; i < a.length; i++){

				if(a[i] == count1){
					count2++;
				}
			}
     	}


     	return count2;
     }

     public static int sumFactor(int[ ] a){

     	int sum  = 0;
     	int count = 0;

     	for (int i=0; i < a.length; i++){

     		//if(a[i] == 1){
     			sum += a[i];
     		//}
     	}

     	for (int i=0; i < a.length; i++){

     		if(a[i] == sum){
     			count++;
     		}
     	}


     	return count;
     }

     public static int guthrieIndex(int n){

			//print(n);

     		if(n==1){
     			return 0;
     		}


     		int count = 0;
     		int m = 0;

     		if(n%2==0)
     			m = n / 2;
     		else
     			m = (n * 3)  + 1;

     		if(n > 1 ){
     			count = 1;
     		}


     		return count + guthrieIndex(m);
     		
     }


     public static int[] solve10(){

     		int n = 1;
     		int m =10;
     		int a = 1 ;
     		int b = 1;
     		int k = 1;

     		int[] z = new int[3];
     		
 			for(int i=1; i <= m; i++){
 				n *= i;
 			}
						
 			while(k <= m){

 				a = a *  k;
 				b = 1;

 				for(int j=1; j<=m; j++){
 					b = b * j;
 					if(a + b == n){
 						z[0] = k;
					 	z[1] = j;
					 	z[2] = n;
					 	return z;
 					}

 				}
 				k++;
 			}

 			return z;
     }

     public static int repsEqual(int[ ] a, int n){

 		for(int i = a.length - 1 ; i >= 0; i--){

 			if(a[i]>0 && n%10 != a[i]){
 				return 0;
 			}

 			n = n / 10;
 		}

 		return 1;
		
     }


     public static int isCentered15(int[ ] a){


     		int start = 0;
     		int count = 0;
     		int centerLen = 0;
     		int j = 0;
     		int k = 0;
            int xcount=0;

     		while(start < a.length){
     			j = 0;
     			count = 0;
 				for(int i = start; i < a.length; i++){
 					j++;
 					count += a[i];
 					if(count==15){
 						k = start + j;
 						if(a.length - k == start){
                            System.out.println(xcount);
 							return 1;
 						}
 					}
                    xcount++;
 				}
 				start++;
 			}
System.out.println(xcount);
			return 0;
     }

     public static int perfectNumber(int n){

     		int sum = 0;

     		for(int i=1; i < n; i++){

     			if(n % i == 0){

     				print(i);

     				sum += i;
     			}

     		}


     		if(n==sum)
     			return 1;

     		return 0;
     }

     public static int henry (int i, int j){

     		int pernumber = 0;
     		int sum = 0;
     		int sumperfect = 0;
     		boolean loop = true;
     		int search = 0;

     		
     		while(loop){
     			search++;
     			sum = 0;
     			for(int k=1; k < search; k++){
	     			if(search % k == 0){
	     				sum += k;
	     			}

	     		}


	     		if(sum == search){

	     			pernumber++;	     			

					if(pernumber == i){
		     			sumperfect += sum;
		     		}

		     		if(pernumber == j){

		     			sumperfect += sum;
		     		}

	     		}

	     		
	     		if(pernumber >= j){
	     			loop = false;
	     		}


     		}


     		return sumperfect;
     }


     public static int isDivisible(int [  ] a, int divisor){

     		int divisible = 1;

     		for(int i=0;i<a.length; i++){

     				if(a[i] % divisor != 0){
						divisible = 0;
						break;

     				}

     		}


     		return divisible;
     }


     public static int isNUnique(int[ ] a, int n){

     		int count = 0;


     		for (int i=0; i < a.length; i++){

     			for (int j=i + 1; j < a.length; j++){

     					if(n == (a[i] + a[j])){

     						count++;
     					}

				}

     		}


     		if(count==1) return 1;

     		return 0;

     }

     public static int[] bubbleSort(int[] a){

     	int tmp = 0;


     	for(int i=0; i< a.length; i++){

     		for(int j=0; j < a.length -1; j++){

     				if(a[j] > a[j + 1]){

     					tmp = a[j+1];
     					a[j+1] = a[j];
     					a[j] = tmp;

     				}
     		}
     	}

     	return a;
     }

     public static int nUpCount(int[] a ,int n){

     	int partialSumStart = 0;
     	int partialSumEnd = 0;
     	int upcount = 0;

     	for (int i = 0; i < a.length; i++){


     			partialSumEnd += a[i];


     			if(partialSumStart <= n && partialSumEnd > n){
     				upcount++;
     			}

     			partialSumStart = partialSumEnd;

     	}

     	return upcount;
     }

     public static int isLegalNumber(int[  ] a, int base){

			for(int i = 0; i < a.length; i++){

				if(!(a[i] < base)){
					return 0;
				}

			}

			return 1;

     }

     public static int convertToBase10(int[  ] a, int base)
	 {


	 		int isLegalNumber = isLegalNumber(a ,base);

	 		if(isLegalNumber!=1) return 0;

	 		int sum = 0;
	 		int sup = 0;
	 		int mul = 0;

	 		for(int i = a.length - 1; i >= 0; i--){


	 			if(sup==0)
	 				mul = 1;
	 			else
					mul *= base;


	 			sum += (a[i] * mul);

	 			sup++;

	 		}


	 		return sum;
	 }


	 public static int arrayHasNoZeros(int[] a){

	 		for(int i=0; i < a.length; i++){

	 			if(a[i]==0){
	 				return 0;
	 			}

	 		}

	 		return 1;
	 }

	 public static int computeDepth(int n){

	 		int i = 1;
	 		int j = 0;
	 		int k = 0;

	 		boolean hasContribute = false;
	 		boolean search = true;
	 		int[] contribute = new int[10];


	 		for(int a=0; a < contribute.length; a++){

	 			contribute[a] = -1;

	 		}

	 		int count = 0;
	 		int digits = 0;



	 		while(search){

	 			j = n * i;
	 			
	 			while(j>0){

	 				k = j % 10;
	 				j = j / 10;

	 				
	 				hasContribute = false;
	 				
	 				for(int l = 0; l < contribute.length; l++){

	 					if(contribute[l]==k){
	 						hasContribute = true;
	 						l=contribute.length;
	 					}
	 				}	

	 				if(!hasContribute){						
						contribute[count] = k;
						count++;
	 				}

	 				 digits = 0;

	 				for (int m=0; m<=9; m++){

	 					for(int x = 0; x < contribute.length; x++){

	 						if(m == contribute[x]){

								digits++;
	 							x = contribute.length;
	 						}
	 					}

	 				}
	 				
	 			}

	 			if(digits==10){

	 				search = false;
	 				return i;

	 			}

	 			i++;

	 		}

	 		return 0;

	 }


	 public static double isPrime2(int n){

	 		int m;

	 		if(n%2==0) return 0;

	 		m = (int) sqrt(n);

	 		for (int i = 3; i <= m; i+=2){

	 			if(n%i==0){
	 				return 0;
	 			}
	 		}

	 		return 1;

	 }

     public static int matches(int[ ] a, int[ ] p)
     {

            int start = 0;
            int end = 0;
            int len = 0;

            for(int i=0; i < p.length; i++){

                if(p[i] < 0)
                    len = p[i] * ( -1 );
                else
                    len = p[i];

                 end +=len; 

                for(int j=start;j < end; j++){

                    if(p[i] > 0){

                        if(a[j] < 0) return 0;

                    }else{

                        if(a[j] > 0) return 0;
                    }
                }

                start += len;
            }


            return 1;

     }


     public static int isStacked(int n){

        int i =1;
        int sum = 0;
        while(i <= n){

            sum += i;

            if(sum==n){
                return 1;
            }


            i++;
           
        }

        return 0;
     }


     public static int isSumSafe(int[ ] a){


        if(a.length <1) return 0;

        int sum = 0;

        for(int i=0;i<a.length;i++){

            sum += a[i];
        }

        for(int j=0;j < a.length;j++){

            if(sum==a[j]) return 0;
        }

        return 1;
     }

     public static int isIsolated(long n){

        if(n>2097151 || n < 1) return 0;


        long square = n * n;
        long cubes = n * n * n;




        long num1 ,num2,squarex;

        while(cubes>0){

            num1 = cubes % 10;
            cubes = cubes / 10;

            squarex = square;

            while(squarex>0){

                num2 = squarex % 10;
                squarex = squarex / 10;

                if(num1==num2) return 0;

            }

        }


        return 1;

     }




     public static void tail(){


        //System.out.println(isIsolated(1500));


        //System.out.println(isSumSafe(new int[]{5,-2,1}));

        //System.out.println(isStacked(15));
        //System.out.println(matches(new int[]{1,  2,  -3, -5, -5,  2, 3, 18} ,new int[]{2, -3, 3}));

     	//System.out.println(isPrime2(31));

     	//print(computeDepth(25));

     	//print(arrayHasNoZeros(new int[]{0,0,0,0}));

     	//print(convertToBase10(new int[]{3, 2, 5} ,8));

     	//print(nUpCount(new int[]{1,2,-1,5,3,2,-3} ,20));


     	/*
     	int[] b = new int[]{};
     	b = bubbleSort(new int[]{7, 3, 3, 2, 4});
     	for(int i=0; i< b.length; i++){
     		print(b[i]);
     	}*/

     	//print(isNUnique(new int[]{7, 3, 3, 2, 4} ,6));

		//print(isDivisible(new int[]{3, 3, 6, 36} ,3));

     	//print(henry(1,3));

     	//print(perfectNumber(502));

     	print(isCentered15(new int[]{1, 1, 15 -1,-1}));
        // print(isCentered15(new int[]{15}));
        // print(isCentered15(new int[]{2,3,4,5,6,7,8}));
        //  print(isCentered15(new int[]{12,3,2,12,4}));



		//int[] a = new int[]{0, 3, 2, 0, 5, 3};
		//print(repsEqual(a ,32053));

     	/*
     	int[] a = solve10();
		for (int i=0; i < a.length; i++) {
			print(a[i]);
		}*/
		
		//print(guthrieIndex(7));


		//int[] a = new int[]{0, 0, 0};
		//print(sumFactor(a));


     	//int[] a = new int[]{8, 4, 2};
		//print(isGuthrieSequence(a));
		
		//int[] a = new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
		//print(stantonMeasure(a));
     }

}