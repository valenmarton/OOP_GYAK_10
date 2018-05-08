package tartalyos.Fut;

import tartalyos.Tartaly;

public class Futtathato {

	public static void main(String[] args) {
		
		Tartaly[] tartalyArray = new Tartaly[5];
		
		for(int i=0;i< tartalyArray.length;i++){
			tartalyArray[i]= new Tartaly(i,i*2);
			
		}
		
		for( Tartaly tartaly : tartalyArray){
			System.out.println(tartaly);
			
		}
		int maxNyomas=0;
		for(int i=0;i< tartalyArray.length;i++){
			if(tartalyArray[i].isBiggerThan(tartalyArray[maxNyomas])){
				maxNyomas=i;
			}
		}
		System.out.println(tartalyArray[maxNyomas]+ " " +maxNyomas);
		
		Tartaly maxTartaly= tartalyArray[0];
		for(int i=0;i< tartalyArray.length;i++){
			if(maxTartaly.getTerfogat()< tartalyArray[i].getTerfogat()){
				maxTartaly=tartalyArray[i];
			}
		}
		System.out.println(maxTartaly);

	}

}
