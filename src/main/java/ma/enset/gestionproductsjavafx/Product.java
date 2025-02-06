package ma.enset.gestionproductsjavafx;

public class Product {

    private String nom;
    private double prix;

    public Product(String nom , double prix) {
        this.prix = prix;
        this.nom = nom;
    }

    public Product() {
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
