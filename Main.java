import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    	
        //Initilizing what we know
		int numberOfStudents = 2;
		int numberOfTest = 4;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<numberOfStudents; i++){
			
			System.out.println("Enter the data for the studen: #" + (i+1) );
			
			double total = 0;
			
			for(int j=0; j<numberOfTest; j++){
				System.out.println("Enter the total score for the test: #" + (j+1) );
				double score = scanner.nextDouble();
				total = total + score;
				
				
				
			}
			
			double average = total/numberOfTest;
			System.out.println("The test average for student #" + (i+1) + " is: " + average);
		}
		
		scanner.close();
	
  }
}