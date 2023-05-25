public class Second2 {
    public static void main(String[] args) {
        int n = 138;
        int largestDigit = n % 10; // зберігаємо останню цифру як найбільшу
        n /= 10; // видаляємо останню цифру
        int middleDigit = n % 10; //  наступна цифра
        if (middleDigit > largestDigit) {
            largestDigit = middleDigit;
        }
        n /= 10;
        int smallestDigit = n;
        if (smallestDigit > largestDigit) {
            largestDigit = smallestDigit;
        }
        System.out.println("Найбільша цифра у заданому числі: " + largestDigit);
    }

}
