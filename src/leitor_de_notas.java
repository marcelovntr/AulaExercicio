import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leitor_de_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner (System.in);
	
		
	List<Double> notas=new ArrayList<>(); 
	int soma=0;	
		
	for(int i=0;i<5;i++) {
		System.out.println("digite a nota de 5 alunos:");
		notas.add(input.nextDouble());
		soma+=notas.get(i);
	
	}
	
	System.out.println("total: "+notas.size());
	System.out.println(soma);
	
	
	
	
	
	
	input.close();
	}

}
