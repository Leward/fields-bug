package myapp

class Company {

    String name
    String website

    static constraints = {
        name blank: false
        website url: true
    }
}
