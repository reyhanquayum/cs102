package project2;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the tree species to learn more about it (\"quit\" to stop):");
        TreeSpecies testSpecies =  new TreeSpecies("common Name", "latin Name");
        TreeSpecies species2 = new TreeSpecies("COmmoN Name", "latin Name");
        Tree newTree = new Tree(6, testSpecies);
        System.out.println(testSpecies.equals(species2));
    }
    
}
