public class Converter {
    double stepSize = 0.75;                     // 1 шаг равный 75 сантиметров
    double fat;                                     // те калории, что мы жгём пока гуляем.
    double calories = 50.0;         //то, что мы сжигаем за 1 шаг
    // 1 килокалория = 1000 калорий

    double conv(double stepSum) {
        return stepSize * stepSum / 1000.0;
    }

    double getOfFat(double stepSum) {                       //вычисляем сожёные калории, те жыр
        fat = stepSum * calories / 1000.0;
        return fat;
    }
}

