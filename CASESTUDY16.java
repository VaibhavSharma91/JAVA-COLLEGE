class FoodPreparation extends Thread {
    public void run() {
        System.out.println("Food preparation started.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Food preparation interrupted.");
        }

        System.out.println("Food preparation completed.");
    }
}

class FoodDelivery extends Thread {
    public void run() {
        System.out.println("Food delivery started.");
        System.out.println("Food delivered successfully!");
    }
}

public class CASESTUDY16 {
    public static void main(String[] args) {
        FoodPreparation preparation = new FoodPreparation();
        FoodDelivery delivery = new FoodDelivery();

        preparation.start();

        try {
            preparation.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        delivery.start();
    }
}