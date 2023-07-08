
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

    05. Обозначены неизменяемые переменные как final
          final int NUMBER_ZERO_IN_ASCII = 48;
          final int NUMBER_NINE_IN_ASCII = 57;
          final int SYMBOL_WHITE_WALKERS_IN_ASCII = 61;

    06. Перенесено объявление переменной StringBuilder s = new StringBuilder(); из начала блока кода перенесена непосредственно к месту её использования
        public static String Keymaker(int k) {        
            int[] doors = new int[k];
            for (int step = 1; step <= k; step++) {
                //код
            }

            StringBuilder s = new StringBuilder();
            for (int index = 0; index < doors.length; index++) {
                s.append(doors[index]);
            }
            return s.toString();
         }

    07. метод считывает введённые в консоль числа для определения размеров поля для игры
        применён assert для проверки на предмет допустимости их значений != null
        
        private static int readConcoleFieldSize(String indicatingOfLinesOrColumns) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readConsoleSize = null;
        int turnNumberOfFieldSize = 0;
        try {
            readConsoleSize = reader.readLine();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так, извините");
        }

        assert readConsoleSize != null;
        //код
        }

    08. 
      
    09.
      
    10.
      
    11.
      
    12.
      
    13.
      
    14.
      
    15.
