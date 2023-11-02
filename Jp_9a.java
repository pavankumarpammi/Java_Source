class A{
    public static void validdata(int age)
    {
        if(age<18)
        {
            throw  ArithmeticException("person is not eligible to vote")
        }
        else{
            System.out.println("person is eligible for vote");
        }
    }
    
    public static void main(String[] args) {
        validdata[13];
        System.out.println("rest of code");
    }
    
}