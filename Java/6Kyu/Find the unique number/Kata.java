public class Kata {
    public static double findUniq(double arr[]) {
        double num1 = arr[0];
        
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] != num1) {
                if(arr[i] == arr[i + 1]) {
                    return num1;
                } else {
                    return arr[i];
                }
            }
        }
      
        return arr[arr.length - 1];
    }
}
