class InvalidAgeException extends Exception{

    InvalidAgeException(String msg) {
        super(msg);
    }
    
}
class ManuelException{
    void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    public static void main(String[] args) {
        
    }
}