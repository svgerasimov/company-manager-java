package Playground;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> storage = new ArrayList<>();

    public void add(T item){
        storage.add(item);
    }

    public void remove(T item){
        storage.remove(item);
    }

    public List<T> getAll(){
        return storage;
    }

    public T get(int index){
        if(index < 0 || index >= storage.size()){
            return null;
        }
        return storage.get(index);
    }


}


// new Repository<Employee>();
// new Repository<String>();
