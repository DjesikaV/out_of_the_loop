import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random generator = new Random();
    public static void main(String[] args) {
        System.out.println("Въведи брой участници: ");
        int playersCount = scanner.nextInt();
        String[] playerRoles = {"player", "impostor"};
        LinkedHashMap<String, String> players = new LinkedHashMap<>();
        for (int i = 0; i < playersCount; i++) {
            System.out.println("Въведи име: ");
            String playerName = scanner.next();
            int randomRole = generator.nextInt(playerRoles.length);
            String role = playerRoles[randomRole];
            if (players.containsValue("impostor")) {
                players.put(playerName, "player");
            } else {
                players.put(playerName, role);
            }
        }
        String[] food = {"Pizza", "Cheeseburger", "Sushi", "Spaghetti Carbonara", "Caesar Salad",
                "Beef Taco", "Grilled Steak", "Club Sandwich", "Tomato Soup", "Chicken Curry",
                "Fried Rice", "French Baguette", "Cheddar Cheese", "Red Apple", "Banana",
                "Orange", "Strawberry", "Vanilla Ice Cream", "Chocolate Cake", "Oatmeal Cookie",
                "Dark Chocolate", "Glazed Donut", "Blueberry Pancakes", "Belgian Waffle",
                "Cheese Omelet", "French Fries", "Fried Chicken", "Grilled Salmon", "Garlic Shrimp", "Spicy Tofu"};
        String[] jobs = {"Software Engineer", "Nurse", "Teacher", "Graphic Designer", "Accountant",
                "Electrician", "Plumber", "Chef", "Police Officer", "Firefighter", "Lawyer", "Dentist",
                "Architect", "Journalist", "Pilot", "Marketing Manager", "Data Scientist", "Mechanical Engineer",
                "Pharmacist", "Veterinarian", "Librarian", "Carpenter", "Flight Attendant", "Psychologist",
                "Web Developer", "Project Manager", "Bus Driver", "Artist", "Social Worker", "Financial Analyst"};
        String[] animals = {"Lion", "Tiger", "Elephant", "Giraffe", "Zebra",
                "Kangaroo", "Panda", "Koala", "Grizzly Bear", "Polar Bear",
                "Wolf", "Fox", "Rabbit", "Deer", "Horse", "Cow", "Pig", "Sheep",
                "Goat", "Chicken", "Duck", "Eagle", "Owl", "Penguin",
                "Dolphin", "Whale", "Shark", "Octopus", "Turtle", "Crocodile"};
        int choice;
        String animal;
        String foodName;
        String jobName;
        String word;
        do {
            System.out.println("Изберете категория: ");
            System.out.println("1.Животни; 2.Храна; 3.Професии");
            choice = scanner.nextInt();
            if (choice == 1) {
                int randomWord = generator.nextInt(animals.length);
                animal = animals[randomWord];
                    word = animal;
            } else if (choice == 2) {
                int randomWord = generator.nextInt(food.length);
                foodName = food[randomWord];
                word = foodName;
            }
            else {
                int randomWord = generator.nextInt(jobs.length);
                jobName = jobs[randomWord];
                word = jobName;
            }
        } while(choice != 1 && choice != 2 && choice != 3);
        Iterator<Map.Entry<String, String>> iterator = players.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> player = iterator.next();
            System.out.println("Подай телефона на: " + player.getKey());
            System.out.println("Натисни enter за да продължиш.");
            String newLine = scanner.nextLine();
            if (player.getValue().equals("player")) {
                System.out.println(word);
            }
            else {
                System.out.println("Ти си импостър.");
            }
        }
    }
}