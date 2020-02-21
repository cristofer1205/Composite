package pattern.composite;

public class ClientComposite {
    public static void main(String... args) {

        Employee marcManager = new Manager("Marc");

        Employee mariaDeveloper = new Developer("Maria");
        Employee emaDeveloper = new Developer("Ema");
        Employee brianDeveloper = new Developer("Brian");

        marcManager.add(mariaDeveloper);
        marcManager.add(emaDeveloper);
        marcManager.add(brianDeveloper);

        Employee susanManager = new Manager("Susan");

        Employee jamesDeveloper = new Developer("James");
        Employee michaelDeveloper = new Developer("Michael");

        susanManager.add(jamesDeveloper);
        susanManager.add(michaelDeveloper);

        System.out.println(marcManager.calculatePoints());
        System.out.println(susanManager.calculatePoints());

    }
}
