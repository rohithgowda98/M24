// Base class Wonder
class Wonder {
    private String name;
    private String location;
    private String description;

    public Wonder(String name, String location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}

// Subclasses for each wonder
class GreatWallOfChina extends Wonder {
    public GreatWallOfChina() {
        super("Great Wall of China", "China", "Ancient wall built to protect China from invasions.");
    }
}

class Petra extends Wonder {
    public Petra() {
        super("Petra", "Jordan", "Historical and archaeological city famous for its rock-cut architecture.");
    }
}

class ChristTheRedeemer extends Wonder {
    public ChristTheRedeemer() {
        super("Christ the Redeemer", "Brazil", "Iconic statue of Jesus Christ in Rio de Janeiro.");
    }
}

class MachuPicchu extends Wonder {
    public MachuPicchu() {
        super("Machu Picchu", "Peru", "Ancient Incan city located in the Andes Mountains.");
    }
}

class ChichenItza extends Wonder {
    public ChichenItza() {
        super("Chichen Itza", "Mexico", "Large pre-Columbian archaeological site built by the Maya civilization.");
    }
}

class RomanColosseum extends Wonder {
    public RomanColosseum() {
        super("Roman Colosseum", "Italy", "Ancient amphitheater in Rome, known for gladiator battles.");
    }
}

class TajMahal extends Wonder {
    public TajMahal() {
        super("Taj Mahal", "India", "White marble mausoleum built by Mughal Emperor Shah Jahan.");
    }
}

// Main class
public class acp2 {
    public static void main(String[] args) {
        // Create an array of Wonder objects
        Wonder[] wonders = {
                new GreatWallOfChina(),
                new Petra(),
                new ChristTheRedeemer(),
                new MachuPicchu(),
                new ChichenItza(),
                new RomanColosseum(),
                new TajMahal()
        };

        System.out.println("The 7 Wonders of the World:");
        System.out.println("----------------------------");

        // Display information about each wonder
        for (Wonder wonder : wonders) {
            wonder.displayInfo();
        }
    }
}
