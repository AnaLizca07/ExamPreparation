package localCRUD.services;

import localCRUD.dto.ToyDTO;
import localCRUD.interfacee.ILocal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToyImplements implements ILocal {
    private List<ToyDTO> toys;
    public ToyImplements() throws  IOException, ClassNotFoundException{
        toys = new ArrayList<>();
    }
    @Override
    public ToyDTO finfById(int id) {
        return toys.stream()
                .filter(toys -> toys.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ToyDTO> findAll() throws IOException, ClassNotFoundException {
        toys = (List<ToyDTO>) ObjectSerializable.readObjectFromFile("local.ax");
        return toys;
    }

    @Override
    public void save(ToyDTO toy) throws IOException {
        toys.add(toy);
        ObjectSerializable.writeObjectToFile(toys,"local.ax");
    }

    @Override
    public void update(ToyDTO toy) throws IOException {
        ToyDTO oldToy = finfById(toy.getId());
        if(oldToy!=null){
            toys.remove(oldToy);
            toys.add(toy);
            ObjectSerializable.writeObjectToFile(toys,"local.ax");
        }
    }

    @Override
    public void delete(ToyDTO toy) throws IOException {
        toys.remove(toy);
        ObjectSerializable.writeObjectToFile(toys,"local.ax");
    }
}
