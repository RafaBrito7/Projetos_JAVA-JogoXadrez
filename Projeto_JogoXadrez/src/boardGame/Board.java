package boardGame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar tabuleiro: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece (int row, int columns) {
		if (!positionExists(row, columns)) {
			throw new BoardException("A posição não existe no tabuleiro");
		}
		return pieces[row][columns];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("A posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPeace(position)) {
			throw new BoardException("A posição já existe no tabuleiro " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPeace(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("A posição não existe no tabuleiro");
		}
		return piece(position) != null;
	}
}
