import java.io.File;
import java.io.IOException;
import java.util.*;

public class BooleanSearchEngine implements SearchEngine {
    private Map<String, List<PageEntry>> database = new HashMap<>();

    public BooleanSearchEngine(File pdfsDir) throws IOException {
        // прочтите тут все pdf и сохраните нужные данные,
        // тк во время поиска сервер не должен уже читать файлы

        /*
//        Map<String, Integer> freqs = new HashMap<>(); // мапа, где ключом будет слово, а значением - частота
//        for (var word : words) { // перебираем слова
//            if (word.isEmpty()) {
//                continue;
//            }
//            word = word.toLowerCase();
//            freqs.put(word, freqs.getOrDefault(word, 0) + 1);

          */

    }

    @Override
    public List<PageEntry> search(String word) {
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }
}
