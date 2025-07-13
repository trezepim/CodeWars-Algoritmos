public class Solution {
  public static String explode(String digits) {
    
    digits = digits.replaceAll("0","");
    digits = digits.replaceAll("2","22");
    digits = digits.replaceAll("3","333");
    digits = digits.replaceAll("4","4444");
    digits = digits.replaceAll("5","55555");
    digits = digits.replaceAll("6","666666");
    digits = digits.replaceAll("7","7777777");
    digits = digits.replaceAll("8","88888888");
    digits = digits.replaceAll("9","999999999");
    
    return digits;
  }
}
