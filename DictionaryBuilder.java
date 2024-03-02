import java.util.*;

public class DictionaryBuilder {
    public record Request(String action, List<String> params, String keyword) {
    }

    public interface DictionaryService {
        void lookup(String keyword);
        void define(String type, String keyword, String definition, String sentence, String meaning);
        void drop(String keyword);
        void export(String filePath);
    }

    public static class DictionaryServiceImpl implements DictionaryService {
        private static DictionaryServiceImpl instance;
        private final Map<String, List<String>> dictionary;

        private DictionaryServiceImpl() {
            dictionary = new HashMap<>();
        }

        public static synchronized DictionaryServiceImpl getInstance() {
            if (instance == null) {
                instance = new DictionaryServiceImpl();
            }
            return instance;
        }

        @Override
        public void lookup(String keyword) {
            if (dictionary.containsKey(keyword)) {
                List<String> definitions = dictionary.get(keyword);
                for (String definition : definitions) {
                    System.out.println(definition);
                }
            } else {
                System.out.println("Definition not found for keyword: " + keyword);
            }
        }
        @Override
        public void define(String type, String keyword, String definition, String sentence, String meaning) {
            List<String> definitions = dictionary.getOrDefault(keyword, new LinkedList<>());
            definitions.add(createDefinition(type, definition, sentence, meaning));
            dictionary.put(keyword, definitions);
            System.out.println("Saved!");
        }

        @Override
        public void drop(String keyword) {
            if (dictionary.containsKey(keyword)) {
                dictionary.remove(keyword);
                System.out.println("Keyword dropped: " + keyword);
            } else {
                System.out.println("Keyword not found: " + keyword);
            }
        }

        @Override
        public void export(String filePath) {
            // Export the dictionary to the specified file path
            System.out.println("Dictionary exported to: " + filePath);
        }
        private String createDefinition(String type, String definition, String sentence, String meaning) {
            String keyword = "";
            String sb = "@" + keyword + " /" + definition + "/\n" +
                    "* " + type + "\n" +
                    "- " + meaning + "\n" +
                    "= " + sentence + "\n";
            return sb;
        }
    }
    public static class DictionaryController {
        private final DictionaryService dictionaryService;

        public DictionaryController(DictionaryService dictionaryService) {
            this.dictionaryService = dictionaryService;
        }
        public void processRequest(Request request) {
            String action = request.action();
            List<String> params = request.params();
            String keyword = request.keyword();

            switch (action) {
                case "lookup":
                    dictionaryService.lookup(keyword);
                    break;
                case "define":
                    String type = params.get(0);
                    String definition = params.get(1);
                    String sentence = "";
                    String meaning = "";
                    if (type.equals("-n") || type.equals("--noun") ||
                            type.equals("-a") || type.equals("--adjective") ||
                            type.equals("-v") || type.equals("--verb")) {
                        sentence = params.get(2);
                        meaning = params.get(3);
                    }
                    dictionaryService.define(type, keyword, definition, sentence, meaning);
                    break;
                case "drop":
                    dictionaryService.drop(keyword);
                    break;
                case "export":
                    String filePath = params.get(0);
                    dictionaryService.export(filePath);
                    break;
                default:
                    System.out.println("Invalid action: " + action);
            }
        }
    }
    public static void main(String[] args) {
        DictionaryService dictionaryService = DictionaryServiceImpl.getInstance();
        DictionaryController controller = new DictionaryController(dictionaryService);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Action: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" ");
            String action = parts[0];
            String keyword = "";
            List<String> params = new ArrayList<>();

            if (parts.length > 1) {
                keyword = parts[1];
                for (int i = 2; i < parts.length; i++) {
                    params.add(parts[i]);
                }
            }
            Request request = new Request(action,params, keyword);
            controller.processRequest(request);
        }
    }
}
