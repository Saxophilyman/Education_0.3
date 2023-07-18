Существует определённая сложность в отношении данной рекомендации по массивам, т.к. не смотря на свои минусы концепция массива для меня очень проста и понятна
Говоря о коде и примерах, наверное сейчас не имею достаточного количества навыков, чтобы легко уйти от контекста и переделать задачу в других структурах данных.
Буду работать над этим.

1. Однознавчно в задаче на соответствие скобок проще и правильнее испольщовать stack вместо array
    public static boolean balance(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(1);
                check = false;
            }
            if (s.charAt(i) == ')') {
                stack.pop();
            }
            if (stack.size() == 0 && check){
                return  false;
            }
            if (stack.size() == 0){
                check = true;
            }
        }
        return stack.size() == 0;
    }

2. Тоже самое будет относится и к задаче с палиндромами, да и в принципе с подобным родом задач
    public static boolean checkStringToPalindrome(String s){
        Deque deque = new Deque<>();
        for (int i = 0; i < s.length(); i++) {
            deque.addTail(s.charAt(i));
        }
        while (deque.size()>0){
            Object first = deque.removeFront();
            Object last = deque.removeTail();
            if (!first.equals(last)){
                return false;
            }
        }
        return true;
    }

3. В моём случае имеется множество примеров, где можно вместо прямого счётчика обойтись перебором fori
    Например:
    int sum = 0;
    array int [] = new int[]{5,7,3,9};

    вместо 
    for (int i = 0; i < array.length; i++){
      sum += array[i];
    }

    применить
    for (int values : array) {
            sum += array[values];
        }


4. Также и с более сложными выражениями
    вместо 
  		for (var i = 0; i < arr.length; i++) {
			if (hash[arr[i]] == null) {
				hash[arr[i]] = '1';
				result.push(arr[i]);
			}
		}
	
	  применить
		for (let element : arr) {
			if (hash[element] == null) {
				hash[element] = '1';
				result.push(element);
			}
		}

5. Неоднократно видел примеры задач, где результирующие данные функций хранились в массиве и выводились либо напрямую, либо по условию с инверсией.
   В таких случаях, следую данной рекомендации лучше было использовать либо queue либо stack соответственно
   Например:
   function();

   вместо
   int [] array = new int[10];
   for (int i = 0; i < array.length; i++){
      array[i] = function();
    }

   применить
   Stack stack = new Stack<>();
   stack.pop(function());
      
  
