package exo.poo.genericite;

public class JoueurTennis extends Sportif {

    public TerrainTennis terrainFav;

    public JoueurTennis(String nom, TerrainTennis terrainFav) {
        super(nom);
        this.terrainFav = terrainFav;
    }

    public TerrainTennis getTerrainFav() {
        return terrainFav;
    }

    public void setTerrainFav(TerrainTennis terrainFav) {
        this.terrainFav = terrainFav;
    }
}
