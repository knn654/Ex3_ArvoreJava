package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		Arvore arvore = new Arvore();
		for (char i : vetor) {
			arvore.insert(i);
		}
		try {
			arvore.remove('F');
			System.out.println("Infixo (após remover F)");
			arvore.infixSearch();
			System.out.println();
			arvore.remove('U');
			System.out.println("Infixo (após remover U)");
			arvore.infixSearch();
			System.out.println();
			System.out.println("-------------");
			System.out.println("Prefixo: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.println("Infixo: ");
			arvore.infixSearch();
			System.out.println();
			System.out.println("Pósfixo");
			arvore.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}