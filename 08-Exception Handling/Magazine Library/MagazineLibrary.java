import java.util.ArrayList;

public class MagazineLibrary {
    
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(magazines.get(index));
    }

    public void setMagazine(int index, Magazine magazine) {
        this.magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        this.magazines.add(new Magazine(magazine));
    }
}