package practica11.ejercicio4;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

public class Board extends Parent {
    private VBox rows = new VBox();
    private boolean enemy = false;
    public int ships = 5;

    public Board(boolean enemy) {
        this.enemy = enemy;
        for (int i = 0; i < 10; i++) {
            HBox row = new HBox();
            for (int j = 0; j < 10; j++) {
                Cell c = new Cell(i, j, this);
                c.setOnMouseClicked(handler);
                row.getChildren().add(row);

            }
        }
    }

    public class Cell extends Rectangle {
        public int x;
        public int y;
        public Ship ship = null;
        public boolean wasShot = false;
        private Board board;

        public Cell(int x1, int y1, Board board) {
            super(30, 30);
            this.x = x1;
            this.y = y1;
            this.board = board;
            setFill();
        }
    }
}
