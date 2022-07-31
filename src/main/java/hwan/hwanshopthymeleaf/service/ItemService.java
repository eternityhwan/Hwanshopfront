package hwan.hwanshopthymeleaf.service;

import hwan.hwanshopthymeleaf.entity.Item;

import java.util.List;

public interface ItemService {

    Item createItem(Item item);

    void deleteItem(Long id);

    List<Item> getAllItem();
}
