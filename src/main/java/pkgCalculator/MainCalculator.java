package pkgCalculator;

public class MainCalculator {

	// updateing changes for cicd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator objscientificCalculator=new Calculator();
		String StrResult=objscientificCalculator.varHi;
		
		if(StrResult.contains("Hello world")){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		int resultAddition=objscientificCalculator.addition(12, 12);
		
		if(resultAddition==24){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		

	}

}
