На самом деле много таких примеров, особенно по началу, когда концепция самодокументирующнгося кода ещё не известна, а хочется закомментировать всё, что было понятно.
    Из серии "Обязательные комментарии"
01. // временная переменная для суммы
    здесь её лучше правильно назвать для понимания и удалить комментарий
  
02. // общее расстояние
    здесь тоже самое, правильно назвать и удалить

03. //возвращаемое значение
  
    Закомментированный код
    Очень распространённый в моём случае вид комментариев, буквально куски кода комментировал "про запас".
    Полные примеры приводить не буду, подчистую удаляю. Оставлю короткие типа
04. //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
05. //try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

    Комментарии из серии шума.
    Я так понимаю целесообразно расписывать "сложные" имена функций, но очевидные лучше просто удалить
06. //Проверка на число 
07. //Вывод в консоль
08. //Функция умножения 
09. //печатает массив

    Комментарии за закрывающей фигурной скобкой тоже по началу возникали, особенно в двухуровневых массивах. удаляю.
10. // первый проход по циклу
11. // второй проход по циклу    
  
    Избыточные комментарии
    В изучении темы порой пытался расписать как работает тот или иной метод своими словами. 
    Возможно для начала это и имеет некоторую целесообразность, но сейчас это не актуально.
12. //сеттер - даёт возможность назначать значение
13. //геттер - возвращает заложенное значение
  
14. Слишком много информации. 
    Также пропишу в этот пункт пространные замечания у себя, где в пометках ставлю, что нужно посмотреть ту или иную тему обучения, свои рассуждения и так далее.
    Практика показывает, что возвращение к данным заметкам минимальное, а в целом если вести записи об обучении лучше завести отдельный файл.
  
    Недостоверные комментарии
    Отнесу данный комментарий пожалуй сюда 
15. //Лучше попробовать полностью расписывать задачу через подробные комментарии, чтобы не забыть все связи и логику решения
