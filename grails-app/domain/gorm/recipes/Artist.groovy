package gorm.recipes

class Artist {


    String name
    Date birthDate
    String home
    String style

    static hasMany = [works: Work]

    def String toString() {
        "($id: $name)"
    }
}
