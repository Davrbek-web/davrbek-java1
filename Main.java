public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();
        printMenu();
        tracker.createdDays();

        int userInput = scanner.nextInt();
        int months = 12;
        int days = 30;

        while (userInput != 0) {

            if (userInput == 1) {
                System.out.println("Введите номер месяца, за который хотите ввести шаги - ");
                int userInputMonth = scanner.nextInt();

                while(userInputMonth > months || userInputMonth < 1) {
                    System.out.println("Месяцев всего 12. Пожалуйста, введите корректный номер месяца (1-12).");
                    userInputMonth = scanner.nextInt();
                }
                System.out.println("Введите номер дня, за который хотите ввести шаги - ");
                int   userInputDays = scanner.nextInt();
                while (userInputDays > days || userInputDays < 1) {
                    System.out.println("Дней всего 30. \nПожалуйста, введите корректный номер дня (1-30).");
                    userInputDays = scanner.nextInt();
                }
                System.out.println("Введите количество шагов за выбранный день");
                int steps = scanner.nextInt();
                while (steps < 0) {
                    System.out.println("Отрицательное движение, зовется торможение, \nвведите пожалуйста корректное число шагов! ( те больше 0)");
                    System.out.println("Попробуем снова? \nВедите количество шагов: ");
                    steps = scanner.nextInt();
                }
                tracker.saveSteps(userInputMonth, userInputDays, steps);
            }
            if (userInput == 2) {
                System.out.println("Введите номер месяца, за который хотите получить вывод статистики");
                int userInputMonth = scanner.nextInt();
                while (userInputMonth > months || userInputMonth < 1) {
                    System.out.println("Месяцев всего 12. Пожалуйста, введите корректный номер месяца (1-12).\nПопробуем снова?\nВедите корректный номер месяца.");
                    userInputMonth = scanner.nextInt();
                }
                tracker.showingOurStatistics(userInputMonth);
                tracker.resulOfEffort(userInputMonth);
                tracker.showingOurSeries(userInputMonth);
            }
            if (userInput == 3) {
                System.out.println("Введите желаемое количество шагов за день");
                int  totalUserSteps = scanner.nextInt();
                while (totalUserSteps < 0) {
                    System.out.println("Количество шагов не может быть отрицательным\n" + "Введите количество шагов");
                    totalUserSteps = scanner.nextInt();
                } for (int i = 0; i < months;i++) {
                    tracker.monthToData[i].defaultSteps = totalUserSteps;
                }

            }
            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("До свидания!");
    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }

}


