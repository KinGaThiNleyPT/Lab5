public class Key{
	public static void main(String[] args	W) {
		int arr[] = {'a','d','c','b','e','s'};//initailize the array

		int n = arr.length;
		int []aux = new int[n];
		int R = 250;
		int count[] = new int[R+1];
		//compute frequency counts
		for(int i = 0; i < n; i++){
			count[arr[i] + 1]++;
		}
		//Transform counts to indices
		for(int r = 0; r < R; r++){
			count[r + 1] = count[r+1] + count[r];
		}
		//Distribute the records
		for(int i = 0; i < n; i++){
			aux[count[arr[i]]++] = arr[i];
		}
		//copy back
		for (int i = 0;i < n; i++) {
			arr[i] = aux[i];
		}
		show(arr);
	}
	public static void show(int arr[]){
		for (int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.print("\n");
	}
}
