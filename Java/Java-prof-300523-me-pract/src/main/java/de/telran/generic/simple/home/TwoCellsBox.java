package de.telran.generic.simple.home;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public
class TwoCellsBox<T, S> {
    private T firstCellItem;
    private S secondCellItem;
}
