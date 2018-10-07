package task1;

public class Matches {
    private int n;

    public Matches(int n){
        this.n = n;
        findMinimumNumberOfMatches();
    }

    private void findMinimumNumberOfMatches(){
        int result = 0;

        if (n == 1) {
            result = 4;
        } else if (n == 2) {
            result = 7;
        } else if (n > 2){
            int count = 2;
            result = 7;
            while (count <= n){
                n = n - count;
                count = count + 2;
            }

            int temp = 0;
            for (int i = 2; i < count - 2; i = i + 2) {
                result = result + 10 + temp;
                temp = temp + 4;
            }
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    if (i == 0 || i == count/2){
                        result = result + 3;
                    }else {
                        result = result + 2;
                    }
                }
            }
        }
        System.out.println(" minimum number of matches = " + result);
    }

}
