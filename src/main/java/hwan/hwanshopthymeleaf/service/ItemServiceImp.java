package hwan.hwanshopthymeleaf.service;

import hwan.hwanshopthymeleaf.entity.Item;
import hwan.hwanshopthymeleaf.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }
}
