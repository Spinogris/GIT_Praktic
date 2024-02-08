package de.telran.generic.garbage;

public class TwoCellsBox <T, S> {
    private T firstCellItem;
    private S cellCellItem;

    public TwoCellsBox(T firstCellItem, S cellCellItem) {
        this.firstCellItem = firstCellItem;
        this.cellCellItem = cellCellItem;
    }

    @Override
    public String toString() {
        return "TwoCellsBox{" +
                "firstCellItem=" + firstCellItem +
                ", cellCellItem=" + cellCellItem +
                '}';
    }
}
