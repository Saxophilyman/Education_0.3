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
        но непосредственно к теме - сужаю область видимости переменной correctLengt нигде более не используемой, кроме цикла
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


    07. Уменьшение области видимости переменной varForTrafficLightsOperation до завершения цикла fori:
    before:
        int timeOfAllWay = 0;
        int pointWay = 0;
        int varForTrafficLightsOperation;
            for (int countTrafficLights = 0; countTrafficLights < track.length; countTrafficLights++) {
            //много кода
            }
        varForTrafficLightsOperation = Integer.MIN_VALUE;
        timeOfAllWay += L - pointWay;
        return timeOfAllWay;

    after:  
        int timeOfAllWay = 0;
        int pointWay = 0;
        {
        int varForTrafficLightsOperation;
            for (int countTrafficLights = 0; countTrafficLights < track.length; countTrafficLights++) {
            //много кода
            }
        varForTrafficLightsOperation = Integer.MIN_VALUE;
        }
        timeOfAllWay += L - pointWay;
        return timeOfAllWay;

    
    08. Здесь тоже уже вижу много моментов, но непосредственно - сужаю область видимости swap в пределы его использования
    before:
        ArrayList<String []> data = new ArrayList<>();
        ArrayList<String []> swap = new ArrayList<>();
        //код

        for (int i = 0; i < data.size(); i++) {
            //код
        }
        for (int i = 0; i < data.size() - 1; i++) {
            //код
        }
        String [] result = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i)[0] + " " + data.get(i)[1];
        }
        return result;


    after:  
        ArrayList<String []> data = new ArrayList<>();
        {
            ArrayList<String []> swap = new ArrayList<>();
            //код

            for (int i = 0; i < data.size(); i++) {
                //код
            }
            for (int i = 0; i < data.size() - 1; i++) {
                 //код
            }
        }
        String [] result = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i)[0] + " " + data.get(i)[1];
        }
        return result;
    
    09. Локализация переменной year:
    before:
        Integer[][] yearNumTree = new Integer[H][W];
        String[] resultTree = new String[H];
        //код

        int year = 0;
        while (year < N) {
            for (int i = 0; i < yearNumTree.length; i++) {
               //много кода
            }
            year++;
        }

        //код
        return resultTree;

    after:     
        Integer[][] yearNumTree = new Integer[H][W];
        String[] resultTree = new String[H];
        //код
        {
            int year = 0;
            while (year < N) {
                for (int i = 0; i < yearNumTree.length; i++) {
                   //много кода
                }
                year++;
            }
        }
        //код
        return resultTree;
    
    
    10. Ограничение области видимости переменной k:
    before:
        private static int[] transform(int[] arr) {
            ArrayList<Integer> array = new ArrayList<>();
            int k;
            for (int i = 0; i <= arr.length - 1; i++) {
                //код
            }
            int[] returnArray = new int[array.size()];
            for (int i = 0; i < array.size(); i++) {
                returnArray[i] = array.get(i);
            }
            return returnArray;
        }

    after:  
        private static int[] transform(int[] arr) {
            ArrayList<Integer> array = new ArrayList<>();
            {
                int k;
                for (int i = 0; i <= arr.length - 1; i++) {
                    //код, где используется k
                }
            }
        
            int[] returnArray = new int[array.size()];
            for (int i = 0; i < array.size(); i++) {
                returnArray[i] = array.get(i);
            }
            return returnArray;
        }

Я так понимаю в Java не имеется глобальных переменных в полном смысле этого слова,
В нижних примерах осуществлена минимизация области видимости переменной через минимальный доступ к ней (private)

    11.
    before:
        ArrayList<String> addedCord;
    after:  
        private static ArrayList<String> addedCord;
    
    12.
    before:
        int horizontalFieldSize;
    after:  
        private horizontalFieldSize;
    
    13.
    before:
        String nameOfPlayer;
    after:  
        private String nameOfPlayer;
    
    14.
    before:
        TypeOfPizza typeOfPizza;
    after:  
        private TypeOfPizza typeOfPizza;
    
    15.
    before:
        int valueSizeOfPizza;
    after:  
        private int valueSizeOfPizza;
