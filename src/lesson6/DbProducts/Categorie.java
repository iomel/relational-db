package lesson6.DbProducts;

public class Categorie {
    private long id;
    private String categoryName;
    private String description;
    private String picture;

    public Categorie(long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Categorie(long id, String categoryName, String description, String picture) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }
}
