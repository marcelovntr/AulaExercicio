import java.util.Scanner;

public class leitor_de_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner (System.in);
	
		
	int soma=0;	
		
	for(int i=1;i<=5;i++) {
		System.out.println("digite a nota de 5 alunos:");
		int nota=input.nextInt();
		soma+=nota;
	
	}
	
	System.out.println("total: "+soma);
	
	input.close();
	}

}
