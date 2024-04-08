package Test.src;

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Chess {
    public static abstract class ChessPiece {
        private int locX, locY;

        ChessPiece(int x, int y) {
            locX = x;
            locY = y;
        }

        int getX() {
            return locX;
        }

        int getY() {
            return locY;
        }

        abstract boolean canAttack(ChessPiece p);
    }

    public static class King extends ChessPiece {
        King(int x, int y) {
            super(x, y);
        }

        boolean canAttack(ChessPiece p) {

            if ( Math.abs(this.getX() - p.getX()) <=1 && Math.abs(this.getY() - p.getY()) <=1 ) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static class Bishop extends ChessPiece {
        Bishop(int x, int y) {
            super(x, y);
        }

        boolean canAttack(ChessPiece p) {
            if (Math.abs(p.getX() - this.getX()) == Math.abs(p.getY() - this.getY())) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static class Rook extends ChessPiece {
        Rook(int x, int y) {
            super(x, y);
        }

        boolean canAttack(ChessPiece p) {
            if (p.getX() == this.getX() && p.getY() != this.getY()) {
                return true;
            } else if (p.getY() == this.getY() && p.getX() != this.getX()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static class Queen extends ChessPiece {
        Queen(int x, int y) {
            super(x, y);
        }

        boolean canAttack(ChessPiece p) {
            if ( Math.abs(this.getX() - p.getX()) <=1 && Math.abs(this.getY() - p.getY()) <=1 ) {
                return true;
            } else if (Math.abs(p.getX() - this.getX()) == Math.abs(p.getY() - this.getY())) {
                return true;
            } else if (p.getX() == this.getX() && p.getY() != this.getY()) {
                return true;
            } else if (p.getY() == this.getY() && p.getX() != this.getX()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static class Knight extends ChessPiece {
        Knight(int x, int y) {
            super(x, y);
        }

        boolean canAttack(ChessPiece p) {
            if (Math.abs(p.getX() - this.getX()) == 2 && Math.abs(p.getY() - this.getY()) == 1){
                return true;
            } else if (Math.abs(p.getX() - this.getX()) == 1 && Math.abs(p.getY() - this.getY()) == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
