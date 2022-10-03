package test_demo

class ford extends vehicle{

    int topspeed = 100

    @Override
    def topSpeed() {
        println "Top speed for $name is $topspeed"
    }
    static void main(args)
    {
        ford car1 = new ford()
        car1.name = "Ecosport"
        car1.color = "Black"
        car1.startEngine()
        car1.topSpeed()
    }

}
