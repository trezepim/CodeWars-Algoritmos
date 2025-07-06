public class Vowels {
  public static int getCount(String str) {
    int contador = 0;
    String s = str.toLowerCase();
    
    for(int i = 0; i < str.length(); i++){
      if(s.charAt(i) == 'a' || 
         s.charAt(i) == 'e' || 
         s.charAt(i) == 'i' || 
         s.charAt(i) == 'o' || 
         s.charAt(i) == 'u')
      {
        contador++;
      }
    }
    
    return contador;
  }
}
