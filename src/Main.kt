//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var shoppingList = mutableListOf<String>()
    while (true) {
        println("chooese an option")
        println("1. add item to the list")
        println("2. remove from the list")
        println("3. view shopping list")
        println("4.exit")
        val choice = readlnOrNull()?.toIntOrNull()
        when (choice) {
            1 -> {
                println("enter the iteam to add")
                val iteam = readlnOrNull()
                if (!iteam.isNullOrEmpty()) {
                    shoppingList.add(iteam)
                    println("$iteam is added")
                } else {
                    print("invaid input!! not added")
                }
            }
            2 -> {
                
                if (shoppingList.isNotEmpty()) {
                    print("plz enter the index no to remove")
                    val index = readlnOrNull()?.toIntOrNull()
                    if (index != null && index in shoppingList.indices) {
                        val removeitem = shoppingList.removeAt(index)
                        print("$removeitem removed from  the index ")

                    } else {
                        print("invalid input!!!!! not removed from  the index ")
                    }

                } else {
                    println("the list is empty")
                }
            }

            3 -> {
                if (shoppingList.isNotEmpty()) {
                    println("shopping list !!!!!")
                    for ((index, item) in shoppingList.withIndex()) {
                        println("$index.$item")
                    }

                } else {
                    println("shopping list is emtpy")
                }
            }

            4 -> {
                println("exit the program")
                return
            }

            else -> {
                println("enter the no from 1 to 4")
            }
        }
    }

}