1. Переменные timeOfAllWay и pointWay определены сразу(максимальное время связывания), т.к. их значения будут меняться в цикле и до него им необходимо сразу задать начальные значения (0).
   Переменная varForTrafficLightsOperation имеет уже большее время связывания, но она зависит от вычислений в цикле, поэто не определена константой.
        int timeOfAllWay = 0;
        int pointWay = 0;
        {
            int varForTrafficLightsOperation;
            for (int countTrafficLights = 0; countTrafficLights < track.length; countTrafficLights++) {
                if (track[countTrafficLights][0] > L) {
                    return L;
                }
                timeOfAllWay += track[countTrafficLights][0] - pointWay;
                pointWay = track[countTrafficLights][0];
                varForTrafficLightsOperation = timeOfAllWay;
                while (varForTrafficLightsOperation > track[countTrafficLights][1] + track[countTrafficLights][2]) {
                    varForTrafficLightsOperation -= track[countTrafficLights][1] + track[countTrafficLights][2];
                }
                if (varForTrafficLightsOperation < track[countTrafficLights][1]) {
                    timeOfAllWay += track[countTrafficLights][1] - varForTrafficLightsOperation;
                }
            }
            varForTrafficLightsOperation = Integer.MIN_VALUE;
        }
        timeOfAllWay += L - pointWay;
        return timeOfAllWay;


2. Заданы сразу переменные-константы, для того чтобы оращаться к ним, а не к магическим цифрам. Заданы сразу значения, 
   которые можно будет изменить при других "числовых" условиях задачи. Данный пример ограничен. т.к. они встречаются в коде ограниченное число раз,
   но подразумевается, что если бы был бы некий процесс масштабирования, возможно подобные значения встречались в коде чаще и их не надо было бы искать,
   а только изменить при объявлении переменных.
   final int MIN_LENGHT_OF_STRING_FOR_MAYBE_TRUE = 5;
        if (village.length() < MIN_LENGHT_OF_STRING_FOR_MAYBE_TRUE) {
            return false;
        }
        final int NUMBER_ZERO_IN_ASCII = 48;
        final int NUMBER_NINE_IN_ASCII = 57;
        final int FINDED_WHITE_WALKERS = 3;
        final int SYMBOL_WHITE_WALKERS_IN_ASCII = 61;
        boolean human = false;
        int sumHuman = 0;
        int countWalkers = 0;
        boolean global = false;
        for (int indexChar = 0; indexChar < village.length(); indexChar++) {
            if (village.charAt(indexChar) >= NUMBER_ZERO_IN_ASCII && village.charAt(indexChar) <= NUMBER_NINE_IN_ASCII) {
                int num = Integer.parseInt(village.substring(indexChar, indexChar + 1));
                if (sumHuman == 0) {
                    sumHuman = num;
                    human = true;
                }
                if (sumHuman + num != 10) {
                    sumHuman = num;
                    countWalkers = 0;
                } else if (countWalkers != FINDED_WHITE_WALKERS) {
                    return false;
                } else {
                    global = true;
                    sumHuman = num;
                    countWalkers = 0;
                }
            }
            if (human && village.charAt(indexChar) == SYMBOL_WHITE_WALKERS_IN_ASCII) {
                countWalkers++;
            }
        }
        return global;


3. 
