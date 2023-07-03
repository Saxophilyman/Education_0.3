Пока что достаточно слабо знаком с методом фабрики и интерфейсами, напишу насколько понимаю

1.  FabricCars fabricCars = FabricCars.collectTypeOfCars(audi);
2.  Pizza pizza = Pizza.makeTypeOfPyzza(cheezePizza);
3.  Soldiers soldiers = Soldiers.createUnitTypeOfSoldiers(infantry);

Соответственно если брать по аналогии, интерфейс по сборке машин/пиццы лучше назвать 
  FabricCarsImp / PizzaConstructorImp
