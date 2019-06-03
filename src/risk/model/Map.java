package risk.model;

import risk.model.Tile;

public class Map {
  private Tile[][] tileArray;

  public Map() {
    this.tileArray = new Tile[4][2];
    for (int x = 0; x < tileArray.length; x++) {
      for (int y = 0; y < tileArray[x].length; y++) {
        tileArray[x][y] = new Tile();
      }
    }
  }
}
