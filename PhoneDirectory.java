import java.util.*;
class PhoneDirectory {
    private Map<String, List<String>> directory;
    public PhoneDirectory() {
        directory = new HashMap<>();
    }
    public void add(String surname, String phoneNuber){
        directory.computeIfAbsent(surname, s -> new ArrayList<>()).add(phoneNuber);
    }
    public List<String> get(String surname){
        return directory.getOrDefault(surname, Collections.emptyList());
    }
    public void printAll(){
        for(Map.Entry<String, List<String>> entry : directory.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}