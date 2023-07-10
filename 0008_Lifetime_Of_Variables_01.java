    01. Уменьшение области видимости arr до цикла do ... while:
        
    before:
        int[] array = {0};
        do {  
            array = modifyNumber(array); // сохраняет результаты в другом месте
        } while (array.length < 100);

    after:
        {
        int[] array = {0};
        do {  
            array = modifyNumber(array); 
        } while (array.length < 100);
        }


    02. Уменьшение области видимости переменных random / generatedNumber до завершения цикла fori:
    before:
        Random random = new Random();
        int generatedNumber;
        int[] arrayOfTelemetric = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            generatedNumber = random.nextInt(256) + 1;
            //код
        }
        //дальнейший код


    after:
        int[] arrayOfTelemetric = new int[arrayLength];
        {
        Random random = new Random();
        int generatedNumber;
        for (int i = 0; i < arrayLength; i++) {
            generatedNumber = random.nextInt(256) + 1;
            //код
        }
        }
        //дальнейший код

        
    03. Уменьшение области видимости переменных random / generatedNumber до завершения цикла fori:


        
    04.
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
