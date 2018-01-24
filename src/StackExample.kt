/**
 * Created by suri on 24/01/18.
 */
fun main(args: Array<String>) {


     val  stack = StackImpl();

    stack.push("COBOL")
    stack.push("PASCAL")
    stack.push("C")
    stack.push("C++")
    stack.push("Java")
    stack.push("Kotlin")
    stack.push("Programming")

    stack.performOperations()

}



class StackImpl() {

    val stack = mutableListOf<String>()

    fun push(str:String){

        stack.add(str)
    }



    fun pop(){

        if(stack.isNotEmpty()){
            println("removing the topmost element =======> ${stack.elementAt(stack.lastIndex)}")
            stack.removeAt(stack.lastIndex)
        }else{
            println("Sorry There are 0 elements in the stack hence pop operation can't be performed ")
        }

    }


    fun peek(){
        if(stack.isNotEmpty()) {
            print("now the topmost element of Stack ===> ${stack.elementAt(stack.lastIndex)} \n")
        }else{
            println("Sorry There are 0 elements in the stack hence peek operation can't be performed")
        }
    }


    fun displayStack(){

        println(" \n\n====== Start of the stack ====== ")
        for (i in stack.lastIndex downTo 0){
            println("\t  ${stack.elementAt(i)}")
        }
        println("====== End of the stack ======")
    }


    fun performOperations() {

        while (stack.isNotEmpty()){

                displayStack()
                pop()
                peek()

        }


    }
}