class mumtest{

	 /**
     * [generateGuthrieSequence description]
     * @param n [description]
     */
    public static void generateGuthrieSequence(int n) {

        int m = 0;

        if (n % 2 == 0)
            m = n / 2;
        else
            m = (n * 3)  + 1;

        if (n > 1 )
            generateGuthrieSequence(m);

    }
	
	 /**
     * [isGuthrieSequence description]
     * @param  a [description]
     * @return   [description]
     */
    public static int isGuthrieSequence(int[ ] a) {

        if (!(a.length > 0)) return 0;

        if (a[a.length - 1] != 1) return 0;

        int b = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] % 2 == 0)
                b = a[i - 1] / 2;
            else
                b = (a[i - 1] * 3) + 1;

            if (b != a[i])
                return 0;

        }

        return 1;

    }


    /**
     * [stantonMeasure description]
     * @param  a [description]
     * @return  integer  [description]
     */
    public static int stantonMeasure(int[ ] a) {

        int count1  = 0;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {
                count1++;
            }
        }


        if (count1 > 0) {

            for (int i = 0; i < a.length; i++) {

                if (a[i] == count1) {
                    count2++;
                }
            }
        }


        return count2;
    }

    /**
     * [sumFactor description]
     * @param  a [description]
     * @return  integer [description]
     */
    public static int sumFactor(int[ ] a) {

        int sum  = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] == sum) {
                count++;
            }
        }


        return count;
    }
}