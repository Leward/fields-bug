package myapp

class BootStrap {

    def init = { servletContext ->
        new Company(name: 'Google', website: 'https://google.com').save()
        new Company(name: 'Nintendo', website: 'https://www.nintendo.com').save()
    }
    def destroy = {
    }
}
