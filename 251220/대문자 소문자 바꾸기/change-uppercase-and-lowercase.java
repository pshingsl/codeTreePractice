public class CharConversionExample {
    public static void main(String[] args) {
        String str = "Hello World 123";
        
        // 변환된 문자열을 저장할 StringBuilder를 생성합니다.
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // 현재 문자가 소문자('a'~'z')인 경우에만 대문자로 변환합니다.
            if (currentChar >= 'a' && currentChar <= 'z') {
                char upperChar = Character.toUpperCase(currentChar);
                result.append(upperChar); // 변환된 대문자를 결과에 추가
            } else {
                result.append(currentChar); // 소문자가 아니면 (대문자, 숫자, 공백 등) 그대로 추가
            }
        }
        
        System.out.println("원본 문자열: " + str);
        System.out.println("변환된 문자열: " + result.toString());
    }
}