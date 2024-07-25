public class pra10 {
    public static void main(String[] args) {

        String input = "CHARUSAT UNIVERSITY";

        System.out.println("Length : " + input.length());
        
        for(int i=0;i<input.length();i++)

        {
            if(input.charAt(i) == 'H')
            {
                input = input.substring(0, i) + 'D' + input.substring(i+1);
                
            }
        }

        System.out.println(input);

        System.out.println("Lowercase of the String : " + input.toLowerCase());
       
  System.out.println("\nID : 23DIT009"); 
    }
    
}