package a.com.dao;

import a.com.po.Items;

import java.util.List;

public interface ItemsMapper {

    List<Items> findAllItems();

    Items findItemsById(Integer id);

    void saveAndUpdata(Items items);
}
