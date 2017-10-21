/* Programador: Vinicio Lima
 * 
 * Data: 24/09/17
 * Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo: 
 */
package exercicios;

public class Lote2Ex11 {
    
    public static void main(String[] args) {
        
		int mat[][] = new int[8][8];
		mat = carregar(mat);
		exibir(mat);
    }
	
	public static int[][] carregar(int mat[][]){
            
                int i, j, z = 1;		
                
		while(z < 5){
			for(i = z-1; i < 9-z; i++){
				for(j = z-1; j < 9-z; j++){
					mat[i][j] = z;
				}
			}
			z++;
                }
		return mat;
	}

	public static void exibir(int mat[][]){

            int i, j;
            
		for(i = 0 ;i < 8; i++){
                    for(j = 0; j < 8;j++){
                        
			System.out.print(mat[i][j]);
                        
                    }                    
                        System.out.println(" ");
		}                
	}
}