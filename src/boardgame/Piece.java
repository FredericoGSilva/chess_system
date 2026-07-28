package boardgame;

public class Piece {
    
    // Posição simples de matriz e não de de xadrez
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // A peça não foi colocada em nenhuma posição ainda
        position = null;
    }
    
    // apenas classes do mesmo pacote ou subclasses podem acessar o tabuleiro
    // Tabuleiro associado a uma peça será acessado apenas por classes do mesmo pacote ou por subclasses de Piece 
    protected Board getBoard() {
        return board;
    }
}
