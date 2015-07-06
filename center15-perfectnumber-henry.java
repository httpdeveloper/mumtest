class mumtest{
	
	/**
     * [isCentered15 description]
     * @param  a [description]
     * @return  integer [description]
     */
    public static int isCentered15(int[ ] a) {

        int start = 0;
        int count = 0;
        int centerLen = 0;
        int j = 0;
        int k = 0;
        int xcount = 0;

        while (start < a.length) {
            j = 0;
            count = 0;
            for (int i = start; i < a.length; i++) {
                j++;
                count += a[i];
                if (count == 15) {
                    k = start + j;
                    if (a.length - k == start) {
                        System.out.println(xcount);
                        return 1;
                    }
                }
            }
            start++;
        }
        return 0;
    }

    /**
     * [perfectNumber description]
     * @param  n [description]
     * @return  integer [description]
     */
    public static int perfectNumber(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                print(i);

                sum += i;
            }

        }


        if (n == sum)
            return 1;

        return 0;
    }

    /**
     * [henry description]
     * @param  i [description]
     * @param  j [description]
     * @return  integer [description]
     */
    public static int henry (int i, int j) {

        int pernumber = 0;
        int sum = 0;
        int sumperfect = 0;
        boolean loop = true;
        int search = 0;


        while (loop) {
            search++;
            sum = 0;
            for (int k = 1; k < search; k++) {
                if (search % k == 0) {
                    sum += k;
                }

            }

            if (sum == search) {
                pernumber++;
                if (pernumber == i) {
                    sumperfect += sum;
                }
                if (pernumber == j) {

                    sumperfect += sum;
                }
            }

            if (pernumber >= j) {
                loop = false;
            }
        }


        return sumperfect;
    }
}