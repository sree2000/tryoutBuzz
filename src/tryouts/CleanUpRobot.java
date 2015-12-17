package tryouts;

public class CleanUpRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length==0){
			System.out.println("please write number toys on tiles in order \n from 1 to 4 and write tile bot will start on");
		}
		else if(args.length==5){
			int toysOnTileOne = Integer.parseInt(args[0]);
			int toysOnTileTwo = Integer.parseInt(args[1]);
			int toysOnTileThree = Integer.parseInt(args[2]);
			int toysOnTilefour = Integer.parseInt(args[3]);
			int tileBotStartsOn = Integer.parseInt(args[4]);
				if (tileBotStartsOn==){
					while(toysOnTileOne>0){
						toysOnTileOne--;
					}
			}	
				if (tileBotStartsOn==){
					while(toysOnTileTwo>0){
						toysOnTileTwo--;
					}
			}
				if (tileBotStartsOn==){
					while(toysOnTileThree>0){
						toysOnTileThree--;
					}
			}
				if (tileBotStartsOn==){
					while(toysOnTilefour>0){
						toysOnTilefour--;
			}
		
		}
		else {
			System.out.println("please write number toys on tiles in order \n from 1 to 4 and write tile bot will start on");
		}
	}
}
}
