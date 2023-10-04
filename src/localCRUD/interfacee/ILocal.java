package localCRUD.interfacee;

import localCRUD.dto.ToyDTO;

import java.io.IOException;
import java.util.List;

public interface ILocal {
    ToyDTO finfById(int id);

    List<ToyDTO> findAll() throws IOException, ClassNotFoundException;
    void save(ToyDTO toy) throws IOException;
    void update(ToyDTO toy) throws IOException;
    void delete(ToyDTO toy) throws IOException;
}
