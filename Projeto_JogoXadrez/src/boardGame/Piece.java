package boardGame;

public class Piece {
	
	protected Position position; // A posição só poderá ser acessada por quem estiver no tabuleiro
	private Board board;
	
	/*
	 * A posição de uma peça recém criada será tida como Nula
	 * Por isso que não passamos como argumento do Construtor, mas é importante inicializar a peça como Nula
	 */
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// Somente classes do mesmo pacote e subClasses poderão acessar o tabuleiro de uma peça. Ele será de uso interno da class
	protected Board getBoard() {
		return board;
	}

	/*
	 * Ninguém poderá alterar o meu tabuleiro
	 * 
	  public void setBoard(Board board) {
		this.board = board;
	}
	*
	 */
	
	
	

}
