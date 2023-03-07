package de.entwicklerheld.easystorage.challenge.stage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class EasyStorage{

    private Map<String, String> storage = new HashMap<String, String>();

    public void store(String item, String repository){
        //Implement this for scenario 1
        if(item.isEmpty() || repository.isEmpty()){
            throw new IllegalArgumentException();
        }
            storage.put(item, repository);
            System.out.println(storage);
    }

    public Map<String, String> getAllData(){
        //Implement this for scenario 2
        return storage;
    }

    public String getRepository(String item){
        //Implement this for scenario 3 
        return storage.get(item);
    }

    public Set<String> getItems(String repository){
        //Implement this for scenario 3
    Set<String> itemSet = new TreeSet<>();
    for(Map.Entry<String, String> entry : storage.entrySet()){
        if(entry.getValue().equals(repository)){
            itemSet.add(entry.getKey());
        }
    }
    return itemSet;
    }
}