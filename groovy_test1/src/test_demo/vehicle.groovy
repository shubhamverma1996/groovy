package test_demo

abstract class vehicle {

    String name;
    String color;
    int model = 12;

    def startEngine()
    {
        println "Engine started for $name"
    }

    abstract def topSpeed();


}
