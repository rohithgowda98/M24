public class a3 {
    void location() {
        System.out.println("Location is:");
    }

    void famousfor() {
        System.out.println("Famous for:");
    }

}

class Manali extends a3 {
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousfor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends a3 {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousfor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends a3 {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousfor() {
        System.out.println("It is Famous for skiing");
    }
}

class Main {
    public static void main(String args[]) {
       a3 A = new a3();
       a3 M = new Manali();

        a3 Mu = new Mussoorie();

        a3 G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
    
}
