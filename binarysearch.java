public class GFG {
	public static int binary(int arr[], int x)
	{
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (x == arr[mid]) {
				return mid;
			}
			else if (x > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = { 2, 4, 5, 17, 14, 7, 11, 22 };
		int search = binary(arr, 22);
		System.out.println(search);
	}
}
