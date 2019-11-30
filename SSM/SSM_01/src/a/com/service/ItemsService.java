package a.com.service;

import a.com.po.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAllItems();

    Items findItemsById(Integer id);

    void saveAndUpdata(Items item);
}
