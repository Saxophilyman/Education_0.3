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

        
    03. Уменьшение области видимости переменной id до завершения цикла fori (превращение её из глобальной в локальную):     
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


    05. Инициализация и скрытие переменной внутри метода:
    before:   
        int amount;
        private boolean methodForRandomCheck() {
        amount = Random.nextInt(0, 100);
        return amount => 50;
        }

    after:
        private boolean methodForRandomCheck() {
        int amount = Random.nextInt(0, 100);
        return amount => 50;
        }
    
    06. Здесь вижу уже много моментов, которые можно было бы переделать в соответствии с курсом
        но непосредственно к теме - сужаю область видимости переменной correctLengt нигде более не используемой,кроме цикла
    before:
        //много кода
        int correctLength = 0;
        while (valueToCorrect != 0) {
            if (dop.charAt(dop.length() - 1) > 0 && dop.charAt(dop.length() - correctLength - 1) != '0') {
                dop.setCharAt(dop.length() - correctLength - 1, (char) (dop.charAt(dop.length() - correctLength - 1) - 1));
                valueToCorrect = 0;
            } else {
                dop.setCharAt(dop.length() - correctLength - 1, '9');
                correctLength++;
            }
        }
        //код

    after:    
        //много кода
        {
        int correctLength = 0;
        while (valueToCorrect != 0) {
            if (dop.charAt(dop.length() - 1) > 0 && dop.charAt(dop.length() - correctLength - 1) != '0') {
                dop.setCharAt(dop.length() - correctLength - 1, (char) (dop.charAt(dop.length() - correctLength - 1) - 1));
                valueToCorrect = 0;
            } else {
                dop.setCharAt(dop.length() - correctLength - 1, '9');
                correctLength++;
            }
        }
        }
        //код


    07.
    before:


    after:  
    
    08.
    before:


    after:  
    
    
    09.
    before:


    after:      
    
    
    10.
    before:


    after:  
    
    
    11.
    before:


    after:  
    
    
    12.
    before:


    after:  
    
    
    13.
    before:


    after:  
    
    
    14.
    before:


    after:  
    
    
    15.
    before:


    after:  
