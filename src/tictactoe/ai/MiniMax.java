package tictactoe.ai;

import tictactoe.engine.Board;
import tictactoe.engine.Mark;

public class MiniMax extends Ai {
    public MiniMax(Board board, Mark mark) {
        super(board, mark);
    }

    @Override
    public int getMove() {
        return 0;
    }

    private int evaluate() {
        return 0;
    }
}