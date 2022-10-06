package MyStack;
public class CobaKurung {
    
    public static boolean cekKurungV1(String str) {
        MyStack stackKu = new MyStack();
        
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{') {
                stackKu.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if(stackKu.peek() == '(') {
                    stackKu.pop();
                }else {
                    return false;
                }
            } else if (str.charAt(i) == '}') {
                if(stackKu.peek() == '{') {
                    stackKu.pop();
                }else {
                    return false;
                }
            } else if (str.charAt(i) == ']') {
                if(stackKu.peek() == '[') {
                    stackKu.pop();
                }else {
                    return false;
                }
            }
        }
        
        
        return stackKu.isEmpty();

    }
//    public static boolean cekKurungV1(String str){
//        MyStack stackKu = new MyStack();
//        char cek;
//        
//        for (int i = 0; i < str.length(); i++) {
//            cek = str.charAt(i);
////            System.out.println(cek);
//            if(cek == '('){
//                stackKu.push(cek);
//            }
//            else if(cek == ')'){
//                if(stackKu.pop() == 0){
//                    return false;
//                }
//            }
//        }
//        
//        if(stackKu.isEmpty()){
//            return true;
//        }else{
//            return false;
//        }
//    }
    
    
}
