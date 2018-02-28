package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author andytaber
 */
public class PersonalBoard extends GameOfLifeBoard{
    
    
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();
        for(int i = 0; i < this.getWidth(); i++) {
            for(int j = 0; j < this.getHeight(); j++) {
                if(random.nextDouble() <= d) {
                    this.getBoard()[i][j] = true;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if(!isOnBoard(i, i1)) {
            return false;
        }
        return this.getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if(isOnBoard(i, i1)) {
            this.getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if(isOnBoard(i, i1)) {
            this.getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int count = 0;
        for(int j = -1; j < 2; j++) {
            for(int k = -1; k < 2; k++) {
                int x = i + j;
                int y = i1 + k;
                if(isOnBoard(x, y) && !(x == i && y == i1)) {
                    if(this.getBoard()[x][y]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(i2 < 2) {
            this.turnToDead(i, i1);
        } else if (i2 > 3) {
            this.turnToDead(i, i1);
        } else if (i2 == 3) {
            this.turnToLiving(i, i1);
        }
    }
    
    private boolean isOnBoard(int x, int y) {
        return (x >= 0 && x < this.getWidth() && y >= 0 && y < this.getHeight());
    }
}
