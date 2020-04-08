public static int getNumberOfMaxParam(int a, int b, int c) {
        int result;
        if (a >= b && a >= c ) {
        result = 1;
        } else if (b >= a && b >= c) {
        result = 2;
        } else {
        result = 3;
        }
        return result;
        }
