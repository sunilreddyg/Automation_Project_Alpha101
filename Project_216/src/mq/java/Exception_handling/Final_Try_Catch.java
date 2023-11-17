package mq.java.Exception_handling;

public class Final_Try_Catch {

	public static void main(String[] args) {
		
		try {
			int arr[]= {10,20,30};
			System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Run Completed");
		}

	}

}
