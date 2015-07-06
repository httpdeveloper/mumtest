class mumtest{
	
	 /**
     * [guthrieIndex description]
     * @param  n [description]
     * @return integer  [description]
     */
    public static int guthrieIndex(int n) {

        //print(n);

        if (n == 1) {
            return 0;
        }


        int count = 0;
        int m = 0;

        if (n % 2 == 0)
            m = n / 2;
        else
            m = (n * 3)  + 1;

        if (n > 1 ) {
            count = 1;
        }


        return count + guthrieIndex(m);

    }


    /**
     * [solve10 description]
     * @return array [description]
     */
    public static int[] solve10() {

        int n = 1;
        int m = 10;
        int a = 1 ;
        int b = 1;
        int k = 1;

        int[] z = new int[3];

        for (int i = 1; i <= m; i++) {
            n *= i;
        }

        while (k <= m) {

            a = a *  k;
            b = 1;

            for (int j = 1; j <= m; j++) {
                b = b * j;
                if (a + b == n) {
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

    /**
     * [repsEqual description]
     * @param  a [description]
     * @param  n [description]
     * @return  integer [description]
     */
    public static int repsEqual(int[ ] a, int n) {

        for (int i = a.length - 1 ; i >= 0; i--) {

            if (a[i] > 0 && n % 10 != a[i]) {
                return 0;
            }

            n = n / 10;
        }

        return 1;

    }
}