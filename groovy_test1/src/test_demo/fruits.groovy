package test_demo

class fruits {
    private String fruitName
    private String fruitColor

    def setfruitName(String name) {
        fruitName = name
    }

    def setfruitColor(String color) {
        fruitColor = color
    }

    def getfruitName(String name) {
        println "the fruit name is $fruitName"
    }

    def getfruitColor(String color) {
        println "the fruit color is $fruitColor"
    }


}
