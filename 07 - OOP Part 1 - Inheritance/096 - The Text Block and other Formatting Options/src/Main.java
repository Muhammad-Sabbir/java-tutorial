public class Main {
    public static void main(String[] args) {
        String bulletIt_1 = "Print a Bulleted List:" +
                "\u2022 First Point" +
                "\u2022 Sub Point";
        System.out.println(bulletIt_1);

        String bulletIt_2 = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt_2);

        String bulletIt_3 = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point""";
        System.out.println(bulletIt_3);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d\n ", age, yearOfBirth);

        System.out.printf("Your age is %f%n", (float) age);
        System.out.printf("Your age is %.2f%n", (float) age);
        for(int i = 1; i<=100000; i*=10){
            System.out.printf("Printing %d %n", i);
        }
        for(int i = 1; i<=100000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }
        String formattedString = String.format("Your age is %d\n",age);
        System.out.println(formattedString);
        formattedString = "Your age is  %d".formatted(age);
        System.out.println(formattedString);
    }
}
