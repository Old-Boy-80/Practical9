public class Practical9_2 {
    public static void main(String[] args) {
        if(args.length  > 0) { 
            
            Integer size = Integer.parseInt(args[0]);       
            char[] characterArray = new char[size];       
            
            System.out.print("Random Characters Array generated: ");
            for(int i = 0; i < size; i++) {
                char charValue = (char) ((System.nanoTime() % 26) + 65);
                characterArray[i] = charValue;
                System.out.print(characterArray[i]+ " ");
            }    
            
            System.out.println("\n");
            
            String normalString = "DEVA";
            StringBuffer bufferString = new StringBuffer("DEVA");
            StringBuilder builderString = new StringBuilder("DEVA");
            
            long totalTimeNormalString =  0;
            long totalTimeStringBuffer = 0;
            long totalTimeStringBuilder = 0;
            
            for(int i = 0; i < size; i++) {
                // Normal String Time 
                long startTime = System.nanoTime(); 
                normalString += characterArray[i];
                long endTime = System.nanoTime();
                totalTimeNormalString += (endTime - startTime);
                
                // StringBuffer Time
                startTime = System.nanoTime();
                bufferString.append(characterArray[i]);
                endTime = System.nanoTime();
                totalTimeStringBuffer += (endTime - startTime);
                
                // StringBuilder Time
                startTime = System.nanoTime();
                builderString.append(characterArray[i]);
                endTime = System.nanoTime();
                totalTimeStringBuffer += (endTime - startTime);
            }
            
            System.out.println("New String will be: " + normalString+ "\n");
            
            System.out.println("Average String Time: "+ totalTimeNormalString/args.length + " ns");
            System.out.println("Average StringBuffer Time: "+ totalTimeStringBuffer/args.length + " ns");
            System.out.println("Average StringBuilder Time: "+ totalTimeStringBuilder/args.length + " ns\n");
            
            
            if (totalTimeNormalString < totalTimeStringBuffer && totalTimeNormalString < totalTimeStringBuilder) {
                System.out.println("String Normal is fastest.");
            } else if (totalTimeStringBuffer < totalTimeNormalString && totalTimeStringBuffer < totalTimeStringBuilder) {
                System.out.println("StringBuffer is fastest.");
            } else if (totalTimeStringBuilder < totalTimeNormalString && totalTimeStringBuilder < totalTimeStringBuffer) {
                System.out.println("StringBuilder is fastest.");
            } else {
                System.out.println("It is a draw!");
            }    
        } else { 
            System.out.println("Error: Provide the size of character array!");
        }
            
    }
}
