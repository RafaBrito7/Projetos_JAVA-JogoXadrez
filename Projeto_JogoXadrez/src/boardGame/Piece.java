package boardGame;

public class Piece {
	
	protected Position position; // A posi��o s� poder� ser acessada por quem estiver no tabuleiro
	private Board board;
	
	/*
	 * A posi��o de uma pe�a rec�m criada ser� tida como Nula
	 * Por isso que n�o passamos como argumento do Construtor, mas � importante inicializar a pe�a como Nula
	 */
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// Somente classes do mesmo pacote e subClasses poder�o acessar o tabuleiro de uma pe�a. Ele ser� de uso interno da class
	protected Board getBoard() {
		return board;
	}

	/*
	 * Ningu�m poder� alterar o meu tabuleiro
	 * 
	  public void setBoard(Board board) {
		this.board = board;
	}
	*
	 */
	
	
	

}
