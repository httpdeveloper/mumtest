class mumtest{

	 /**
     * [sqrt description]
     * @param  n [description]
     * @return   [description]
     */

    public static double sqrt(int n) {

        if (n <= 1) {

            return n;
        }

        double  sqrt , m;
        sqrt  = n / 2;
        do {
            m = sqrt;
            sqrt = (m + (n / m)) / 2;
        } while ((m - sqrt) != 0);
        return sqrt;
    }

	 /**
	  * [isPrime description]
	  * @param  n [description]
	  * @return   [description]
	  */
	 public static double isPrime(int n) {

        int m;

        if (n % 2 == 0) return 0;

        m = (int) sqrt(n);

        for (int i = 3; i <= m; i += 2) {

            if (n % i == 0) {
                return 0;
            }
        }

        return 1;

    }

	/**
     * [findPorcupineNumber description]
     * @param  n [description]
     * @return integer  [description]
     */
    public static int findPorcupineNumber(int n) {

        while (n >= 0) {

            n++;

            if (n % 2 != 0) {

                int m = 0 ;

                if (isPrime(n)) {

                    m = n;

                    boolean nextNumber = true;

                    while (nextNumber) {

                        m++;

                        if (isPrime(m)) {
                            nextNumber = false;
                        }
                    }


                    if (n % 10 == 9 && m % 10 == 9) {
                        return n;
                    }
                }
            }

        }

        return 0;
    }

    /**
     * [count7 description]
     * @param  n [description]
     * @return  integer [description]
     */
    public static int count7(int n) {

        if (n == 0) return 0;

        int c = 0;
        int m =  n % 10;

        if (m == 7) {
            c = 1;
        } else {
            c = 0;
        }

        return c + count7(n / 10);
    }

}