public class Opgave_2 {

    public static void meddelFejlv1() {
        System.out.println("Der er en fejl");
    }

    public static void meddelFejlv2 (int fejlNr) {
        System.out.println("Fejl nr. " + fejlNr);
    }

    public static void meddelFejlv3 (int fejlNr, int fejlLinje){
        System.out.println("Fejl nr. "+ fejlNr + " i linje " + fejlLinje);

    }

    public static void main(String[] args) {
        meddelFejlv1();
        meddelFejlv2(5);
        meddelFejlv3(5, 14);
    }
}
