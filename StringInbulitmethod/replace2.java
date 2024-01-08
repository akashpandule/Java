public class replace2 {
    public static void main(String[]args){
        String s="java is programming lang";
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(i==0 && temp!=' '){
                count++;
            }else if(i<s.length()-1 && temp!=' ' && s.charAt(i-1)==' '){
                count++;
            }
            
        }

        System.out.println(count);
    }
    
}


// write the java  program to display how many char presetn inside the strinngin each word along with word;
// WAP to count how many even length word are there given string;
// WAP to count occurenace of char a in the given strinng
// write the diff betweent string buffer and bulder