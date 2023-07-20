Уместные комментарии

1.
  // проверяем существует ли путь и является ли путь каталогом
  if (path.toFile().exists() && path.toFile().isDirectory()) 
  
2.
  // проверяем содержит ли файл необходимое расширение
  if (getFileExtension(file.toPath()).contains(ex)) {
    
3.
  // удаляем все повторяющиеся значения и пересобираем словарь без них
   map = map.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));,
  
4.
  // проверяем имеются ли все ингридиенты для пиццы на складе
  if (pizza.isHaveIngregientsInStorage)  
  
5. 
  // проверяем проходит ли игрок проверку на скрытность
  if (player.isPasseCheckOfStealth)
  
6.
  //Проверяем на окончание игры крестики-нолики - три символа в ряд. 
  if (player.isCrossOrZeroThreeInLine)
  
7.
  // Проверяем ассимилирована ли земля
  if (isLandAssimilated)
  

Неуместные комментарии

1. вообще по коду оставляю очень много мест с "дополнительными вариантами решения"
   на отправке готового решения удаляю их, но в принципе возможно от них лучше вообще избавиться
  
      public static int odometer(int[] oksana) {
        int distance_km = 0;
        int time_hour = 0;
        for (int i = 0; i < oksana.length; i +=2) {
            distance_km += oksana[i] * (oksana[i+1] - time_hour);
            time_hour = oksana[i + 1];
        }
        return distance_km;
    }
}

данную часть удаляю:
//    int km = 0;
//    int lastTime = 0;
//        for(int i = 1; i < oksana.length; i += 2) {
//        km += (oksana[i] - lastTime) * oksana[i - 1];
//        lastTime = oksana[i];
//        }
//        return km

2.   public static int SumOfThe(int N, int[] data) {
       int sum = 0;
       int allSumOfArray = 0;
       for (int indexForSum : data) {
           allSumOfArray += indexForSum;
       }
       for (int index : data) {
           if (index * 2 == allSumOfArray) {
               sum = index;
               break;
           }
       }
       return sum;
    }


данную часть удаляю:
//        int allSumOfArray = Arrays.stream(data).sum();

В том числе встречаются свои мысли и рассуждения. НАверное их лучше вести в отдельном файле. Из "рабочего кода" удаляю.

3. Также в качестве комментариев прописываются условия задач. Понимаю, что это не совсем правильно, но "для себя" удобно.
  
4. Удаляю данные комментарии. Думаю, что для новичка они будут полезны, но в целом, для того, кто хотя бы немного знаком с тематикой - они излишни.
   А методы и так говорят сами за себя.
  
   g.setColor(Color.RED); // задать цвет прямоугольника - удаляю
   g.fillRect((img.getWidth() - w) / 2, (img.getHeight() - h) / 2, w, h);  // нарисовать прямоугольник - удаляю

5. Также встречаются закомментированные выводы в консоль для проверки значений по старинке. Удаляю
  
