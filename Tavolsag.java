import java.util.Scanner;
class Tavolsag{
	
	public static void main(String[] args){
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kerek egy magassagot: ");
		double magassag = sc.nextDouble();
		System.out.println("Kerek egy szoget: ");
		double szog = sc.nextDouble();
		
		double eredmeny = magassag/(szog* Math.PI / 180);
		System.out.println(eredmeny);
		}
	
	}


