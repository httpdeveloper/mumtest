class Mumtest {
  
    /**
     * [isTrivalent description]
     * @param  a [description]
     * @return   integer 1 if true otherwise 0 [description]
     */
    
    public static  int isTrivalent (int[ ] a) {
        int tmp; int count = 1;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {

                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < a.length - 1 ; i++) {

            if (a[i + 1] != a[i]) {

                count++;
            }
        }

        if (count == 3) return 1;

        return 0;
    }

    /**
     * [countRepresentations description]
     * @param  numRupees [description]
     * @return    integer       [description]
     */

    public static int countRepresentations(int numRupees) {

        int count = 0;


        for (int rupee20 = 0; rupee20 <= numRupees; rupee20++) {
            for (int rupee10 = 0; rupee10 <= numRupees; rupee10++) {
                for (int rupee5 = 0; rupee5 <= numRupees; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= numRupees; rupee2++) {
                        for (int rupee1 = 0;  rupee1 <= numRupees; rupee1++) {
                            if ( ( (20 * rupee20) + (10 * rupee10) + (5 * rupee5) + (2 * rupee2) + (1 * rupee1)) == numRupees) {
                                count++;
                            }
                        }

                    }
                }
            }
        }


        return count;

    }


    /**
     * [isSequentiallyBounded description]
     * @param  a [description]
     * @return   integer 1 if true otherwise 0 [description]
     */
    public static int isSequentiallyBounded(int[ ] a) {
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {

            if (!(a[i + 1] >= a[i])) return 0;

            if (a[i + 1] == a[i]) {
                count++;
            } else {
                count = 1;
            }

            if (count >= a[i]) return 0;

        }

        return 1;
    }
}