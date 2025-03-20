package sample;

class Engine{  // parent 1 class
  void start(){
    System.out.println("Engine is starting");
  }
}

class Car{  // parent2 class
  Engine e = new Engine();
}

public class Composition{}
