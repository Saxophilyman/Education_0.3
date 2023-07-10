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
        String nameOfPerson = «John»;
        int id = 0;
        for (int i = 0; i<= 5; i++) {
             id++;
        if (id == 4) {
        System.out.println(«id: « + id);
        System.out.println(«nameOfPerson: « + name);
        }
        }


     after:
        String nameOfPerson = «John»;
        {
        int id = 0;
        for (int i = 0; i<= 5; i++) {
        id++;
        if (id == 4) {
        System.out.println(«id: « + id);
        System.out.println(«nameOfPerson: « + name);
        }
        }
        }

    04. Уменьшение области видимости переменных до завершения первого цикла fori, после которого они не используются
    before:    
        String[] text = s.split(" ", 0);
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "");
        int indexForLIst = 0;
        int countLen = len;
        boolean newString = true;
        for (int i = 0; i < text.length; i++) {
            //много кода
        }
        fori(){
            //код
        }

    after:    
        String[] text = s.split(" ", 0);
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "");
        {
        int indexForLIst = 0;
        int countLen = len;
        boolean newString = true;
        for (int i = 0; i < text.length; i++) {
            //много кода
        }
        }
        fori(){
            //код
        }


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
