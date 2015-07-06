class mumtest{
	
	/**
     * [isLegalNumber description]
     * @param  a    [description]
     * @param  base [description]
     * @return   integer 1 if true otherwise 0 [description]
     */
    public static int isLegalNumber(int[  ] a, int base) {

        for (int i = 0; i < a.length; i++) {

            if (!(a[i] < base)) {
                return 0;
            }

        }

        return 1;

    }

    /**
     * [convertToBase10 description]
     * @param  a    [description]
     * @param  base [description]
     * @return   integer   [description]
     */
    public static int convertToBase10(int[  ] a, int base) {


        int isLegalNumber = isLegalNumber(a , base);

        if (isLegalNumber != 1) return 0;

        int sum = 0;
        int sup = 0;
        int mul = 0;

        for (int i = a.length - 1; i >= 0; i--) {


            if (sup == 0)
                mul = 1;
            else
                mul *= base;


            sum += (a[i] * mul);

            sup++;

        }


        return sum;
    }


    /**
     * [arrayHasNoZeros description]
     * @param  a [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int arrayHasNoZeros(int[] a) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                return 0;
            }

        }

        return 1;
    }
    
}