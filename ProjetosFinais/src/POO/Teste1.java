package POO;

import java.util.ArrayList;
import java.util.List;

public class Teste1 {
	
	private static int vi = 7;
	public static void main(String[] args) {
		
		
		Video v[] = new Video[vi];
		v[0]= new Video("king kong");
		Gafanhoto G[] = new Gafanhoto[3];
		
		System.out.println(v[0].videoD());
		
		Gafanhoto g = new Gafanhoto("isac", 23, "m", 0, "isaczx");
		
		Visualização vis = new  Visualização(g, v[0]);
		System.out.println(vis.getEspectador().getNome()+" "+ vis.getFilme().getTitulo());
		
		
		
		
		
	}

}
