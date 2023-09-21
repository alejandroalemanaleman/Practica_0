public class LettersList
{
    public static String[] getLettersList(String phrase) {
        String[] array = new String[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            array[i] = phrase.substring(i, i + 1);
        }

        return array;
    }
}