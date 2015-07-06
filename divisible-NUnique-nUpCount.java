class mumtest{
	
	 /**
     * [isDivisible description]
     * @param  a       [description]
     * @param  divisor [description]
     * @return    integer 1 if true otherwise 0     [description]
     */
    public static int isDivisible(int [  ] a, int divisor) {

        int divisible = 1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % divisor != 0) {
                divisible = 0;
                break;

            }

        }


        return divisible;
    }


    /**
     * [isNUnique description]
     * @param  a [description]
     * @param  n [description]
     * @return  1 if true otherwise 0 [description]
     */
    public static int isNUnique(int[ ] a, int n) {

        int count = 0;


        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (n == (a[i] + a[j])) {

                    count++;
                }

            }

        }


        if (count == 1) return 1;

        return 0;

    }

    /**
     * [nUpCount description]
     * @param  a [description]
     * @param  n [description]
     * @return  integer  [description]
     */
    public static int nUpCount(int[] a , int n) {

        int partialSumStart = 0;
        int partialSumEnd = 0;
        int upcount = 0;

        for (int i = 0; i < a.length; i++) {


            partialSumEnd += a[i];


            if (partialSumStart <= n && partialSumEnd > n) {
                upcount++;
            }

            partialSumStart = partialSumEnd;

        }

        return upcount;
    }
}