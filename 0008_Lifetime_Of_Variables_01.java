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

        
    03. Уменьшение области видимости переменной id до завершения цикла fori (превращение её из глобальной в локальную) : 
    before:   
        String name = «John»;
        int id = 0;
        for (int i = 0; i<= 5; i++) {
             id++;
        if (id == 4) {
        System.out.println(«id: « + id);
        System.out.println(«name: « + name);
        }
        }


     after:
        String name = «John»;
        {
        int id = 0;
        for (int i = 0; i<= 5; i++) {
        id++;
        if (id == 4) {
        System.out.println(«id: « + id);
        System.out.println(«name: « + name);
        }
        }
        }

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
