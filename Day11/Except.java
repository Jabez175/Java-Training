class Except{
    public static void main(String[] args) {
        try {
            // int a = 10 / 0; // This will throw an ArithmeticException
                String str = null;
                System.out.println(str.length()); // This will throw a NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e);
        }
        catch (Exception e){
            System.out.println("Caught a general exception: " + e);
        }
        finally {
            System.out.println("This block will always execute.");
        }
    }
}