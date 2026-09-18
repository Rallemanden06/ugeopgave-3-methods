public class main {

    // opgave 1
    /*
    double balance = 0;
    String accountName;

    void main(){
        accountName = "Rasmus";

        deposit100();
        deposit100();
        withDraw50();

        printBalance();
    }

    void deposit100(){
        balance += 100;
    }

    void withDraw50(){
        balance -= 50;
    }

    void printBalance(){
        System.out.println(accountName + " har " + balance + " kr");
    }
    */
    // opgave 2
    /*
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    void main(){
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }

    void addAssignmentPoints(int points){
        assignmentPoints += points;
    }

    void addExamPoints(int points){
        examPoints += points;
    }

    void addProjectPoints(int points){
        projectPoints += points;
    }

    void printTotal(){
        int total = assignmentPoints+examPoints+projectPoints;
        System.out.println("Total points: " + total);
    }
     */
    // opgave 3
    /*
    void main(){
        double finalprice = calculateFinalPrice(500,20);
        System.out.println("Slutpris: " + finalprice + " kr");
    }

    double applyDiscount(double price, double discountPercent){
        return price * (1 - discountPercent / 100);
    }

    double addTax(double price){
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice,double discount){
        double discountedprice = applyDiscount(basePrice,discount);
        double taxedDiscountedPrice = addTax(discountedprice);
        return taxedDiscountedPrice;
    }
     */
    // opgave 4
    /*
    void main(){
        int [] tal = {45,67,23,89,34,56,78};
        printAllStats(tal);
    }

    double calculateAverage(int[] numbers){
        int sum = 0;
        for(int number : numbers){
           sum += number;
        }
        return (double) sum / numbers.length;
    }

    int findMax(int[] numbers){
        int max = numbers[0];
        for (int number: numbers){
            if (number > max){
                max = number;
            }
        }
        return max;
    }

    int findMin(int[] numbers){
        int min = numbers[0];
        for (int number: numbers){
            if (number < min){
                min = number;
            }
        }
        return min;
    }

    int countAboveAverage(int [] numbers){
        double average = calculateAverage(numbers);
        int count = 0;
        for (int number : numbers){
            if (number > average){
                count++;
            }
        }
        return count;
    }

    void printAllStats(int [] numbers){
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Max number: " + findMax(numbers));
        System.out.println("Min number: " + findMin(numbers));
        System.out.println("Count of above average: " + countAboveAverage(numbers));
    }
     */
    // opgave 5
    /*
    void main() {

        int a = 7, b = 42;

        int smaller = minimum(a, b);
        // resultatet fra minimum() gemmes i smaller.

        if (smaller == a) {
            // betingelsen skal stå i parentes.

            System.out.println(smaller + " is the smallest!");
            // man kan ikke for tallet hvis man printer den i String

        }

    }

    int minimum(int a, int b) {
        // void er ændret til int, fordi metoden returnerer et tal.

        int smaller;
        // defineret smaller så den kan bruges efter if/else da der ikke er nogen global.

        if (a < b) {

            smaller = a;

        } else {
            //else må ikke have en betingelse og skal bare det du ville have hvis den ikke opfylder if

            smaller = b;

        }

        return smaller;
        //i return retunere man kun variablen og ikke med datatypen fordi den er allderig skrevet i metoden.
    }

     */
}
