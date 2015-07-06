class mumtest {

    /**
     * [isSumSafe description]
     * @param  a [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int isSumSafe(int[ ] a) {


        if (a.length < 1) return 0;

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
        }

        for (int j = 0; j < a.length; j++) {

            if (sum == a[j]) return 0;
        }

        return 1;
    }

    /**
     * [isIsolated description]
     * @param  n [description]
     * @return  1 if true otherwise 0 [description]
     */
    public static int isIsolated(long n) {

        if (n > 2097151 || n < 1) return 0;

        long square = n * n;
        long cubes = n * n * n;
        long num1 , num2, squarex;

        while (cubes > 0) {

            num1 = cubes % 10;
            cubes = cubes / 10;

            squarex = square;

            while (squarex > 0) {

                num2 = squarex % 10;
                squarex = squarex / 10;

                if (num1 == num2) return 0;

            }

        }

        return 1;
    }


    /**
     * [isVanilla description]
     * @param  a [description]
     * @return  integer 1 if true otherwise 0 [description]
     */
    public static int isVanilla(int[ ] a) {

        int b, c;
        int start = 1;
        int d = 0;


        for (int i = 0; i < a.length; i++) {

            b = a[i];

            if (b < 0) {

                b *=  -1;
            }

            while (b > 0) {

                c = b % 10;

                if (start == 1) d = c;

                if (c != d) return 0;

                d = c;

                b = b / 10;

                start++;

            }

        }


        return 1;
    }
}