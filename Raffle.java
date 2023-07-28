public class Raffle {
    public static void main(String[] args) {
        Store store = new Store();

        Toy toy1 = new Toy(1, "Электросамокат", 1, 20);
        Toy toy2 = new Toy(2, "Супер бластер", 2, 40);
        Toy toy3 = new Toy(3, "Свинка Пепе", 2, 50);
        Toy toy4 = new Toy(3, "Танцующий Динозавр", 5, 30);
        Toy toy5 = new Toy(3, "3D ручка", 2, 90);
        Toy toy6 = new Toy(3, "Электрический водяной пистолет", 1, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выиграли: " + prizeToy.getName());
        }
    }
}

