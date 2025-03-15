class Computer{
    void computerMethod(){
        System.out.println("Computer method fom computer class");
        
        class LocalInnerClass{
            void localClassMethod(){
                System.out.println("Local method from local inner class");
            }
        }
        
        LocalInnerClass lic = new LocalInnerClass();
        lic.localClassMethod();
    }

    class Processor{
        void processorMethod(){
            System.out.println("Processor method from processor class");
        }
    }

    public static void main(String[] arg){
        Computer c = new Computer();
        Computer.Processor p = c.new Processor();

        c.computerMethod();
        p.processorMethod();
    }
}