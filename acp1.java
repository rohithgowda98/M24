import java.util.Scanner;

// Class for calculating volume
class acp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its volume:");
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Sphere");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                Cube cube = new Cube(side);
                System.out.println("Volume of Cube: " + cube.calculateVolume());
                break;

            case 2:
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());
                break;

            case 3:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("Volume of Sphere: " + sphere.calculateVolume());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

// Cube class
class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}

// Cylinder class
class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Sphere class
class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
