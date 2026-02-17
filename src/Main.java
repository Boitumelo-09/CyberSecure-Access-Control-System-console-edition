
void main() {
    IO.println("Hello Broski...");

    Intern intern = new Intern("Cassias","67548");
    Admin administrator = new Admin("Marcello Kuna","4532");
    SecurityAnalyst securityAnalyst = new SecurityAnalyst("Boitumelo","34257");

        intern.accessSystem();
        administrator.accessSystem();
        securityAnalyst.accessSystem();
}
