package BinarySearch;
public class kokoEatingBananas {
    public static int findMax(int v[]) {
        int n = v.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static int findTotalHrs(int v[], int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) v[i] / (double) hourly);
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int v[], int h) {
        int low = 1;
        int high = findMax(v);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = findTotalHrs(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = { 7, 15, 6, 3 };
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
