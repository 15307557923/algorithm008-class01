public class week001_day01{
    public int removeDuplicates(int[] arr) {
        int x = 0;
        for (int y = 1;y < arr.length; y ++) {
            if (arr[x] != arr[y]) {
                if ((y - x) > 1 )  {
                    arr[x + 1] = arr[y];
                }
                x ++;
            }
        }
        return x + 1;
}