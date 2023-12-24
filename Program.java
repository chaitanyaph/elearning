class Program{

    public void fun(){

        System.out.println("Fun() method");
    }
    //Bug 101
    public static void main(String[] args){

        System.out.println("Hello World");
        fun();
    }
}