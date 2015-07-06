class mumtest{


    /**
     * [isInertial description]
     * @param  a [description]
     * @return  integer [description]
     */
    public static int isInertial(int[ ] a) {

        boolean hasOddNumber = hasOddNumber(a);

        if (!hasOddNumber) return 0;

        boolean hasOddGreaterThanEven = hasOddGreaterThanEven(a);

        if (!hasOddGreaterThanEven) return 0;

        return 1;

    }

	/**
	 * [max description]
	 * @param  a [description]
	 * @return  integer  [description]
	 */
	public static int max(int[] a) {

        int max = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {

                max = a[i];
            }

        }

        return max;
    }

    /**
     * [hasOddNumber description]
     * @param  a [description]
     * @return boolean  [description]
     */
    public static boolean hasOddNumber(int[] a) {

        boolean hasOddNumber = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                hasOddNumber = true;
                break;
            }
        }

        return hasOddNumber;
    }


	/**
	 * [countSquarePairs description]
	 * @param  a [description]
	 * @return integer  [description]
	 */
	public static int countSquarePairs(int[] a) {


        if (a.length < 1) {
            return 0;
        }

        int count = 0;

        int len = a.length;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {

                if (a[i] > 0 && a[j] > 0 && a[i] < a[j]) {

                    int k = a[i] + a[j];

                    int l = (int) sqrt(k);

                    if (l * l == k) {
                        count++;

                    }
                }
            }
        }


        return count;
    }

	/**
	 * [arraySum description]
	 * @param  a      [description]
	 * @param  start  [description]
	 * @param  length [description]
	 * @return        [description]
	 */
	public static int arraySum(int[] a , int start , int length) {

        int sum = 0;

        int end = start + length;

        for (int i = start; i < end; i++) {

            sum += a[i];
        }

        return sum;
    }

    /**
     * [checkArrayLen description]
     * @param  a [description]
     * @param  n [description]
     * @return   [description]
     */
    public static boolean checkArrayLen(int[ ] a , int n) {


        int allowLen = n * (n + 1) / 2;

        if (!(a.length >= allowLen)) {

            return false;
        }


        return true;

    }

	/**
	 * [findLength description]
	 * @param  a [description]
	 * @return   [description]
	 */
	public static int findLength(int[] a) {


        if (a.length > 2) {

            for (int i = 2; i < a.length; i++) {

                int n = i * (i + 1) / 2;

                if (a.length == n) {

                    return n;
                }

            }
        }

        return 0;
    }

	 /**
	  * [isMadhavArray description]
	  * @param  a [description]
	  * @return   [description]
	  */
	 public static int isMadhavArray(int[ ] a) {

        int start = 0;
        int length = 1;
        boolean marr = false;
        int preValue = a[0];
        int nextValue = 0;
        int n = findLength(a);


        if (n > 0) {

            marr = true;

            for (int i = 0; i < n; i++) {
                if (start + length <= a.length) {
                    nextValue = arraySum(a , start , length);

                    if (preValue != nextValue) {
                        marr = marr && false;
                    } else {
                        marr = marr && true;
                        preValue = nextValue;
                    }

                    start += length;
                    length += 1;
                }
            }

        }


        if (marr)
            return 1;
        else
            return 0;

    }

}