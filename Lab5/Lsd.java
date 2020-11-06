public class Lsd{
	public static void show(String arr[], int w){
		int n = arr.length;
		int R = 250;
		String [] aux = new String[n];
		
		for (int d = w-1; d>=0; d--) {
			int[] count = new int[R+1];

			for (int i=0; i<n; i++ ){
				count[arr[i].charAt(d)+1]++;
			}

			for (int r=0; r<R; r++ ) {
				count[r+1] = count[r+1] + count[r];
			}

			for (int i =0; i<n; i++ ) {
				aux[count[arr[i].charAt(d)]++]= arr[i];
			}
			for (int i=0; i< n; i++) {
				arr[i] = aux[i];
			}
		}
		for (int i = 0; i< n; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.print("\n");	
	}
	public static void main(String[] args) {
		String arr[] = {"pema","nima","dawa","momo"};
		int w = 4;
		show(arr,w);
	}
}