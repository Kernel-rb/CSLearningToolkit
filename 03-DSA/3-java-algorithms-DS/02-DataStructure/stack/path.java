package stack;
import java.util.*;

class path {
    public static void main(String[] args){
        Stack<String> dir_name  = new Stack<String>();
        String path  = "/home///...";
        String[] sub_string = path.split("/");
        for(String dir : sub_string){
            if(dir.isEmpty() || dir.equals(".")){
                continue;
            }else if(dir.equals("..")){
                if(!dir_name.isEmpty()) dir_name.pop();
            }else{
                dir_name.push(dir);
            }
        }
        //if(dir_name.isEmpty()) return "/";
        StringBuilder r = new StringBuilder();
        for(String dir : dir_name){
            r.append("/").append(dir);
        }

        System.out.println(r.toString());
    }
}
