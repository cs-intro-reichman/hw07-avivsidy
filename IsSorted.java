public class IsSorted {

    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    private static boolean isSorted(int[] a, int i) {
        if (a.length <= 1) return true;
        if (i >= a.length - 1) return true;
        if (a[i] > a[i + 1]) return false;
        return isSorted(a, i + 1);
    }
}
