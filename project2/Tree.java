package project2;

public class Tree implements Comparable<Tree>{
    private int tree_id;
    private TreeSpecies species;
    String status;
    String health;
    String spc_health;
    String spc_common;
    int zipcode;
    String boroname;
    double x_sp;
    double y_sp;

    public Tree (int treeID, TreeSpecies species) throws IllegalArgumentException{
        this.tree_id = treeID;
        if (this.tree_id < 0){
            throw new IllegalArgumentException("Tree_id must be a non-negative integer!");
        }

        this.species = species;
        if (this.species == null){
            throw new IllegalArgumentException("Species cannot be null!");
        }
    }

    public int getTreeID(){
        return this.tree_id;
    }

    public TreeSpecies getTreeSpecies(){
        return this.species;
    }

    public void setTreeID(Tree tree, int id) throws IllegalArgumentException{
        if (id < 0){
            throw new IllegalArgumentException("Tree_id must be a non-negative integer!");
        }
        tree.tree_id = id;
    }

    public void setTreeSpecies(Tree tree, TreeSpecies species) throws IllegalArgumentException{
        if (species == null){
            throw new IllegalArgumentException("Species of tree cannot be null!");
        }
        tree.species = species;
    }


   @Override
   public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Tree)){
            return false;
        }
        Tree treeObj = (Tree) obj;
        if (this.getTreeID() == treeObj.getTreeID() && this.getTreeSpecies().equals(treeObj.getTreeSpecies())){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Tree t) throws NullPointerException {
        String thisCommonName = this.getTreeSpecies().commonName.toLowerCase();
        String tCommonName = t.getTreeSpecies().commonName.toLowerCase();

        if (this.equals(t)){
            return 0;
        }
        if (thisCommonName.compareTo(tCommonName) == -1){
            return -1;
        }
        if (thisCommonName.compareTo(tCommonName) == 1){
            return 1;
        }
        if (this.getTreeID() < t.getTreeID()){
            return -1;
        }
        if (this.getTreeID() > t.getTreeID()){
            return 1;
        }

        return 0;
    }

    @Override
    public String toString(){
        // TODO THIS METHOD IS A STUB
        return "";
    }

}