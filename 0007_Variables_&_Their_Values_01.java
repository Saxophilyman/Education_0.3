
    01. Завершил работу с переменной по окончании выполнения блока кода,
        присвоив ей минимальное значение типа integer
        varForTrafficLightsOperation = Integer.MIN_VALUE;
      
    02. В методе инициализация переменной int sumOfDiscount = 0; из начала блока кода перенесена непосредственно к месту её использования
        if (price.length < 3) {
            return 0;
        }
        Arrays.sort(price);
        int sumOfDiscount = 0;
        for (int i = price.length-3; i >= 0; i -= 3) {
            sumOfDiscount += price[i];
        }
        return sumOfDiscount;
      
    03. Перенесено объявление переменной int year = 0; из начала блока кода перенесена непосредственно к месту её использования
        Integer[][] yearNumTree = new Integer[H][W];
        String[] resultTree = new String[H];
        for (int index = 0; index < tree.length; index++) {
            //код
        }
        int year = 0;
        while (year < N) {
            //код
        }    
      
    04. Также завершена работа с переменной по окончании выполнения блока кода, с присвоением "недопустимого" значения -1
        year = -1;

    05.
      
    06.
      
    07.
      
    08.
      
    09.
      
    10.
      
    11.
      
    12.
      
    13.
      
    14.
      
    15.
