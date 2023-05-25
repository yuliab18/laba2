public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        if (grade == 'A') {
            System.out.println("Вітаємо, тест складено на відмінно!");
        } else if (grade == 'B') {
            System.out.println("Тест складено дуже добре!");
        } else if (grade == 'C') {
            System.out.println("Тест складно добре, слід звернути увагу на слабкі сторони");
        } else if (grade == 'D') {
            System.out.println("Тест складено задовільно, слід повторно переглянути матеріал");
        } else if (grade == 'E') {
            System.out.println("Тест ледве складено, рекомендовано повторно пройти навчання");
        } else if (grade == 'F') {
            System.out.println("Тест не складено!");
        } else {
            System.out.println("Неправильна оцінка!");
        }


    }
}