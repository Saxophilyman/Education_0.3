01. магическая строка "bmp" в константу
    IMAGE_FOMAT = "bmp";
  
02. изменение точности с 10.1f на 10.1d
  
03. проверка при делении в выражении speed_km = passedWay/time
    if (time > 0)
  
04. изменение числа 20.0 на 20, т.к. можно в задаче обойтись целыми числами
  
05. изменение сравнения 1000.0d > 50 на 1000.0d > 50.0 
  
06. вместо магической строки "txt" определяем в константу
    FILE_FOMAT = ".txt";

07. изменение точности с 3.0004f на 3.0004d

08. при возведении в степень методом exponential(){FirstArgument.pow(SecondArgument)} лучше проверить не будет ли число выходить за границы int
    или использовать класс bigDecimal

09. если правильно понимаю, то даже скрытые преобразования лучше указывать, верно?
    тогда в случае int a = 11111111;
    float b = a; лучше указать float b = (float) a;
  
10. 
  11.
  12. вместо проверки множества условий 
        arrCountRepeatForOutNumbers.size() == 1 || (arrCountRepeatForOutNumbers.size() <= 2 &&
        arrCountRepeatForOutNumbers.get(0) + 1 >= arrCountRepeatForOutNumbers.get(1) &&
        arrCountRepeatForOutNumbers.get(0) - 1 <= arrCountRepeatForOutNumbers.get(1) &&
        (lastCheckArrOfCountRepeat.get(0) <= 1 || lastCheckArrOfCountRepeat.get(1) <= 1));
        можно было ввести дополнительные булевые переменные 

        boolean isStringValidInFirstCondition = (arrCountRepeatForOutNumbers.size() <= 2 && 
                                                 arrCountRepeatForOutNumbers.get(0) + 1 >= arrCountRepeatForOutNumbers.get(1) &&
                                                 arrCountRepeatForOutNumbers.get(0) - 1 <= arrCountRepeatForOutNumbers.get(1));

        boolean isStringValidInSecondCondition = (lastCheckArrOfCountRepeat.get(0) <= 1 || lastCheckArrOfCountRepeat.get(1) <= 1);
                
        затем проверить их if (arrCountRepeatForOutNumbers.size() == 1 || (isStringValidInFirstCondition && isStringValidInSecondCondition))
        Наверное тоже запутано, но слегка более понятно для отслеживания проверки условий
