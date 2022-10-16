package project2;


public class TreeSpecies {
    String commonName;
    String latinName;

    public TreeSpecies(String commonName, String latinName){
            this.commonName = commonName;
            if (this.commonName == null){
                throw new NullPointerException("Tree cannot have null as commonName!");
            }
            this.latinName = latinName;
            if (this.latinName == null){
                throw new NullPointerException("Tree cannot have null as latinName!");
            }
        }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof TreeSpecies)){
            return false;
        }
        TreeSpecies t = (TreeSpecies) obj;
        if (this.commonName.toLowerCase().equals(t.commonName.toLowerCase()) && this.latinName.toLowerCase().equals(t.latinName.toLowerCase())){
            return true;
        }
        return false;
    }
 }


