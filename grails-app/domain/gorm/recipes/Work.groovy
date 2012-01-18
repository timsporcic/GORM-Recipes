package gorm.recipes

class Work {

    String title
    Integer price
    Date created

    static belongsTo = [artist: Artist]

    def String toString() {
        "($id: $title)"
    }


}
