public class Linear{
	public static void linear(int arr[], int value){
		int size = arr.length;
		System.out.print("Number you want to find is:" +value);
		System.out.print("\n");
		for(int i= 0; i < size; i++){
			if(value == arr[i]){
				System.out.print("Element is present on index: "+i);
			}
			else{
				System.out.print("Element not present ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		int arr[] = {34,23,12,23,54,12,23,35,53};
		int value = 23;
		linear(arr, value);
	}
}