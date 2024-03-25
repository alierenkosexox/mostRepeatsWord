
// Ali Eren KÖSE
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxCount=0;
        String frequency = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String words = input.nextLine();

        String[] splitWords = words.split("\\s");
        System.out.println(Arrays.toString(splitWords));

        Map<String , Integer> wordsCountMap = new HashMap<>();

        for(String word : splitWords){
            wordsCountMap.put(word,wordsCountMap.getOrDefault(word,0)+1);
        }
        System.out.println(wordsCountMap);

        for(Map.Entry<String,Integer> entry : wordsCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                frequency = entry.getKey();
            }
        }
        if(frequency != null){
            System.out.println("En çok tekrar eden kelime "+ frequency + " : " + maxCount);
        }else{
            System.out.println("Kelime bulunamadı ! ");
        }
    }
}
