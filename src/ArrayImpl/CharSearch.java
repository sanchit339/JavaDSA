package ArrayImpl;

public class CharSearch {
    public static void main(String[] args) {
        String name = "sanchit";
        char target = 'a';
        int ans = linerSearch(name , target);
        System.out.println("Char is present at index :- " + ans);
    }
    static int linerSearch(String name , char target){
        for (int i = 0; i < name.length() ; i++){
            if(name.length() == 0){
                return -1;
            }
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
