public class Main {

    private int result;

    //initialize the variable to zero
    Main(){
        result = 0;
    }

    //addition method
    public int add(int a,int b){
        result = a+b;
        return result;
    }
    //subtraction method
    public int sub(int a, int b){
        result = a-b;
        return result;
    }

    //multiplication method
    public int mult(int a, int b){
        result = a*b;
        return result;
    }

    //division method
    public int div(int a, int b){
        result =a/b;
        return result;
    }

    //set Result to passed argument value
    public int setResult(int a){
        result = a;
        return a;
    }

    //return the result variable value
    public int getResult(){
        return result;
    }

    //resets the result to zero and returns result
    public int clear(){
        result = 0;
        return result;
    }

}

